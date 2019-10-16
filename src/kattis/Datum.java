package kattis;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Datum {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String[] x = sc.nextLine().split(" ");
        String dateS = String.format("%d-%d-%d", 2009, Integer.parseInt(x[1]), Integer.parseInt(x[0]));
        Date date = new SimpleDateFormat("yyyy-M-d").parse(dateS);
        String day = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
        System.out.println(day);
    }
}
