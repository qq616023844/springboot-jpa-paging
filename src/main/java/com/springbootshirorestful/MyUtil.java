package com.springbootshirorestful;

public class MyUtil {
    public static int calculatePageTotal(int pageNum,int pageSize){
        return pageNum*pageSize;
    }
}
