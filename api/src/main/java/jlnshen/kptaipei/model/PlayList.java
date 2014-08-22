package jlnshen.kptaipei.model;

import java.util.HashMap;

public class PlayList {
    public String id;
    public String title;
    public String description;
    public String publishedAt;
    public String link;
    public int video_count;
    public HashMap<String, Thumbnail> thumbnails = new HashMap<String, Thumbnail>();
}
