package com.mappertest.test;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author zwj9044
 * @date 2018-06-15
 */
public class OtherTest {

    @Test
    public void test() {
        Arrays.asList("123", "345", "456").forEach(e -> System.out.println(e));
    }

    @Test
    public void test2() {
        System.out.println(new DefaulableImpl().notRequiredFunc());
    }

    @Test
    public void test3() {
        Defaulable defaulable = DefaulableFactory.create(DefaulableImpl::new);
        System.out.println(defaulable.notRequiredFunc());
    }

    @Test
    public void test4() {

    }
}
