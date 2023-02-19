/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nhatm
 */
import java.util.Scanner;
public class giaithua {
    public static int tinh(int n )
    {
        int gt=1;
        for(int i=1;i<=n;i++)
        {
            gt *=i;
        }
        System.out.println("gia tri giai thua cua n la: " +gt);
        return gt;
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("hay nhap gia tri cua n");
        int n =sc.nextInt();
        giaithua.tinh(n);
    }
            
    
}
