package Crt;

public class Main {
    public static void main(String[] args) {
//        ternary_Operator();
//        variable = a reusable container for a value
//                   a variable behaves as if it was the value it contains.

        //Primitive  = simple value stores directly in memory(stack).
        //Refernce  = memory address(stack) that ponts to the (heap).

//        int age = 21;//declaration
//        int year = 2024;
//        int quantity = 1;
//
//         double price = 19;
//         double gpa = 3.5;
//         double temperature = -12.5;
//
//         char grade = 'A';
//         char symbol = '!';
//         char currency = '$';
//
//         boolean isStudent = false;
//         boolean forSale = false;
//         boolean isOnline = true;

//         if (isStudent){
//             System.out.println("You are a student!");
//         }
//         else {
//             System.out.println("You are not a student!");
//         }

//        String name = "Rishabh jain";
//        String food = "pizza";
//        String car = "mustang";
//        String color = "red";
//
//        System.out.println("Your choice is " + color + " " + car + " " + year);
//        System.out.println("The price of a car is " + currency + " " + price);
//        if (forSale){
//            System.out.println("There is a " + car + " For sale.");
//        }
//        else {
//            System.out.println("There is no " + car + " For sale");
//        }
        // 12 hour

        //THIS IS MY FIRST JAVA PROGRAM

        /*
        This
        is
        a
        multi-line
        comment
         */

//        System.out.print("I like pizza!\n");
//        System.out.print("It's really good!\n");
//        System.out.println("Buy me pizza!");

//        int age = 21;
//        int quantity = 1;
//
////        System.out.println(quantity);
//        double price = 18.99;
//        double gpa = 3.5;
//
//        boolean isStudent = false;
//        System.out.println(isStudent);
//
//        if (isStudent){
//            System.out.println("You are a student");
//        }else {
//            System.out.println("You are not a student");
//        }

//        String name = "Rishabh";
//        String food  = "pizza";
//        String color = "red";
//        String car = "mustang";
//        int year  = 2024;

//        System.out.println("HEllo! " +name);
//        System.out.println("Your favourote food is "+food);
//        System.out.println("Youe choice is "+ color +" "+ car +" "+ year );

//        boolean forSale = true;
//
//        if (!forSale){
//            System.out.println("The "+ car +" is for sale");
//        }
//        else {
//            System.out.println("not for sale");
//        }


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your age:");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println("Enter your favourite color: ");
//        String color = scanner.nextLine();
//
//        System.out.println("your age is " + age);
//        System.out.println("your fav color is " + color);
//
//
//
//        scanner.close();

        //calculate area of a rectangle

//        double width = 0;
//        double height = 0;
//        double area = 0;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter the width: ");
//        width = sc.nextDouble();
//
//        System.out.print("enter the height: ");
//        height = sc.nextDouble();
//
//        area = width * height;
//
//        System.out.println("Area of a rectangle " + area + " m^2");
//
//
//        sc.close();

        //MAD LIBS GAME
//        Scanner sc = new Scanner(System.in);
//
//        String adjective1;
//        String noun1;
//        String adjective2;
//        String verb1;
//        String adjective3;
//
//        System.out.print("Enter an adjective (description): ");
//        adjective1 = sc.nextLine();
//        System.out.print("Enter a noun (animal or person): ");
//        noun1 = sc.nextLine();
//        System.out.print("Enter an adjective (description): ");
//        adjective2 = sc.nextLine();
//        System.out.print("Enter a verb end with -ing (action): ");
//        verb1 = sc.nextLine();
//        System.out.print("Enter an adjective (description): ");
//        adjective3 = sc.nextLine();
//
//        System.out.println("Today I went to a "+ adjective1 + " zoo.");
//        System.out.println("In an exhibit , I saw a " + noun1 + ".");
//        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
//        System.out.println("I was " + adjective3 + "!");
//
//        sc.close();

        //Arithmetic operators
//        int x = 10;
//        int y = 2;
//        int z;

//        z = x + y;
//        z = x - y;
//          z = x * y;
//          z = x / y;
//          z = x % y;

//        System.out.println(z);
        // assignmnt operators
//        int x = 10;
//        int y = 3;
//        x += y;
//        x -= y;
//        x *= y;
//        x /= y;
//          x %= y;
//        System.out.println(x);

        //Increment and Dcerement operator
//        int x = 1;
////        x++;
////        x++;
////        x++;
//        x--;
//        x--;
//        x--;
//
//        System.out.println(x);
//        testBitwiseOperator();
//        testShiftOperator();
//        controlStatement();
//        findFirstMax();
//        findFirstMin();
//        findReverseOfNumber();
//        practiceSwitchCase();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter no : ");
//        int n = sc.nextInt();
//        table5to10();
        loopStatement();
     }
     static void ternary_Operator(){
         //ternary
//        if = ?
//        else = :
         int a =  10;
         int b = 6;
         int c = 4;
         int d = 11;

//         String maxOfThree = a > b && a > c ? "A" : b > c ? "B" : "C";
//         System.out.println("max of three: " + maxOfThree);

//         String maxOfFour = a > b && a > c && a > d ? "a" : b > c && b > d ? "b" : c > d ? "c" : "d";
//         System.out.println("max of four: " + maxOfFour);

         String maxOfFour = "";
         String secondMax = "";

         if ( a > b && a > c && a > d){
             maxOfFour = "a";
             a = Integer.MIN_VALUE;
         }
         else if ( b > c && b > d){
             maxOfFour = "b";
             b = Integer.MIN_VALUE;
         } else if (c > d) {
             maxOfFour = "c";
             c = Integer.MIN_VALUE;
         }else {
             maxOfFour = "d";
             d = Integer.MIN_VALUE;
         }
         System.out.println("maxOfFour" + maxOfFour);

         //Second max element
         if ( a > b && a > c && a > d){
             secondMax = "a";
         }
         else if ( b > c && b > d){
             secondMax = "b";
         } else if (c > d) {
             secondMax = "c";
         }else {
             secondMax = "d";
         }
         System.out.println(secondMax);
     }

     static void testBitwiseOperator(){
        // &,|,^,~
         int a = 10;
         int b = 5;
         int c =7;


         System.out.println("a & b: " + (a & b));
         System.out.println(Integer.toBinaryString(a&b));
         System.out.println("a | b: " + (a | b));
         System.out.println(Integer.toBinaryString(a|b));
         System.out.println("a ^ b: " + (a ^ b));
         System.out.println(Integer.toBinaryString(a^b));
         System.out.println("a & b & c: " + (a & b & c ));
         System.out.println("a & b & c :" + Integer.toBinaryString(a & b & c));
         System.out.println("a | b & | c: " + (a | b | c ));
         System.out.println("a | b & | c :" + Integer.toBinaryString(a | b | c));
         System.out.println("a^ b ^ c: " + (a ^ b ^ c ));
         System.out.println("a ^ b ^ c :" + Integer.toBinaryString(a ^ b ^ c));
         System.out.println("~a : " + Integer.toBinaryString(~a));
         System.out.println("~b : " + Integer.toBinaryString(~b));
         System.out.println("~c : " + Integer.toBinaryString(~c));
     }
     static void testShiftOperator(){
        int a = 10;
         System.out.println("a binary : " + Integer.toBinaryString(a));
         System.out.println(a << 2);
         System.out.println("a shifted two steps: " + Integer.toBinaryString(a));
         System.out.println(a >> 2);
         System.out.println("a shifted two steps: " + Integer.toBinaryString(a));
         System.out.println(a << 4);
         System.out.println("a shifted four steps: " + Integer.toBinaryString(a));
         System.out.println(a >> 4);
         System.out.println("a shifted four steps: " + Integer.toBinaryString(a));
//         int reuslt = a <<< 3;
         a = -5;
         System.out.println("a: " + a);
         System.out.println("binary no : " + Integer.toBinaryString(a));
         System.out.println("unsigned right shift: " + (a >>> 3));
         System.out.println(Integer.toBinaryString(a >>> 3));
     }
     /*
     control statement
     if
     else
     else if
     nested if else
     switch
      */
    static void controlStatement(){



//        if (a > b){//If (condition)(true/false)
//            //inside if
//        }
//        else{
//            //inside else


    }
    static void findFirstMax(){
        int a = 10;
        int b = 5;
        int c = 4;
        int d = 18;
        int e = 9;
        int f = 7;

        int firstMax;
        int secondMax;
        if (a > b && a > c && a > d && a > e && a > f){
            firstMax = a;
            a = Integer.MIN_VALUE;
        } else if (b > c && b > d && b > e && b > f) {
            firstMax = b;
            b = Integer.MIN_VALUE;
        } else if (c > d && c > e && c > f) {
            firstMax = c;
            c = Integer.MIN_VALUE;
        } else if (d > e && d > f) {
            firstMax = d;
            d = Integer.MIN_VALUE;
        } else if (e > f) {
            firstMax = e;
            e = Integer.MIN_VALUE;
        }else {
            firstMax = f;
            f = Integer.MIN_VALUE;
        }
        System.out.println("First Max: " + firstMax);
        //Second Max
        if (a > b && a > c && a > d && a > e && a > f){
            secondMax = a;
        } else if (b > c && b > d && b > e && b > f) {
            secondMax = b;
        } else if (c > d && c > e && c > f) {
            secondMax = c;
        } else if (d > e && d > f) {
            secondMax = d;
        } else if (e > f) {
            secondMax = e;
        }else {
            secondMax = f;
        }
        System.out.println("Second max: " + secondMax);
    }
    static void findFirstMin(){
        int a = 10;
        int b = 5;
        int c = 4;
        int d = 18;
        int e = 9;
        int f = 7;

        // First Min
        int firstMin;

        if (a < b && a < c && a < d && a < e && a < f){
            firstMin = a;
            a = Integer.MAX_VALUE;
        } else if (b < c && b < d && b < e && b < f) {
            firstMin = b;
            b = Integer.MAX_VALUE;
        } else if (c < d && c < e && c < f) {
            firstMin = c;
            c = Integer.MAX_VALUE;
        } else if (d < e && d < f) {
            firstMin = d;
            d = Integer.MAX_VALUE;
        } else if (e < f) {
            firstMin = e;
            e = Integer.MAX_VALUE;
        }else {
            firstMin = f;
            f = Integer.MAX_VALUE;
        }
        System.out.println("First Min: " + firstMin);
    }

    static void findMaxDifferneceBetweenValues(){

        int a = 10;
        int b = 9;
        int c = 8;
        int d = 6;

        int diff_ab = a - d;
        int diff_ac = a - c;
        int diff_ad = a - d;
        int diff_bc = b - c;
        int diff_bd = b - d;
        int diff_cd = c - d;

        int first;

        if (diff_ab > diff_ac && diff_ab > diff_ad && diff_ab > diff_bc && diff_ab > diff_bd && diff_ab > diff_cd){

        }
    }

    static void findReverseOfNumber(){
        int digitCount = 4;
        int a = 1234;
        System.out.println("Number: " + a);
        int b = 0;

        // output : 4321
        int divideValue = a / 10; // 123
        int modValue = a % 10;  // 4

        int multiplyby = 1;
        if (digitCount ==4)
        {
            multiplyby = 1000;
        }
        b = modValue * multiplyby; // 4000
        digitCount--; // 3

        int div1 = divideValue / 10; // 12
        int mod1 = divideValue % 10; // 3

        if (digitCount == 3){
            multiplyby = 100;
        }
        b += mod1 * multiplyby; // 4300
        digitCount--;
//        System.out.println(b);

        int div2 = div1 / 10; //1
        int mod2 = div1 % 10; //2

        if (digitCount == 2){
            multiplyby = 10;
        }
        b += mod2 * multiplyby; //4320
        digitCount--;

        int div3 = div2 / 10; // 0
        int mod3 = div2 % 10; // 1

        if (digitCount == 1){
            multiplyby = 1;
        }
        b += mod3 * multiplyby; // 4321

        System.out.println("Reverse number: " + b);
    }
    static void practiceSwitchCase(){
//        int day = 3;
//        final int no = -1;
//
//        switch (day) {
//            case 1:
//                System.out.println("today is monday");
//                break;
//            case 2:
//                System.out.println("today is Tueday");
//                break;
//            case 3:
//                System.out.println("today is Wednesday");
//                break;
//            case 4:
//                System.out.println("today is Thursday");
//                break;
//            case 5:
//                System.out.println("today is Friday");
//                break;
//            case 6:
//                System.out.println("today is Saturday");
//                break;
//            case 7:
//                System.out.println("today is Sunday");
//                break;
//            case no:
//                System.out.println("today is no day");
//                break;
//            default:
//                System.out.println("Invalid input");

        //char, boolean
//        char grade = 'A';
//
//        switch(grade){
//            case 'A':
//                System.out.println("very good");
//                break;
//            case 'B':
//                System.out.println("good");
//                break;
//            case 'C':
//                System.out.println("not bad");
//                break;
//            default:
//                System.out.println("bad");ca
        }
        static void practiceForLoop(){
        int no = 5;
            for (int n = 0; n < no ; n++) {
                System.out.println(n * no);
            }
    }
    static void table5to10(){
//        int no = 5;
//        for (int i = 1; i <= 10 ; i++){
//            System.out.println("5 X " + i + " = " + no * i);
//        }
//        no++;
//        System.out.println();
//        for (int i = 1; i <= 10 ; i++){
//            System.out.println(no +" X " + i + " = " + no * i);
//        }
//        no++;
//        System.out.println();
//        for (int i = 1; i <= 10 ; i++){
//            System.out.println(no +" X " + i + " = " + no * i);
//        }
//        no++;
//        System.out.println();
//        for (int i = 1; i <= 10 ; i++){
//            System.out.println(no +" X " + i + " = " + no * i);
//        }
//        no++;
//        System.out.println();
//        for (int i = 1; i <= 10 ; i++){
//            System.out.println(no +" X " + i + " = " + no * i);
//        }
//        no++;
//        System.out.println();
//        for (int i = 1; i <= 10 ; i++){
//            System.out.println(no +" X " + i + " = " + no * i);
//        }
        //Another Method
;
            //Even no table
//        int no = 1;
//        int i = 1;

//        for (int i = 1; i <= 10; i++){
//            if (no % 2 == 0){
//                System.out.println(no * i);
//            }
//            if (i == 10 && no <9){
//                i = 0;
//                no++;
//
//            }
//
//        }
//        int no = 1;
//        int i = 1;
//        while (i++ <= 10){
//            if (no % 2 == 0){
//                System.out.println(no * i);
//            }
//            if (i == 10 && no <9){
//                i = 0;
//                no++;
//            }
//        }
//
    }
    static void loopStatement(){
//        for (int i = 20; i >= 0; i--){
//            if (i % 2 != 0 && i < 10){
//                System.out.print(i + " ");
//            }
//            if (i % 2 == 0 && i >= 10){
//                System.out.print(i + " ");
//            }
//        }

        // 1, 3, 6, 10, 15, 13, 10, 6, 1
        // 15, 13, 10, 6, 1
       // 1, 3, 6, 10, 15
//        int no = 5;
//        int counter = 2;
//        int seriesValue = 1;
//        System.out.print(seriesValue + " ");
//
//        for (int i = 0; i <= no * 2 -1; i++){
//            if (i <= 5) {
//                seriesValue += counter;
//                System.out.print(seriesValue + " ");
//                counter++;
//            }else{
//
//
//            }
//        }
//        int counter = 2;
//        int seriesvalue = 1;
//        System.out.print(seriesvalue + " ");
//        for (int i = 1; i <= 9; i++ ){
//            if (i < 5){
//                seriesvalue += counter;
//                System.out.print(seriesvalue + " ");
//                counter++;
//            }
//            if ( i == 5 ){
//                counter = 2;
//            }
//            if (i > 5){
//                seriesvalue -= counter;
//                System.out.print(seriesvalue + " ");
//                counter++;
//            }
//        }
        // 1 5 10 14 19 23 28
//        int seiresValue = 1;
//        System.out.print(seiresValue + " ");
//        for (int i = 2; i <= 7; i++){
//            if (i % 2 == 0) {
//                seiresValue += 4;
//                System.out.print(seiresValue + " ");
//            }
//            else {
//                seiresValue += 5;
//                System.out.print(seiresValue + " ");
//            }
//        }
        //30 28 25 23 20 18 15 13 10 8 5 3 0
//        int seiresValue = 30;
//        System.out.print(seiresValue + " ");
//        for (int i = 2; i <= 13; i++){
//            if (i % 2 == 0) {
//                seiresValue -= 2 ;
//                System.out.print(seiresValue + " ");
//            }
//            else {
//                seiresValue -= 3;
//                System.out.print(seiresValue + " ");
//            }
//        }
        /*
        1 1 1 1 1
        2 2 2 2 2
        3 3 3 3 3
        4 4 4 4 4
        5 5 5 5 5
         */

//        int number = 1;
//        for (int i = 1; i <= 5 ; i++) {
//            for (int j = 1; j <= 5; j++){
//                System.out.print(i + " ");
//            }
//            System.out.println();
//            number++;

        /*
        1 2 3 4 5
        6 7 8 9 10
         */
//        int number = 1;
//        for (int i = 1; i <= 2; i++){
//            for (int j = 1; j <= 5; j++) {
//                System.out.print(number + " ");
//                number++;
//            }
//            System.out.println();
//        }

//        for (int i = 1; i <= 10; i++ ){
//            System.out.print(i + " ");
//            if (i == 5) {
//                System.out.println();
//            }

            // 1 2 3 4 5
            // 5 4 3 2 1
//        int number = 1;

//          for (int i = 1; i <= 2; i++){
//              for (int j = 1; j <= 5; j++){
//                 if (i == 1) {
//                     System.out.print(number + " ");
//                     number++;
//                 }else{
//                     number--;
//                     System.out.print(number + " ");
//                 }
//              }
//              System.out.println();
//          }
        int number = 1;



          /*
          1 3 5 7 9
          2 4 6 8 10
          3 5 7 9 11
          4 6 8 10 12
          5 7 9 11 13
           */
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 15 ; j++){
                if (i % 2 != 0 && j % 2 != 0 ){
                    System.out.print(j + " ");
                }
                if (i % 2 == 0 && j % 2 == 0 ){
                    System.out.print(j+ " ");
                }
            }
            System.out.println();
        }


    }
}


