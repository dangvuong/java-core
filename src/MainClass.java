import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
	
		DanhSachNhanVien dsnv = new DanhSachNhanVien();
		Scanner s = new Scanner(System.in);
		
		while(true){
			int choice = 0;
			
			
			System.out.println("-------------------------");
			System.out.println("\n1. nhap nhan vien ");
			System.out.println("\n2. xuat nhan vien ");
			System.out.println("\n3. tim nhan vien ");
			System.out.println("\n4. xoa nhan vien");
			System.out.println("\n5. cap nhat nhan vien  theo ma ");
			System.out.println("\n6. tim theo khoang luong  ");
			System.out.println("\n7. sap xep theo ten ");
			System.out.println("\n8. sap xep theo thu nhap ");
			System.out.println("\n9. hien thi top thu nhap ");
			System.out.println("\n0. Thoat");
			System.out.println("----------------------------- ");
			choice = s.nextInt();
			s.nextLine();
			if(choice == 0){
				
			System.exit(0);
		}
	switch(choice){		
		case 1:
			dsnv.nhap();
			break;
		case 2:
			dsnv.xuat();
			break;
		case 3:
			dsnv.timVaHienThiNhanVien(s);
			//dsnv.xuat();
			break;
	
		case 4:
			dsnv.timVaXoaNhanVien(s);
			dsnv.xuat();
			break;
		
		case 5:
			dsnv.capNhatNhanVienTheoMa(s);
			dsnv.xuat();
			break;
		case 6:
			dsnv.timTheoKhoangLuong(s);
		
			break;
		case 7:
			dsnv.sapXepTheoTen();
			System.out.println("sau khi sap xep");
			dsnv.xuat();
			break;
		case 8:
			dsnv.sapXepTheoThuNhap();
			dsnv.xuat();
			break;	
			case 9:
			dsnv.hienThiTop3DoanhThu();
			break;
			}
		System.out.println("nhap phim bat ki der thoat");
			s.next();
		}
		}

}
