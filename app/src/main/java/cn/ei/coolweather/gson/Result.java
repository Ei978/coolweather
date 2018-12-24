package cn.ei.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {

    public Sk sk;

    public Today today;

    @SerializedName("future")
    public List<Future> futureList;

    public class Sk {

        public String temp;

        public String time;

    }

    public class Today {

        public String temperature;

        public String weather;

        public String city;

        public String date_y;

        public String dressing_advice;

    }



}
