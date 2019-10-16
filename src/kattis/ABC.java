package kattis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> output = new ArrayList<>();
        x.add(sc.nextInt());
        x.add(sc.nextInt());
        x.add(sc.nextInt());
        sc.nextLine();
        String y = sc.nextLine();
        Collections.sort(x);
        for (int i = 0; i < 3; i++) {
            if(y.charAt(i)=='A')output.add(i,x.get(0));
            else if(y.charAt(i)=='B')output.add(i,x.get(1));
            else if(y.charAt(i)=='C')output.add(i,x.get(2));
        }
        System.out.println(output.get(0)+" "+output.get(1)+" "+output.get(2));

    }
}
