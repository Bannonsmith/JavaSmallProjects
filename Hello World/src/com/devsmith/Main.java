package com.devsmith;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();

//            IF STATEMENTS
        if(temperature > 30) {
            System.out.println("It's a hot day");
        } else if (temperature > 20) {
                System.out.println("It's a nice day");
        } else {
                System.out.println("It's cold");
        }


//        LOGICAL OPERATORS
//        int temperature = 22;
//        boolean isWarm = temperature > 20 && temperature < 30;
//        System.out.println(isWarm);
//
//
//        boolean hasHighIncome = true;
//        boolean hasGoodCredit = true;
////        OR OPERATOR
//        boolean isEligible = hasHighIncome || hasGoodCredit;
//        System.out.println(isEligible);
//
//        boolean hasHighIncome = true;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalRecord = false;
//        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord ;
//        System.out.println(isEligible);



//        COMPARISON OPERATORS
//            int x = 1;
//            int y = 1;
//        System.out.println(x == y);
//        System.out.println(x != y);
//        System.out.println(x <= y);





//        SCANNER
//                Scanner scanner = new Scanner(System.in);
//                System.out.print("Age: ");
//                byte age = scanner.nextByte();
//                System.out.println("You are " + age);
//
//        System.out.print("Name: ");
//        String name = scanner.nextLine().trim();
//        System.out.println("You are " + name);

//        FORMATTING NUMBERS
//        change input into currency
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result = currency.format(1234567.891);
//        System.out.println(result);
//
//        change input into percentage
//        NumberFormat percent = NumberFormat.getPercentInstance();
//        String result = percent.format(1234567.891);
//        System.out.println(result);
//
//        Method Chaining(just keep calling methods on methods. If the first method has a return you can continue to call methods)
//        String result = NumberFormat.getPercentInstance().format(0.1);
//        System.out.println(result);




//        MATH CLASS
//        Math.random();
//        Math.ceil() ;
//        Math.max();
//        int result =  Math.round(1.1F);
//        System.out.println(result);

////        CASTING
//      Implicit casting
//      byte > short > int > long > float > double
//        short x = 1;
//        int y = x + 2;
//        System.out.println(y);
//
//        Implicit casting works because they are all numbers and the program will casting if for you
//        double x = 1.1;
//        int y = (int)x + 2;
//        System.out.println(y);
//
//        Implicit casting also works from primitives to objects like strings
//                String x = "1";
//                Integer.parseInt(x);
//                Float.parseFloat(x);
//                Double.parseDouble(x);
//                int y = (int)x + 2;
//                System.out.println();



//        ORDER OF OPERATIONS (), */, +-
//        Order of operations goes parenthesis first then multiplication and division and then addition and subtraction
//        int x = 10 + 3 * 2;
//        System.out.println(x);

//        ARITHMETIC EXPRESSIONS
//        AUGEMTED OPERATORS +=, -=, *=, /=
//        x = x + 2;
//        x += 2;
//
//        int x = 1;
//        x++;
//        ++x;
//        System.out.println(x);
//
//
//        double result = (double)10 / (double)3;
//        DIVSION IS SPECIAL IN JAVA THE DIVSION OF TWO *WHOLE NUMBERS* IS A *WHOLE* NUMBER
//        SO THE ANSWER BELOW IS 3: YOU HAVE
//        TO USE TYPECASTING TO FIX THE PROBLEM IF YOU WANT THE TRUE VALUE AND TYPE CAST TO FLOAT OR DOUBLE ON BOTH
//        SIDES OF THE EQUAL SIGN.
//
//        int result = 10 / 3;
//            int result = 10 * 3;
//            int result = 10 - 3;
//            int result = 10 + 3;
//        System.out.println(result);

//        CONSTANTS
//            final keyword makes it an constants/ cannot be changed
//                final float pi = 3.14F;
//                pi = 1;


//        MULTI-DIMENSIONAL ARRAYS
//
//        int[][] numbers = { { 1, 2, 3}, {4,5,6 } };
//        System.out.println(Arrays.deepToString(numbers));
//
//        THREE DIMENSIONAL ARRAY
//        int[][][] numbers = new int[2][3][3];
//        numbers[0][0][2] = 1;
//        System.out.println(Arrays.deepToString(numbers));
//
//        TWO DIMENSIONAL ARRAY
//        int[][] numbers = new int[2][3];
//        numbers[0][0] = 1;
//        System.out.println(Arrays.deepToString(numbers));


//        ARRAYS
//
//        int[] numbers = {2,3,4,5,6,4,1,5};
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//
//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers);



//        ESCAPE SEQUENCES
//        showing how to add a tab
//        String message = "C\tWINDOWS\\...";
//        showing how to do a next line
//        String message = "C\nWINDOWS\\...";
          //showing how to add in a pathway and to use backslash on the backslashes so the compiler can read it corectly
//        String message = "C\\WINDOWS\\...";
//        showing how to add quotation marks in java
       // String message = "Hello \"Mate\"";
//        System.out.println(message);


//        STRINGS
//        String message = "   Hello World   " + "!!    ";
//        System.out.println(message.endsWith("!!"));
//        System.out.println(message.length());
//        System.out.println(message.indexOf("H"));
//        System.out.println(message.replace("!", "*"));
//        System.out.println(message.toLowerCase());
//        System.out.println(message.toUpperCase());
//        System.out.println(message.trim());

//        You can also do this to declare the String but not needed
//        String message = new String("Hello World");
//        System.out.println(message);

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
