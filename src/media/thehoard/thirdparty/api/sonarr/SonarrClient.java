package media.thehoard.thirdparty.api.sonarr;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;

import media.thehoard.thirdparty.api.sonarr.endpoints.QueueItem;
import media.thehoard.thirdparty.api.sonarr.endpoints.SystemStatus;
import media.thehoard.thirdparty.api.sonarr.endpoints.command.CommandBody;
import media.thehoard.thirdparty.api.sonarr.endpoints.command.CommandName;
import media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.DownloadScanBody;
import media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.MultiEpisodeBody;
import media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.MultiFileBody;
import media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.MultiFileListBody;
import media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.MultiSeriesBody;
import media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.SeasonBody;
import media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.SeriesBody;
import media.thehoard.thirdparty.api.sonarr.endpoints.common.PageManager;
import media.thehoard.thirdparty.api.sonarr.endpoints.common.SortDirection;
import media.thehoard.thirdparty.api.sonarr.endpoints.common.SortKey;
import media.thehoard.thirdparty.api.sonarr.endpoints.episode.EpisodeFile;
import media.thehoard.thirdparty.api.sonarr.endpoints.history.HistoryRecord;
import media.thehoard.thirdparty.api.sonarr.endpoints.systembackup.SystemBackup;
import media.thehoard.thirdparty.api.sonarr.endpoints.wantedmissing.WantedMissingRecord;
import media.thehoard.thirdparty.api.sonarr.http.DateDeserializer;
import media.thehoard.thirdparty.api.sonarr.http.DurationDeserializer;
import media.thehoard.thirdparty.api.sonarr.http.RequestMethod;
import media.thehoard.thirdparty.api.sonarr.http.SonarrRequest;

/**
 * Sonarr API Wrapper
 *
 * @author Michael Haas
 * @since 0.3.4.40
 */
public class SonarrClient {
	public static final ExecutorService CLIENT_THREADPOOL = Executors.newCachedThreadPool();

	private final String API_URL;

	private final String API_KEY;

	public SonarrClient(String apiUrl, String apiKey) {
		this.API_URL = apiUrl.endsWith("/")? apiUrl : apiUrl + "/";
		this.API_KEY = apiKey;
	}

	public SonarrClient(String apiKey) {
		this("http://localhost:8989/api/", apiKey);
	}

	public String getApiUrl() {
		return this.API_URL;
	}

	public String getApiKey() {
		return this.API_KEY;
	}

	public Calendar calendar() {
		return new Calendar();
	}

	public class Calendar {
		/**
		 * Gets upcoming episodes, if start/end are not supplied episodes airing today
		 * and tomorrow will be returned
		 *
		 * @return Get request for a calendar.
		 */
		public Get get() {
			return new Get();
		}

		public Get get(Date startDate, Date endDate) {
			return new Get(startDate, endDate);
		}

		public Get get(String startDate, String endDate) {
			return new Get(startDate, endDate);
		}

		public class Get extends
				SonarrRequest<Object, java.util.List<media.thehoard.thirdparty.api.sonarr.endpoints.calendar.Calendar>> {
			protected Get() {
				super(SonarrClient.this, RequestMethod.GET, "calendar", new TypeToken<java.util.List<media.thehoard.thirdparty.api.sonarr.endpoints.calendar.Calendar>>() {
				}.getType());
			}

			protected Get(Date startDate, Date endDate) {
				this();
				this.setStartDate(startDate);
				this.setEndDate(endDate);
			}

			protected Get(String startDate, String endDate) {
				this();
				this.setStartDate(startDate);
				this.setEndDate(endDate);
			}

			private SimpleDateFormat calendarDateFormat = new SimpleDateFormat("yyyy-MM-dd");

			public Get setStartDate(Date startDate) {
				return setStartDate(calendarDateFormat.format(startDate));
			}

			public Get setStartDate(String startDate) {
				this.addParameter("start", startDate);
				return this;
			}

			public Get setEndDate(Date endDate) {
				return setStartDate(calendarDateFormat.format(endDate));
			}

			public Get setEndDate(String endDate) {
				this.addParameter("start", endDate);
				return this;
			}
		}
	}

	public Command command() {
		return new Command();
	}

	public class Command {
		// TODO Cast gotten generic commands to proper commands, possibly using
		// instanceof
		public Get get(int commandId) {
			return new Get(commandId);
		}

		public class Get extends
				SonarrRequest<Object, media.thehoard.thirdparty.api.sonarr.endpoints.command.Command<CommandBody>> {
			protected Get(int commandId) {
				super(SonarrClient.this, RequestMethod.GET, "command/" + commandId, new TypeToken<media.thehoard.thirdparty.api.sonarr.endpoints.command.Command<CommandBody>>() {
				}.getType());
				// super.addGsonTypeAdapter(getAdapter());
			}
		}

		public List get() {
			return new List();
		}

		public List list() {
			return new List();
		}

		public class List extends SonarrRequest<Object, java.util.List<Command>> {
			protected List() {
				super(SonarrClient.this, RequestMethod.GET, "command", new TypeToken<java.util.List<Command>>() {
				}.getType());
				// super.addGsonTypeAdapter(getAdapter());
			}
		}

		public RefreshSeries refreshSeries(int seriesId) {
			return new RefreshSeries(seriesId);
		}

		public RefreshSeries refreshSeries() {
			return new RefreshSeries();
		}

		public class RefreshSeries
				extends SonarrRequest<media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.SeriesBody,
				media.thehoard.thirdparty.api.sonarr.endpoints.command.Command<media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.SeriesBody>> {
			protected RefreshSeries(int seriesId) {
				super(SonarrClient.this, RequestMethod.POST, "command", (SeriesBody) (new SeriesBody()
						      .setSeriesId(seriesId).setName(CommandName.RefreshSeries)),
				      new TypeToken<media.thehoard.thirdparty.api.sonarr.endpoints.command.Command<media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.SeriesBody>>() {
				      }.getType());
			}

			protected RefreshSeries() {
				super(SonarrClient.this, RequestMethod.POST, "command", (SeriesBody) (new SeriesBody()
						      .setName(CommandName.RefreshSeries)),
				      new TypeToken<media.thehoard.thirdparty.api.sonarr.endpoints.command.Command<media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.SeriesBody>>() {
				      }.getType());
			}
		}

		public RescanSeries rescanSeries(int seriesId) {
			return new RescanSeries(seriesId);
		}

		public RescanSeries rescanSeries() {
			return new RescanSeries();
		}

		public class RescanSeries
				extends SonarrRequest<media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.SeriesBody,
				media.thehoard.thirdparty.api.sonarr.endpoints.command.Command<media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.SeriesBody>> {
			protected RescanSeries(int seriesId) {
				super(SonarrClient.this, RequestMethod.POST, "command", (SeriesBody) (new SeriesBody()
						      .setSeriesId(seriesId).setName(CommandName.RescanSeries)),
				      new TypeToken<media.thehoard.thirdparty.api.sonarr.endpoints.command.Command<media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.SeriesBody>>() {
				      }.getType());
			}

			protected RescanSeries() {
				super(SonarrClient.this, RequestMethod.POST, "command", (SeriesBody) (new SeriesBody()
						      .setName(CommandName.RescanSeries)),
				      new TypeToken<media.thehoard.thirdparty.api.sonarr.endpoints.command.Command<media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.SeriesBody>>() {
				      }.getType());
			}
		}

		public EpisodeSearch episodeSearch(java.util.List<Integer> episodeIds) {
			return new EpisodeSearch(episodeIds);
		}

		public EpisodeSearch episodeSearch(int episodeId) {
			return episodeSearch(Collections.singletonList(episodeId));
		}

		public class EpisodeSearch
				extends SonarrRequest<media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.MultiEpisodeBody,
				media.thehoard.thirdparty.api.sonarr.endpoints.command.Command<media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.MultiEpisodeBody>> {
			protected EpisodeSearch(java.util.List<Integer> episodeIds) {
				super(SonarrClient.this, RequestMethod.POST, "command", (MultiEpisodeBody) (new MultiEpisodeBody()
						.setName(CommandName.EpisodeSearch)), new TypeToken<
						media.thehoard.thirdparty.api.sonarr.endpoints.command.Command<media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.MultiEpisodeBody>>() {
				}.getType());
			}
		}

		public SeasonSearch seasonSearch(int seriesId, int seasonNumber) {
			return new SeasonSearch(seriesId, seasonNumber);
		}

		public class SeasonSearch
				extends SonarrRequest<media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.SeasonBody,
				media.thehoard.thirdparty.api.sonarr.endpoints.command.Command<media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.SeasonBody>> {
			protected SeasonSearch(int seriesId, int seasonNumber) {
				super(SonarrClient.this, RequestMethod.POST, "command",
				      (SeasonBody) (new SeasonBody().setSeasonNumber(seasonNumber).setSeriesId(seriesId)
						      .setName(CommandName.SeasonSearch)),
				      new TypeToken<media.thehoard.thirdparty.api.sonarr.endpoints.command.Command<media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.SeasonBody>>() {
				      }.getType());
			}
		}

		public SeriesSearch seriesSearch(int seriesId) {
			return new SeriesSearch(seriesId);
		}

		public class SeriesSearch
				extends SonarrRequest<media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.SeriesBody,
				media.thehoard.thirdparty.api.sonarr.endpoints.command.Command<media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.SeriesBody>> {
			protected SeriesSearch(int seriesId) {
				super(SonarrClient.this, RequestMethod.POST, "command", (SeriesBody) (new SeriesBody()
						      .setSeriesId(seriesId).setName(CommandName.SeriesSearch)),
				      new TypeToken<media.thehoard.thirdparty.api.sonarr.endpoints.command.Command<media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.SeriesBody>>() {
				      }.getType());
			}
		}

		// TODO
		// This is a low priority, as it is technically deprecated.
		// public DownloadEpisodesScan()

		public RssSync rssSync() {
			return new RssSync();
		}

		public class RssSync extends SonarrRequest<media.thehoard.thirdparty.api.sonarr.endpoints.command.CommandBody,
				media.thehoard.thirdparty.api.sonarr.endpoints.command.Command<media.thehoard.thirdparty.api.sonarr.endpoints.command.CommandBody>> {
			protected RssSync() {
				super(SonarrClient.this, RequestMethod.POST, "command", new CommandBody().setName(CommandName.RssSync),
				      new TypeToken<media.thehoard.thirdparty.api.sonarr.endpoints.command.Command<media.thehoard.thirdparty.api.sonarr.endpoints.command.CommandBody>>() {
				      }.getType());
			}
		}

		public RenameFiles renameFiles(java.util.List<Integer> fileIdsToRename) {
			return new RenameFiles(fileIdsToRename);
		}

		public RenameFiles renameFiles(int fileId) {
			return renameFiles(Collections.singletonList(fileId));
		}

		public class RenameFiles
				extends SonarrRequest<media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.MultiFileListBody,
				media.thehoard.thirdparty.api.sonarr.endpoints.command.Command<media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.MultiFileListBody>> {
			protected RenameFiles(java.util.List<Integer> fileIdsToRename) {
				super(SonarrClient.this, RequestMethod.POST, "command", (MultiFileListBody) new MultiFileListBody()
						      .setFiles(fileIdsToRename).setName(CommandName.RenameFiles),
				      new TypeToken<
						      media.thehoard.thirdparty.api.sonarr.endpoints.command.Command<media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.MultiFileListBody>>() {
				      }.getType());
			}

		}

		public Backup backup() {
			return new Backup();
		}

		public class Backup extends SonarrRequest<media.thehoard.thirdparty.api.sonarr.endpoints.command.CommandBody,
				media.thehoard.thirdparty.api.sonarr.endpoints.command.Command<media.thehoard.thirdparty.api.sonarr.endpoints.command.CommandBody>> {
			protected Backup() {
				super(SonarrClient.this, RequestMethod.POST, "command", new CommandBody().setName(CommandName.Backup),
				      new TypeToken<media.thehoard.thirdparty.api.sonarr.endpoints.command.Command<media.thehoard.thirdparty.api.sonarr.endpoints.command.CommandBody>>() {
				      }.getType());
			}
		}

		protected RuntimeTypeAdapterFactory<CommandBody> getAdapter() {
			return RuntimeTypeAdapterFactory.of(CommandBody.class).registerSubtype(CommandBody.class)
					.registerSubtype(DownloadScanBody.class)
					.registerSubtype(MultiEpisodeBody.class).registerSubtype(MultiFileBody.class)
					.registerSubtype(MultiFileListBody.class).registerSubtype(MultiSeriesBody.class)
					.registerSubtype(SeasonBody.class).registerSubtype(SeriesBody.class);
		}
	}

	public Diskspace diskspace() {
		return new Diskspace();
	}

	public class Diskspace {
		public Get get() {
			return new Get();
		}

		public class Get extends
				SonarrRequest<Object, java.util.List<media.thehoard.thirdparty.api.sonarr.endpoints.Diskspace>> {
			protected Get() {
				super(SonarrClient.this, RequestMethod.GET, "diskspace", new TypeToken<java.util.List<media.thehoard.thirdparty.api.sonarr.endpoints.Diskspace>>() {
				}.getType());
			}
		}
	}

	public Episode episode() {
		return new Episode();
	}

	public class Episode {
		public Get get(int episodeId) {
			return new Get(episodeId);
		}

		public class Get extends SonarrRequest<Object, media.thehoard.thirdparty.api.sonarr.endpoints.Episode> {
			protected Get(int episodeId) {
				super(SonarrClient.this, RequestMethod.GET, "episode/" + episodeId, media.thehoard.thirdparty.api.sonarr.endpoints.Episode.class);
			}
		}

		public List list(int seriesId) {
			return new List(seriesId);
		}

		public class List
				extends SonarrRequest<Object, java.util.List<media.thehoard.thirdparty.api.sonarr.endpoints.Episode>> {
			protected List(int seriesId) {
				super(SonarrClient.this, RequestMethod.GET, "episode", new TypeToken<java.util.List<media.thehoard.thirdparty.api.sonarr.endpoints.Episode>>() {
				}.getType());
				super.addParameter("seriesId", String.valueOf(seriesId));
			}
		}

		public Put put(media.thehoard.thirdparty.api.sonarr.endpoints.Episode episode) {
			return new Put(episode);
		}

		public class Put extends
				SonarrRequest<media.thehoard.thirdparty.api.sonarr.endpoints.Episode, media.thehoard.thirdparty.api.sonarr.endpoints.Episode> {
			protected Put(media.thehoard.thirdparty.api.sonarr.endpoints.Episode episode) {
				super(SonarrClient.this, RequestMethod.PUT, "episode", episode, media.thehoard.thirdparty.api.sonarr.endpoints.Episode.class);
			}
		}
	}

	public EpisodeFile episodeFile() {
		return new EpisodeFile();
	}

	public class EpisodeFile {
		public Get get(int episodeFileId) {
			return new Get(episodeFileId);
		}

		public class Get
				extends SonarrRequest<Object, media.thehoard.thirdparty.api.sonarr.endpoints.episode.EpisodeFile> {
			protected Get(int episodeFileId) {
				super(SonarrClient.this, RequestMethod.GET, "episodefile/" + episodeFileId, media.thehoard.thirdparty.api.sonarr.endpoints.episode.EpisodeFile.class);
			}
		}

		public List list(int seriesId) {
			return new List(seriesId);
		}

		public class List extends
				SonarrRequest<Object, java.util.List<media.thehoard.thirdparty.api.sonarr.endpoints.episode.EpisodeFile>> {
			protected List(int seriesId) {
				super(SonarrClient.this, RequestMethod.GET, "episodefile", new TypeToken<java.util.List<media.thehoard.thirdparty.api.sonarr.endpoints.episode.EpisodeFile>>() {
				}.getType());
				super.addParameter("seriesId", String.valueOf(seriesId));
			}
		}

		public Put put(media.thehoard.thirdparty.api.sonarr.endpoints.episode.EpisodeFile episodeFile) {
			return new Put(episodeFile);
		}

		public class Put extends SonarrRequest<media.thehoard.thirdparty.api.sonarr.endpoints.episode.EpisodeFile, media.thehoard.thirdparty.api.sonarr.endpoints.episode.EpisodeFile> {
			protected Put(media.thehoard.thirdparty.api.sonarr.endpoints.episode.EpisodeFile episodeFile) {
				super(SonarrClient.this, RequestMethod.PUT, "episodefile/" + episodeFile.getId(), episodeFile, media.thehoard.thirdparty.api.sonarr.endpoints.episode.EpisodeFile.class);
			}
		}

		public Delete delete(int episodeFileId) {
			return new Delete(episodeFileId);
		}

		public class Delete extends SonarrRequest<Object, Object> {
			protected Delete(int episodeFileId) {
				super(SonarrClient.this, RequestMethod.DELETE, "episodefile/" + episodeFileId, Object.class);
			}
		}
	}

	public History history() {
		return new History();
	}

	public class History {
		public Get get(SortKey sortKey, int page, int pageSize, SortDirection sortDir) {
			return new Get(sortKey, page, pageSize, sortDir);
		}

		public Get get(SortKey sortKey, int page, int pageSize) {
			return get(sortKey, page, pageSize, SortDirection.Ascending);
		}

		public Get get(SortKey sortKey, int page) {
			return get(sortKey, page, 15, SortDirection.Ascending);
		}

		public Get get(SortKey sortKey, SortDirection sortDir) {
			return get(sortKey, 1, 15, sortDir);
		}

		public Get get(SortKey sortKey) {
			return get(sortKey, 1, 15, SortDirection.Ascending);
		}

		public class Get extends SonarrRequest<Object, PageManager<HistoryRecord>> {
			protected Get(SortKey sortKey, int page, int pageSize, SortDirection sortDir) {
				super(SonarrClient.this, RequestMethod.GET, "history", new TypeToken<PageManager<HistoryRecord>>() {
				}.getType());
				super.addParameter("sortKey", sortKey.toString());
				super.addParameter("page", String.valueOf(page));
				super.addParameter("pageSize", String.valueOf(pageSize));
				super.addParameter("sortDir", sortDir.toString());
			}
		}
	}

	public Wanted wanted() {
		return new Wanted();
	}

	public class Wanted {
		public Missing missing() {
			return new Missing();
		}

		public class Missing {
			public Get get(SortKey sortKey, int page, int pageSize, SortDirection sortDir) {
				return new Get(sortKey, page, pageSize, sortDir);
			}

			public Get get(SortKey sortKey, int page, int pageSize) {
				return get(sortKey, page, pageSize, SortDirection.Ascending);
			}

			public Get get(SortKey sortKey, int page) {
				return get(sortKey, page, 10, SortDirection.Ascending);
			}

			public Get get(SortKey sortKey, SortDirection sortDir) {
				return get(sortKey, 1, 10, sortDir);
			}

			public Get get(SortKey sortKey) {
				return get(sortKey, 1, 10, SortDirection.Ascending);
			}

			public class Get extends SonarrRequest<Object, PageManager<WantedMissingRecord>> {
				protected Get(SortKey sortKey, int page, int pageSize, SortDirection sortDir) {
					super(SonarrClient.this, RequestMethod.GET, "wanted/missing", new TypeToken<PageManager<WantedMissingRecord>>() {
					}.getType());
					super.addParameter("sortKey", sortKey.toString());
					super.addParameter("page", String.valueOf(page));
					super.addParameter("pageSize", String.valueOf(pageSize));
					super.addParameter("sortDir", sortDir.toString());
				}
			}
		}
	}

	public Queue queue() {
		return new Queue();
	}

	public class Queue {
		public Get get() {
			return new Get();
		}

		public class Get extends SonarrRequest<Object, List<QueueItem>> {
			protected Get() {
				super(SonarrClient.this, RequestMethod.GET, "queue", new TypeToken<List<QueueItem>>() {
				}.getType());
			}
		}

		public Delete delete(int id, boolean doBlacklist) {
			return new Delete(id, doBlacklist);
		}

		public Delete delete(int id) {
			return delete(id, false);
		}

		public class Delete extends SonarrRequest<Object, Object> {
			protected Delete(int id, boolean doBlacklist) {
				super(SonarrClient.this, RequestMethod.DELETE, "queue/" + id, Object.class);
				super.addParameter("blacklist", "true");
			}
		}
	}

	public Parse parse() {
		return new Parse();
	}

	public class Parse {
		public Get getWithTitle(String title) {
			return new Get("title", title);
		}

		public Get getWithPath(String path) {
			return new Get("path", path);
		}

		public class Get extends SonarrRequest<Object, media.thehoard.thirdparty.api.sonarr.endpoints.parse.Parse> {
			private Get(String paramName, String val) {
				super(SonarrClient.this, RequestMethod.GET, "parse", media.thehoard.thirdparty.api.sonarr.endpoints.parse.Parse.class);
				super.addParameter(paramName, val);
			}
		}
	}

	public Profile profile() {
		return new Profile();
	}

	public class Profile {
		public Get get() {
			return new Get();
		}

		public class Get extends SonarrRequest<Object, media.thehoard.thirdparty.api.sonarr.endpoints.profile.Profile> {
			protected Get() {
				super(SonarrClient.this, RequestMethod.GET, "profile", new TypeToken<List<media.thehoard.thirdparty.api.sonarr.endpoints.profile.Profile>>() {
				}.getType());
			}
		}
	}

	public Release release() {
		return new Release();
	}

	public class Release {
		public Get get(int episodeId) {
			return new Get(episodeId);
		}

		public class Get extends SonarrRequest<Object, List<media.thehoard.thirdparty.api.sonarr.endpoints.Release>> {
			protected Get(int episodeId) {
				super(SonarrClient.this, RequestMethod.GET, "release", new TypeToken<List<media.thehoard.thirdparty.api.sonarr.endpoints.Release>>() {
				}.getType());
			}
		}

		public Post post(media.thehoard.thirdparty.api.sonarr.endpoints.Release release) {
			return new Post(release);
		}

		public class Post extends
				SonarrRequest<media.thehoard.thirdparty.api.sonarr.endpoints.Release, List<media.thehoard.thirdparty.api.sonarr.endpoints.Release>> {
			protected Post(media.thehoard.thirdparty.api.sonarr.endpoints.Release release) {
				super(SonarrClient.this, RequestMethod.POST, "release", release, new TypeToken<List<media.thehoard.thirdparty.api.sonarr.endpoints.Release>>() {
				}.getType());
				super.addParameter("guid", release.getGuid());
			}
		}
	}

	//TODO Release/Push https://github.com/Sonarr/Sonarr/wiki/Release-Push

	public Rootfolder rootFolder() {
		return new Rootfolder();
	}

	public class Rootfolder {
		public Get get() {
			return new Get();
		}

		public class Get
				extends SonarrRequest<Object, List<media.thehoard.thirdparty.api.sonarr.endpoints.Rootfolder>> {
			protected Get() {
				super(SonarrClient.this, RequestMethod.GET, "rootfolder", new TypeToken<List<media.thehoard.thirdparty.api.sonarr.endpoints.Rootfolder>>() {
				}.getType());
			}
		}
	}

	public Series series() {
		return new Series();
	}

	public class Series {
		/**
		 * Returns all series in your collection
		 *
		 * @param
		 *
		 * @return Get request for all series in your collection
		 */
		public List get() {
			return new List();
		}

		/**
		 * @return Get request for all series in your collection
		 *
		 * @see {@link #get()}
		 */
		public List list() {
			return get();
		}

		public class List extends
				SonarrRequest<Object, java.util.List<media.thehoard.thirdparty.api.sonarr.endpoints.series.Series>> {
			protected List() {
				super(SonarrClient.this, RequestMethod.GET, "series", new TypeToken<java.util.List<media.thehoard.thirdparty.api.sonarr.endpoints.series.Series>>() {
				}.getType());
			}
		}

		/**
		 * Returns the series with the matching ID or 404 if no matching series is found
		 *
		 * @param seriesId Series ID
		 *
		 * @return Get request for series specified with ID
		 */
		public Get get(int seriesId) {
			return new Get(seriesId);
		}

		public class Get extends SonarrRequest<Object, media.thehoard.thirdparty.api.sonarr.endpoints.series.Series> {
			protected Get(int seriesId) {
				super(SonarrClient.this, RequestMethod.GET, "series/" + seriesId, media.thehoard.thirdparty.api.sonarr.endpoints.series.Series.class);
			}
		}

		/**
		 * Adds a new series to your collection
		 * <p>
		 * NOTE: if you do not add the required params, then the series wont function.
		 * some of these without the others can indeed make a "series". But it wont
		 * function properly in nzbdrone.
		 * <p>
		 * <p>
		 * Required: {@code tvdbId (int)} {@code title (string)}
		 * {@code qualityProfileId (int)} {@code titleSlug
		 * (string)} {@code images (array)} {@code seasons (array)} - See
		 * {@link #()} output for format
		 * <p>
		 * {@code path (string)} - full path to the series on disk <i>or</i>
		 * {@code rootFolderPath (string)} - full path will be created by combining the
		 * rootFolderPath with the series title
		 * <p>
		 * Optional: {@code tvRageId (int)} {@code seasonFolder (bool)}
		 * {@code monitored (bool)} {@code addOptions (object)}
		 * <p>
		 * {@code addOptions} is an object that contains three properties
		 * <p>
		 * <ul>
		 * <li>{@code ignoreEpisodesWithFiles}: Unmonitors any episodes with a file</li>
		 * <li>{@code ignoreEpisodesWithoutFiles}: Unmonitors any episodes without a
		 * file</li>
		 * <li>{@code searchForMissingEpisodes}: Searches for missing files after
		 * applying {@code ignoreEpisodesWithFiles} and
		 * {@code ignoreEpisodesWithoutFiles}</li>
		 * </ul>
		 * <p>
		 * <i>Note</i>: If all episodes are unmonitored via the options above the season
		 * will be unmonitored (unless it is the latest season)
		 * <p>
		 * <p>
		 * <pre>
		 * {@code}
		 * "addOptions":
		 * {
		 * 	"ignoreEpisodesWithFiles": true,
		 * 	"ignoreEpisodesWithoutFiles": true,
		 * 	"searchForMissingEpisodes": false
		 * }
		 * </pre>
		 * <p>
		 * It can be used to control which episodes Sonarr monitors after adding the
		 * series, ignoring episodes with and without files will only monitor future
		 * episodes.
		 * <p>
		 *
		 * @return Post request for series
		 */
		public Post post() {
			return new Post();
		}

		/**
		 * @param series Series object to use in the post request
		 *
		 * @return Post request for series
		 *
		 * @see {@link #post()}
		 */
		public Post post(media.thehoard.thirdparty.api.sonarr.endpoints.series.Series series) {
			return new Post(series);
		}

		public class Post extends
				SonarrRequest<media.thehoard.thirdparty.api.sonarr.endpoints.series.Series, media.thehoard.thirdparty.api.sonarr.endpoints.series.Series> {
			protected Post(media.thehoard.thirdparty.api.sonarr.endpoints.series.Series series) {
				super(SonarrClient.this, RequestMethod.POST, "series", series, media.thehoard.thirdparty.api.sonarr.endpoints.series.Series.class);
			}

			protected Post() {
				super(SonarrClient.this, RequestMethod.POST, "series", media.thehoard.thirdparty.api.sonarr.endpoints.series.Series.class);
			}

			@Override
			public media.thehoard.thirdparty.api.sonarr.endpoints.series.Series execute() throws IOException {
				String missingValues = null;

				if (content.getTvdbId() == null)
					missingValues += "TVDB id, ";
				if (content.getTitle() == null)
					missingValues += "title, ";
				if (content.getQualityProfileId() == null)
					missingValues += "quality profile id, ";
				if (content.getTitleSlug() == null)
					missingValues += "title slug, ";
				if (content.getImages() == null)
					missingValues += "image list, ";
				if (content.getSeasons() == null)
					missingValues += "season list, ";

				if (missingValues != null) {
					missingValues = missingValues.substring(0, missingValues.length() - 2);
					throw new IOException("Request doesn't contain all required fields.\nMissing " + missingValues);
				}

				return super.execute();
			}
		}

		/**
		 * Update an existing series
		 *
		 * @param TV to use in the put request
		 *
		 * @return Put request to update series
		 */
		public Put put(media.thehoard.thirdparty.api.sonarr.endpoints.series.Series series) {
			return new Put(series);
		}

		public class Put extends
				SonarrRequest<media.thehoard.thirdparty.api.sonarr.endpoints.series.Series, media.thehoard.thirdparty.api.sonarr.endpoints.series.Series> {
			protected Put(media.thehoard.thirdparty.api.sonarr.endpoints.series.Series series) {
				super(SonarrClient.this, RequestMethod.PUT, "series", series, media.thehoard.thirdparty.api.sonarr.endpoints.series.Series.class);
			}
		}

		/**
		 * Delete the series with the given ID
		 * <p>
		 * Delete request allows optional {@code deleteFiles (bool)}. If true the series
		 * folder and all files will be deleted when the series is deleted
		 *
		 * @param seriesId Series ID
		 *
		 * @return Delete request for the given series
		 */
		public Delete delete(int seriesId) {
			return new Delete(seriesId);
		}

		public class Delete extends SonarrRequest<Object, Object> {
			protected Delete(int seriesId) {
				super(SonarrClient.this, RequestMethod.DELETE, "series/" + seriesId, Object.class);
			}
		}

	}

	//TODO Consider moving this into the Series class
	public SeriesLookup seriesLookup() {
		return new SeriesLookup();
	}

	public class SeriesLookup {
		public Get get(String term) {
			return new Get(term);
		}

		public class Get extends
				SonarrRequest<Object, List<media.thehoard.thirdparty.api.sonarr.endpoints.serieslookup.SeriesLookup>> {
			protected Get(String term) {
				super(SonarrClient.this, RequestMethod.GET, "series/lookup", new TypeToken<List<media.thehoard.thirdparty.api.sonarr.endpoints.serieslookup.SeriesLookup>>() {
				}.getType());
			}
		}
	}

	public System system() {
		return new System();
	}

	public class System {
		public Status status() {
			return new Status();
		}

		public class Status {
			public Get get() {
				return new Get();
			}

			public class Get extends SonarrRequest<Object, SystemStatus> {
				protected Get() {
					super(SonarrClient.this, RequestMethod.GET, "system/status", SystemStatus.class);
				}
			}
		}

		public Backup backup() {
			return new Backup();
		}

		public class Backup {
			public Get get() {
				return new Get();
			}

			public class Get extends SonarrRequest<Object, List<SystemBackup>> {
				protected Get() {
					super(SonarrClient.this, RequestMethod.GET, "system/backup", new TypeToken<List<SystemBackup>>() {
					}.getType());
				}
			}
		}
	}

	public static Gson getGson() {
		return new GsonBuilder().registerTypeAdapter(Date.class, new DateDeserializer())
				.registerTypeAdapter(Duration.class, new DurationDeserializer()).create();
	}
}
