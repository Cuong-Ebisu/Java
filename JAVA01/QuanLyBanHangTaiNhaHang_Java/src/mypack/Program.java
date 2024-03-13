package mypack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDate;



public class Program {

	//KHOI TAO DU LIEU
    public static List<DatDonHang> dsDatDonHang = new ArrayList<DatDonHang>();
    public static List<DauBep> dsDauBep = new ArrayList<DauBep>();
    public static List<DonHang> dsDonHang = new ArrayList<DonHang>();
    public static List<HoaDon> dsHoaDon = new ArrayList<HoaDon>();
    public static List<KhachHang> dsKhachHang = new ArrayList<KhachHang>();
    public static List<KhuVucCheBien> dsKhuVucCheBien = new ArrayList<KhuVucCheBien>();
    public static List<MonAn> dsMonAn = new ArrayList<MonAn>();
    public static List<NhanVien> dsNhanVien = new ArrayList<NhanVien>();
    public static List<QuanLy> dsQuanLy = new ArrayList<QuanLy>();
    public static List<TaiXeGH> dsTaiXeGH = new ArrayList<TaiXeGH>();

    //HAM TAO DU LIEU
    public static void TaoDS_DatDonHang()
    {
        dsDatDonHang.add(new DatDonHang(1, 4, LocalDate.of(2023, 1, 03), new ArrayList<KhachHang>(), new ArrayList<DonHang>()));//0
        dsDatDonHang.add(new DatDonHang(2, 3, LocalDate.of(2023, 1, 02), new ArrayList<KhachHang>(), new ArrayList<DonHang>()));//1
        dsDatDonHang.add(new DatDonHang(2, 2, LocalDate.of(2023, 1, 05), new ArrayList<KhachHang>(), new ArrayList<DonHang>()));//2
        dsDatDonHang.add(new DatDonHang(1, 2, LocalDate.of(2023, 1, 06), new ArrayList<KhachHang>(), new ArrayList<DonHang>()));//3
        dsDatDonHang.add(new DatDonHang(3, 4, LocalDate.of(2023, 1, 04), new ArrayList<KhachHang>(), new ArrayList<DonHang>()));//4
        dsDatDonHang.add(new DatDonHang(1, 3, LocalDate.of(2023, 1, 01), new ArrayList<KhachHang>(), new ArrayList<DonHang>()));//5
        dsDatDonHang.add(new DatDonHang(1, 5, LocalDate.of(2023, 1, 02), new ArrayList<KhachHang>(), new ArrayList<DonHang>()));//6
        dsDatDonHang.add(new DatDonHang(1, 1, LocalDate.of(2023, 1, 07), new ArrayList<KhachHang>(), new ArrayList<DonHang>()));//7
        dsDatDonHang.add(new DatDonHang(1, 1, LocalDate.of(2023, 1, 06), new ArrayList<KhachHang>(), new ArrayList<DonHang>()));//8
        dsDatDonHang.add(new DatDonHang(2, 4, LocalDate.of(2023, 1, 04), new ArrayList<KhachHang>(), new ArrayList<DonHang>()));//9
        dsDatDonHang.add(new DatDonHang(3, 1, LocalDate.of(2023, 1, 05), new ArrayList<KhachHang>(), new ArrayList<DonHang>()));//10
        dsDatDonHang.add(new DatDonHang(1, 1, LocalDate.of(2023, 1, 02), new ArrayList<KhachHang>(), new ArrayList<DonHang>()));//11
    }
    public static void TaoDS_HoaDon()
    {
        dsHoaDon.add(new HoaDon("HD001", 1400000, LocalDate.of(2023, 1, 30), new ArrayList<KhachHang>(), new ArrayList<DonHang>()));  //0
        dsHoaDon.add(new HoaDon("HD002", 1410000, LocalDate.of(2023, 1, 29), new ArrayList<KhachHang>(), new ArrayList<DonHang>()));  //1
        dsHoaDon.add(new HoaDon("HD003", 290000, LocalDate.of(2023, 1, 28), new ArrayList<KhachHang>(), new ArrayList<DonHang>()));   //2
        dsHoaDon.add(new HoaDon("HD004", 15000, LocalDate.of(2023, 1, 30), new ArrayList<KhachHang>(), new ArrayList<DonHang>()));    //3
        dsHoaDon.add(new HoaDon("HD005", 930000, LocalDate.of(2023, 1, 27), new ArrayList<KhachHang>(), new ArrayList<DonHang>()));   //4
        dsHoaDon.add(new HoaDon("HD006", 1435000, LocalDate.of(2023, 1, 26), new ArrayList<KhachHang>(), new ArrayList<DonHang>()));  //5
        dsHoaDon.add(new HoaDon("HD007", 1000000, LocalDate.of(2023, 1, 28), new ArrayList<KhachHang>(), new ArrayList<DonHang>()));  //6
        dsHoaDon.add(new HoaDon("HD008", 20000, LocalDate.of(2023, 1, 30), new ArrayList<KhachHang>(), new ArrayList<DonHang>()));    //7
        dsHoaDon.add(new HoaDon("HD009", 700000, LocalDate.of(2023, 1, 29), new ArrayList<KhachHang>(), new ArrayList<DonHang>()));   //8
        dsHoaDon.add(new HoaDon("HD010", 1440000, LocalDate.of(2023, 1, 28), new ArrayList<KhachHang>(), new ArrayList<DonHang>()));  //9
        dsHoaDon.add(new HoaDon("HD011", 1245000, LocalDate.of(2023, 1, 30), new ArrayList<KhachHang>(), new ArrayList<DonHang>()));  //10
        dsHoaDon.add(new HoaDon("HD012", 3555000, LocalDate.of(2023, 1, 30), new ArrayList<KhachHang>(), new ArrayList<DonHang>()));  //11
    }
    public static void TaoDS_QuanLy()
    {
        dsQuanLy.add(new QuanLy("QL001", "Chau Anh Tuyet", "Q.11, TP.Ho Chi Minh", "038570509", "Nu", "256957122", new ArrayList<NhanVien>(), new ArrayList<TaiXeGH>()));             //0
        dsQuanLy.add(new QuanLy("QL002", "Truong Nguyet Anh", "Q.Binh Thanh, TP.Ho Chi Minh", "038570046", "Nu", "416028464", new ArrayList<NhanVien>(), new ArrayList<TaiXeGH>()));  //1
        dsQuanLy.add(new QuanLy("QL003", "Vu Anh Tuan", "Q.Tan Binh, TP.Ho Chi Minh", "038570378", "Nam", "287238227", new ArrayList<NhanVien>(), new ArrayList<TaiXeGH>()));         //2
        dsQuanLy.add(new QuanLy("QL004", "Nguyuen Anh Tho", "Q.1, TP.Ho Chi Minh", "0385720366", "Nu", "884182370", new ArrayList<NhanVien>(), new ArrayList<TaiXeGH>()));            //3
        dsQuanLy.add(new QuanLy("QL005", "Chau Anh Dung", "Q.10, TP.Ho Chi Minh", "038570732", "Nam", "409021400", new ArrayList<NhanVien>(), new ArrayList<TaiXeGH>()));             //4
    }
    public static void TaoDS_NhanVien()
    {
        dsNhanVien.add(new NhanVien("NV001", "Dang Ngoc Anh", "Q.1, TP.Ho Chi Minh", "038379483", "Nu", "215864519", dsQuanLy.get(0).maQL, new ArrayList<DonHang>(), dsQuanLy.get(0)));              //0
        dsNhanVien.add(new NhanVien("NV002", "Ha Thi Tuyet Anh", "Q.Binh Thanh, TP.Ho Chi Minh", "038361783", "Nu", "555250324", dsQuanLy.get(0).maQL, new ArrayList<DonHang>(), dsQuanLy.get(0)));  //1
        dsNhanVien.add(new NhanVien("NV003", "Mai Anh", "Q.Tan Binh, TP.Ho Chi Minh", "038326783", "Nu", "915543531", dsQuanLy.get(1).maQL, new ArrayList<DonHang>(), dsQuanLy.get(1)));             //2
        dsNhanVien.add(new NhanVien("NV004", "Tu Ngoc Anh", "Q.10, TP.Ho Chi Minh", "038336783", "Nu", "370830211", dsQuanLy.get(1).maQL, new ArrayList<DonHang>(), dsQuanLy.get(1)));               //3
        dsNhanVien.add(new NhanVien("NV005", "Trinh Hung Manh", "Q.11, TP.Ho Chi Minh", "038379367", "Nam", "698551944", dsQuanLy.get(2).maQL, new ArrayList<DonHang>(), dsQuanLy.get(2)));          //4
        dsNhanVien.add(new NhanVien("NV006", "Huu Quoc Anh", "Q.8, TP.Ho Chi Minh", "0354769483", "Nam", "517555198", dsQuanLy.get(2).maQL, new ArrayList<DonHang>(), dsQuanLy.get(2)));             //5
        dsNhanVien.add(new NhanVien("NV007", "Do Anh Thu", "Q.Binh Thanh, TP.Ho Chi Minh", "038379429", "Nu", "676553571", dsQuanLy.get(2).maQL, new ArrayList<DonHang>(), dsQuanLy.get(2)));        //6
        dsNhanVien.add(new NhanVien("NV008", "Moc Phung Anh", "Q.5, TP.Ho Chi Minh", "038482483", "Nam", "996357151", dsQuanLy.get(2).maQL, new ArrayList<DonHang>(), dsQuanLy.get(2)));             //7
        dsNhanVien.add(new NhanVien("NV009", "Ho Anh Minh", "Q.Binh Thanh, TP.Ho Chi Minh", "038376580", "Nam", "545784041", dsQuanLy.get(3).maQL, new ArrayList<DonHang>(), dsQuanLy.get(3)));      //8  
        dsNhanVien.add(new NhanVien("NV010", "Do Ngoc Tram Anh", "Q.11, TP.Ho Chi Minh", "038350983", "Nu", "879955528", dsQuanLy.get(4).maQL, new ArrayList<DonHang>(), dsQuanLy.get(4)));          //9

        //THEM NHAN VIEN THEO DANH SACH QUAN LY
        dsQuanLy.get(0).ds_NhanVien.add(dsNhanVien.get(0));
        dsQuanLy.get(0).ds_NhanVien.add(dsNhanVien.get(1));

        dsQuanLy.get(1).ds_NhanVien.add(dsNhanVien.get(2));
        dsQuanLy.get(1).ds_NhanVien.add(dsNhanVien.get(3));

        dsQuanLy.get(2).ds_NhanVien.add(dsNhanVien.get(4));
        dsQuanLy.get(2).ds_NhanVien.add(dsNhanVien.get(5));
        dsQuanLy.get(2).ds_NhanVien.add(dsNhanVien.get(6));
        dsQuanLy.get(2).ds_NhanVien.add(dsNhanVien.get(7));

        dsQuanLy.get(3).ds_NhanVien.add(dsNhanVien.get(8));

        dsQuanLy.get(4).ds_NhanVien.add(dsNhanVien.get(9));
    }
    public static void TaoDS_TaiXeGH()
    {
        dsTaiXeGH.add(new TaiXeGH("TX001", "Tran Kim Anh", "Q.3, TP.Ho Chi Minh", "033931529", "Nu", "905882448", "37A84613", dsQuanLy.get(0).maQL, dsQuanLy.get(0), new ArrayList<DonHang>()));         //0
        dsTaiXeGH.add(new TaiXeGH("TX002", "Tang Quan Anh", "Q.Tan Phu, TP.Ho Chi Minh", "033931822", "Nam", "291010506", "35A98547", dsQuanLy.get(1).maQL, dsQuanLy.get(1), new ArrayList<DonHang>())); //1
        dsTaiXeGH.add(new TaiXeGH("TX003", "Tran Thi Anh Suong", "Q.10, TP.Ho Chi Minh", "033931563", "Nu", "487862971", "36A94684", dsQuanLy.get(1).maQL, dsQuanLy.get(1), new ArrayList<DonHang>()));  //2
        dsTaiXeGH.add(new TaiXeGH("TX004", "Anh Ton Khoi", "Q.Tan Binh, TP.Ho Chi Minh", "033931277", "Nam", "695403179", "37A10274", dsQuanLy.get(2).maQL, dsQuanLy.get(2), new ArrayList<DonHang>())); //3
        dsTaiXeGH.add(new TaiXeGH("TX005", "Tran Anh Vinh", "Q.3, TP.Ho Chi Minh", "033931353", "Nam", "383859888", "37A67542", dsQuanLy.get(2).maQL, dsQuanLy.get(2), new ArrayList<DonHang>()));       //4
        dsTaiXeGH.add(new TaiXeGH("TX006", "Nguyen Anh Dung", "Q.4, TP.Ho Chi Minh", "033931925", "Nam", "715472437", "30A74937", dsQuanLy.get(3).maQL, dsQuanLy.get(3), new ArrayList<DonHang>()));     //5
        dsTaiXeGH.add(new TaiXeGH("TX007", "Tan Anh Nguyet", "Q.5, TP.Ho Chi Minh", "033931540", "Nu", "974169937", "34A84937", dsQuanLy.get(4).maQL, dsQuanLy.get(4), new ArrayList<DonHang>()));       //6

        // THEM TAI XE THEO DANH SACH QUAN LY
        dsQuanLy.get(0).ds_TaiXeGH.add(dsTaiXeGH.get(0));

        dsQuanLy.get(1).ds_TaiXeGH.add(dsTaiXeGH.get(1));
        dsQuanLy.get(1).ds_TaiXeGH.add(dsTaiXeGH.get(2));

        dsQuanLy.get(2).ds_TaiXeGH.add(dsTaiXeGH.get(3));
        dsQuanLy.get(2).ds_TaiXeGH.add(dsTaiXeGH.get(4));

        dsQuanLy.get(3).ds_TaiXeGH.add(dsTaiXeGH.get(5));

        dsQuanLy.get(4).ds_TaiXeGH.add(dsTaiXeGH.get(6));
    }
    public static void TaoDs_KhuVucCB()
    {
        dsKhuVucCheBien.add(new KhuVucCheBien("KVCB001", "Khu A", new ArrayList<MonAn>(), new ArrayList<DauBep>()));  //0
        dsKhuVucCheBien.add(new KhuVucCheBien("KVCB002", "Khu B", new ArrayList<MonAn>(), new ArrayList<DauBep>()));  //1
        dsKhuVucCheBien.add(new KhuVucCheBien("KVCB003", "Khu C", new ArrayList<MonAn>(), new ArrayList<DauBep>()));  //2
        dsKhuVucCheBien.add(new KhuVucCheBien("KVCB004", "Khu D", new ArrayList<MonAn>(), new ArrayList<DauBep>()));  //3
        dsKhuVucCheBien.add(new KhuVucCheBien("KVCB005", "Khu E", new ArrayList<MonAn>(), new ArrayList<DauBep>()));  //4
    }
    public static void TaoDS_DauBep()
    {
        dsDauBep.add(new DauBep("DB001", "Le Anh Tuan", "033833432", 1983, "Q.1 ,TP.Ho Chi Minh", LocalDate.of(2010, 3, 8), dsKhuVucCheBien.get(0).maKV, dsKhuVucCheBien.get(0)));                  //0
        dsDauBep.add(new DauBep("DB002", "Mai Anh Nguyet", "033833420", 1993, "Q.11 ,TP.Ho Chi Minh", LocalDate.of(2012, 2, 7), dsKhuVucCheBien.get(0).maKV, dsKhuVucCheBien.get(0)));              //1
        dsDauBep.add(new DauBep("DB003", "Le Tuan Anh", "033833165", 1982, "Q.1 ,TP.Ho Chi Minh", LocalDate.of(2010, 8, 8), dsKhuVucCheBien.get(1).maKV, dsKhuVucCheBien.get(1)));                  //2
        dsDauBep.add(new DauBep("DB004", "Le Thi Phuong Anh", "0338334842", 1983, "Q.Phu Thuan ,TP.Ho Chi Minh", LocalDate.of(2011, 4, 1), dsKhuVucCheBien.get(1).maKV, dsKhuVucCheBien.get(1)));   //3
        dsDauBep.add(new DauBep("DB005", "Le Anh Dung", "033833631", 1986, "Q.5 ,TP.Ho Chi Minh", LocalDate.of(2010, 7, 18), dsKhuVucCheBien.get(2).maKV, dsKhuVucCheBien.get(2)));                 //4
        dsDauBep.add(new DauBep("DB006", "Lam Anh", "033833099", 1981, "Q.Tan Phu ,TP.Ho Chi Minh", LocalDate.of(2010, 3, 8), dsKhuVucCheBien.get(2).maKV, dsKhuVucCheBien.get(2)));                //5
        dsDauBep.add(new DauBep("DB007", "Huynh Phuc Anh", "033833043", 1988, "Q.Go Vap ,TP.Ho Chi Minh", LocalDate.of(2010, 3, 8), dsKhuVucCheBien.get(3).maKV, dsKhuVucCheBien.get(3)));          //6
        dsDauBep.add(new DauBep("DB008", "Nguyen Thi Lai San", "033833148", 1990, "Q.Binh Thanh ,TP.Ho Chi Minh", LocalDate.of(2010, 3, 8), dsKhuVucCheBien.get(3).maKV, dsKhuVucCheBien.get(3)));  //7
        dsDauBep.add(new DauBep("DB009", "Nguyen Thi Dy Anh", "033833085", 1988, "Q.1 ,TP.Ho Chi Minh", LocalDate.of(2011, 5, 27), dsKhuVucCheBien.get(4).maKV, dsKhuVucCheBien.get(4)));           //8
        dsDauBep.add(new DauBep("DB010", "Nguyen Ngoc Vy Anh", "033833405", 1989, "Q.Go Vap ,TP.Ho Chi Minh", LocalDate.of(2010, 3, 8), dsKhuVucCheBien.get(4).maKV, dsKhuVucCheBien.get(4)));      //9

        //THEM DANH SACH DAU BEP THEO KHU VUC CHE BIEN
        dsKhuVucCheBien.get(0).ds_dauBep.add(dsDauBep.get(0));
        dsKhuVucCheBien.get(0).ds_dauBep.add(dsDauBep.get(1));

        dsKhuVucCheBien.get(1).ds_dauBep.add(dsDauBep.get(2));
        dsKhuVucCheBien.get(1).ds_dauBep.add(dsDauBep.get(3));

        dsKhuVucCheBien.get(2).ds_dauBep.add(dsDauBep.get(4));
        dsKhuVucCheBien.get(2).ds_dauBep.add(dsDauBep.get(5));

        dsKhuVucCheBien.get(3).ds_dauBep.add(dsDauBep.get(6));
        dsKhuVucCheBien.get(3).ds_dauBep.add(dsDauBep.get(7));

        dsKhuVucCheBien.get(4).ds_dauBep.add(dsDauBep.get(8));
        dsKhuVucCheBien.get(4).ds_dauBep.add(dsDauBep.get(9));

    }
    public static void TaoDS_DonHang()
    {
        dsDonHang.add(new DonHang("DH01", LocalDate.of(2023, 01, 11), dsHoaDon.get(0).maHD, dsHoaDon.get(0), new ArrayList<MonAn>(), dsNhanVien.get(0).maNV, dsNhanVien.get(0), dsTaiXeGH.get(0).maTX, dsTaiXeGH.get(0)));   //0
        dsDonHang.add(new DonHang("DH02", LocalDate.of(2023, 01, 12), dsHoaDon.get(1).maHD, dsHoaDon.get(1), new ArrayList<MonAn>(), dsNhanVien.get(1).maNV, dsNhanVien.get(1), dsTaiXeGH.get(1).maTX, dsTaiXeGH.get(1)));   //1
        dsDonHang.add(new DonHang("DH03", LocalDate.of(2023, 01, 14), dsHoaDon.get(1).maHD, dsHoaDon.get(1), new ArrayList<MonAn>(), dsNhanVien.get(2).maNV, dsNhanVien.get(2), dsTaiXeGH.get(1).maTX, dsTaiXeGH.get(1)));   //2
        dsDonHang.add(new DonHang("DH04", LocalDate.of(2023, 01, 20), dsHoaDon.get(2).maHD, dsHoaDon.get(2), new ArrayList<MonAn>(), dsNhanVien.get(2).maNV, dsNhanVien.get(2), dsTaiXeGH.get(2).maTX, dsTaiXeGH.get(2)));   //3
        dsDonHang.add(new DonHang("DH05", LocalDate.of(2023, 01, 10), dsHoaDon.get(2).maHD, dsHoaDon.get(2), new ArrayList<MonAn>(), dsNhanVien.get(2).maNV, dsNhanVien.get(2), dsTaiXeGH.get(2).maTX, dsTaiXeGH.get(2)));   //4
        dsDonHang.add(new DonHang("DH06", LocalDate.of(2023, 01, 31), dsHoaDon.get(3).maHD, dsHoaDon.get(3), new ArrayList<MonAn>(), dsNhanVien.get(3).maNV, dsNhanVien.get(3), dsTaiXeGH.get(2).maTX, dsTaiXeGH.get(2)));   //5
        dsDonHang.add(new DonHang("DH07", LocalDate.of(2023, 01, 22), dsHoaDon.get(4).maHD, dsHoaDon.get(4), new ArrayList<MonAn>(), dsNhanVien.get(3).maNV, dsNhanVien.get(3), dsTaiXeGH.get(3).maTX, dsTaiXeGH.get(3)));   //6
        dsDonHang.add(new DonHang("DH08", LocalDate.of(2023, 01, 30), dsHoaDon.get(4).maHD, dsHoaDon.get(4), new ArrayList<MonAn>(), dsNhanVien.get(4).maNV, dsNhanVien.get(4), dsTaiXeGH.get(3).maTX, dsTaiXeGH.get(3)));   //7
        dsDonHang.add(new DonHang("DH09", LocalDate.of(2023, 01, 12), dsHoaDon.get(4).maHD, dsHoaDon.get(4), new ArrayList<MonAn>(), dsNhanVien.get(4).maNV, dsNhanVien.get(4), dsTaiXeGH.get(3).maTX, dsTaiXeGH.get(3)));   //8
        dsDonHang.add(new DonHang("DH10", LocalDate.of(2023, 01, 21), dsHoaDon.get(5).maHD, dsHoaDon.get(5), new ArrayList<MonAn>(), dsNhanVien.get(5).maNV, dsNhanVien.get(5), dsTaiXeGH.get(3).maTX, dsTaiXeGH.get(3)));   //9
        dsDonHang.add(new DonHang("DH11", LocalDate.of(2023, 01, 15), dsHoaDon.get(6).maHD, dsHoaDon.get(6), new ArrayList<MonAn>(), dsNhanVien.get(5).maNV, dsNhanVien.get(5), dsTaiXeGH.get(4).maTX, dsTaiXeGH.get(4)));   //10
        dsDonHang.add(new DonHang("DH12", LocalDate.of(2023, 01, 12), dsHoaDon.get(7).maHD, dsHoaDon.get(7), new ArrayList<MonAn>(), dsNhanVien.get(5).maNV, dsNhanVien.get(5), dsTaiXeGH.get(4).maTX, dsTaiXeGH.get(4)));   //11
        dsDonHang.add(new DonHang("DH13", LocalDate.of(2023, 01, 21), dsHoaDon.get(8).maHD, dsHoaDon.get(8), new ArrayList<MonAn>(), dsNhanVien.get(5).maNV, dsNhanVien.get(5), dsTaiXeGH.get(5).maTX, dsTaiXeGH.get(5)));   //12
        dsDonHang.add(new DonHang("DH14", LocalDate.of(2023, 01, 16), dsHoaDon.get(9).maHD, dsHoaDon.get(9), new ArrayList<MonAn>(), dsNhanVien.get(6).maNV, dsNhanVien.get(6), dsTaiXeGH.get(5).maTX, dsTaiXeGH.get(5)));   //13
        dsDonHang.add(new DonHang("DH15", LocalDate.of(2023, 01, 30), dsHoaDon.get(9).maHD, dsHoaDon.get(9), new ArrayList<MonAn>(), dsNhanVien.get(6).maNV, dsNhanVien.get(6), dsTaiXeGH.get(5).maTX, dsTaiXeGH.get(5)));   //14
        dsDonHang.add(new DonHang("DH16", LocalDate.of(2023, 01, 13), dsHoaDon.get(10).maHD, dsHoaDon.get(10), new ArrayList<MonAn>(), dsNhanVien.get(7).maNV, dsNhanVien.get(7), dsTaiXeGH.get(5).maTX, dsTaiXeGH.get(5))); //15
        dsDonHang.add(new DonHang("DH17", LocalDate.of(2023, 01, 28), dsHoaDon.get(10).maHD, dsHoaDon.get(10), new ArrayList<MonAn>(), dsNhanVien.get(7).maNV, dsNhanVien.get(7), dsTaiXeGH.get(5).maTX, dsTaiXeGH.get(5))); //16
        dsDonHang.add(new DonHang("DH18", LocalDate.of(2023, 01, 17), dsHoaDon.get(10).maHD, dsHoaDon.get(10), new ArrayList<MonAn>(), dsNhanVien.get(8).maNV, dsNhanVien.get(8), dsTaiXeGH.get(6).maTX, dsTaiXeGH.get(6))); //17
        dsDonHang.add(new DonHang("DH19", LocalDate.of(2023, 01, 13), dsHoaDon.get(11).maHD, dsHoaDon.get(11), new ArrayList<MonAn>(), dsNhanVien.get(8).maNV, dsNhanVien.get(8), dsTaiXeGH.get(6).maTX, dsTaiXeGH.get(6))); //18
        dsDonHang.add(new DonHang("DH20", LocalDate.of(2023, 01, 12), dsHoaDon.get(11).maHD, dsHoaDon.get(10), new ArrayList<MonAn>(), dsNhanVien.get(9).maNV, dsNhanVien.get(9), dsTaiXeGH.get(6).maTX, dsTaiXeGH.get(6))); //19

        //THEM DON HANG THEO TAI XE GIAO HANG
        dsTaiXeGH.get(0).ds_DonHang.add(dsDonHang.get(0));

        dsTaiXeGH.get(1).ds_DonHang.add(dsDonHang.get(1));
        dsTaiXeGH.get(1).ds_DonHang.add(dsDonHang.get(2));

        dsTaiXeGH.get(2).ds_DonHang.add(dsDonHang.get(3));
        dsTaiXeGH.get(2).ds_DonHang.add(dsDonHang.get(4));
        dsTaiXeGH.get(2).ds_DonHang.add(dsDonHang.get(5));

        dsTaiXeGH.get(3).ds_DonHang.add(dsDonHang.get(6));
        dsTaiXeGH.get(3).ds_DonHang.add(dsDonHang.get(7));
        dsTaiXeGH.get(3).ds_DonHang.add(dsDonHang.get(8));
        dsTaiXeGH.get(3).ds_DonHang.add(dsDonHang.get(9));

        dsTaiXeGH.get(4).ds_DonHang.add(dsDonHang.get(10));
        dsTaiXeGH.get(4).ds_DonHang.add(dsDonHang.get(11));

        dsTaiXeGH.get(5).ds_DonHang.add(dsDonHang.get(12));
        dsTaiXeGH.get(5).ds_DonHang.add(dsDonHang.get(13));
        dsTaiXeGH.get(5).ds_DonHang.add(dsDonHang.get(14));
        dsTaiXeGH.get(5).ds_DonHang.add(dsDonHang.get(15));
        dsTaiXeGH.get(5).ds_DonHang.add(dsDonHang.get(16));

        dsTaiXeGH.get(6).ds_DonHang.add(dsDonHang.get(17));
        dsTaiXeGH.get(6).ds_DonHang.add(dsDonHang.get(18));
        dsTaiXeGH.get(6).ds_DonHang.add(dsDonHang.get(19));

        // THEM DON HANG THEO NHAN VIEN
        dsNhanVien.get(0).ds_DonHang.add(dsDonHang.get(0));

        dsNhanVien.get(1).ds_DonHang.add(dsDonHang.get(1));

        dsNhanVien.get(2).ds_DonHang.add(dsDonHang.get(2));
        dsNhanVien.get(2).ds_DonHang.add(dsDonHang.get(3));
        dsNhanVien.get(2).ds_DonHang.add(dsDonHang.get(4));

        dsNhanVien.get(3).ds_DonHang.add(dsDonHang.get(5));
        dsNhanVien.get(3).ds_DonHang.add(dsDonHang.get(6));

        dsNhanVien.get(4).ds_DonHang.add(dsDonHang.get(7));
        dsNhanVien.get(4).ds_DonHang.add(dsDonHang.get(8));

        dsNhanVien.get(5).ds_DonHang.add(dsDonHang.get(9));
        dsNhanVien.get(5).ds_DonHang.add(dsDonHang.get(10));
        dsNhanVien.get(5).ds_DonHang.add(dsDonHang.get(11));
        dsNhanVien.get(5).ds_DonHang.add(dsDonHang.get(12));

        dsNhanVien.get(6).ds_DonHang.add(dsDonHang.get(13));
        dsNhanVien.get(6).ds_DonHang.add(dsDonHang.get(14));

        dsNhanVien.get(7).ds_DonHang.add(dsDonHang.get(15));
        dsNhanVien.get(7).ds_DonHang.add(dsDonHang.get(16));

        dsNhanVien.get(8).ds_DonHang.add(dsDonHang.get(17));
        dsNhanVien.get(8).ds_DonHang.add(dsDonHang.get(18));

        dsNhanVien.get(9).ds_DonHang.add(dsDonHang.get(19));

        //THEM DON HANG THEO DANH SACH DAT DON HANG
        dsDatDonHang.get(0).dsDonHang.add(dsDonHang.get(0));

        dsDatDonHang.get(1).dsDonHang.add(dsDonHang.get(1));
        dsDatDonHang.get(1).dsDonHang.add(dsDonHang.get(2));

        dsDatDonHang.get(2).dsDonHang.add(dsDonHang.get(3));
        dsDatDonHang.get(2).dsDonHang.add(dsDonHang.get(4));

        dsDatDonHang.get(3).dsDonHang.add(dsDonHang.get(5));

        dsDatDonHang.get(4).dsDonHang.add(dsDonHang.get(6));
        dsDatDonHang.get(4).dsDonHang.add(dsDonHang.get(7));
        dsDatDonHang.get(4).dsDonHang.add(dsDonHang.get(8));

        dsDatDonHang.get(5).dsDonHang.add(dsDonHang.get(9));

        dsDatDonHang.get(6).dsDonHang.add(dsDonHang.get(10));

        dsDatDonHang.get(7).dsDonHang.add(dsDonHang.get(11));

        dsDatDonHang.get(8).dsDonHang.add(dsDonHang.get(12));

        dsDatDonHang.get(9).dsDonHang.add(dsDonHang.get(13));
        dsDatDonHang.get(9).dsDonHang.add(dsDonHang.get(14));

        dsDatDonHang.get(10).dsDonHang.add(dsDonHang.get(15));
        dsDatDonHang.get(10).dsDonHang.add(dsDonHang.get(16));
        dsDatDonHang.get(10).dsDonHang.add(dsDonHang.get(17));

        dsDatDonHang.get(11).dsDonHang.add(dsDonHang.get(18));
        dsDatDonHang.get(11).dsDonHang.add(dsDonHang.get(19));

        // THEM DON HANG THEO DANH SACH HOA DON
        dsHoaDon.get(0).dsDH_HD.add(dsDonHang.get(0));

        dsHoaDon.get(1).dsDH_HD.add(dsDonHang.get(1));
        dsHoaDon.get(1).dsDH_HD.add(dsDonHang.get(2));

        dsHoaDon.get(2).dsDH_HD.add(dsDonHang.get(3));
        dsHoaDon.get(2).dsDH_HD.add(dsDonHang.get(4));

        dsHoaDon.get(3).dsDH_HD.add(dsDonHang.get(5));

        dsHoaDon.get(4).dsDH_HD.add(dsDonHang.get(6));
        dsHoaDon.get(4).dsDH_HD.add(dsDonHang.get(7));
        dsHoaDon.get(4).dsDH_HD.add(dsDonHang.get(8));

        dsHoaDon.get(5).dsDH_HD.add(dsDonHang.get(9));

        dsHoaDon.get(6).dsDH_HD.add(dsDonHang.get(10));

        dsHoaDon.get(7).dsDH_HD.add(dsDonHang.get(11));

        dsHoaDon.get(8).dsDH_HD.add(dsDonHang.get(12));

        dsHoaDon.get(9).dsDH_HD.add(dsDonHang.get(13));
        dsHoaDon.get(9).dsDH_HD.add(dsDonHang.get(14));

        dsHoaDon.get(10).dsDH_HD.add(dsDonHang.get(15));
        dsHoaDon.get(10).dsDH_HD.add(dsDonHang.get(16));
        dsHoaDon.get(10).dsDH_HD.add(dsDonHang.get(17));

        dsHoaDon.get(11).dsDH_HD.add(dsDonHang.get(18));
        dsHoaDon.get(11).dsDH_HD.add(dsDonHang.get(19));
    }
    public static void TaoDS_KhachHang()
    {
        dsKhachHang.add(new KhachHang("KH1001", "Hoang Minh Tam", "An Giang", 1983, "038379483", dsHoaDon.get(0).maHD, dsHoaDon.get(0)));           // 0
        dsKhachHang.add(new KhachHang("KH1002", "Phuong Ngoc Anh", "Ba Ria - Vung Tau", 1979, "038549986", dsHoaDon.get(0).maHD, dsHoaDon.get(0))); // 1
        dsKhachHang.add(new KhachHang("KH1003", "Tat Anh", "Bac Lieu", 1982, "038379323", dsHoaDon.get(0).maHD, dsHoaDon.get(0)));                  // 2
        dsKhachHang.add(new KhachHang("KH1004", "Dinh Hong Anh", "Bac Lieu", 1976, "038027463", dsHoaDon.get(0).maHD, dsHoaDon.get(0)));            // 3
        dsKhachHang.add(new KhachHang("KH1005", "Duong Le Anh", "Quang Nam", 1983, "0385382683", dsHoaDon.get(1).maHD, dsHoaDon.get(1)));           // 4
        dsKhachHang.add(new KhachHang("KH1006", "Ha Tuan Anh", "Bac Giang", 1998, "038872733", dsHoaDon.get(1).maHD, dsHoaDon.get(1)));             // 5
        dsKhachHang.add(new KhachHang("KH1007", "Lam Hue Anh", "Quang Nam", 1978, "038376583", dsHoaDon.get(1).maHD, dsHoaDon.get(1)));             // 6
        dsKhachHang.add(new KhachHang("KH1008", "Tiet Duc Anh", "Bac Kan", 1986, "038377323", dsHoaDon.get(2).maHD, 	dsHoaDon.get(2)));              // 7
        dsKhachHang.add(new KhachHang("KH1009", "Ly Thi Anh Nguyet", "Bac Ninh", 1978, "038343483", dsHoaDon.get(2).maHD, dsHoaDon.get(2)));        // 8
        dsKhachHang.add(new KhachHang("KH1010", "Vuong Thi Ngoc Anh", "Quang Nam", 1967, "038099483", dsHoaDon.get(3).maHD, dsHoaDon.get(3)));      // 9
        dsKhachHang.add(new KhachHang("KH1011", "Dinh Huu Anh Huy", "Ben Tre", 1983, "038398483", dsHoaDon.get(3).maHD, dsHoaDon.get(3)));          // 10
        dsKhachHang.add(new KhachHang("KH1012", "Dao Duy Anh", "Binh Duong", 1993, "038372383", dsHoaDon.get(4).maHD, dsHoaDon.get(4)));            // 11
        dsKhachHang.add(new KhachHang("KH1013", "Mai Anh Tuan", "Binh Duong", 1973, "038345483", dsHoaDon.get(4).maHD, dsHoaDon.get(4)));           // 12
        dsKhachHang.add(new KhachHang("KH1014", "Khuong Tuan Anh", "Binh Dinh", 1984, "037379403", dsHoaDon.get(4).maHD, dsHoaDon.get(4)));         // 13
        dsKhachHang.add(new KhachHang("KH1015", "Hua Chan Anh", "Binh Phuoc", 1985, "0383123483", dsHoaDon.get(4).maHD, dsHoaDon.get(4)));          // 14
        dsKhachHang.add(new KhachHang("KH1016", "Bui Thi Nguyet Anh", "Quang Nam", 1984, "031279483", dsHoaDon.get(5).maHD, dsHoaDon.get(5)));      // 15
        dsKhachHang.add(new KhachHang("KH1017", "Vu Ngoc Anh", "Ca Mau", 1989, "038371383", dsHoaDon.get(5).maHD, dsHoaDon.get(5)));                // 16
        dsKhachHang.add(new KhachHang("KH1018", "Vu Anh Ngoc", "Quang Nam", 1999, "038372383", dsHoaDon.get(5).maHD, dsHoaDon.get(5)));             // 17
        dsKhachHang.add(new KhachHang("KH1019", "Tu Nguyet Anh", "Cao Bang", 1986, "0388733283", dsHoaDon.get(6).maHD, dsHoaDon.get(6)));           // 18
        dsKhachHang.add(new KhachHang("KH1020", "Truong Anh Tu", "Quang Nam", 1976, "030479483", dsHoaDon.get(6).maHD, dsHoaDon.get(6)));           // 19
        dsKhachHang.add(new KhachHang("KH1021", "Kim Anh", "Ca Mau", 1990, "038377283", dsHoaDon.get(6).maHD, dsHoaDon.get(6)));                    // 20
        dsKhachHang.add(new KhachHang("KH1022", "Tran Viet Anh", "Cao Bang", 1993, "038379410", dsHoaDon.get(6).maHD, dsHoaDon.get(6)));            // 21
        dsKhachHang.add(new KhachHang("KH1023", "Ho Thi Anh", "Da Nang", 1998, "031279303", dsHoaDon.get(6).maHD, dsHoaDon.get(6)));                // 22
        dsKhachHang.add(new KhachHang("KH1024", "To Anh Hoa", "Quang Nam", 1989, "035497483", dsHoaDon.get(7).maHD, dsHoaDon.get(7)));              // 23
        dsKhachHang.add(new KhachHang("KH1025", "Nhan Ngoc Anh", "Dong Nai", 1983, "031379440", dsHoaDon.get(8).maHD, dsHoaDon.get(8)));            // 24
        dsKhachHang.add(new KhachHang("KH1026", "Pham Thi Anh Thu", "Dong Thap", 1983, "030923483", dsHoaDon.get(9).maHD, dsHoaDon.get(9)));        // 25
        dsKhachHang.add(new KhachHang("KH1027", "Nguyen Thi Anh Dao", "Quang Nam", 1942, "038979480", dsHoaDon.get(9).maHD, dsHoaDon.get(9)));      // 26
        dsKhachHang.add(new KhachHang("KH1028", "Luong Thi Lan Anh", "Ha Nam", 1998, "0385691713", dsHoaDon.get(9).maHD, dsHoaDon.get(9)));         // 27
        dsKhachHang.add(new KhachHang("KH1029", "Nguyen Anh Trong", "Quang Nam", 1990, "038109482", dsHoaDon.get(9).maHD, dsHoaDon.get(9)));        // 28
        dsKhachHang.add(new KhachHang("KH1030", "Nguyen Anh Hoang", "Ha Noi", 1983, "0309543723", dsHoaDon.get(10).maHD, dsHoaDon.get(10)));        // 29
        dsKhachHang.add(new KhachHang("KH1031", "Huynh Anh Hong", "Quang Nam", 1989, "038109401", dsHoaDon.get(11).maHD, dsHoaDon.get(11)));        // 30

        //THEM KHACH HANG THEO DANH SACH DAT DON HANG
        dsDatDonHang.get(0).dsKhachHang.add(dsKhachHang.get(0));
        dsDatDonHang.get(0).dsKhachHang.add(dsKhachHang.get(1));
        dsDatDonHang.get(0).dsKhachHang.add(dsKhachHang.get(2));
        dsDatDonHang.get(0).dsKhachHang.add(dsKhachHang.get(3));

        dsDatDonHang.get(1).dsKhachHang.add(dsKhachHang.get(4));
        dsDatDonHang.get(1).dsKhachHang.add(dsKhachHang.get(5));
        dsDatDonHang.get(1).dsKhachHang.add(dsKhachHang.get(6));

        dsDatDonHang.get(2).dsKhachHang.add(dsKhachHang.get(7));
        dsDatDonHang.get(2).dsKhachHang.add(dsKhachHang.get(8));

        dsDatDonHang.get(3).dsKhachHang.add(dsKhachHang.get(9));
        dsDatDonHang.get(3).dsKhachHang.add(dsKhachHang.get(10));

        dsDatDonHang.get(4).dsKhachHang.add(dsKhachHang.get(11));
        dsDatDonHang.get(4).dsKhachHang.add(dsKhachHang.get(12));
        dsDatDonHang.get(4).dsKhachHang.add(dsKhachHang.get(13));
        dsDatDonHang.get(4).dsKhachHang.add(dsKhachHang.get(14));

        dsDatDonHang.get(5).dsKhachHang.add(dsKhachHang.get(15));
        dsDatDonHang.get(5).dsKhachHang.add(dsKhachHang.get(16));
        dsDatDonHang.get(5).dsKhachHang.add(dsKhachHang.get(17));

        dsDatDonHang.get(6).dsKhachHang.add(dsKhachHang.get(18));
        dsDatDonHang.get(6).dsKhachHang.add(dsKhachHang.get(19));
        dsDatDonHang.get(6).dsKhachHang.add(dsKhachHang.get(20));
        dsDatDonHang.get(6).dsKhachHang.add(dsKhachHang.get(21));
        dsDatDonHang.get(6).dsKhachHang.add(dsKhachHang.get(22));

        dsDatDonHang.get(7).dsKhachHang.add(dsKhachHang.get(23));

        dsDatDonHang.get(8).dsKhachHang.add(dsKhachHang.get(24));

        dsDatDonHang.get(9).dsKhachHang.add(dsKhachHang.get(25));
        dsDatDonHang.get(9).dsKhachHang.add(dsKhachHang.get(26));
        dsDatDonHang.get(9).dsKhachHang.add(dsKhachHang.get(27));
        dsDatDonHang.get(9).dsKhachHang.add(dsKhachHang.get(28));

        dsDatDonHang.get(10).dsKhachHang.add(dsKhachHang.get(29));

        dsDatDonHang.get(11).dsKhachHang.add(dsKhachHang.get(30));

        // THEM KHACH HANG THEO HOA DON
        dsHoaDon.get(0).dsKH_HD.add(dsKhachHang.get(0));
        dsHoaDon.get(0).dsKH_HD.add(dsKhachHang.get(1));
        dsHoaDon.get(0).dsKH_HD.add(dsKhachHang.get(2));
        dsHoaDon.get(0).dsKH_HD.add(dsKhachHang.get(3));

        dsHoaDon.get(1).dsKH_HD.add(dsKhachHang.get(4));
        dsHoaDon.get(1).dsKH_HD.add(dsKhachHang.get(5));
        dsHoaDon.get(1).dsKH_HD.add(dsKhachHang.get(6));

        dsHoaDon.get(2).dsKH_HD.add(dsKhachHang.get(7));
        dsHoaDon.get(2).dsKH_HD.add(dsKhachHang.get(8));

        dsHoaDon.get(3).dsKH_HD.add(dsKhachHang.get(9));
        dsHoaDon.get(3).dsKH_HD.add(dsKhachHang.get(10));

        dsHoaDon.get(4).dsKH_HD.add(dsKhachHang.get(11));
        dsHoaDon.get(4).dsKH_HD.add(dsKhachHang.get(12));
        dsHoaDon.get(4).dsKH_HD.add(dsKhachHang.get(13));
        dsHoaDon.get(4).dsKH_HD.add(dsKhachHang.get(14));

        dsHoaDon.get(5).dsKH_HD.add(dsKhachHang.get(15));
        dsHoaDon.get(5).dsKH_HD.add(dsKhachHang.get(16));
        dsHoaDon.get(5).dsKH_HD.add(dsKhachHang.get(17));

        dsHoaDon.get(6).dsKH_HD.add(dsKhachHang.get(18));
        dsHoaDon.get(6).dsKH_HD.add(dsKhachHang.get(19));
        dsHoaDon.get(6).dsKH_HD.add(dsKhachHang.get(20));
        dsHoaDon.get(6).dsKH_HD.add(dsKhachHang.get(21));
        dsHoaDon.get(6).dsKH_HD.add(dsKhachHang.get(22));

        dsHoaDon.get(7).dsKH_HD.add(dsKhachHang.get(23));

        dsHoaDon.get(8).dsKH_HD.add(dsKhachHang.get(24));

        dsHoaDon.get(9).dsKH_HD.add(dsKhachHang.get(25));
        dsHoaDon.get(9).dsKH_HD.add(dsKhachHang.get(26));
        dsHoaDon.get(9).dsKH_HD.add(dsKhachHang.get(27));
        dsHoaDon.get(9).dsKH_HD.add(dsKhachHang.get(28));

        dsHoaDon.get(10).dsKH_HD.add(dsKhachHang.get(29));

        dsHoaDon.get(11).dsKH_HD.add(dsKhachHang.get(30));
    }

    
    
    
    
    
    public static void TaoDS_MonAn()
    {
        dsMonAn.add(new MonAn("Lau ga den", "Mon man", 700000, 2, 2, dsDonHang.get(0).maDH, dsKhuVucCheBien.get(0).maKV, dsDonHang.get(0), dsKhuVucCheBien.get(0)));            //0
        dsMonAn.add(new MonAn("Ga hap", "Mon man", 500000, 1, 1, dsDonHang.get(1).maDH, dsKhuVucCheBien.get(0).maKV, dsDonHang.get(1), dsKhuVucCheBien.get(0)));                //1
        dsMonAn.add(new MonAn("Ga hap la chanh", "Mon man", 170000, 3, 1, dsDonHang.get(2).maDH, dsKhuVucCheBien.get(0).maKV, dsDonHang.get(2), dsKhuVucCheBien.get(0)));       //2
        dsMonAn.add(new MonAn("Ga chien mang", "Mon man", 400000, 1, 2, dsDonHang.get(2).maDH, dsKhuVucCheBien.get(1).maKV, dsDonHang.get(2), dsKhuVucCheBien.get(1)));          //3
        dsMonAn.add(new MonAn("Dau phu chien gion", "Mon chay", 40000, 5, 1, dsDonHang.get(3).maDH, dsKhuVucCheBien.get(1).maKV, dsDonHang.get(3), dsKhuVucCheBien.get(1)));    //4
        dsMonAn.add(new MonAn("Kem tuoi", "Mon ngot", 10000, 1, 0.5, dsDonHang.get(3).maDH, dsKhuVucCheBien.get(1).maKV, dsDonHang.get(3), dsKhuVucCheBien.get(1)));            //5
        dsMonAn.add(new MonAn("Dau phu sot ca chua", "Mon chay", 40000, 2, 1, dsDonHang.get(4).maDH, dsKhuVucCheBien.get(1).maKV, dsDonHang.get(4), dsKhuVucCheBien.get(1)));   //6
        dsMonAn.add(new MonAn("Sup ca hoi", "Mon man", 15000, 1, 2, dsDonHang.get(5).maDH, dsKhuVucCheBien.get(1).maKV, dsDonHang.get(5), dsKhuVucCheBien.get(1)));             //7
        dsMonAn.add(new MonAn("Sup cua", "Mon man", 15000, 2, 2, dsDonHang.get(6).maDH, dsKhuVucCheBien.get(1).maKV, dsDonHang.get(6), dsKhuVucCheBien.get(1)));                //8
        dsMonAn.add(new MonAn("Banh kem pho mai", "Mon ngot", 100000, 1, 1, dsDonHang.get(7).maDH, dsKhuVucCheBien.get(1).maKV, dsDonHang.get(7), dsKhuVucCheBien.get(1)));             //9
        dsMonAn.add(new MonAn("Goi bo", "Mon man", 50000, 2, 2, dsDonHang.get(7).maDH, dsKhuVucCheBien.get(1).maKV, dsDonHang.get(7), dsKhuVucCheBien.get(1)));                 //10
        dsMonAn.add(new MonAn("Lau ga la e", "Mon man", 700000, 1, 2, dsDonHang.get(8).maDH, dsKhuVucCheBien.get(1).maKV, dsDonHang.get(8), dsKhuVucCheBien.get(1)));            //11
        dsMonAn.add(new MonAn("Banh kem socola", "Mon ngot", 100000, 2, 1, dsDonHang.get(9).maDH, dsKhuVucCheBien.get(2).maKV, dsDonHang.get(9), dsKhuVucCheBien.get(2)));             //12
        dsMonAn.add(new MonAn("Sup cua dong", "Mon man", 15000, 1, 2, dsDonHang.get(9).maDH, dsKhuVucCheBien.get(2).maKV, dsDonHang.get(9), dsKhuVucCheBien.get(2)));                //13
        dsMonAn.add(new MonAn("Ga chien mam", "Mon man", 400000, 3, 2, dsDonHang.get(9).maDH, dsKhuVucCheBien.get(2).maKV, dsDonHang.get(9), dsKhuVucCheBien.get(2)));          //14
        dsMonAn.add(new MonAn("Banh mi chien", "Mon ngot", 20000, 1, 1, dsDonHang.get(9).maDH, dsKhuVucCheBien.get(2).maKV, dsDonHang.get(9), dsKhuVucCheBien.get(2)));         //15
        dsMonAn.add(new MonAn("Ga hap xa", "Mon man", 500000, 2, 1, dsDonHang.get(10).maDH, dsKhuVucCheBien.get(2).maKV, dsDonHang.get(10), dsKhuVucCheBien.get(2)));              //16
        dsMonAn.add(new MonAn("Kem socola", "Mon ngot", 150000, 2, 0.5, dsDonHang.get(11).maDH, dsKhuVucCheBien.get(2).maKV, dsDonHang.get(11), dsKhuVucCheBien.get(2)));          //17
        dsMonAn.add(new MonAn("Rau bi xao", "Mon man", 50000, 2, 1, dsDonHang.get(12).maDH, dsKhuVucCheBien.get(3).maKV, dsDonHang.get(12), dsKhuVucCheBien.get(3)));           //18
        dsMonAn.add(new MonAn("Sup hai sang", "Mon man", 200000, 3, 1, dsDonHang.get(12).maDH, dsKhuVucCheBien.get(3).maKV, dsDonHang.get(12), dsKhuVucCheBien.get(3)));        //19
        dsMonAn.add(new MonAn("Banh mi chien mam", "Mon ngot", 15000, 2, 1, dsDonHang.get(13).maDH, dsKhuVucCheBien.get(3).maKV, dsDonHang.get(13), dsKhuVucCheBien.get(3)));       //20
        dsMonAn.add(new MonAn("Lau ga ta", "Mon man", 700000, 2, 2, dsDonHang.get(14).maDH, dsKhuVucCheBien.get(3).maKV, dsDonHang.get(14), dsKhuVucCheBien.get(3)));          //21
        dsMonAn.add(new MonAn("Banh kem dau", "Mon ngot", 100000, 2, 1, dsDonHang.get(15).maDH, dsKhuVucCheBien.get(3).maKV, dsDonHang.get(15), dsKhuVucCheBien.get(3)));           //22
        dsMonAn.add(new MonAn("Sup cua hoang de", "Mon man", 15000, 1, 2, dsDonHang.get(15).maDH, dsKhuVucCheBien.get(3).maKV, dsDonHang.get(15), dsKhuVucCheBien.get(3)));              //23
        dsMonAn.add(new MonAn("Sup cua gach", "Mon man", 15000, 2, 2, dsDonHang.get(15).maDH, dsKhuVucCheBien.get(3).maKV, dsDonHang.get(15), dsKhuVucCheBien.get(3)));              //24
        dsMonAn.add(new MonAn("Ga chien mam ot", "Mon man", 400000, 2, 2, dsDonHang.get(16).maDH, dsKhuVucCheBien.get(3).maKV, dsDonHang.get(16), dsKhuVucCheBien.get(3)));        //25
        dsMonAn.add(new MonAn("Dau phu chien", "Mon chay", 100000, 2, 1, dsDonHang.get(17).maDH, dsKhuVucCheBien.get(4).maKV, dsDonHang.get(17), dsKhuVucCheBien.get(4)));  //26
        dsMonAn.add(new MonAn("Rau lang xao", "Mon man", 60000, 2, 1, dsDonHang.get(17).maDH, dsKhuVucCheBien.get(4).maKV, dsDonHang.get(17), dsKhuVucCheBien.get(4)));         //27
        dsMonAn.add(new MonAn("Lau ga la giang", "Mon man", 700000, 2, 2, dsDonHang.get(18).maDH, dsKhuVucCheBien.get(4).maKV, dsDonHang.get(18), dsKhuVucCheBien.get(4)));          //28
        dsMonAn.add(new MonAn("Banh mi chien toi", "Mon ngot", 200000, 2, 1, dsDonHang.get(18).maDH, dsKhuVucCheBien.get(4).maKV, dsDonHang.get(18), dsKhuVucCheBien.get(4)));       //29
        dsMonAn.add(new MonAn("Sup ca ngu", "Mon man", 15000, 1, 1, dsDonHang.get(19).maDH, dsKhuVucCheBien.get(4).maKV, dsDonHang.get(19), dsKhuVucCheBien.get(4)));           //30
        dsMonAn.add(new MonAn("Lau ga", "Mon man", 700000, 3, 2, dsDonHang.get(19).maDH, dsKhuVucCheBien.get(4).maKV, dsDonHang.get(19), dsKhuVucCheBien.get(4)));          //31

        //THEM MON AN THEO DANH SACH KHU VUC CHE BIEN	
        dsKhuVucCheBien.get(0).ds_MonAn.add(dsMonAn.get(0));
        dsKhuVucCheBien.get(0).ds_MonAn.add(dsMonAn.get(1));
        dsKhuVucCheBien.get(0).ds_MonAn.add(dsMonAn.get(2));

        dsKhuVucCheBien.get(1).ds_MonAn.add(dsMonAn.get(3));
        dsKhuVucCheBien.get(1).ds_MonAn.add(dsMonAn.get(4));
        dsKhuVucCheBien.get(1).ds_MonAn.add(dsMonAn.get(5));
        dsKhuVucCheBien.get(1).ds_MonAn.add(dsMonAn.get(6));
        dsKhuVucCheBien.get(1).ds_MonAn.add(dsMonAn.get(7));
        dsKhuVucCheBien.get(1).ds_MonAn.add(dsMonAn.get(8));
        dsKhuVucCheBien.get(1).ds_MonAn.add(dsMonAn.get(9));
        dsKhuVucCheBien.get(1).ds_MonAn.add(dsMonAn.get(10));
        dsKhuVucCheBien.get(1).ds_MonAn.add(dsMonAn.get(11));

        dsKhuVucCheBien.get(2).ds_MonAn.add(dsMonAn.get(12));
        dsKhuVucCheBien.get(2).ds_MonAn.add(dsMonAn.get(13));
        dsKhuVucCheBien.get(2).ds_MonAn.add(dsMonAn.get(14));
        dsKhuVucCheBien.get(2).ds_MonAn.add(dsMonAn.get(15));
        dsKhuVucCheBien.get(2).ds_MonAn.add(dsMonAn.get(16));
        dsKhuVucCheBien.get(2).ds_MonAn.add(dsMonAn.get(17));

        dsKhuVucCheBien.get(3).ds_MonAn.add(dsMonAn.get(18));
        dsKhuVucCheBien.get(3).ds_MonAn.add(dsMonAn.get(19));
        dsKhuVucCheBien.get(3).ds_MonAn.add(dsMonAn.get(20));
        dsKhuVucCheBien.get(3).ds_MonAn.add(dsMonAn.get(21));
        dsKhuVucCheBien.get(3).ds_MonAn.add(dsMonAn.get(22));
        dsKhuVucCheBien.get(3).ds_MonAn.add(dsMonAn.get(23));
        dsKhuVucCheBien.get(3).ds_MonAn.add(dsMonAn.get(24));
        dsKhuVucCheBien.get(3).ds_MonAn.add(dsMonAn.get(25));

        dsKhuVucCheBien.get(4).ds_MonAn.add(dsMonAn.get(26));
        dsKhuVucCheBien.get(4).ds_MonAn.add(dsMonAn.get(27));
        dsKhuVucCheBien.get(4).ds_MonAn.add(dsMonAn.get(28));
        dsKhuVucCheBien.get(4).ds_MonAn.add(dsMonAn.get(29));
        dsKhuVucCheBien.get(4).ds_MonAn.add(dsMonAn.get(30));
        dsKhuVucCheBien.get(4).ds_MonAn.add(dsMonAn.get(31));

        //THEM MON AN THEO DANH SACH DON HANG
        dsDonHang.get(0).dsMonAn.add(dsMonAn.get(0));

        dsDonHang.get(1).dsMonAn.add(dsMonAn.get(1));

        dsDonHang.get(2).dsMonAn.add(dsMonAn.get(2));
        dsDonHang.get(2).dsMonAn.add(dsMonAn.get(3));

        dsDonHang.get(3).dsMonAn.add(dsMonAn.get(4));
        dsDonHang.get(3).dsMonAn.add(dsMonAn.get(5));

        dsDonHang.get(4).dsMonAn.add(dsMonAn.get(6));

        dsDonHang.get(5).dsMonAn.add(dsMonAn.get(7));

        dsDonHang.get(6).dsMonAn.add(dsMonAn.get(8));

        dsDonHang.get(7).dsMonAn.add(dsMonAn.get(9));
        dsDonHang.get(7).dsMonAn.add(dsMonAn.get(10));

        dsDonHang.get(8).dsMonAn.add(dsMonAn.get(11));

        dsDonHang.get(9).dsMonAn.add(dsMonAn.get(12));
        dsDonHang.get(9).dsMonAn.add(dsMonAn.get(13));
        dsDonHang.get(9).dsMonAn.add(dsMonAn.get(14));
        dsDonHang.get(9).dsMonAn.add(dsMonAn.get(15));

        dsDonHang.get(10).dsMonAn.add(dsMonAn.get(16));

        dsDonHang.get(11).dsMonAn.add(dsMonAn.get(17));

        dsDonHang.get(12).dsMonAn.add(dsMonAn.get(18));
        dsDonHang.get(12).dsMonAn.add(dsMonAn.get(19));

        dsDonHang.get(13).dsMonAn.add(dsMonAn.get(20));

        dsDonHang.get(14).dsMonAn.add(dsMonAn.get(21));

        dsDonHang.get(15).dsMonAn.add(dsMonAn.get(22));
        dsDonHang.get(15).dsMonAn.add(dsMonAn.get(23));
        dsDonHang.get(15).dsMonAn.add(dsMonAn.get(24));

        dsDonHang.get(16).dsMonAn.add(dsMonAn.get(25));

        dsDonHang.get(17).dsMonAn.add(dsMonAn.get(26));
        dsDonHang.get(17).dsMonAn.add(dsMonAn.get(27));

        dsDonHang.get(18).dsMonAn.add(dsMonAn.get(28));
        dsDonHang.get(18).dsMonAn.add(dsMonAn.get(29));

        dsDonHang.get(19).dsMonAn.add(dsMonAn.get(30));
        dsDonHang.get(19).dsMonAn.add(dsMonAn.get(31));
    }
    
    //--------------DAO QUY CUONG - 21110390--------------------//
    //DANH SACH MON AN THEO DON HANG
    public static void JavaStream01()
    {
    	List<DonHang> dsdonhang = dsDonHang.stream().collect(Collectors.toList());
    	System.out.println("CAU HOI 1");
    	System.out.println("DANH SACH MON AN THEO DON HANG:");
    	for(DonHang donhang: dsdonhang)
    	{
    		System.out.println(donhang.maDH);
    		for(MonAn an : donhang.dsMonAn)
    		{
    			System.out.println(an.getTenMonAn() + "-" + an.donGia);
    		}
    		System.out.println();
    	}
    }
    //DANH SACH MON AN DUOC DAT BOI TAT CA KHACH HANG
    public static void JavaStream02()
    {
    	List<String> dsmonan =
    			dsMonAn.stream().map(a->a.getTenMonAn()).distinct().collect(Collectors.toList());
    	System.out.println("CAU HOI 2");
    	System.out.println("DANH SACH MON AN DUOC DAT BOI TAT CA KHACH HANG");
    	for(String monan: dsmonan)
    	{
    		System.out.println(monan);
    	}
    }
    //TINH DON GIA TRUNG BINH CUA TUNG LOAI MON AN
    public static void JavaStream03()
    {
    	System.out.println("CAU HOI 3");
    	double tbmonman = dsMonAn.stream().filter(x->x.loaiMonAn == "Mon man")
    			.collect(Collectors.averagingDouble(n->n.donGia));
    	System.out.print("DON GIA TRUNG BINH CUA MON MAN: ");
    	System.out.println(tbmonman +" dong");
    	
    	double tbmonngot = dsMonAn.stream().filter(x->x.loaiMonAn == "Mon ngot")
    			.collect(Collectors.averagingDouble(n->n.donGia));
    	System.out.print("DON GIA TRUNG BINH CUA MON NGOT: ");
    	System.out.println(tbmonngot +" dong");
    	
    	double tbmonchay = dsMonAn.stream().filter(x->x.loaiMonAn == "Mon chay")
    			.collect(Collectors.averagingDouble(n->n.donGia));
    	System.out.print("DON GIA TRUNG BINH CUA MON CHAY: ");
    	System.out.println(tbmonchay +" dong");
    }
    //DANH SACH DAU BEP VAO LAM SAU 5/8/2010
    public static void JavaStream04()
    {
    	List<DauBep> dsdaubep = dsDauBep.stream().collect(Collectors.toList());
    	System.out.println("CAU HOI 4");
    	System.out.println("DANH SACH DAU BEP VAO LAM SAU 5/8/2010");
    	for(DauBep kq:dsdaubep)
    	{
    		LocalDate a = kq.ngayVaoLam;
    		LocalDate b = LocalDate.of(2010,8,5);
    		if(a.isAfter(b) == true)
    			System.out.println("Ten dau bep:" +kq.hoTenDB +" - Ngay vao lam: "+ kq.ngayVaoLam);
    	}
    }
    //DANH SACH NHAN VIEN CO DIA CHI O QUAN BINH THANH THANH PHO HO CHI MINH
    public static void JavaStream05()
    {
    	String diachi = "Q.Binh Thanh, TP.Ho Chi Minh";
    	List<NhanVien> dsqbinhthanh = dsNhanVien.stream().filter(a->diachi.equals(a.diaChi)).collect(Collectors.toList());
    	System.out.println("CAU HOI 5");
    	System.out.println("DANH SACH NHAN VIEN CO DIA CHI O QUAN BINH THANH THANH PHO HO CHI MINH");
    	for(NhanVien kq: dsqbinhthanh)
    	{
    		System.out.println("Ten nhan vien: "+ kq.hoTen + " - Dia chi: " + kq.diaChi);
    	}
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaoDS_DatDonHang();
        TaoDS_HoaDon();
        TaoDS_QuanLy();
        TaoDS_NhanVien();
        TaoDS_TaiXeGH();
        TaoDs_KhuVucCB();
        TaoDS_DauBep();
        TaoDS_DonHang();
        TaoDS_KhachHang();
        TaoDS_MonAn();
        
        //--------------DAO QUY CUONG - 21110390--------------------//
        JavaStream01();
        JavaStream02();
        JavaStream03();
        JavaStream04();
        JavaStream05();
	}

}
