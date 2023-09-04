package com.Java_Kunal_Lec;

public class OOP_1_Introduction_Concepts_Classes_Objects_Constructors_Keywords_37 {
    public static void  main(String[] args) {
//        create 5 roll nos
        int[] nums = new int[5];
//        store 5 names
        String[] names = new String[5];

        /*Data of 5 students : {roll no,name,marks}*/
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        /* Creating data type using the class  */
        Students[] students = new Students[5];

        /* Just Declaring class */

//        Students atif;
//        System.out.println(atif);// it gives error

        /* Initialising the class  */
//        atif = new Students();

        Students atif = new Students();
        Students raza = new Students(1,"raaz",7);

//        atif.rno = 13;
//        atif.name = "Atif";
//        atif.marks = 88.5F;

        System.out.println(atif.rno);
        System.out.println(atif.name);
        System.out.println(atif.marks);

        /* calling a function of the class  */

        atif.name_change("Raza");
        atif.greeting();
        System.out.println(raza.rno);
        System.out.println(raza.name);
        System.out.println(raza.marks);



    }

}

/* Create a class */
/* for every single student */
class Students {
    int rno;
    String name;
    float marks;
    /* Creating the constructor  */

    /* We need a way to add the values of the above properties object by object */
    /* We need one word to access every object */
//    Students () {
//        atif.rno = 13;
//        atif.name = "Atif";
//        atif.marks = 88.5F;
//    }
    /* Constructor overloading  */
    Students() {
        this.rno = 13;
        this.name = "Atif";
        this.marks = 88.5F;
    }
    Students(int rol,String name,float marks){
        this.rno = rol;
        this.name = name;
        this.marks = marks;
    }

    /* Creating the function in the class  */
    void greeting(){
        System.out.println("Hello! My name is "+name);
    }
    /* Creating the function to change the name   */
    void name_change(String Newname){
        name=Newname;
    }

}
