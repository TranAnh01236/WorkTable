package baiTap1;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QLCB {
	private static List<CanBo> canbo;
	public QLCB() {
		this.canbo=new ArrayList<>();
	}
	public void ThemCanBo(CanBo canbo) {
		this.canbo.add(canbo);
	}	
	public static List<CanBo> timCanBo(String s) {
		ArrayList<CanBo> newlist = new ArrayList<CanBo>();
		for(int i=0;i<canbo.size();i++) {
			if(canbo.get(i).getHoTen().equals(s)) {
				newlist.add(canbo.get(i));
			}
		}
		return newlist;
	}
	public void xemDanhSach() {
		for(int i=0;i<canbo.size();i++) {
			System.out.println(canbo.get(i).toString());
		}
	}
}
