package Englishapp;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */

public class People {
    private String id;
    private String pass;
    private String hoTen;
    private String queQuan;
    private GregorianCalendar ngaySinh;
    private GregorianCalendar ngayGiaNhap;

    public People(String id, String pass, String hoTen, String queQuan,
            GregorianCalendar ngaySinh, GregorianCalendar ngayGiaNhap) {
        this.id = id;
        this.pass = pass;
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
        this.ngayGiaNhap = ngayGiaNhap;
    }
    
    
    
    
    @Override
    public String toString() {
       SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
       Date d = this.getNgaySinh().getTime();
       Date d1 = this.getNgayGiaNhap().getTime();
       return String.format("\tHo ten: %s \n \tDia chi:%s \n\t Ngay sinh:%s \n\t Ngay gia nhap:%s \n\t", this.getHoTen(), this.getQueQuan(),f.format(d),f.format(d1));
       
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    /**
     * @return the ngaySinh
     */
    public GregorianCalendar getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(GregorianCalendar ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the ngayGiaNhap
     */
    public GregorianCalendar getNgayGiaNhap() {
        return ngayGiaNhap;
    }

    /**
     * @param ngayGiaNhap the ngayGiaNhap to set
     */
    public void setNgayGiaNhap(GregorianCalendar ngayGiaNhap) {
        this.ngayGiaNhap = ngayGiaNhap;
    }
    
    
   
   
    
}
