package edu.pxu.lthdt.bai3;
import java.time.LocalDate;



public class XeBus {
	private String hangxe;
    private int namsanxuat;
    private float dongco;
    private int soghe;

    public XeBus(String hangxe, int namsanxuat, float dongco, int soghe) {
        this.hangxe = setHangxe(hangxe);
        this.namsanxuat = setNamsanxuat(namsanxuat);
        this.dongco = setDongco(dongco);
        this.soghe = setSoghe(soghe);
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

    public int getSoghe() {
        return soghe;
    }

    public String setHangxe(String hangxe) {
        this.hangxe = hangxe;
        
        return hangxe;
    }

    public int setNamsanxuat(int namsanxuat) {
        LocalDate date = LocalDate.now();
        int namhientai = date.getYear();
        
        if (namsanxuat < 1894 || namsanxuat > namhientai) {
            System.out.println("Nam san xuat " + namsanxuat + " khong hop le.");
        }
        this.namsanxuat = namsanxuat;
        
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

    public int setSoghe(int soghe) {
        if (soghe <= 0) {
            System.out.println("So ghe " + soghe + " khong hop le.");
        } else {
            this.soghe = soghe;
        }
        return soghe;
    }

  
    public String toString() {
        return "XeBus{" + "Hãng Xe=" + hangxe + ", Năm Sản Xuất=" + namsanxuat + ", Động Cơ=" + dongco + ", Số Ghế =" + soghe + '}';
    }
    
    
}