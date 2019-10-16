package kattis;

import java.util.Scanner;

public class Avion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            if(sc.nextLine().contains("FBI")){
                output.append((i+1)+" ");
                if(i==4)output.deleteCharAt(output.length()-1);
            }
        }
        if(output.length()==0) System.out.println("HE GOT AWAY!");
        else if(output.length()==2){
            output.deleteCharAt(output.length()-1);
            System.out.println(output);
        }
        else System.out.println(output);
    }
}
