/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dethithu;

import java.util.Scanner;

/**
 *
 * @author Ngo Nhan
 */
public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner sc =new Scanner(System.in);
       QLSV so1 = new QLSV();
       int chon;
        do {            
            System.out.println("------Menu------");
            System.out.println("1.Nhap 1 doi tuong");
            System.out.println("2.Xuat doi tuong");
            System.out.println("3.Xuat danh sach cac Sv tuoi tren 20 tuoi");
            System.out.println("4.Tim sinh vien theo ma");
            System.out.println("0.Thoat");
            System.out.println("Moi ban chon muc:");
            chon= Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    so1.nhapDS();
                    break;
                    case 2:
                    so1.xuatDS();
                    break;
                    case 3:
                    
                    break;
                    case 4:
                    
                    break;
                    case 0:
                        System.out.println("Ban da thoat");
                        System.exit(0);
                    break;
                default:
                    System.out.println("Moi ban nhap lai");
            }
        } while (chon!=0);
    }

   
}
