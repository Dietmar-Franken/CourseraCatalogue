package com.waliahimanshu.courseracatalogue.Service;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitService {

    @GET("api/courses.v1")
    Call<CoursesResponse> listAllCourses();

    /**
     * Additional query parameters which can be applied
     * Query("start") String start
     * Query("limit") String limit
     */
    @GET("api/courses.v1?includes=partnerIds,instructorIds&fields=partnerIds,instructorIds&q=search")
    Call<CoursesResponse> search(@Query("query") String query);
}


