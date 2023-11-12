package com.arunabha.enumexamples;

//import java.lang.Enum;

public class Basic {

    // purpose of enum
    // for a particular class, we need a number of particular objects only
    // in that case we use enum
    // all the enums explicitly extends java.lang.enum class
    // enum cannot be a superclass either
    enum Week implements A{

        // these are enum constants
        // public, static, final members by default
        // since it's final, you cannot create child enums
        // type is 'Week'
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday;

        Week(){
            // constructor will run for all at once even if we try to access only one
            // this is not public or protected, only private or default
            // why?
            // if we make it public or protected, it will allow initialization of more than one objects
            // we only want constant number of objects for Week
            // internally it's like: public static final Week Monday = new Week();
            System.out.println("Constructor called for " + this);
        }

        @Override
        public void hello() {
            System.out.println("Hello it's is " + this);
        }

        // this is not allowed
//        void fun();
    }

    public static void main(String[] args) {
//        System.out.println(Week.Monday);

        Week week = null;
        week = Week.Monday;
        week.hello();

        System.out.println(Week.valueOf("Monday"));


//        for (Week day : Week.values()) {
//            System.out.println(day + ", " + day.ordinal());
//        }
    }
}
