package com.test;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.*;

public class Test1 {

    @Test
    public void test1() {
        System.out.println();
    }

    @Test
    public void test2() {
        System.out.println(new Date());
        final TimeZone timeZone = TimeZone.getTimeZone("Australia/Melbourne");
        TimeZone.setDefault(timeZone);
        SimpleDateFormat dfNew = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dfNew.format(new Date()));
    }

    @Test
    public void test3(){
        System.out.println(TimeZone.getDefault()); //输出当前默认时区
        System.out.println(new Date());
        final TimeZone zone = TimeZone.getTimeZone("Australia/Melbourne"); //获取中国时区
        TimeZone.setDefault(zone); //设置时区
        System.out.println(TimeZone.getDefault()); //输出验证
        System.out.println(new Date());
    }




}

