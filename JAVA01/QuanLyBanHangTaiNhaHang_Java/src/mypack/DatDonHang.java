package mypack;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DatDonHang {
	//AUTOMATIC PROPERTIES
    public int soLuongDH;

    public int soLuongKH;
    public LocalDate ngayDat;

    //CONSTRUCTOR
    public DatDonHang() { }
    
    public DatDonHang(int soLuongDH, int soLuongKH,LocalDate ngayDat, ArrayList<KhachHang> dsKhachHang, ArrayList<DonHang> dsDonHang)
    {
        this.soLuongDH= soLuongDH;
        this.soLuongKH= soLuongKH;
        this.ngayDat= ngayDat;
        this.dsKhachHang= dsKhachHang;
        this.dsDonHang= dsDonHang;
    }

    // RELATED = SINGULAR

    public List<KhachHang> dsKhachHang;
    public List<DonHang> dsDonHang;
    
    //GETTER -SETTER
    public int getSoLuongDH()
    {
    	return soLuongDH;
    }
    public void setSoLuongDH(int soLuongDH)
    {
    	this.soLuongDH = soLuongDH;
    }
    public int getSoLuongKH()
    {
    	return soLuongKH;
    }
    public void setSoLuongKH(int soLuongKH)
    {
    	this.soLuongKH = soLuongKH;
    }
    public LocalDate getNgayDat()
    {
    	return ngayDat;
    }
    public void setNgayDat(LocalDate ngayDat)
    {
    	this.ngayDat = ngayDat;
    }
    public List<KhachHang> getDSKhachHang()
    {
    	return dsKhachHang;
    }
    public void setDSKhachHang(List<KhachHang> dsKhachHang)
    {
    	this.dsKhachHang = dsKhachHang;
    }
    public List<DonHang> getDSDonHang()
    {
    	return dsDonHang;
    }
    public void setDSDonHang(List<DonHang> dsDonHang)
    {
    	this.dsDonHang = dsDonHang;
    }
}
