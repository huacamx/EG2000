package Service;
import java.util.ArrayList;
import Ex.Print;

import Ex.Uea;
public class UeasService extends Print {
	private ArrayList<Uea> listaUea;
	
	public ArrayList<Uea> setUpListaUeas(){
		this.listaUea = new ArrayList<Uea>();
		
		
		this.listaUea.add(new Uea("Matematicas", "11112354", 8));
		
		this.listaUea.add(new Uea("Matematicas 2", "11112355", 7));
		this.listaUea.add(new Uea("Matematicas 3", "11112356", 7));
		
		listaUea.get(0).getNombreUEA()
		
	return this.listaUea;
	}
	
}
