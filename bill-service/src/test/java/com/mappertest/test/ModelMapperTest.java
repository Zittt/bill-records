package com.mappertest.test;

import com.zit.bill.service.vo.TestOneVo;
import com.zit.bill.service.vo.TestTwoVo;
import jdk.nashorn.internal.runtime.Source;
import org.junit.Assert;
import org.junit.Test;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.TypeMap;
import org.modelmapper.convention.MatchingStrategies;

import javax.print.attribute.standard.Destination;

/**
 * @author zwj9044
 * @date 2018-06-14
 */
public class ModelMapperTest {

    @Test
    public void testModelMapper() {
        TestOneVo testOneVo = GenerateVo.generateTestOneVo();
        ModelMapper modelMapper = new ModelMapper();

        // F1
        TypeMap<TestOneVo, TestTwoVo> typeMap = modelMapper.createTypeMap(TestOneVo.class, TestTwoVo.class);
        typeMap.addMapping(TestOneVo::getName, TestTwoVo::setNameTwo);
        typeMap.addMapping(TestOneVo::getContact, TestTwoVo::setContactTwo);
        typeMap.addMapping(TestOneVo::getAccountList, TestTwoVo::setAccountTwoList);

        // F2
//        PropertyMap<TestOneVo, TestTwoVo> propertyMap = new PropertyMap<TestOneVo, TestTwoVo>() {
//            protected void configure() {
//                map().setNameTwo(source.getName());
//                map().setAccountTwoList(source.getAccountList());
//            }
//        };
//        modelMapper.addMappings(propertyMap);

        // F3
//        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        TestTwoVo testTwoVo = modelMapper.map(testOneVo, TestTwoVo.class);
        Assert.assertTrue(testTwoVo.getAddress().equals(testOneVo.getAddress()));
    }
}
