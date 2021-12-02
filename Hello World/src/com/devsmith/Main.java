package com.devsmith;






public class Main {

    public static void main(String[] args) {
//        Strings
        String message = "   Hello World   " + "!!    ";
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
        System.out.println(message.replace("!", "*"));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());

//        You can also do this to declare the String but not needed
//        String message = new String("Hello World");
        System.out.println(message);

//        PRIMITVESTYPES VS REFERENCE TYPES
//        Point point1 = new Point( x:1, y:1);
//        Point point2 = point1;
//        point1.x = 2;
//        System.out.println(point2);


//        byte x = 1;
//        byte y = x;
//        x = 2;
//        System.out.println(y);



//      REFERENCE TYPES
//        byte age = 30;
//        Date now = new Date();
//        System.out.println(now);
//
//        PRIMITIVE TYPES
//        byte age = 30;
//        long viewsCount = 3123456789L;
//        float price = 10.99F;
//        char letter = 'A';
//        boolean isEligible = true;

//        Types     Bytes        Range
//        byte        1           [-128,127]
//        short       2           [-32K, 32K]
//        int         4           [-2B, 2B]
//        long        8
//        float       4
//        double      8
        //char        2             A,B,C Single character
        //boolean     1             true/false
    }
}
