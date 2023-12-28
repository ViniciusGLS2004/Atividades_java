package classe;

import java.util.ArrayList;
import java.util.List;

public class lista {

	List <lista >somalista = new ArrayList<>();
	
	public int var;
	public lista() {
		
	}
	
	public lista(int var) {
		this.var = var;
		
	}

	public int  somalist(List<lista> somalista) {
		int varT = 0;
		for(int c = 0; c < somalista.size(); c++) {
		  varT += somalista.get(c).var;
		}
		return varT;
	}
}
