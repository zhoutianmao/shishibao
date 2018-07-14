package com.shishibao.shishibao.retrofit;


import model.RoomsModel;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

public interface ApiService {

    String API_SERVER_URL = "http://192.168.1.106:8081/shishibao-server/";

    //加载天气
   // @GET("weather")
    //Observable<WeatherModel> loadDataByRetrofitRxjava(@Query("citypinyin") String cityId);

    /*获取播放室列表*/
    @POST("home/list")
    Observable<RoomsModel> loadRoomList();



}