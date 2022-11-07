package com.platzi.springboot.bean;

public class MyOperationImplement implements MyOperation{
    @Override
    public int sumOne(int value) {
        return value+1;
    }
}
