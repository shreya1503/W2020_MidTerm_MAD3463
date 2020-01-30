/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton;

/**
 *
 * @author Pritesh Patel
 */
public class LambtonStringTools 
{
    //1 - REVERSE STRING
    public static String[] reverse(String s)
    {
        char[] rev1 = s.toCharArray();
        String[] rev2 = new String[s.length()];

                for (int i = 0 ; i<s.length() ; i++ )
                {
                    rev2[i] = String.valueOf(rev1[s.length()-1-i]);
                }
                return rev2;
        //return null;

    }
    
    //2 - FORMAT INITIALS OF STRING
    public static String initials(String s) 
    {

        return null;
    }
        
    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static String mostFrequent(String s)
    {

        char[] array = s.toCharArray();
        int count = 1;
        int occour = 0;
        char mostFrequent = 0;
        for(int i=1; i<array.length; i++)
        {
            if(array[i]==array[i-1])
            {
                count++;
            }
            else
            {
                if(count>occour)
                {
                        occour=count;
                        mostFrequent=array[i-1];
                }
                count = 1;
            }
        }
        if(count>occour){
            occour=count;
            mostFrequent=array[array.length-1];
        }

        return String.valueOf(occour);
    }
    
    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(int num)
    {

        int a = num;
        int decimal=0;
        int i=1;
        while(a != 0)
        {
            decimal = decimal+i*(a%2);
            a = a/2;
            i=i*10;
        }

        return decimal;
    }
       //return 0;

    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString) 
    {
        return null;
    }
}
