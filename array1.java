/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nhatm
 */
import java.util.Scanner;
public class array1 {
    public static void Nhap(int m[],int n)
            {
                Scanner sc = new Scanner(System.in);
                
                for(int i=0;i<n;i++)
                {
                    System.out.print("hay nhap phan tu thu " +i+" ");
                    m[i]= sc.nextInt();
                }
            }
    public static void xuat(int m[],int n)
    {
        for(int i=0; i<n;i++)
        {
            System.out.print( " "+m[i] );
        }
    }
    public static void xoax(int x,int m[],int n,int i,int c)
    {
        if(x>n)
        {
            System.out.println("gia tri x ko hop le");
        }
        else
        {
            for (c = i = 0; i < n; i++) {
        if (m[i] != x) {
            m[c] = m[i];
            c++;
            }
        }
        
    }
    }

    public static void sx(int n,int[] m)
    {
        int b= m[0];
        for (int i=0;i<n-1;i++)
        {
            for (n=i+1;n<m[0];n++)
            {
                if(m[i]>m[n])
                {
                    b=m[n];
                    m[n]=m[i];
                    m[i]=b;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("hay nhap so luong phan tu cua mang");
        int n=sc.nextInt();
        int[] m= new int[n];
        array1.Nhap(m, n);
        System.out.print("mang goc: ");array1.xuat(m, n);
        System.out.print(" hay nhap vi tri phan tu can xoa ");
        int x =sc.nextInt();
        array1.xoax(x, m, n, x, x);
         System.out.println("mang sau khi xoa la : ");
        array1.sx(n, m);
        array1.xuat(m, n);
        
    }
}
