package mypack;

import java.util.ArrayList;
import java.util.List;

public class QuanLy {
	//AUTOMATIC PROPERTIES
    public String maQL; // Primary Key
    public String hoTen;
    public String diaChi;
    public String soDienThoai;
    public String gioiTinh;
    public String CMND;
    
    //CONSTRUCTOR
    public QuanLy() { }
    public QuanLy(QuanLy QL)
    {
        this.maQL = QL.maQL;
        this.hoTen = QL.hoTen;
        this.diaChi= QL.diaChi;
        this.soDienThoai= QL.soDienThoai;
        this.gioiTinh=QL.gioiTinh;
        this.CMND = QL.CMND;
        this.ds_NhanVien = QL.ds_NhanVien;
        this.ds_TaiXeGH= QL.ds_TaiXeGH;
    }
    public QuanLy(String maQL, String hoTen, String diaChi, String soDienThoai, String gioiTinh, String CMND, ArrayList<NhanVien> ds_NhanVien, ArrayList<TaiXeGH> ds_TaiXeGH)
    {
        this.maQL = maQL;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.gioiTinh = gioiTinh;
        this.CMND = CMND;
        this.ds_NhanVien = ds_NhanVien;
        this.ds_TaiXeGH = ds_TaiXeGH;
    }

    //RELATED = SINGULAR
    public List<NhanVien> ds_NhanVien;// DANH SACH NHAN VIEN DUOC QUAN LY BOI 1 QUAN LY
    public List<TaiXeGH> ds_TaiXeGH; // DANH SACH TAI XE GIAO HANG DUOC 1 QUAN LY PHAN CONG
    
    //GETTER - SETTER
    public String getMaQL()
    {
    	return maQL;
    }
    public void setMaQL(String maQL)
    {
    	this.maQL = maQL;
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
    public String getSoDienThoai()
    {
    	return soDienThoai;
    }
    public void setSoDienThoai(String soDienThoai)
    {
    	this.soDienThoai = soDienThoai;
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
    public List<NhanVien> getDS_NhanVien()
    {
    	return ds_NhanVien;
    }
    public void setDS_NhanVien(List<NhanVien> ds_NhanVien)
    {
    	this.ds_NhanVien = ds_NhanVien;
    }
    public List<TaiXeGH> getDS_TaiXeGH()
    {
    	return ds_TaiXeGH;
    }
    public void setDS_TaiXeGH(List<TaiXeGH> ds_TaiXeGH)
    {
    	this.ds_TaiXeGH = ds_TaiXeGH;
    }
}
