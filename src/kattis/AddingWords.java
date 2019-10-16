package kattis;

import java.util.Hashtable;
import java.util.Scanner;

public class AddingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hashtable<Integer, String> num = new Hashtable<>();
        Hashtable<String, Integer> dic = new Hashtable<>();
        boolean valid = true;
        while(sc.hasNextLine()){
            String[] input = sc.nextLine().split(" ");
            StringBuilder output = new StringBuilder();
            if(input[0].equals("def")){
                if(num.contains(input[1])){
                    num.remove(input[1]);
                    dic.remove(input[2]);
                }
                dic.put(input[1], Integer.parseInt(input[2]));
                num.put(Integer.parseInt(input[2]), input[1]);
            }
            else if(input[0].equals("calc")){
                int total =0;
                valid = true;
                for (int i = 1; i < input.length; i++) {
                    if(i==1){
                        output.append(input[i]);
                       if( num.contains(input[i])){
                           total = total + dic.get(input[i]);
                       }
                       else{
                           valid = false;
                       }
                    }
                    else if(input[i].equals("+")){
                        output.append(" "+ input[i] + " "+ input[i+1]);
                        if( num.contains(input[i+1])&& valid){
                            total = total + dic.get(input[i+1]);
                        }
                        else{
                            valid = false;
                        }
                        i++;
                    }
                    else if(input[i].equals("-")){
                        output.append(" "+ input[i] + " "+ input[i+1]);
                        if( num.contains(input[i+1])&& valid){
                            total = total - dic.get(input[i+1]);
                        }
                        else{
                            valid = false;
                        }
                        i++;
                    }
                    else{
                        output.append(" "+ input[i]);
                        if( dic.contains(total)&& valid){
                            System.out.println(output + " " + num.get(total));
                        }
                        else{
                            System.out.println(output + " unknown");
                        }
                    }
                }
            }
            else if(input[0].equals("clear")){
                num.clear();
                dic.clear();
            }
            else{
                return;
            }
        }
    }
}
