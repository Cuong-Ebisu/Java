package mypack;

import java.time.LocalDate;

public class DauBep {
	//AUTOMATIC PROPERTIES
    public String maDB; // Primary Key
    public String hoTenDB;
    public String soDienThoai;
    public int namSinh;
    public String diaChi;
    public LocalDate ngayVaoLam;
    public String maKV; // Foreign Key

    //CONSTRUCTOR
    public DauBep() { }
    public DauBep(DauBep DB)
    {
        this.maDB= DB.maDB;
        this.hoTenDB= DB.hoTenDB;
        this.soDienThoai = DB.soDienThoai;
        this.namSinh= DB.namSinh;
        this.diaChi= DB.diaChi;
        this.ngayVaoLam= DB.ngayVaoLam;
        this.maKV= DB.maKV;
        this.KVCB_DB = DB.KVCB_DB;
    }

    public DauBep(String maDB, String hoTenDB, String soDienThoai, int namSinh, String diaChi, LocalDate ngayVaoLam, String maKV, KhuVucCheBien KVCB_DB)
    {
        this.maDB = maDB;
        this.hoTenDB = hoTenDB;
        this.soDienThoai = soDienThoai;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.ngayVaoLam = ngayVaoLam;
        this.maKV = maKV;
        this.KVCB_DB = KVCB_DB;
    }
    //RELATED = SINGULAR
    public KhuVucCheBien KVCB_DB; //KHU VUC CHE BIEN CUA DAU BEP
    
    //GETTER - SETTER
    public String getMaDB()
    {
    	return maDB;
    }
    public void setMaDB(String maDB)
    {
    	this.maDB = maDB;
    }
    public String getHoTenDB()
    {
    	return hoTenDB;
    }
    public void setHoTenDB(String hoTenDB)
    {
    	this.hoTenDB = hoTenDB;
    }
    public String getSoDienThoai()
    {
    	return soDienThoai;
    }
    public void setSoDienThoai(String soDienThoai)
    {
    	this.soDienThoai = soDienThoai;
    }
    public int getNamSinh()
    {
    	return namSinh;
    }
    public void setNamSinh(int namSinh)
    {
    	this.namSinh = namSinh;
    }
    public String getDiaChi()
    {
    	return diaChi;
    }
    public void setDiaChi(String diaChi)
    {
    	this.diaChi = diaChi;
    }
    public LocalDate getNgayVaoLam()
    {
    	return ngayVaoLam;
    }
    public void setNgayVaoLam(LocalDate ngayVaoLam)
    {
    	this.ngayVaoLam = ngayVaoLam;
    }
    public String getMaKV()
    {
    	return maKV;
    }
    public void setMaKV(String maKV)
    {
    	this.maKV = maKV;
    }
    public KhuVucCheBien getKVCB_DB()
    {
    	return KVCB_DB;
    }
    public void setKVCB_DB(KhuVucCheBien KVCB_DB)
    {
    	this.KVCB_DB = KVCB_DB;
    }
}
