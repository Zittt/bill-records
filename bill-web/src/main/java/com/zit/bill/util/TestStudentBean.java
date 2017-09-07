package com.zit.bill.util;

/**
 * Created by zwj9044 on 2017/2/15.
 */
public class TestStudentBean {
    private String name;

    private String address;

    private Integer age;

    private String phone;

    private Integer gender;

    public TestStudentBean() {
    }

    public TestStudentBean(String name, String address, Integer age, String phone, Integer gender) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phone = phone;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "TestStudentBean{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", gender=" + gender +
                '}';
    }
}
