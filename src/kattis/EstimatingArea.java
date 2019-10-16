package kattis;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EstimatingArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#########");
        while(true){
            String[] circle = sc.nextLine().split(" ");
            if(Double.parseDouble(circle[0])==0&&Double.parseDouble(circle[1])==0&&Double.parseDouble(circle[2])==0){
                break;
            }
            System.out.print(Math.PI*Math.pow(Double.parseDouble(circle[0]),2));
            System.out.println(" " + 2*(Double.parseDouble(circle[2]) /Double.parseDouble(circle[1]))
                    *((2*Math.pow(Double.parseDouble(circle[0]),2))));

        }
    }
}
