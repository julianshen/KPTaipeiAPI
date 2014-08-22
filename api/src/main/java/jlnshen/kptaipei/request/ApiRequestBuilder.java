/*
 * Copyright 2014 Julian Shen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jlnshen.kptaipei.request;


import java.util.List;

import jlnshen.kptaipei.model.Album;
import jlnshen.kptaipei.model.AlbumInfo;
import jlnshen.kptaipei.model.Article;
import jlnshen.kptaipei.model.Category;
import jlnshen.kptaipei.model.PlayList;
import jlnshen.kptaipei.model.Result;
import jlnshen.kptaipei.model.Video;


public class ApiRequestBuilder {
    private String ACCESS_TOKEN = null;

    public ApiRequestBuilder(String access_token) {
        ACCESS_TOKEN = access_token;
    }

    public BasicApiRequest buildRequest(API apiCode, String... id) {
        BasicApiRequest req = null;

        switch (apiCode) {
            case GET_CATEGORIES:
                req = new ReqListCategories();
                break;
            case GET_ARTICLES:
                req = new ReqListArticles();
                break;
            case LIST_ALBUMS:
                req = new ReqListAlbums();
                break;
            case GET_ALBUM_INFO:
                req = new ReqGetAlbumInfo();
                break;
            case GET_PLAY_LISTS:
                req = new ReqGetPlayLists();
                break;
            case GET_VIDEOS:
                req = new ReqGetVideos();
                break;
        }

        if (id != null && id.length > 0) {
            req.id = id[0];
        }

        return req;
    }

    public enum API {
        GET_CATEGORIES,
        GET_ARTICLES,
        LIST_ALBUMS,
        GET_ALBUM_INFO,
        GET_PLAY_LISTS,
        GET_VIDEOS
    }

    private class ReqListCategories extends BasicApiRequest<Result<List<Category>>> {
        @Override
        public Result<List<Category>> loadDataFromNetwork() throws Exception {
            return getService().getCategories(ACCESS_TOKEN);
        }
    }

    private class ReqListArticles extends BasicApiRequest<Result<List<Article>>> {
        @Override
        public Result<List<Article>> loadDataFromNetwork() throws Exception {
            return getService().getArticles(ACCESS_TOKEN, id, page_size, page);
        }
    }

    private class ReqListAlbums extends BasicApiRequest<Result<List<Album>>> {
        @Override
        public Result<List<Album>> loadDataFromNetwork() throws Exception {
            return getService().getAlbums(ACCESS_TOKEN, page_size, page);
        }
    }

    private class ReqGetAlbumInfo extends BasicApiRequest<Result<AlbumInfo>> {
        @Override
        public Result<AlbumInfo> loadDataFromNetwork() throws Exception {
            return getService().getAlbumInfo(ACCESS_TOKEN, id, page_size, page);
        }
    }

    private class ReqGetPlayLists extends BasicApiRequest<Result<List<PlayList>>> {
        @Override
        public Result<List<PlayList>> loadDataFromNetwork() throws Exception {
            return getService().getPlayLists(ACCESS_TOKEN, page_size, page);
        }
    }

    private class ReqGetVideos extends BasicApiRequest<Result<List<Video>>> {
        @Override
        public Result<List<Video>> loadDataFromNetwork() throws Exception {
            return getService().getVideos(ACCESS_TOKEN, id, page_size, page);
        }
    }
}
