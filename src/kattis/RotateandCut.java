package kattis;

import java.util.Scanner;

public class RotateandCut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numcases = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numcases; i++) {
            StringBuilder str = new StringBuilder();
            String[] input = sc.nextLine().split(" ");
            str.append(input[1]);
            for (int j = 0; j < Integer.parseInt(input[0]); j++) {
                int sub = (int)(str.length()*0.25);
                if(sub==0)break;
                if(j%2==0)str.delete(0,sub);
                else str.delete(str.length()-sub,str.length());
            }
            System.out.println(str);
        }
    }
}
