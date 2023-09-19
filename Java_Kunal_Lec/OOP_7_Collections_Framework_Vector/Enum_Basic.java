package com.Java_Kunal_Lec.OOP_7_Collections_Framework_Vector;

public class Enum_Basic {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
//        There are enum constants
//        public , static and final
//        since its final you can't create child enum
//        type is week

        Week(){
            System.out.println("Constructor called for "+this);
        }
//        this is not public or protected , only private or default
//         why? we don't want to create new object
//        this is not the enum concept , that's why

//        internally: public static final week Monday = new Week();
    }

    public static void main(String[] args) {
        Week week ;
        week = Week.Monday;
        for (Week day : Week.values()){
            System.out.println(day);
        }
        System.out.println(week);
        System.out.println(week.ordinal());
        System.out.println(Week.valueOf("Monday"));
    }
}
