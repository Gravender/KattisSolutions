package kattis;

import java.util.Scanner;

public class LastFactorialDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            System.out.println(fac(sc.nextInt()));
        }
    }
    public static int fac(int x, int z){
        z--;
        if(z==0){
            String y= Integer.toString(x);
            return Character.getNumericValue(y.charAt(y.length()-1));
        }
        else return fac(x*(z),z);
    }
    public static int fac(int x){
        return fac(x,x);
    }

}

