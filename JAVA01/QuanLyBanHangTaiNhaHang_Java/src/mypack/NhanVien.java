package mypack;

import java.util.ArrayList;
import java.util.List;

public class NhanVien {
	//AUTOMATIC PROPERTIES
    public String maNV; // Primary Key
    public String hoTen;
    public String diaChi;
    public String dienThoai;
    public String gioiTinh;
    public String CMND;
    public String maQL; // Foreign Key

    // CONSTRUCTOR
    public NhanVien() { }
    public NhanVien(NhanVien NV)
    {
        this.maNV = NV.maNV;
        this.hoTen = NV.hoTen;
        this.diaChi = NV.diaChi;
        this.dienThoai= NV.dienThoai;
        this.gioiTinh = NV.gioiTinh;
        this.CMND = NV.CMND;
        this.maQL = NV.maQL;
        this .ds_DonHang = NV.ds_DonHang;
        this.QL_NV = NV.QL_NV;
    }
    public NhanVien(String maNV, String hoTen, String diaChi, String dienThoai, String gioiTinh, String CMND,String maQL, ArrayList<DonHang> ds_DonHang, QuanLy QL_NV)
    {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.gioiTinh = gioiTinh;
        this.CMND = CMND;
        this.maQL = maQL;
        this.ds_DonHang = ds_DonHang;
        this.QL_NV = QL_NV;
    }
    //RELATED = SINGULAR
    public List<DonHang> ds_DonHang; // DANH SACH DON HANG DUOC TIEP NHAN BOI NHAN VIEN
    public QuanLy QL_NV; //QUAN LY CUA NHAN VIEN
    
    //GETTER- SETTER
    public String getMaNV()
    {
    	return maNV;
    }
    public void setMaNV(String maNV)
    {
    	this.maNV = maNV;
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
    public String getgioiTinh()
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
    public String getMaQL()
    {
    	return maQL;
    }
    public void setMaQL(String maQL)
    {
    	this.maQL = maQL;
    }
    public List<DonHang> getDS_DonHang()
    {
    	return ds_DonHang;
    }
    public void setDS_DonHang(List<DonHang> ds_DonHang)
    {
    	this.ds_DonHang = ds_DonHang;
    }
    public QuanLy getQL_NV()
    {
    	return QL_NV;
    }
    public void setQL_NV(QuanLy QL_NV)
    {
    	this.QL_NV = QL_NV;
    }
}
