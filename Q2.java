/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LABNO9;

import java.util.Scanner;

/**
 *
 * @author sathaiah balaji
 */
public class Q2 {
     public static void main(String args[])
   {
      try{
         int num1=30, num2=0;
         int output=num1/num2;
         System.out.println ("Result: "+output);
      }
      catch(ArithmeticException e){
         System.out.println ("You Shouldn't divide a number by zero");
      }
   }
}
class array
{
 public static void main(String args[])
 {
 try{
 int a[]=new int[100];
 //Array has only 100 elements
 a[1120] = 9;
   }
      catch(ArrayIndexOutOfBoundsException e){
         System.out.println ("ArrayIndexOutOfBounds");
      }
}
}
class numberformat
{
   public static void main(String args[])
   {
      try{
	 int num=Integer.parseInt ("sathaiah") ;
	 System.out.println(num);
      }catch(NumberFormatException e){
	  System.out.println("Number format exception occurred");
       }
   }
}
class StringIndex
{
   public static void main(String args[])
   {
       Scanner in=new Scanner(System.in);
      try{
	 String str=in.next();
	 System.out.println(str.length());
	  char c = str.charAt(40);
	 System.out.println(c);
      }catch(StringIndexOutOfBoundsException e){
	  System.out.println("StringIndexOutOfBoundsException!!");
       }
   }
}
