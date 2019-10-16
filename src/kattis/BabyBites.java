package kattis;

import java.util.Scanner;

public class BabyBites {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine();
        boolean fishy = false;
        String[] temp = sc.nextLine().split(" ");
       for (int i = 0; i < x; i++) {
            if(!temp[i].equals("mumble")){
                int tem = Integer.parseInt(temp[i]);
                if(tem!=(i+1)){
                    fishy = true;
                    break;
                }
            }
        }
        if(fishy){
            System.out.println("something is fishy");
        }
        else{
            System.out.println("makes sense");
        }
    }
}
