/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlysinhvien;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;
    private float diemToan;
    private float diemVan;
    private float diemAnh;
    private Lop lop;

    public SinhVien(String hoTen, String ngaySinh, String gioiTinh, String diaChi, float diemToan, float diemVan, float diemAnh, Lop lop) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
        this.lop = lop;
    }

    SinhVien() {
    // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean laSinhVienGioi() {
        switch (lop.getMonChuyen().toLowerCase()) {
            case "toan":
                return (diemToan + diemVan + diemAnh) > 24 && diemToan > 9;
            case "van":
                return (diemToan + diemVan + diemAnh) > 24 && diemVan > 9;
            case "anh":
                return (diemToan + diemVan + diemAnh) > 24 && diemAnh > 9;
            default:
                return false;
        }
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ho ten: ");
        hoTen = scanner.nextLine();

        System.out.print("Nhap ngay sinh: ");
        ngaySinh = scanner.nextLine();

        System.out.print("Nhap gioi tinh: ");
        gioiTinh = scanner.nextLine();

        System.out.print("Nhap dia chi: ");
        diaChi = scanner.nextLine();

        System.out.print("Nhap diem toan: ");
        diemToan = scanner.nextFloat();

        System.out.print("Nhap diem van: ");
        diemVan = scanner.nextFloat();

        System.out.print("Nhap diem anh: ");
        diemAnh = scanner.nextFloat();

        scanner.nextLine();  // Đọc bỏ dòng new line sau nextFloat

        lop = new Lop();
        lop.nhapThongTin();
    }

    public void hienThiThongTin() {
        System.out.println("\nThong tin sinh vien:");
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Diem toan: " + diemToan);
        System.out.println("Diem van: " + diemVan);
        System.out.println("Diem anh: " + diemAnh);
        lop.hienThiThongTin();
    }
}
