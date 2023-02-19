/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nhatm
 */
import java.util.Scanner;
public class mt {
    public static void nhap(int[][] m,int n)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                        System.out.println("hay nhap cac trong so (" + i + ", " + j + ") ");
                        m[i][j] =sc.nextInt();
                    }
                }
    }
    public static void xuat(int[][] m, int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
            System.out.print("" +m[i][j]);
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("hay nhap so dong va so cot");
        int n= sc.nextInt();
        int[][] m = new int [n][n];
        mt.nhap(m, n);
        System.out.println("ma tran can hien thi la");
        mt.xuat(m, n);
        
    }
}
 