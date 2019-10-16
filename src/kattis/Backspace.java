package kattis;

import java.util.Scanner;

public class Backspace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        str.append(sc.nextLine());
        int j =0;
        int k = 0;
        int l=0;
        boolean del = false;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '<'){
                temp.deleteCharAt(temp.length()-1);
            }
            else{
                temp.append(str.charAt(i));
            }
        }
        System.out.println(temp.toString());
    }
}
