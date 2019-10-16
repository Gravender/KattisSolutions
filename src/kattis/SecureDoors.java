package kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class SecureDoors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        ArrayList<String> entry = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < cases; i++) {
            String temp = sc.nextLine();
                String[] x = temp.split(" ");

                if(x[0].equals("entry") && entry.contains(x[1])){
                    System.out.println(x[1] + " entered (ANOMALY)");
                }
                else if(x[0].equals("exit") && entry.contains(x[1])){
                    System.out.println(x[1] + " exited");
                    for (int j = 0; j < entry.size(); j++) {
                        if(entry.get(j).equals(x[1])){
                            entry.remove(j);
                        }
                    }
                }
                else if(x[0].equals("exit")){
                    System.out.println(x[1] + " exited (ANOMALY)");
                }
                else{
                    System.out.println(x[1] + " entered");
                    entry.add(x[1]);
                }
        }
    }
}
