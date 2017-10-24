package com.zit.bill.util.excel.test;

import com.zit.bill.util.excel.ExcelException;
import com.zit.bill.util.excel.ExcelUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by zwj9044 on 2017/10/23.
 */
public class ExcelUtilTest {

    public static void main(String[] args) {

        File file = new File("D:/temp", "new4444FileF.xlsx");
        try {
            List<TestStudentBean> list = new ArrayList<>();

            list.add(new TestStudentBean("周文1", "上海", 12, "12345", 1));
            list.add(new TestStudentBean("周文2", "北京", 13, "23456", 0));
            list.add(new TestStudentBean("周文3", "深圳", 14, "34567", 1));
            list.add(new TestStudentBean("周文4", "广州", 15, "45678", 0));
            list.add(new TestStudentBean("周文5", "武汉", 16, "56789", 1));
            list.add(new TestStudentBean("周文6", "成都", 17, "67890", 1));
            LinkedHashMap<String,String> fieldMap = new LinkedHashMap<>();
            fieldMap.put("name", "姓名");
            fieldMap.put("address", "地址");
            fieldMap.put("age", "年龄");
            fieldMap.put("phone", "电话");
            fieldMap.put("gender", "性别");
            String sheetName = "sheet名字1";
            int sheetSize = 1000;
            OutputStream out = new FileOutputStream(file);
            ExcelUtil.listToExcel(list, fieldMap, sheetName, sheetSize, out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ExcelException e) {
            e.printStackTrace();
        }
        System.out.println("输出完了");

//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        String str = "test文件录入串串";
//        byte[] bt = new byte[1024];
//        bt = str.getBytes();
//        FileOutputStream fos = null;
//        try {
//            fos = new FileOutputStream(file);
//            fos.write(bt, 0, bt.length);
//            fos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//
//        }
//        try {
//            FileInputStream fis = new FileInputStream(file);
//            InputStreamReader isr = new InputStreamReader(fis);
//            int ch = 0;
//            while ((ch = isr.read()) != -1) {
//                System.out.print((char) ch);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }
}
