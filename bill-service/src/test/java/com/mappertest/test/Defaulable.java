package com.mappertest.test;

public interface Defaulable {

    default String notRequiredFunc() {
        return "Default implementation";
    }

}
