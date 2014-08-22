package jlnshen.kptaipei.model;

import java.util.HashMap;

public class Video {
    public String id;
    public String sys_id;
    public String title;
    public String description;
    public String publishedAt;
    public String link;
    public HashMap<String, Thumbnail> thumbnails = new HashMap<String, Thumbnail>();
}
