package kattis;

import java.util.Scanner;

public class DiffrentDIstances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            double x1 = sc.nextDouble();
            if(x1==0){
                return;
            }
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double p = sc.nextDouble();
            double xp = Math.pow(Math.abs(x1-x2),p);
            double yp = Math.pow(Math.abs(y1-y2),p);
            double sp = 1/p;
            double xyp = xp+yp;
            System.out.println(Math.pow(xyp,sp));
        }
    }
}
