package kattis;

import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if(i==0){
                output.append(input.charAt(i));
            }
            else if(input.charAt(i)=='-'){
                output.append(input.charAt(i+1));
            }
        }
        System.out.println(output);
    }
}
