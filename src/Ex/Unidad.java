package Ex;
import java.util.ArrayList;
public class Unidad extends Print{

	private int NumerodeUnidad;
	private ArrayList <Tema> listaTemas;
	
	Unidad(int NumerodeUnidad){
		this.NumerodeUnidad = NumerodeUnidad;
		listaTemas = new ArrayList <Tema>() ;
	}
	
	//Metodos
	public int getNumerodeUnidad() {
		return NumerodeUnidad;
	}
	public void setNumerodeUnidad(int numerodeUnidad) {
		NumerodeUnidad = numerodeUnidad;
	}
	public ArrayList<Tema> getListaTemas() {
		return listaTemas;
	}
	public void setListaTemas(ArrayList<Tema> listaTemas) {
		this.listaTemas = listaTemas;
	}
	public void agregarTema(String NombreTema){
		
		
		int ltLen = this.listaTemas.size();
		for(int i = 0; i< ltLen; i++){
			if(this.listaTemas.get(i).getNombreTema() == NombreTema){
				print(">El Tema" + NombreTema + " ya existe\n");
				return;
			}
		}
		
		this.listaTemas.add(new Tema(NombreTema));
		System.out.println(">Se ha agregado el tema " + NombreTema + "\n");
	}

	public void agregarSubtema(String NombreTema, String NombreSubtema){
		int ltLen = this.listaTemas.size();
		for(int i = 0; i < ltLen; i++){
			if(NombreTema == this.listaTemas.get(i).getNombreTema()){
				this.listaTemas.get(i).agregarSubtema(NombreSubtema);
				return;
			}
		}
		System.out.println("En subtema NO pudo ser agregado. El tema " + NombreTema + " NO existe.\n" );
	}
	
	public void agregarPregunta( int iTema, int iSubtema, String pregunta){
	//Recibimos los indices:
		//iTema
		//iSubtema; y el objeto tipo:
		//Pregunta
		//Si la lista de temas esta vacia NO importa el valor de los indices, NO SE PUEDE AGREGAR LA PREGUNTA
		//Si hay temas hay que verificar que iTema se menor que el tamñao de la lista de temas, de lo contrario NO SE PUEDE AGREGAR LA PREGUNTA
		//Si iTema es menor que la lista de temas hay que verificar el valor de iSubtema
			//Si iSubtema es cero, la lista de subtemas del tema[itema] tiene que estar vacia para agregar la preugunta
		print("pregunta " + pregunta + "\n iTema =  " + iTema + "\niSubtema " + iSubtema + "\n");
		if(!this.listaTemas.isEmpty()){
			if(iTema < this.listaTemas.size()){
				
				if(iSubtema < this.listaTemas.get(iTema).getListaSubtemas().size()){
					print("chido");
					this.listaTemas.get(iTema).getListaSubtemas().get(iSubtema).agregarPregunta(pregunta);
				return;
				}
				if(iSubtema == 0 && this.listaTemas.get(iTema).getListaSubtemas().isEmpty()){
					print("chido");
					this.listaTemas.get(iTema).agregarPregunta(pregunta);
				return;
				}
				//iSubtema NO es valido
				print("fail");
			return;	
			}
		//iTema No es correcto	
			print("fail");
		return;
		}
		else{
		//Esta unidad NO tiene temas
			print("fail");
		return;
		}
		
	}
	public void imprimir(){
		System.out.println("Unidad " + this.NumerodeUnidad);
		for(Tema Ttmp : this.listaTemas){
			System.out.println("\t");
			Ttmp.imprimir();
		}
	}	
}
