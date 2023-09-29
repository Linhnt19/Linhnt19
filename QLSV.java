/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dethithu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ngo Nhan
 */
public class QLSV {
    ArrayList<SinhVien> _lstSinhVien = new ArrayList<>();
    SinhVien _sv1 = new SinhVien();
    Scanner _sc =new Scanner(System.in);
    public void nhapDS(){
        String tiepTuc ;
        do {            
            System.out.println("Moi ban nhap ma sinh vien:");
            _sv1.setMaSV(_sc.nextLine());
            System.out.println("Moi ban nhap ten:");
            _sv1.setTen(_sc.nextLine());
            System.out.println("Moi ban nhap nam sinh:");
            _sv1.setNamSinh(Integer.parseInt(_sc.nextLine()));
           //them doi tuong
           _lstSinhVien.add(_sv1);
           
           // hoi co tiep tuc ko?
            System.out.println("Co tiep tuc khong yes/no");
            tiepTuc = _sc.nextLine();
        } while (tiepTuc.equals("yes"));
    }
        public void xuatDS(){
            if(_lstSinhVien.isEmpty()){
                System.out.println("Danh sach trong");
                return;
            }
            for (SinhVien sinhVien : _lstSinhVien) {
                sinhVien.inThongTin();
            }
        }
        public void xuatDL(){
            
        }
    }

