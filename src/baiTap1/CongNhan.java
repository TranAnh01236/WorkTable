package baiTap1;

public class CongNhan extends CanBo{
	private int Bac;

	public int getBac() {
		return Bac;
	}

	public void setBac(int bac) {
		Bac = bac;
	}

	public CongNhan(String hoTen, int tuoi, int gioiTinh, String diaChi, int bac) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		Bac = bac;
	}

	public CongNhan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CongNhan(String hoTen, int tuoi, int gioiTinh, String diaChi) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString()+"\tBậc:"+getBac();
	}


}
