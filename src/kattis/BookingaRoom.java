package kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class BookingaRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numrooms = sc.nextInt();
        int ocupied = sc.nextInt();
        ArrayList<Integer> roomoc = new ArrayList<>();
        if(numrooms==ocupied){
            System.out.println("too late");
            return;
        }
        for (int i = 0; i < ocupied; i++) {
            roomoc.add(sc.nextInt());
        }
        for (int i = 1; i < (numrooms+1); i++) {
            if(!roomoc.contains(i)){
                System.out.println(i);
                return;
            }
        }
    }
}
