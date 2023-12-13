/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quanlysinhvien;

/**
 *
 * @author Admin
 */
public class Quanlysinhvien {

    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien();

        System.out.println("Nhap thong tin sinh vien:");
        sinhVien.nhapThongTin();

        sinhVien.hienThiThongTin();

        if (sinhVien.laSinhVienGioi()) {
            System.out.println("Sinh vien thuoc loai gioi.");
        } else {
            System.out.println("Sinh vien khong thuoc loai gioi.");
        }
    }
}
