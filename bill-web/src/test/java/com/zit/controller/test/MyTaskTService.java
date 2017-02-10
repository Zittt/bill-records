package com.zit.controller.test;

import java.util.Timer;

/**
 * Created by zwj9044 on 2017/2/10.
 */
public class MyTaskTService {

    public void init() {
        Timer timer = new Timer();
        System.out.println("****start*** task service...");
        timer.schedule(new MyTaskT(), 0, 60 * 1000);
        System.out.println("****end*** task service...");
    }

    public static void main(String[] args) {

        new MyTaskTService().init();
    }
}
