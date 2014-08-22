package jlnshen.kptaipei.model;

import java.util.List;

public class AlbumInfo {

    public Set set;
    public List<Photo> photos;

    public static class Set {
        public String id;
        public String title;
    }
}
