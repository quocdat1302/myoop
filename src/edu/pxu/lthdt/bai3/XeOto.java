package edu.pxu.lthdt.bai3;

import java.time.LocalDate;


public class XeOto {
    private String hangxe;
    private int namsanxuat;
    private float dongco;

    public XeOto(String hangxe, int namsanxuat, float dongco) {
        this.hangxe = setHangxe(hangxe);
        this.namsanxuat = setNamsanxuat(namsanxuat);
        this.dongco = setDongco(dongco);
    }

    public String getHangxe() {
        return hangxe;
    }

    public int getNamsanxuat() {
        return namsanxuat;
    }

    public float getDongco() {
        return dongco;
    }

    public String setHangxe(String hangxe) {
        this.hangxe = hangxe;
        
        return hangxe;
    }

    public int setNamsanxuat(int namsanxuat) {
        LocalDate date = LocalDate.now();
        int namhientai = date.getYear();
        
        if (namsanxuat < 1885 || namsanxuat > namhientai) {
            System.out.println("Nam san xuat " + namsanxuat + " khong hop le.");
        } else {
            this.namsanxuat = namsanxuat;
        }
        
        return namsanxuat;
    }

    public float setDongco(float dongco) {
        if (dongco <= 0) {
            System.out.println("Dong co khong the co cong suat la " + dongco + "kW");
        } else {
            this.dongco = dongco;
        }
        
        return dongco;
    }

    @Override
    public String toString() {
        return "XeOto{" + "Hãng Xe=" + hangxe + ", Năm Sản Xuất=" + namsanxuat + ", Động Cơ=" + dongco + '}';
    }
    
    
}