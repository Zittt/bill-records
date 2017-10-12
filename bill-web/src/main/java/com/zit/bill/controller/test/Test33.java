package com.zit.bill.controller.test;

import java.io.*;
import java.net.Socket;

/**
 * Created by zwj9044 on 2017/2/20.
 */
public class Test33 {

    public static void main(String[] args) {
        Socket s = new Socket();
        s.isClosed();
        try {

//            throw new Exception("eeee");

            throw new IOException("测试ioe");
        } catch (IOException ioe) {

            System.out.println("ioe 。。。");
            try {

                new BufferedInputStream(new FileInputStream(""));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }


        } /*catch (Exception e) {
            System.out.println("exception ...");
        }*/

    }
}
