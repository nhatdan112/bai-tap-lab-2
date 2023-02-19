/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nhatm
 */
import java.util.Scanner;
public class ptbac2 {
    public static void main(String[] args)
    {   
        int a;
        int b;
        float c;
        float d;
        float x;
        Scanner sc=new Scanner(System.in);
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

    public static void kt(int a,int b,int c)
       {
        float d =(b*b)-(4*a*c);
            float nk =(float) -b/(2*c) ;
            float n1=(float) (-b+Math.sqrt(d))/2*a;
            float n2=(float) (-b-Math.sqrt(d))/2*a;
            if(d>0)
            {
                System.out.println("phuong trinh co nghiem thu 1 la " +n1);
                System.out.println("phuong tring co nghiem thu 2 la " +n2);
        }
            else
            {
                if(d==0)
                {
                    System.out.println("phuong trinh co nghiem kep la "+nk);
                }
                else
                {
                    System.out.println("phuong trinh vo nghiem");
                }
    }
}
        public static int ptbac1(int b ,int c)
        {            
            float x;
            if(c==0)
    {
        System.out.println("phuong trinh co vo so nghiem");
    }
    else
    {
     if (b==0)
     {
         System.out.println("phuong trinh vo nghiem");
     }
     else
     {
    
          x = (float) -c/b;
         System.out.printf("phuong trinh co nghiem la: "+ (float)x);
     }
    }
        return 0;
        }
            
}
