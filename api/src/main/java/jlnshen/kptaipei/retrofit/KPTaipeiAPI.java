package jlnshen.kptaipei.retrofit;

import java.util.List;

import jlnshen.kptaipei.model.Album;
import jlnshen.kptaipei.model.AlbumInfo;
import jlnshen.kptaipei.model.Article;
import jlnshen.kptaipei.model.Category;
import jlnshen.kptaipei.model.PlayList;
import jlnshen.kptaipei.model.Result;
import jlnshen.kptaipei.model.Video;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

public interface KPTaipeiAPI {
    @GET("/v1/category/")
    Result<List<Category>> getCategories(@Query("accessToken") String accessToken);

    @GET("/v1/category/{cat_id}")
    Result<List<Article>> getArticles(@Query("accessToken") String accessToken, @Path("cat_id") String cat_id, @Query("page_size") Integer page_size, @Query("page") Integer page);

    @GET("/v1/albums/")
    Result<List<Album>> getAlbums(@Query("accessToken") String accessToken, @Query("page_size") Integer page_size, @Query("page") Integer page);

    @GET("/v1/albums/{album_id}")
    Result<AlbumInfo> getAlbumInfo(@Query("accessToken") String accessToken, @Path("album_id") String album_id, @Query("page_size") Integer page_size, @Query("page") Integer page);

    @GET("/v1/videos/")
    Result<List<PlayList>> getPlayLists(@Query("accessToken") String accessToken, @Query("page_size") Integer page_size, @Query("page") Integer page);

    @GET("/v1/videos/{videolist_id}")
    Result<List<Video>> getVideos(@Query("accessToken") String accessToken, @Path("videolist_id") String videolist_id, @Query("page_size") Integer page_size, @Query("page") Integer page);

}
