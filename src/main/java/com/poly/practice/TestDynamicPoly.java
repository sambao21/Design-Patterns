package com.poly.practice;

public class TestDynamicPoly {
    public static void main(String[] args) {
        childClass cc = new childClass();
        cc.m1();
        cc.m2();
        superClass sc = new childClass();
        sc.m1();
    }
}
