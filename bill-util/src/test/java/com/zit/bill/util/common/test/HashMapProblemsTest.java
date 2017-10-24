package com.zit.bill.util.common.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zwj9044 on 2017/10/23.
 */
public class HashMapProblemsTest {

    //并发下诡异的HashMap
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new HashTest.AddThread(0));
        Thread t2 = new Thread(new HashTest.AddThread(1));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}


class HashTest {
    static Map<String, String> map = new HashMap<String, String>();

    public static class AddThread implements Runnable {
        int start = 0;

        public AddThread(int start) {
            this.start = start;
        }

        public void run() {
            for (int i = start; i < 10000; i += 2) {
                map.put(Integer.toString(i), Integer.toBinaryString(i));
            }
        }
    }
}
