

public class NhanVienHanhChinh extends NhanVien {

	public NhanVienHanhChinh(String ma, String hoTen, double luong) {
		super(ma, hoTen, "Hanh Chinh", luong);
		
	}

	

	public NhanVienHanhChinh() {
		super.setLoai("Hanh Chinh");;
		
	}
	public void xuat(){
		
		super.xuat();
		
	}



	@Override
	public double getThuNhap() {
		
		return getLuong();
	}

}
