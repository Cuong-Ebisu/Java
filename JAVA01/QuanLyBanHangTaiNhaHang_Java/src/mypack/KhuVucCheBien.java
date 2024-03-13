package mypack;

import java.util.ArrayList;
import java.util.List;

public class KhuVucCheBien {
	//AUTOMATIC PROPERTIES
    public String maKV;
    public String viTri;

    //CONSTRUCTOR
    public KhuVucCheBien() { }
    public KhuVucCheBien(KhuVucCheBien KVCB)
    {
        this.maKV = KVCB.maKV;
        this.viTri = KVCB.viTri;    
        this.ds_MonAn = KVCB.ds_MonAn;
        this.ds_dauBep = KVCB.ds_dauBep;
    }
    public KhuVucCheBien(String maKV, String viTri, ArrayList<MonAn> ds_MonAn, ArrayList<DauBep> ds_dauBep)
    {
        this.maKV = maKV;
        this.viTri = viTri;
        this.ds_MonAn = ds_MonAn;
        this.ds_dauBep= ds_dauBep;
    }

    //RELATED = SINGULAR
    public List<MonAn> ds_MonAn; // DANH SACH MON AN CUA KHU VUC CHE BIEN
    public List<DauBep> ds_dauBep; // DANH SACH DAU BEP CUA KHU VUC CHE BIEN
    
    //GETTER - SETTER
    public String getMaKV()
    {
    	return maKV;
    }
    public void setMaKV(String maKV)
    {
    	this.maKV = maKV;
    }
    public String getViTri()
    {
    	return viTri;
    }
    public void setViTri(String viTri)
    {
    	this.viTri = viTri;
    }
    public List<MonAn> getDS_MonAn()
    {
    	return ds_MonAn;
    }
    public void setDS_MonAn(List<MonAn> ds_MonAn)
    {
    	this.ds_MonAn = ds_MonAn;
    }
    public List<DauBep> getDS_DauBep()
    {
    	return ds_dauBep;
    }
    public void setDS_DauBep(List<DauBep> ds_dauBep)
    {
    	this.ds_dauBep = ds_dauBep;
    }
}
