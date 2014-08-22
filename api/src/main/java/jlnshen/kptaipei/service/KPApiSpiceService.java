package jlnshen.kptaipei.service;

import com.octo.android.robospice.retrofit.RetrofitGsonSpiceService;

import jlnshen.kptaipei.retrofit.KPTaipeiAPI;


public class KPApiSpiceService extends RetrofitGsonSpiceService {

    private static final String API_URL = "http://api.kptaipei.tw";

    @Override
    public void onCreate() {
        super.onCreate();
        addRetrofitInterface(KPTaipeiAPI.class);
    }

    @Override
    protected String getServerUrl() {
        return API_URL;
    }
}
