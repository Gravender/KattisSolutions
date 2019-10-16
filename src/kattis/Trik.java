package kattis;

import java.util.Scanner;

public class Trik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int temp = 1;
        for (int i = 0; i < x.length(); i++) {
            if(x.charAt(i)=='A'){
                if(temp==2){
                    temp =1;
                }
                else if(temp ==1){
                    temp =2;
                }
            }
            else if(x.charAt(i)=='B'){
                if(temp==2){
                    temp =3;
                }
                else if(temp ==3){
                    temp =2;
                }
            }
            else{
                if(temp==3){
                    temp =1;
                }
                else if(temp ==1){
                    temp =3;
                }

            }
        }
        System.out.println(temp);

    }
}
