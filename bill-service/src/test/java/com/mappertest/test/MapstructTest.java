package com.mappertest.test;

import com.zit.bill.service.vo.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @author zwj9044
 * @date 2018-06-14
 */
public class MapstructTest {

    // 复杂对象映射
    @Test
    public void test1() {
        TestOneVo testOneVo = GenerateVo.generateTestOneVo();
        TestTwoVo testTwoVo = TestVoMapper.MAPPER.voOneToTwo(testOneVo);
        Assert.assertTrue(testTwoVo.getAddress().equals(testOneVo.getAddress()));
    }

    // 普通对象映射
    @Test
    public void test2() {
        Account account = GenerateVo.generateAccountVo();
        AccountTwo accountTwo = TestVoMapper.MAPPER.accountToAccountTwo(account);
        Assert.assertTrue(account.getAcc().equals(accountTwo.getAcc2()));
    }

    // 集合映射
    @Test
    public void test3() {
        List<Account> accounts = GenerateVo.generateAccountVoList();
        List<AccountTwo> accountTwo = TestVoMapper.MAPPER.accountsToAccountTwos(accounts);
        Assert.assertTrue(!"".equals(accounts.get(0)));
    }
}
