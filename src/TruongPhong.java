import java.util.Scanner;

public class TruongPhong extends NhanVien {
	
	private double luongTrachNhiem;

	public double getLuongTrachNhiem() {
		return luongTrachNhiem;
	}

	public void setLuongTrachNhiem(double luongTrachNhiem) {
		this.luongTrachNhiem = luongTrachNhiem;
	}

	public TruongPhong(String ma, String hoTen, double luong, double luongTrachNhiem) {
		super(ma, hoTen, "Truong Phong", luong);
		this.luongTrachNhiem = luongTrachNhiem;
	}

	public TruongPhong() {
		super.setLoai("Truong Phong");
		
	}
	public void nhap(Scanner s){
		super.nhap(s);
		
		System.out.println("nhap luong trach nhiem ");
		this.luongTrachNhiem = s.nextDouble();
		s.nextLine();
		
	}
	public void xuat(){
	
		super.xuat();
		System.out.println("luong trach nhiem : "+luongTrachNhiem);
	}

	@Override
	public double getThuNhap() {
		
		return getLuong() +luongTrachNhiem;
	}
}
