# 柯P野生官網API for Android 
=============================

[柯P野生官網API](http://unlimited.kptaipei.tw/docs/) Android版本的實作

採用:

1. [Robospice](https://github.com/stephanenicolas/robospice)
2. [Retrofit](https://github.com/square/retrofit)

使用Retrofit:

```Java
RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://api.kptaipei.tw")
                .build();
api = restAdapter.create(KPTaipeiAPI.class);
Result<List<Category>> categoryResult = api.getCategories(ACCESS_TOKEN);

if(categoryResult.isSuccess) {
  for (Category cat : categoryResult.data) {
    //Your code
  }
}
```

使用Robospice

```Java
ApiRequestBuilder builder = new ApiRequestBuilder(ACCESS_TOKEN);
BasicApiRequest req = builder.buildRequest(ApiRequestBuilder.API.GET_CATEGORIES);

spiceManager.execute(req, "kapi", DurationInMillis.ONE_HOUR, new RequestListener<Result<List<Category>>>() {
  @Override
  public void onRequestFailure(SpiceException spiceException) {
      
  }

  @Override
  public void onRequestSuccess(Result<List<Category>> categoryResult) {
    if(categoryResult.isSuccess) {
    }
  }
});
```
