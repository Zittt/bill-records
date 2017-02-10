package com.zit.controller.test;

import java.util.TimerTask;

/**
 * Created by zwj9044 on 2017/2/10.
 */
public class MyTaskT extends TimerTask {

    @Override
    public void run() {
        System.out.println("****Start****模拟更新cache开始************");
        try {
            Thread.currentThread().sleep(1000*15);
            System.out.println("#####执行完了cache更新");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("****End****模拟更新cache结束************");
    }
}
