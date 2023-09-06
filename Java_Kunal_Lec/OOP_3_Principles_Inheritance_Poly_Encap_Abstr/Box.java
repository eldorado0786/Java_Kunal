package com.Java_Kunal_Lec.OOP_3_Principles_Inheritance_Poly_Encap_Abstr;

public class Box {
    double l;
    double h;
    double w;

    /* Creating the normal constructor */
    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }
    /* Cube */

     Box(double side) {
        this.l = side;
        this.h = side;
        this.w = side;
    }

     Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(Box old){
         this.h = old.h;
         this.l = old.l;
         this.w = old.w;
    }
    public void information(){
        System.out.println("Running the box");
    }
}
