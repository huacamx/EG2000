package Ex;
import java.util.ArrayList;
public class Tema extends Print {
	private String NombreTema;
	private ArrayList <Pregunta> listaPreguntas;
	private ArrayList <Tema> listaSubtemas;
	
	//Constructor
	Tema(String NombreTema){
		this.NombreTema = NombreTema;
		this.listaPreguntas = new ArrayList <Pregunta> ();
		this.listaSubtemas = new ArrayList <Tema> ();
	
	}
	
	//Metodos
	public String getNombreTema() {
		return NombreTema;
	}
	public void setNombreTema(String nombreTema) {
		NombreTema = nombreTema;
	}
	public ArrayList<Pregunta> getListaPreguntas() {
		return listaPreguntas;
	}
	public void setListaPreguntas(ArrayList<Pregunta> listaPreguntas) {
		this.listaPreguntas = listaPreguntas;
	}
	public ArrayList<Tema> getListaSubtemas() {
		return listaSubtemas;
	}
	public void setListaSubtemas(ArrayList<Tema> listaSubtemas) {
		this.listaSubtemas = listaSubtemas;
	}
	public void imprimir(){
		System.out.println(NombreTema + "\n");
		if(this.listaSubtemas.size() > 0){
			for(Tema tmp: listaSubtemas){
				System.out.println("\t" + tmp.NombreTema);
				for(Pregunta Ptmp : tmp.listaPreguntas){
					System.out.println("\t");
					Ptmp.imprimir();
				}
			}
		}
		else{
			for(Pregunta Ptmp : this.listaPreguntas){
				Ptmp.imprimir();
			}
		}
	}
	
	public void agregarPregunta(String pregunta){
		// La lista de preguntas y la lista de subtemas no pueden ser ambas mayores que 0
		//si this.listaSubtemas.size() > 0 && this.listaPreguntas.size() > 0 nunca SUCEDE
		//si this.listaSubtemas.size() == 0 && this.listaPreguntas.size() == 0 agrega la pregunta en la lista de preguntas
	//>   Si this.listaSubtemas.size() > 0 && this.listaPreguntas.size() == 0 No puede agregar la pregunta porque hay que buscar un subtema
		//Si this.listaSubtemas.size() == 0 && this.listaPreguntas.size() > 0 agrega la pregunta
	
		if(!this.listaSubtemas.isEmpty()){
			System.out.println("\n\tNO se pudo agregar la pregunta " + pregunta + " porfavor agreguela dentro de un subtema\n");
		return;
		}
		this.listaPreguntas.add(new Pregunta(pregunta, stringear(this.listaPreguntas.size())));	
	}
	
	public void agregarSubtema(String NombreSubtema){
		//Primero revisa si hay subtemas  
			//Si hay subtemas Agrega el subtema a la lista de subtemas
			//Si NO hay subtemas revisa que haya preguntas
				//Si hay preguntas agrega el subtema y mueve las preguntas de Tema dentro del Nuevo subtema y vacia la lista de preguntas del Tema
				// Si No hay preguntas agrega el subtema a la lista de subtemas
		
		if(!this.listaPreguntas.isEmpty()){
			this.listaSubtemas.add(new Tema(NombreSubtema));
			int lpLen = this.listaPreguntas.size();
			for(int i = 0; i < lpLen; i++){
				this.listaSubtemas.get(0).listaPreguntas.add(this.listaPreguntas.get(i)); 
			}
			this.listaPreguntas.clear();
			return;
		}
		for(Tema tmp: this.listaSubtemas){
			if(tmp.getNombreTema() == NombreSubtema){
				System.out.println("El subtema " + NombreSubtema +" ya ha sido agregado \n");
				return;
			}
				//this.listaSubtemas.add(new Tema(NombreSubtema));
		}
		this.listaSubtemas.add(new Tema(NombreSubtema));

		
	}
	
}
