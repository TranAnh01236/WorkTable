package baiTap1;

public class KySu extends CanBo{
	private String Nganh;

	public String getNganh() {
		return Nganh;
	}

	public void setNganh(String nganh) {
		Nganh = nganh;
	}

	public KySu(String hoTen, int tuoi, int gioiTinh, String diaChi, String nganh) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		Nganh = nganh;
	}

	public KySu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KySu(String hoTen, int tuoi, int gioiTinh, String diaChi) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString()+"\tNgành:"+getNganh();
	}
	
}
