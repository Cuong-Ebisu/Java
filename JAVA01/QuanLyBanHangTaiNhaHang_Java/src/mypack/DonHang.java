package mypack;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DonHang {
	//AUTOMATIC PROPERTIES
    public String maDH; // Primary Key
    public String maHD; // Foreign Key
    public String maNV; // Foreign Key
    public String maTX; // Foreign Key
    public LocalDate hanGiaoHang;

    //CONSTRUCTOR
    public DonHang() { }
    public DonHang(DonHang donhang)
    {
        this.maDH = donhang.maDH;
        this.hanGiaoHang= donhang.hanGiaoHang;
        this.maHD= donhang.maHD;
        this.HD_DH= donhang.HD_DH;
        this.dsMonAn = donhang.dsMonAn;
        this.maNV = donhang.maNV;
        this.NV_DH = donhang.NV_DH;
        this.maTX= donhang.maTX;
        this.TX_DH= donhang.TX_DH;
    }
    public DonHang(String maDH,LocalDate hanGiaoHang,String maHD, HoaDon HD_DH, ArrayList<MonAn> dsMonAn, String maNV, NhanVien NV_DH, String maTX, TaiXeGH TX_DH)
    {
        this.maDH = maDH;
        this.hanGiaoHang = hanGiaoHang;
        this.maHD = maHD;
        this.HD_DH = HD_DH;
        this.dsMonAn = dsMonAn;
        this.maNV = maNV;
        this.NV_DH = NV_DH;
        this.maTX = maTX;
        this.TX_DH = TX_DH;
    }

    // RELATED = SINHGULAR
    //HOA DON CUA DON HANG
    public HoaDon HD_DH;
    //DANH SACH MON AN CUA DON HANG
    public List<MonAn> dsMonAn;
    //NHAN VIEN TIEP NHAN DON HANG
    public NhanVien NV_DH;
    //TAI XE GIAO DON HANG
    public TaiXeGH TX_DH;
    
    //GETTER - SETTER
    public String getMaDH()
    {
    	return maDH;
    }
    public void setMaDH(String maDH)
    {
    	this.maDH = maDH;
    }
    public String getMaHD()
    {
    	return maHD;
    }
    public void setMaHD(String maHD)
    {
    	this.maHD = maHD;
    }
    public String getMaNV()
    {
    	return maNV;
    }
    public void setMaNV(String maNV)
    {
    	this.maNV = maNV;
    }
    public String getMaTX()
    {
    	return maTX;
    }
    public void setMaTX(String maTX)
    {
    	this.maTX = maTX;
    }
    public LocalDate getHanGiaoHang()
    {
    	return this.hanGiaoHang;
    }
    public void setHanGiaoHang(LocalDate hanGiaoHang)
    {
    	this.hanGiaoHang = hanGiaoHang;
    }
    public HoaDon getHD_DH()
    {
    	return HD_DH;
    }
    public void setHD_DH(HoaDon HD_DH)
    {
    	this.HD_DH = HD_DH;
    }
    public List<MonAn> getDsMonAn()
    {
    	return dsMonAn;
    }
    public void setDsMonAn(List<MonAn> dsMonAn)
    {
    	this.dsMonAn = dsMonAn;
    }
    public NhanVien getNV_DH()
    {
    	return NV_DH;
    }
    public void setNV_DH(NhanVien NV_DH)
    {
    	this.NV_DH = NV_DH;
    }
    public TaiXeGH getTX_DH()
    {
    	return TX_DH;
    }
    public void setTX_GH(TaiXeGH TX_DH)
    {
    	this.TX_DH = TX_DH;
    }
}
