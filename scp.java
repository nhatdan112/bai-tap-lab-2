/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author nhatm
 */
import java.util.Scanner;
public class scp {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
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
    
}
