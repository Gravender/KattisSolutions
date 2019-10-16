package kattis;

import java.util.Scanner;

public class JanitorTrouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double perimeter = (a+b+c+d)/2;
        double  answer= Math.sqrt((perimeter-a)*(perimeter-b)*(perimeter-c)*(perimeter-d));
        System.out.println(answer);


    }
}
