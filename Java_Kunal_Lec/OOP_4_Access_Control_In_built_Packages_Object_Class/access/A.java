package com.Java_Kunal_Lec.OOP_4_Access_Control_In_built_Packages_Object_Class.access;

public class A {
  private int num;
    String name;
    int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
