package com.Java_Kunal_Lec.OOP_3_Principles_Inheritance_Poly_Encap_Abstr;

public class BoxWeight extends Box {
    double weight;
    public BoxWeight(){
        this.weight = -1 ;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);//What is this ? call the parent class constructor
        //used to initialise values present in the parent class
        this.weight = weight;
    }
}
