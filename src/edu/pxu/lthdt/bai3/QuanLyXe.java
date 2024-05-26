package edu.pxu.lthdt.bai3;

public class QuanLyXe {
	public static void main(String[] args) {
        // TODO code application logic here
        XeOto car = new XeOto("BNW", 2024, 1000);
        XeBus bus = new XeBus("BusQuocDat", 2024, 700, 35);
        
        System.out.println(car);
        System.out.println(bus);
    }
    
}
