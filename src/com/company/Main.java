package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str, strFinal = "", strAccumulate = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string :");
        str = scanner.nextLine().toUpperCase();

        meth(str);

    }

    public static void meth(String string) {
        String first, second, third;
        int indexStart = string.indexOf('[');
        int indexEnd = string.indexOf(']');
        if (indexStart==-1){
            System.out.print(string);
            return;}
        first=string.substring(0,indexStart);
        second=string.substring(indexStart+1,indexEnd);
        third=string.substring(indexEnd+1);
        System.out.print(yammy(first)+"["+yammy(second)+"] ");
        meth(third);
    }

    public static String yammy(String strIn) {
        if (strIn.equals("")) return "";
        else if (strIn.contains("F")) {
            return strIn.replace('C', '.');
        } else return strIn;


    }


}
