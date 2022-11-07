package com.platzi.springboot.bean;

public class MyBeanDependencyImplement implements MyBeanWithDependency{

    private MyOperation myOperation;

    public MyBeanDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int numero = 1;
        myOperation.sumOne(numero);
        System.out.println("Hola With Indeppendency");
    }
}
