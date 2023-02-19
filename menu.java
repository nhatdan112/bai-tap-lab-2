/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nhatm
 */
import java.util.Scanner;
public class menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("+-------------------+");
        System.out.println("hay chon cac chuc nang");
        System.out.println("1.kiem tra so chinh phuong");
        System.out.println("2.xep loai hoc tap");
        System.out.println("3.doc so nguyen");
        System.out.println("4.tinh gia thua");
        System.out.println("5.xoa x va sap xep lai mang");
        System.out.println("6.do thi doi xung");
        System.out.println("7.giai pt bac 1");
        System.out.println("8.giai pt bac 2");
        System.out.println("9.tinh tien dien");
        System.out.print("chuc nang ban chon la:");
        int chon;
        Scanner sc=new Scanner(System.in);
        chon =sc.nextInt();
        if(chon<1&&chon>9)
        {
            System.out.println("khong hop le vui long tat chuong trinh va nhap lai");
            
        }
        else
        {
            switch(chon)
            {
                case 1:{
        System.out.println("hay nhap so can kiem tra");
        int a =sc.nextInt();
        float kq= (float)Math.sqrt(a);
        if (kq==(int)kq)
        {
            System.out.println(a + "la so chinh phuong");
        }
        else
        {
            System.out.println(a + "ko la so chinh phuong");
        }
                       }                
                case 2:{
        System.out.println("hay nhap diem:");
        int diem=sc.nextInt();
        xl.xeploai(diem);
                       }
                case 3:{
        System.out.println("hay nhap so nguyen: ");
        int so = sc.nextInt();
        dsn.dns(so);
                       }
                case 4:{
        System.out.println("hay nhap gia tri cua n");
        int n =sc.nextInt();
        giaithua.tinh(n);
                       }
                case 5:{
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
                case 6:{
        System.out.println("hay nhap so dong va so cot");
        int n= sc.nextInt();
        int[][] m = new int [n][n];
        mt.nhap(m, n);
        System.out.println("ma tran can hien thi la");
        mt.xuat(m, n);
                       }
                case 7:{
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
                case 8:{
        int a;
        int b;
        float c;
        float d;
        float x;
        System.out.println("hay nhap gia tri cua a");
        a=sc.nextInt();
        System.out.println("hay nhap gia tri cua b");
        b=sc.nextInt();
        System.out.println("hay nhap gia tri cua c");
        c=sc.nextInt();
        if (a==0)
        {
            System.out.println("phuong trinh la phuong trinh bac nhat");
            ptbac2.ptbac1(b, b);
        }    
        else
        {
            ptbac2.kt(a, b, b);
        }
                       }
                case 9:{
        System.out.println("hay nhap so dien");
        int dien= sc.nextInt();
        if (dien<=50)
        {
            int tien= dien*1000;
             System.out.println("so tien phai tra la "+tien);
        }
        else
        {
             int tien=50*1000+(dien-50)*1200;
             System.out.println("so tien phai tra la "+tien);
        }
                       }
            }
        }
        
        
        System.out.println("ket thuc chuong trinh");
    
}
}
