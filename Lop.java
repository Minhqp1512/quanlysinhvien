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
public class Lop {
private String tenLop;

    public Lop() {
    }

    public Lop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getMonChuyen() {
        if (tenLop.toLowerCase().contains("10a")) {
            return "toan";
        } else if (tenLop.toLowerCase().contains("10b")) {
            return "van";
        } else if (tenLop.toLowerCase().contains("10c")) {
            return "anh";
        } else {
            return "khong xac dinh";
        }
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten lop: ");
        tenLop = scanner.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("Ten lop: " + tenLop);
        System.out.println("Mon chuyen: " + getMonChuyen());
    }
}
