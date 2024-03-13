package mypack;

public class KhachHang {

	//AUTOMATIC PROPERTIES
    public String maKH; // Primary Key
    public String hoTenKH;
    public String diaChi;
    public int namSinh;
    public String soDienThoaiKH;
    public String maHD; // Foreign Key

    //CONSTRUCTOR
    public KhachHang() { }  

    public KhachHang(KhachHang KH)
    {
        this.maKH = KH.maKH;    
        this.hoTenKH = KH.hoTenKH;
        this.diaChi = KH.diaChi;
        this.namSinh = KH.namSinh;
        this.soDienThoaiKH = KH.soDienThoaiKH;
        this.maHD= KH.maHD;
        this.HD_KH = KH.HD_KH;
    }
    public KhachHang(String maKH, String hoTenKH, String diaChi, int namSinh, String soDienThoaiKH, String maHD, HoaDon HD_KH)
    {
        this.maKH = maKH;
        this.hoTenKH = hoTenKH;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
        this.soDienThoaiKH = soDienThoaiKH;
        this.maHD= maHD;
        this.HD_KH = HD_KH;
    }
    // RELATED = PLURAL
    // HOA DON CUA KHACH HANG
    public HoaDon HD_KH; 
    
    //GETTER - SETTER
    public String getmaKH()
    {
    	return maKH;
    }
    public void setmaKH(String maKH)
    {
    	this.maKH = maKH;
    }
    public String getHoTenKH()
    {
    	return hoTenKH;
    }
    public void setHoTenKH(String hoTenKH)
    {
    	this.hoTenKH = hoTenKH;
    }
    public String getDiaChi()
    {
    	return diaChi;
    }
    public void setDiaChi(String diaChi)
    {
    	this.diaChi = diaChi;
    }
    public int getNamSinh()
    {
    	return namSinh;
    }
    public void setNamSinh(int namSinh)
    {
    	this.namSinh = namSinh;
    }
    public String getSoDienThoaiKH()
    {
    	return soDienThoaiKH;
    }
    public void setSoDienThoaiKH(String soDienThoaiKH)
    {
    	this.soDienThoaiKH = soDienThoaiKH;
    }
    public String getMaHD()
    {
    	return maHD;
    }
    public void setMaHD(String maHD)
    {
    	this.maHD = maHD;
    }
    public HoaDon getHD_KH()
    {
    	return HD_KH;
    }
    public void setHD_KH(HoaDon HD_KH)
    {
    	this.HD_KH = HD_KH;
    }
}
