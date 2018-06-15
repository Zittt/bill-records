package com.mappertest.test;

import com.google.common.collect.Lists;
import com.zit.bill.service.vo.Account;
import com.zit.bill.service.vo.Contact;
import com.zit.bill.service.vo.Individual;
import com.zit.bill.service.vo.TestOneVo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author zwj9044
 * @date 2018-06-14
 */
public class GenerateVo {

    public static Account generateAccountVo() {
        Account account = new Account();
        account.setMid("1111kkkkk11111");
        account.setAcc("accccccc");
        account.setSame("savemememe");
        account.setTe(12);
        account.setOneStr("455");
        account.setDate(new Date());
        return account;
    }

    public static List<Account> generateAccountVoList() {
        Account account = new Account();
        account.setMid("1111kkkkk11111");
        account.setAcc("accccccc");
        account.setSame("savemememe");
        Account account2 = new Account();
        account2.setMid("1111kkkkkk2222");
        account2.setAcc("ac22222222222222cccccc");
        account2.setSame("sa2222222222222222vemememe");
        List<Account> list = Lists.newArrayList();
        list.add(account);
        list.add(account2);
        return list;
    }

    public static TestOneVo generateTestOneVo() {
        TestOneVo testOneVo = new TestOneVo();
        testOneVo.setName("testOne");
        testOneVo.setAge(1);
        testOneVo.setDateOne(new Date());
        testOneVo.setOneBig(new BigDecimal("111"));
        Contact contact = new Contact();
        contact.setFirstName("oneoneone");
        contact.setLastName("oneLLLLLL");
        testOneVo.setContact(contact);

        Individual individual = new Individual();
        individual.setCompanyName("oneNameName");
        testOneVo.setIndividual(individual);

        testOneVo.setAddress("one addresss");

        Account account = new Account();
        account.setMid("1111kkkkk11111");
        account.setAcc("accccccc");
        account.setSame("savemememe");
        Account account2 = new Account();
        account2.setMid("1111kkkkkk2222");
        account2.setAcc("ac22222222222222cccccc");
        account2.setSame("sa2222222222222222vemememe");
        List<Account> list = Lists.newArrayList();
        list.add(account);
        list.add(account2);
        testOneVo.setAccountList(list);

        return testOneVo;
    }
}
