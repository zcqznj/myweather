package com.myweather.android.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2017/6/5.
 */

public class HttpUtil {
    public  static  void sendOkHttpRequset(String address, Callback callback){
        //1.获取OKhttp对象
        OkHttpClient client = new OkHttpClient();
        //2.获取请求
        Request request=new Request.Builder().url(address).build();
        //3.将请求加入队列
        client.newCall(request).enqueue(callback);
    }
}
