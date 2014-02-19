package Ex;
import java.util.ArrayList;
public class Uea {
	private String NombreUEA;
	private String ClaceUEA;
	private int CreditosUEA;
	private ArrayList <Unidad> ListaUnidades;
	
	Uea(String NombreUEA, String ClaceUEA, int CreditosUEA){
		this.NombreUEA = NombreUEA;
		this.ClaceUEA = ClaceUEA;
		this.CreditosUEA = CreditosUEA;
		ListaUnidades = new ArrayList <Unidad>();
		
	}
	
	
	//Metodos
	public String getNombreUEA() {
		return NombreUEA;
	}
	public void setNombreUEA(String nombreUEA) {
		NombreUEA = nombreUEA;
	}
	public String getClaceUEA() {
		return ClaceUEA;
	}
	public void setClaceUEA(String claceUEA) {
		ClaceUEA = claceUEA;
	}
	public int getCreditosUEA() {
		return CreditosUEA;
	}
	public void setCreditosUEA(int creditosUEA) {
		CreditosUEA = creditosUEA;
	}
	public ArrayList<Unidad> getListaUnidades() {
		return ListaUnidades;
	}
	public void setListaUnidades(ArrayList<Unidad> listaUnidades) {
		ListaUnidades = listaUnidades;
	}
	public void agregarUnidad(Unidad unidad){
		this.ListaUnidades.add(unidad);
		
	}
	public void agregarTema(int iUnidad, String NombreTema){
		if(!this.ListaUnidades.isEmpty()){
			if(iUnidad < this.ListaUnidades.size()){
				this.ListaUnidades.get(iUnidad).agregarTema(NombreTema);
			}
		}
	return;		
	}
	public void agregarSubtema(int iUnidad, String NombreTema, String NomreSubtema){
		if(!this.ListaUnidades.isEmpty()){
			if(iUnidad < this.ListaUnidades.size()){
				this.ListaUnidades.get(iUnidad).agregarSubtema(NombreTema, NomreSubtema);
			}
		}
	return;		
	}
	
	public void agregarPregunta(){}
}

