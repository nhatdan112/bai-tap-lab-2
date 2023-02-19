/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nhatm
 */
import java.util.Scanner;
public class ptbac1 {
    public static void main(String[] args)
    {
    Scanner sc= new Scanner(System.in);
    int a;
    int b;
    float c;
    System.out.println("hay nhap gia tri cua a:");
    a=sc.nextInt();
    System.out.println("hay nhap gia tri cua b:");
    b=sc.nextInt();
    if(b==0)
    {
        System.out.println("phuong trinh co vo so nghiem");
    }
    else
    {
     if (a==0)
     {
         System.out.println("phuong trinh vo nghiem");
     }
     else
     {
     if (b!=0)
     {
         c=(float) -b/a;
         System.out.println("phuong trinh co nghiem la: "+ c);
     }
     }
    }
    }
}
