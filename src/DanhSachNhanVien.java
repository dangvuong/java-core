import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DanhSachNhanVien {
	
		
		private List<NhanVien> list =new ArrayList<NhanVien>();
		
		public void nhap(){
			list.clear();
			Scanner s = new Scanner(System.in);
			do{
			
			System.out.println("chon loai nhan vien(enter de thoat) \n1.Hanh chinh \n2. Tiep Thi \n3. Truong Phong ");
			String loai = s.nextLine();
			
			if(loai == null || loai.equals(""))
				
				break;
			
		
			int iloai = Integer.parseInt(loai);
			
			switch(iloai){
			
			
			case 1:
				NhanVienHanhChinh nvhc= new NhanVienHanhChinh();
				nvhc.nhap(s);
				list.add(nvhc);
				break;
			case 2:
				NhanVienTiepThi nvtt = new NhanVienTiepThi();
				nvtt.nhap(s);
				list.add(nvtt);
				break;
			case 3:
				TruongPhong tp = new TruongPhong();
				tp.nhap(s);
				list.add(tp);
				break;
			
			}
			
			}while(true);
			
		}
		
		public void xuat(){

			
			for(NhanVien nv :list){
				
				if(nv instanceof NhanVienHanhChinh){
					((NhanVienHanhChinh)nv).xuat();
				}
				else if(nv instanceof NhanVienTiepThi){
					
					((NhanVienTiepThi)nv).xuat();
				}
				else if(nv instanceof TruongPhong){
					
					((TruongPhong)nv).xuat();
				}
				System.out.println("\n------------------");
			}
			
		}
		
		public void timVaHienThiNhanVien(Scanner s){
			System.out.println("nhap ma can tim :");
			String ma = s.nextLine();
			NhanVien nvFound = null;
			
			for(NhanVien nv :list){
				if(nv.getMa().equalsIgnoreCase(ma)){
					nvFound = nv;
					break;
				}
			}
			
			if( nvFound != null){
				
				System.out.println("tim thay thong tin nhan vien ");
				nvFound.xuat();
			}
			else{
				
				System.out.println("khong tim thay nhan vien co ma "+ma);
			}
			
			
		}
		
		public void timVaXoaNhanVien(Scanner s){
			System.out.println("nhap ma can xoa");
			String ma = s.nextLine();
			NhanVien nvFoud = null;
			for(NhanVien nv:list){
				if(nv.getMa().equalsIgnoreCase(ma)){
				nvFoud = nv;
					break;
				}	
				
			}
			if(nvFoud != null){
				list.remove(nvFoud);
			System.out.println("nhan vien da duoc xoa");
			}
			else{
				
				System.out.println("khong tim thay ma trong danh sach ");
			}
		}
		
		public void capNhatNhanVienTheoMa(Scanner s){
			System.out.println("cap nhat nhan vien theo ma ");
			System.out.println("nhap ma can cap nhat ");
			String ma =s.nextLine();
			NhanVien nvFoud = null;
			for(NhanVien nv:list){
				if(nv.getMa().equalsIgnoreCase(ma)){
					nvFoud = nv;
					break;
				}
				
			}
			if(nvFoud != null){
				if(nvFoud instanceof NhanVienHanhChinh){
					
					((NhanVienHanhChinh)nvFoud).nhap(s);
				}
				else if (nvFoud instanceof NhanVienTiepThi){
					
					((NhanVienTiepThi)nvFoud).nhap(s);
					
				}
				else if (nvFoud instanceof TruongPhong){
					
					((TruongPhong)nvFoud).nhap(s);
				}
				System.out.println("cap nhat thanh cong.");
				
			}
			else{
				System.out.println("khong tim that nha  vien voi ma "+ma);
			}
			
		}
		
		public void timTheoKhoangLuong(Scanner s){
			
			System.out.println("tim nhan vien theo khoang luong ");
			System.out.println("nhap khoang luong thap nhat ");
			double min = s.nextDouble();
			
			System.out.println("nhap khoang luong cao nhat");
			double max =s.nextDouble();
			boolean found = false;
			for(NhanVien nv:list){
				if(min < nv.getLuong() && nv.getLuong() <= max){
					
					nv.xuat();
					System.out.println();
					found = true;
				}
				
			}
			if(found == false){
				System.out.println("khong tim thay");
			}
			
		}
		public void sapXepTheoTen(){
			Collections.sort(list,(a,b)->a.getHoTen().compareTo(b.getHoTen()));
			
		}
		public void sapXepTheoThuNhap(){
			
			Collections.sort(list,(a,b)->(int) (a.getThuNhap() -b.getThuNhap()));
			
		}
		public void hienThiTop3DoanhThu(){
			
			Collections.sort(list,(a,b) ->(int) (b.getThuNhap() - a.getThuNhap()));
			System.out.println("top thu nhap ");
			for(int i = 0; i < 3 && i <list.size(); i++){
				
				list.get(i).xuat();
			}
		}
}
