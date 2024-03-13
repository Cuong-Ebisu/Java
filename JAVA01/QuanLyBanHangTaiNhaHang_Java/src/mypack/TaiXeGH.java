package mypack;

import java.util.ArrayList;
import java.util.List;

public class TaiXeGH {
	//AUTOMATIC PROPERTIES
    public String maTX; // Primary Key
    public String hoTen;
    public String diaChi;
    public String dienThoai;
    public String gioiTinh;
    public String CMND;
    public String bienSoXe;
    public String maQL; // Foreign Key

    //CONSTRUCTOR
    public TaiXeGH() { }
    public TaiXeGH(TaiXeGH TX)
    {
        this.maTX = TX.maTX;
        this.hoTen = TX.hoTen;
        this.diaChi = TX.diaChi;
        this.dienThoai = TX.dienThoai;
        this.gioiTinh = TX.gioiTinh;
        this.CMND = TX.CMND;
        this.bienSoXe = TX.bienSoXe;
        this.maQL= TX.maQL;
        this.QL_TX= TX.QL_TX;
        this.ds_DonHang = TX.ds_DonHang;
    }
    public TaiXeGH(String maTX, String hoTen, String diaChi, String dienThoai, String gioiTinh, String CMND, String bienSoXe,String maQL, QuanLy QL_TX, ArrayList<DonHang> ds_DonHang)
    {
        this.maTX = maTX;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.gioiTinh = gioiTinh;
        this.CMND = CMND;
        this.bienSoXe = bienSoXe;
        this.maQL = maQL;
        this.QL_TX = QL_TX;
        this.ds_DonHang = ds_DonHang;
    }

    //RELATED = SINGULAR
    public QuanLy QL_TX;
    public List<DonHang> ds_DonHang;
    
    //GETTER - SETTER
    public String getMaTX()
    {
    	return maTX;
    }
    public void setMaTx(String maTX)
    {
    	this.maTX = maTX;
    }
    public String getHoTen()
    {
    	return hoTen;
    }
    public void setHoTen(String hoTen)
    {
    	this.hoTen = hoTen;
    }
    public String getDiaChi()
    {
    	return diaChi;
    }
    public void setDiaChi(String diaChi)
    {
    	this.diaChi = diaChi;
    }
    public String getDienThoai()
    {
    	return dienThoai;
    }
    public void setDienThoai(String dienThoai)
    {
    	this.dienThoai = dienThoai;
    }
    public String getGioiTinh()
    {
    	return gioiTinh;
    }
    public void setGioiTinh(String gioiTinh)
    {
    	this.gioiTinh = gioiTinh;
    }
    public String getCMND()
    {
    	return CMND;
    }
    public void setCMND(String CMND)
    {
    	this.CMND = CMND;
    }
    public String getBienSoXe()
    {
    	return bienSoXe;
    }
    public void setBienSoXe(String bienSoXe)
    {
    	this.bienSoXe = bienSoXe;
    }
    public String getMaQL()
    {
    	return maQL;
    }
    public void setMaQL(String maQL)
    {
    	this.maQL = maQL;
    }
    public QuanLy getQL_TX()
    {
    	return QL_TX;
    }
    public void setQL_TX(QuanLy QL_TX)
    {
    	this.QL_TX = QL_TX;
    }
    public List<DonHang> getDS_DonHang()
    {
    	return ds_DonHang;
    }
    public void setDS_DonHang(List<DonHang> ds_DonHang)
    {
    	this.ds_DonHang = ds_DonHang;
    }
}
