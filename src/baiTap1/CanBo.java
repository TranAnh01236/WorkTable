package baiTap1;

public class CanBo {
	private String HoTen;
	private int Tuoi;
	private int GioiTinh;
	private String DiaChi;
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public int getTuoi() {
		return Tuoi;
	}
	public void setTuoi(int tuoi) {
		Tuoi = tuoi;
	}
	public String getGioiTinh() {
		String gt;
		switch (GioiTinh) {
			case 1: {
				gt = "Nam";
				break;
			}
			case 2: {
				gt = "Nữ";
				break;
			}
			case 3: {
				gt = "Bê Đê";
				break;
			}
			default:
				gt = "Không hộp lệ";
				break;
		}
		return gt;
	}
	public void setGioiTinh(int gioiTinh) {
		GioiTinh = gioiTinh;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DiaChi == null) ? 0 : DiaChi.hashCode());
		result = prime * result + GioiTinh;
		result = prime * result + ((HoTen == null) ? 0 : HoTen.hashCode());
		result = prime * result + Tuoi;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CanBo other = (CanBo) obj;
		if (DiaChi == null) {
			if (other.DiaChi != null)
				return false;
		} else if (!DiaChi.equals(other.DiaChi))
			return false;
		if (GioiTinh != other.GioiTinh)
			return false;
		if (HoTen == null) {
			if (other.HoTen != null)
				return false;
		} else if (!HoTen.equals(other.HoTen))
			return false;
		if (Tuoi != other.Tuoi)
			return false;
		return true;
	}
	public CanBo(String hoTen, int tuoi, int gioiTinh, String diaChi) {
		super();
		HoTen = hoTen;
		Tuoi = tuoi;
		GioiTinh = gioiTinh;
		DiaChi = diaChi;
	}
	public CanBo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Họ tên:"+getHoTen()+"\tTuổi:"+getTuoi()+"\tGiới Tính:"+getGioiTinh()+"\tĐịa Chỉ:"+getDiaChi();
	}
	
}
