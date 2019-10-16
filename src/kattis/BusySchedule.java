package kattis;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class BusySchedule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean first= true;
        while(true){
            int x = sc.nextInt();
            if(x==0)return;
            if(first) first =false;
            else System.out.println();
            sc.nextLine();
            HashMap<Integer,String> output = new HashMap<>();
            for (int i = 0; i < x; i++) {
                String input = sc.nextLine();
                int minute=0;
                if(input.contains("a")){
                    if(input.length()==10){
                        if(!(input.charAt(1)=='2')){
                            minute += (Integer.parseInt(input.substring(0, 2)) * 60);
                        }
                        minute+=Integer.parseInt(input.substring(3,5));
                        if(output.containsKey(minute))minute++;
                        output.put(minute,input);
                    }
                    else{

                        minute += (Integer.parseInt(input.substring(0,1)) * 60);
                        minute +=Integer.parseInt(input.substring(2,4));
                        if(output.containsKey(minute))minute++;
                        output.put(minute,input);
                    }
                }
                else{
                    minute+=720;
                    if(input.length()==10){
                        if(!(input.charAt(1)=='2')){
                            minute += (Integer.parseInt(input.substring(0, 2)) * 60);
                        }
                        minute+=Integer.parseInt(input.substring(3,5));
                        if(output.containsKey(minute))minute++;
                        output.put(minute,input);
                    }
                    else{
                        minute += (Integer.parseInt(input.substring(0,1)) * 60);
                        minute+=Integer.parseInt(input.substring(2,4));
                        if(output.containsKey(minute))minute++;
                        output.put(minute,input);
                    }
                }
            }
            TreeMap<Integer,String> sort = new TreeMap<>();
            sort.putAll(output);
            for (Map.Entry<Integer, String> entry: sort.entrySet()
                 ) {
                System.out.println(entry.getValue());
            }
        }
    }
}
