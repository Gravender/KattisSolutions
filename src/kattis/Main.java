package kattis;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] x = sc.nextLine().split(" ");
        double tank = Double.parseDouble(x[0]);
        double leak = Double.parseDouble(x[1]);
        double distance = Double.parseDouble(x[2]);
        int Highest =0;
        double temptank = tank;
        for (int i = 0; i < 6; i++) {
            temptank = tank;
            String[] y = sc.nextLine().split(" ");
            double[] mpg = {Double.parseDouble(y[0]),Double.parseDouble(y[1])};
            boolean dis = true;
            while(temptank > (10^-6) && dis) {
                if (distance <= 0 && temptank > (10^-6)) {
                    if(mpg[0]  > Highest){
                        Highest = (int)mpg[0];
                    }
                    dis = false;
                } else {

                distance = distance - mpg[0];
                temptank = temptank - (mpg[0] / mpg[1]) - leak;
                System.out.println(temptank);
                }
            }
        }
        if(Highest ==0){
            System.out.println("NO");
        }
        else{
            System.out.println("YES "+ Highest);
        }
    }
}
