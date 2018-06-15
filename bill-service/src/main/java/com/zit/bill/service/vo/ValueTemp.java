package com.zit.bill.service.vo;

import java.util.Optional;

/**
 * @author zwj9044
 * @date 2018-06-15
 */
public class ValueTemp<T> {

    public static <T> T defaultValue() {
        return null;
    }

    public T getOrDefault(T value, T defaultValue) {
        return value;
    }
}
