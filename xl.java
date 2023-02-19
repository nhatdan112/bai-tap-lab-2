/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author nhatm
 */
public class xl
{
    public static void xeploai(int diem)
    {
        if(diem<=5)
        {
        System.out.println("hoc sinh trung binh");   
        }
        else
        {
            if(diem >5 && diem <= 7)
        {
        System.out.println("hoc sinh kha");
        }
        else
        {
        if(diem>8)
        {
        System.out.println("hoc sinh gioi");
        }
        else
        {
        System.out.println("gioi han diem o 10 vui long nhap dung");
        }
        }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("hay nhap diem:");
        int diem=sc.nextInt();
        xl.xeploai(diem);
    }
}




