package com.zit.bill.service.vo;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author zwj9044
 * @date 2018-06-14
 */
@Mapper(componentModel = "spring")
public interface TestVoMapper {

    TestVoMapper MAPPER = Mappers.getMapper(TestVoMapper.class);

    @Mappings({
            @Mapping(source = "name", target = "nameTwo"),
            @Mapping(source = "age", target = "ageTwo"),
            @Mapping(source = "dateOne", target = "dateTwo"),
            @Mapping(source = "oneBig", target = "twoBig"),
            @Mapping(source = "accountList", target = "accountTwoList"),
            @Mapping(source = "contact", target = "contactTwo")
    })
    TestTwoVo voOneToTwo(TestOneVo one);

    @Mappings({
            @Mapping(source = "mid", target = "mid2"),
            @Mapping(source = "acc", target = "acc2"),
            @Mapping(source = "te", target = "in2"),
            @Mapping(source = "oneStr", target = "twoInt"),
            @Mapping(source = "date", target = "twoDate")
    })
    AccountTwo accountToAccountTwo(Account account);

    List<AccountTwo> accountsToAccountTwos(List<Account> accountList);
}
