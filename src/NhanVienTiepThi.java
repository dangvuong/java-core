import java.util.Scanner;

public class NhanVienTiepThi extends NhanVien {
	
		
	
	public NhanVienTiepThi(String ma, String hoTen, double luong, double doanhSo, double hoHong) {
		super(ma, hoTen, "Tiep Thi", luong);
		this.doanhSo = doanhSo;
		this.hoHong = hoHong;
	}
	public NhanVienTiepThi() {
		super.setLoai("Tiep Thi");
		
	}
	public double getDoanhSo() {
		return doanhSo;
	}
	public void setDoanhSo(double doanhSo) {
		this.doanhSo = doanhSo;
	}
	public double getHoHong() {
		return hoHong;
	}
	public void setHoHong(double hoHong) {
		this.hoHong = hoHong;
	}
	private double doanhSo;
	private double hoHong;
	
	public void nhap(Scanner s){
		super.nhap(s);
		System.out.println("nhap doanh so ");
		this.doanhSo = s.nextDouble();
		
		System.out.println("nhap hoa hong ");
		this.hoHong = s.nextDouble();
		s.nextLine();
		
	}
	public void xuat(){
		
		super.xuat();
		System.out.println("Doanh So : "+doanhSo+", Hoa Hong : "+hoHong);
	}
	@Override
	public double getThuNhap() {
		
		return getLuong() + doanhSo + hoHong/100;
	}
}
