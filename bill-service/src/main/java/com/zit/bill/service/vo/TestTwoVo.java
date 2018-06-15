package com.zit.bill.service.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author zwj9044
 * @date 2018-06-14
 */
@Data
public class TestTwoVo {

    private String nameTwo;

    private int ageTwo;

    private Date dateTwo;

    private BigDecimal twoBig;

    private Contact contactTwo;

    private Individual individual;      // 同

    private String address;     // 同

    private List<AccountTwo> accountTwoList;
}
