package com.snail.education.protocol.service;

import com.snail.education.protocol.model.SEStory;

import java.util.ArrayList;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.Part;
import retrofit.mime.TypedFile;

/**
 * Created by tianxiaopeng on 15-1-17.
 */
public interface SEStoryService {

    /**
     * 查询蜗牛故事信息
     *
     * @param uid
     * @param cb
     */
    @FormUrlEncoded
    @POST("/api/storyAjax")
    public void fetchStory(@Field("page") int page,
                           @Field("limit") int limit,
                           @Field("uid") int uid,
                           Callback<ArrayList<SEStory>> cb);

    /**
     * 发表故事
     *
     * @param name
     * @param cb
     */
    @Multipart
    @POST("/api/test")
    public void deployStory(@Part("msg") int msg,
                            @Part("uid") int uid,
                            @Part("name") TypedFile name,
                            Callback<ArrayList<SEStory>> cb);


}
