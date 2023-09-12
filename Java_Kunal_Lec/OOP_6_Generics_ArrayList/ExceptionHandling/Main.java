package com.Java_Kunal_Lec.OOP_6_Generics_ArrayList.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
//        int c = a/b;
        try {
//            int c = a/ b ;
//            divide(a,b);
            String name = "Atif";
            if (name.equals("Atif")){
                throw new MyException("Name is Kunal");
            }
        }catch (MyException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Normal exception");
        } finally {
            System.out.println("This will always exceute ");
        }
    }
    static int divide(int a , int b ) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a/b;
    }
}
