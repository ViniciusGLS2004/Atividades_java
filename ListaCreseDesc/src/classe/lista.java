package classe;

import java.util.ArrayList;
import java.util.List;

public class lista {

	List<lista> credec = new ArrayList<>();
	
	public int val;
	
	public lista() {
		
	}
	
	public lista(int val) {
		this.val = val;
	}
	public boolean listacres(List<lista> credec) {
		boolean listacres = true;
	for(int c = 0; c < credec.size() - 1; c++) {
		if(credec.get(c).val > credec.get( c + 1).val) {
			listacres = false;
			break;
		}
	}
	return listacres;
	
	}
	
	public boolean listadec(List<lista> credec) {
		boolean listadec = true;
	for(int c = 0; c < credec.size() - 1; c++) {
		if(credec.get(c).val < credec.get( c + 1).val) {
			listadec = false;
			break;
		}
	}
	return listadec;
	
	}
}

