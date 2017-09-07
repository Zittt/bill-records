package com.zit.bill.util2;

import com.zit.bill.util.ExcelUtil;

import java.io.IOException;

/**
 * Created by zwj9044 on 2017/2/16.
 */
public class TestExcelUtil2 {
    public static void main(String[] args) {

        try {
            ExcelUtils.readFromExcelDemo();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("读取完成");


//        try {
//            ExcelUtils.writeToExcelDemo();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("输出完成");

    }
}
