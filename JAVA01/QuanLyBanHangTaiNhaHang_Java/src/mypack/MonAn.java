package mypack;

public class MonAn {
	//AUTOMATIC PROPERTIES  
    public String tenMonAn; // Primary Key
    public String loaiMonAn;
    // LOAI MON AN CHI CO THE LA: "MON MAN", "MON NGOT", "MON CHAY"
    public double donGia;
    public int soLuong;
    public double thoiGianCheBien;// THOI GIAN CHE BIEN DUOC TINH THEO DON VI (GIO)
    public String maDH; // Foreign Key
    public String maKV; // Foreign Key
    

    //CONSTRUCTOR
    public MonAn() { }
    public MonAn(MonAn MA)
    {
        this.tenMonAn = MA.tenMonAn;
        this.loaiMonAn= MA.loaiMonAn;
        this.donGia = MA.donGia;
        this.soLuong = MA.soLuong;  
        this.thoiGianCheBien = MA.thoiGianCheBien;
        this.maDH = MA.maDH;
        this.maKV = MA.maKV;
        this.DH_MA = MA.DH_MA;
        this.KVCB_MA= MA.KVCB_MA;
    }
    public MonAn(String tenMonAn, String loaiMonAn, double donGia,int soLuong,double thoiGianCheBien, String maDH,String maKV, DonHang dH_MA, KhuVucCheBien kVCB_MA)
    {
        this.tenMonAn = tenMonAn;
        this.loaiMonAn = loaiMonAn;
        this.donGia = donGia;
        this.soLuong= soLuong;
        this.thoiGianCheBien = thoiGianCheBien;
        this.maDH = maDH;
        this.maKV = maKV;
        DH_MA = dH_MA;
        KVCB_MA = kVCB_MA;
    }
    //RELATED = SINGULAR
    public DonHang DH_MA; //DON HANG CUA MON AN
    public KhuVucCheBien KVCB_MA; // KHU VUC CHE BIEN CUA MON AN
    
    //GETTER - SETTER
    public String getTenMonAn()
    {
    	return tenMonAn;
    }
    public void setTenMonAn(String tenMonAn)
    {
    	this.tenMonAn = tenMonAn;
    }
    public String getLoaiMonAn()
    {
    	return loaiMonAn;
    }
    public void setLoaiMonAn(String loaiMonAn)
    {
    	this.loaiMonAn = loaiMonAn;
    }
    public double getDonGia()
    {
    	return donGia;
    }
    public void setDonGia(double donGia)
    {
    	this.donGia = donGia;
    }
    public int getSoLuong()
    {
    	return soLuong;
    }
    public void setSoLuong(int soLuong)
    {
    	this.soLuong = soLuong;
    }
    public double getThoiGianCheBien()
    {
    	return thoiGianCheBien;
    }
    public void setThoiGianCheBien(double thoiGianCheBien)
    {
    	this.thoiGianCheBien = thoiGianCheBien;
    }
    public String getMaDH()
    {
    	return maDH;
    }
    public void setMaDH(String maDH)
    {
    	this.maDH = maDH;
    }
    public String getMaKV()
    {
    	return maKV;
    }
    public void setMaKV(String maKV)
    {
    	this.maKV = maKV;
    }
    public DonHang getDH_MA()
    {
    	return DH_MA;
    }
    public void setDH_MA(DonHang DH_MA)
    {
    	this.DH_MA = DH_MA;
    }
    public KhuVucCheBien getKVCB_MA()
    {
    	return KVCB_MA;
    }
    public void setKVCB_MA(KhuVucCheBien KVCB_MA)
    {
    	this.KVCB_MA = KVCB_MA;
    }
}
