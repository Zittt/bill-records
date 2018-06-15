package com.zit.bill.service.vo;

/**
 * @author zwj9044
 * @date 2018-06-14
 */

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Data
public class TestOneVo {

    private String name;

    private int age;

    private Date dateOne;

    private BigDecimal oneBig;

    private Contact contact;

    private Individual individual;      // 同

    private String address;     // 同

    private List<Account> accountList;
}
