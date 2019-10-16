package kattis;

import java.util.Scanner;

public class QuickBrownFox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < x; i++) {
            String input = sc.nextLine().toLowerCase();
            StringBuilder output = new StringBuilder("missing ");
            for (int j = (int)'a'; j<= 'z'; j++){
                if (!input.contains(Character.toString((char)j))){
                    output.append((char)j);
                }
            }
            if(output.length()==8){
                System.out.println("pangram");
            }
            else{
                System.out.println(output);
            }
        }
    }
}
