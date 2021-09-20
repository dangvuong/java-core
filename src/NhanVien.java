import java.util.Scanner;

 public abstract class NhanVien {
	private String ma,hoTen,loai;
	private double luong;
	
	 public abstract double getThuNhap();
		
		
	
	public NhanVien() {
		super();
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getLoai() {
		return loai;
	}
	public void setLoai(String loai) {
		this.loai = loai;
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
	public NhanVien(String ma, String hoTen, String loai, double luong) {
		super();
		this.ma = ma;
		this.hoTen = hoTen;
		this.loai = loai;
		this.luong = luong;
	}
	public void nhap(Scanner s){
		
		System.out.println("nhap ma");
		this.ma = s.nextLine();
		//s.nextLine();
		System.out.println("nhap ten");
		this.hoTen = s.nextLine();
		
		System.out.println("nhap luong");
		this.luong = s.nextDouble();
		
		s.nextLine();
		
		
	}
	public void xuat(){
		
		System.out.println("Ma : "+ma+", Ho Ten : "+hoTen+", loai : "+loai+", Luong : "+luong+", Thu Nhap"+getThuNhap());
	}

}
