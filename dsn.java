/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nhatm
 */
import java.util.Scanner;
public class dsn {
    public static int dns(int so)
    {
        int tram = so/100;
        int chuc = (so/10)%10;
        int donvi= so%10;
        if (100 >= so || so >999)
        {
            System.out.print("khong hop le vui long nhap lai");
        }
        else
        {
        switch(tram){
            case 1:System.out.print("mot tram ");break;
            case 2:System.out.print("hai tram ");break;
            case 3:System.out.print("ba tram ");break;
            case 4:System.out.print("bon tram ");break;
            case 5:System.out.print("nam tram ");break;
            case 6:System.out.print("sau tram ");break;
            case 7:System.out.print("bay tram ");break;
            case 8:System.out.print("tam tram ");break;
            case 9:System.out.print("chin tram ");break;}
            if (chuc%10==0&&donvi!=0)
            {
                System.out.println("le");
            }
        switch(chuc){
            case 1:System.out.print(" muoi");break;
            case 2:System.out.print(" hai muoi");break;
            case 3:System.out.print(" ba muoi");break;
            case 4:System.out.print(" bon muoi");break;
            case 5:System.out.print(" nam muoi");break;
            case 6:System.out.print(" sau muoi");break;
            case 7:System.out.print(" bay muoi");break;
            case 8:System.out.print(" tam muoi");break;
            case 9:System.out.print(" chin muoi");break;}
        switch(donvi){
            case 1:System.out.print(" mot ");break;
            case 2:System.out.print(" hai ");break;
            case 3:System.out.print(" ba ");break;
            case 4:System.out.print(" bon ");break;
            case 5:System.out.print(" nam ");break;
            case 6:System.out.print(" sau ");break;
            case 7:System.out.print(" bay ");break;
            case 8:System.out.print(" tam ");break;
            case 9:System.out.print(" chin ");break;
        }
    }
        return 0;
        }
        public static void main(String[] args)
        {
        Scanner sc =new Scanner(System.in);
        System.out.println("hay nhap so nguyen: ");
        int so = sc.nextInt();
        dsn.dns(so);
        
        }
 }      
