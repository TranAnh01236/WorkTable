package baiTap1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		QLCB qlcb = new QLCB();
		
		while(true) {
			System.out.println("Nhập n bất kì \n1:Thêm cán bộ\n2:Tìm kiếm theo họ tên\n3:Hiện thông tin về danh sách caac1 cán bộ\n4:Thoát");
			int n = new Scanner(System.in).nextInt();
			switch (n) {
				case 1: {
					System.out.println("Chọn đối tượng thêm:\na:Thêm công nhân\nb:Thêm kỹ sư\nc:thêm nhân viên");
					String x=new Scanner(System.in).nextLine();
					switch (x) {
						case "a": {
							System.out.println("Nhập Họ Tên:");
							String Hoten = new Scanner(System.in).nextLine();
							System.out.println("Tuổi");
							int Tuoi = new Scanner(System.in).nextInt();
							System.out.println("Nhập Giới Tính:");
							int gt = new Scanner(System.in).nextInt();
							System.out.println("Nhập Địa Chỉ:");
							String DiaChi = new Scanner(System.in).nextLine();
							System.out.println("Nhập Bậc:");
							int Bac = new Scanner(System.in).nextInt();
							CongNhan congnhan = new CongNhan(Hoten, Tuoi, gt, DiaChi, Bac);
							qlcb.ThemCanBo(congnhan);
							System.out.println(congnhan);
							break;
						}
						case "b": {
							System.out.println("Nhập Họ Tên:");
							String Hoten = new Scanner(System.in).nextLine();
							System.out.println("Tuổi");
							int Tuoi = new Scanner(System.in).nextInt();
							System.out.println("Nhập Giới Tính:");
							int gt = new Scanner(System.in).nextInt();
							System.out.println("Nhập Địa Chỉ:");
							String DiaChi = new Scanner(System.in).nextLine();
							System.out.println("Nhập Ngành:");
							String Nganh = new Scanner(System.in).nextLine();
							KySu kysu = new KySu(Hoten, Tuoi, gt, DiaChi, Nganh);
							qlcb.ThemCanBo(kysu);
							System.out.println(kysu);
							break;
						}
						case "c": {
							System.out.println("Nhập Họ Tên:");
							String Hoten = new Scanner(System.in).nextLine();
							System.out.println("Tuổi");
							int Tuoi = new Scanner(System.in).nextInt();
							System.out.println("Nhập Giới Tính:");
							int gt = new Scanner(System.in).nextInt();
							System.out.println("Nhập Địa Chỉ:");
							String DiaChi = new Scanner(System.in).nextLine();
							System.out.println("Nhập Công việc:");
							String cv = new Scanner(System.in).nextLine();
							NhanVien nhanvien = new NhanVien(Hoten, Tuoi, gt, DiaChi, cv);
							qlcb.ThemCanBo(nhanvien);
							System.out.println(nhanvien);
							break;
						}
						default:
							System.out.println("Không hợp lệ!!!");
							break;
						}
					break;
					
				}
				case 2: {
					System.out.print("Nhập tên muốn tìm ");
                    String ten = new Scanner(System.in).nextLine();
                    System.out.println(QLCB.timCanBo(ten));
                    break;

				}
				case 3: {
					qlcb.xemDanhSach();
					break;
				}
				default:
					System.out.println("n không hợp lệ!");
					break;
			}
		}
	}
}
