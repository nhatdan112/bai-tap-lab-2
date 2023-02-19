/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nhatm
 */
import java.util.Scanner;
public class tiendien {
    public static void main(String[] args)
    {
    
        
        System.out.println("hay nhap so dien");
        Scanner sc= new Scanner(System.in);
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
