package com.waliahimanshu.courseracatalogue.Service;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Courses {

    @SerializedName("courseType")
    @Expose
    public String courseType;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("slug")
    @Expose
    public String slug;
    @SerializedName("name")
    @Expose
    public String name;

}