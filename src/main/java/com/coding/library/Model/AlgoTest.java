package com.coding.library.Model;
import java.util.*;

public class AlgoTest{


    public static String toHex(){

        Scanner decScan = new Scanner(System.in);

        int decimal;
        System.out.println("Enter the decimal");
        decimal = decScan.nextInt();
        int tmp;
        String hex="";
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(decimal>0)
        {
            tmp=decimal%16;
            hex=hexchars[tmp]+hex;
            decimal = decimal/16;

        }

        return hex;
    }
    public static void main(String args[]){
       toHex();
    }}
