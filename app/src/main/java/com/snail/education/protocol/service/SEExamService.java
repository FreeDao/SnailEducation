package com.snail.education.protocol.service;

import com.snail.education.protocol.result.SEExamDetailResult;
import com.snail.education.protocol.result.SEExamResult;
import com.snail.education.protocol.result.SERemindResult;

import retrofit.Callback;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;

/**
 * Created by tianxiaopeng on 15-3-22.
 */
public interface SEExamService {

    /**
     * 蜗牛备考提醒
     *
     * @param cb
     */
    @FormUrlEncoded
    @POST("/api/remind")
    public void examRemind(Callback<SERemindResult> cb);

    /**
     * 备考攻略列表
     *
     * @param cb
     */
    @GET("/api/testNews/list")
    public void fetchExam(@Query("page") int page,
                          @Query("limit") int limit,
                          @Query("length") int length,
                          Callback<SEExamResult> cb);

    /**
     * 备考攻略详情
     *
     * @param cb
     */
    @GET("/api/newsHtml")
    public void fetchExamDetail(@Query("id") String page,
                                Callback<SEExamDetailResult> cb);
}
