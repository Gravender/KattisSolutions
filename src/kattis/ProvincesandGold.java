package kattis;

import java.util.Scanner;

public class ProvincesandGold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int buyingpower =0;
        int temp =0;
        temp = sc.nextInt();
        buyingpower += 3*temp;
        temp = sc.nextInt();
        buyingpower += 2*temp;
        temp = sc.nextInt();
        buyingpower += temp;

        if(buyingpower>= 8){
            System.out.println("Province or Gold");
        }
        else if(buyingpower >= 6){
            System.out.println("Duchy or Gold");
        }
        else if(buyingpower == 5){
            System.out.println("Duchy or Silver");
        }
        else if(buyingpower == 4 ||buyingpower == 3 ){
            System.out.println("Estate or Silver");
        }
        else if(buyingpower == 2){
            System.out.println("Estate or Copper");
        }
        else{
            System.out.println("Copper");
        }
    }
}
