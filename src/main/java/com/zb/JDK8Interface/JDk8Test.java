package com.zb.JDK8Interface;

/**
 * Created by Zhou
 * Date:2021/10/19
 * Time:20:53
 */
public interface JDk8Test {

    void add();

    default void get(){
        System.out.println("get...");
    }

    static void staticDel(){
        System.out.println("staticDel...");
    }
}
