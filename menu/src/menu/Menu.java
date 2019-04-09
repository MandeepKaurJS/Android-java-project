/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

/**
 *
 * @author VrinMan Dulay
 */
import java.util.Scanner;
class menu
{
  public static void main(String args[])
  {
   int n,fact=1,f=0,s=1,p,i,ch;
   Scanner in=new Scanner(System.in);
   System.out.println("1.Factorial");
   System.out.println("2.Fibonacci");
   System.out.println("3.Table");
   System.out.println("4.Exit");
   System.out.println("Enter Choice: ");
   ch=in.nextInt();
   switch(ch)
   {
     case 1:
     {
     System.out.println(".....FACTORIAL.....");
     System.out.println("Enter n: ");
        n=in.nextInt();
     for(i=1;i<=n;i++)
     {
     fact=fact*i;
     }
     System.out.println(+fact);
     break;
     }

     case 2:
     {
     System.out.println(".....FIBONACCI SERIES.....");
     System.out.println("Enter no: ");
     n=in.nextInt();
     System.out.println(f);
     System.out.println(s);

     for(i=1;i<=n-2;i++)
     {
       p=f+s;
       f=s;
       s=p;
       System.out.println(+p);
     }
     break;
     }

     case 3:
     {
      System.out.println(".....PRINT TABLE.....");
      System.out.println("Enter n: ");
      n=in.nextInt();
      for(i=1;i<=10;i++)
      {
        System.out.println(+n+ "*" +i+ "=" +(n*i));
      }
      break;
      }

      case 4:
      {
        System.out.println(".....EXIT.....");
        break;
      }
    }
  }
}


