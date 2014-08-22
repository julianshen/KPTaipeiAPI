package jlnshen.kptaipei.model;

import java.util.HashMap;

public class Photo {
    public String id;
    public long date_upload;
    public long date_taken;
    public String title;
    public int isprimary;
    public String link;
    public HashMap<String, String> images = new HashMap<String, String>();
    public HashMap<String, Float> location = new HashMap<String, Float>();
}
