package com.arunabha.exceptionhandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

//        int c = a / b;

        try {
//            int c = a / b;

            // catching exception
//            int d = divide(a, b);
//            throw new Exception("just for fun!!");
            throw new MyException("Something went wrong!!");

        }catch (MyException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) { // parent class ref var of child class
            System.out.println(e.getMessage());
        }catch (Exception e){
            // u will have to put more strict exceptions first
            // if u put Exception first, no way other calls will execute
            System.out.println("normal exception");
        }finally {
            // finally is optional and only one finally block is permitted
            System.out.println("no matter what! this will always execute whether there is an exception or not!");
        }
    }

    // throwing arithmetic exception
    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("please do not divide by zero!!");
        }
        return a / b;
    }
}
