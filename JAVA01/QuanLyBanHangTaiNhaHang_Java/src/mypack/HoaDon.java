package mypack;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HoaDon {
	//AUTOMATIC PROPERTIES
    public String maHD; // Primary Key

    public double thanhTien;
    public LocalDate ngayThanhToan;

    //CONSTRUCTOR
    public HoaDon() { }
    public HoaDon(HoaDon hoadon)
    {
        this.maHD = hoadon.maHD;
        this.thanhTien = hoadon.thanhTien;
        this.ngayThanhToan = hoadon.ngayThanhToan;
        this.dsDH_HD= hoadon.dsDH_HD;
        this.dsKH_HD = hoadon.dsKH_HD;
    }
    public HoaDon(String maHD, double thanhTien, LocalDate ngayThanhToan, ArrayList<KhachHang> dsKH_HD, ArrayList<DonHang> dsDH_HD)
    {
        this.maHD = maHD;
        this.thanhTien = thanhTien;
        this.ngayThanhToan = ngayThanhToan;
        this.dsKH_HD = dsKH_HD; 
        this.dsDH_HD = dsDH_HD;
    }
    
    //REALATED = SINGULAR
    //DANH SACH KHACH HANG CUA HOA DON
    public List<KhachHang> dsKH_HD; 
    //DANH SACH DON HANG CUA HOA DON
    public List<DonHang> dsDH_HD; 
    
    //GETTER - SETTER
    public String getMaHD()
    {
    	return maHD;
    }
    public void setMaHD(String maHD)
    {
    	this.maHD = maHD;
    }
    public double getThanhTien()
    {
    	return thanhTien;
    }
    public void setThanhTien(double thanhTien)
    {
    	this.thanhTien = thanhTien;
    }
    public LocalDate getNgayThanhToan()
    {
    	return this.ngayThanhToan;
    }
    public void setNgayThanhToan(LocalDate ngayThanhToan)
    {
    	this.ngayThanhToan = ngayThanhToan;
    }
    public List<KhachHang> getDsKH_HD()
    {
    	return dsKH_HD;
    }
    public void setDsKH_HD(List<KhachHang> dsKH_HD)
    {
    	this.dsKH_HD = dsKH_HD;
    }
    public List<DonHang> getDsDH_HD()
    {
    	return dsDH_HD;
    }
    public void setDsDH_HD(List<DonHang> dsDH_HD)
    {
    	this.dsDH_HD = dsDH_HD;
    }
    
    
}
