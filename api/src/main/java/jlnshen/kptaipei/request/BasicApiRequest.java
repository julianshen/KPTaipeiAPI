package jlnshen.kptaipei.request;

import com.google.gson.reflect.TypeToken;
import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;

import jlnshen.kptaipei.retrofit.KPTaipeiAPI;


public abstract class BasicApiRequest<T> extends RetrofitSpiceRequest<T, KPTaipeiAPI> {
    protected String id = null;
    protected Integer page_size = null;
    protected Integer page = null;

    public BasicApiRequest() {
        super((Class<T>) new TypeToken<T>() {
        }.getRawType(), KPTaipeiAPI.class);
    }

    public void setPage_size(int page_size) {
        this.page_size = page_size;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return page_size;
    }

    public String getId() {
        return id;
    }

    public String setId() {
        return id;
    }
}
