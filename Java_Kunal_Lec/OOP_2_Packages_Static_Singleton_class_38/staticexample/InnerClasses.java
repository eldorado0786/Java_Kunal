package com.Java_Kunal_Lec.OOP_2_Packages_Static_Singleton_class_38.staticexample;

public class InnerClasses {
  static   class Test{
        String name ;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Atif");
        Test b = new Test("Raza");
        System.out.println(a.name);
        System.out.println(b.name);

    }
}
