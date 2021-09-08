package baiTap1;

public class NhanVien extends CanBo{
	private String CongViec;

	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVien(String hoTen, int tuoi, int gioiTinh, String diaChi) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		// TODO Auto-generated constructor stub
	}

	public NhanVien(String hoTen, int tuoi, int gioiTinh, String diaChi, String congViec) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		CongViec = congViec;
	}

	public String getCongViec() {
		return CongViec;
	}

	public void setCongViec(String congViec) {
		CongViec = congViec;
	}
	@Override
	public String toString() {
		return super.toString()+"\tCongViec:"+getCongViec();
	}
}
