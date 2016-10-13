package me.gudong.dagger.mvp.model;


import me.gudong.dagger.mvp.model.entity.GankData;
import me.gudong.dagger.mvp.model.entity.TypeName;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by GuDong on 12/22/15 23:59.
 * Contact with 1252768410@qq.com.
 */
public interface ApiService {
/*
    @GET("day/{year}/{month}/{day}")
    Observable<GankData> getGankData(@Path("year")int year, @Path("month")int month, @Path("day")int day);
*/
    @GET("course/queryTypeName.action")
    Observable<GankData> getGankData();

    /*
    @GET("course/queryTypeName.action")
    Observable<TypeName> queryTypeName();
    */
}
