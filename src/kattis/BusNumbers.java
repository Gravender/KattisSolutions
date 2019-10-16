package kattis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BusNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> x = new ArrayList<>();
        int temp = sc.nextInt();
        for (int i = 0; i < temp; i++) {
            x.add(sc.nextInt());
        }
        Collections.sort(x);
        boolean conn = false;
        for (int i = 0; i < temp; i++) {
            if(i+1<x.size()&&x.get(i)+1==x.get(i+1)){
                if(i+2<x.size()&&!conn&&x.get(i)+2==x.get(i+2)){
                    if(i!=0){
                        System.out.print(" " + x.get(i)+"-");
                        conn = true;
                    }
                    else{
                        System.out.print(x.get(i)+"-");
                        conn = true;
                    }
                }
                else if(!conn){
                    System.out.print(" " + x.get(i));
                }
            }
            else {
                if(i==0){
                    System.out.print(x.get(i));
                }
                else if(conn) {
                    System.out.print(x.get(i));
                    conn =false;
                } else {
                    System.out.print(" " + x.get(i));
                }
            }
        }


    }
}
