/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.util.Date;

/**
 *
 * @author pc
 */
public class Bia {
    
    private String ma, ten, moTa, maNSX;
    private Double giaNhap, giaBan;
    private Date nsx, hsd;

    public Bia() {
    }

    public Bia(String ma, String ten, String moTa, String maNSX, Double giaNhap, Double giaBan, Date nsx, Date hsd) {
        this.ma = ma;
        this.ten = ten;
        this.moTa = moTa;
        this.maNSX = maNSX;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.nsx = nsx;
        this.hsd = hsd;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getMaNSX() {
        return maNSX;
    }

    public void setMaNSX(String maNSX) {
        this.maNSX = maNSX;
    }

    public Double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(Double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }

    public Date getNsx() {
        return nsx;
    }

    public void setNsx(Date nsx) {
        this.nsx = nsx;
    }

    public Date getHsd() {
        return hsd;
    }

    public void setHsd(Date hsd) {
        this.hsd = hsd;
    }
    
    
}
