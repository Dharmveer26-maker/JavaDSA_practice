import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
      //  float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);

        //TypeCasting
//        int num = (int)(33.22f);
//        System.out.println(num);

        //automatic promotion in expression
//        int a = 257;
//        byte b = (byte)(a); //257 % 256 = 1
//
//        byte a = 20;
//        byte b = 50;
//        byte c = 100;
//        int d = (a*b)/c;
//
//        System.out.println(d);

//
//        byte a = 30;
//        a = a + 2;


//        int number = 'a';
//        System.out.println(number);


        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);

        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
    }
}
