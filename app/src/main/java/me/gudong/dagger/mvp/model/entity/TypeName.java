package me.gudong.dagger.mvp.model.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2016/10/13.
 */
public class TypeName {
    public List<String> typeNames = null;

    public class Result{
        @SerializedName("TypeName") public List<String> typelists;
    }

}
