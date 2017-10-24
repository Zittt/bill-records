package com.zit.bill.util.excel2;

import java.io.IOException;

/**
 * Created by zwj9044 on 2017/10/23.
 */
public class TestExcelUtils {

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
