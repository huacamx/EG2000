package Ex;

public class Pregunta {
	private String idPregunta;
	private String Pregunta;
	
	Pregunta(String Pregunta, String idPregunta){
		this.idPregunta = idPregunta;
		this.Pregunta = Pregunta;
				
		
	}
	
	//Metodos
	
	public String getIdPregunta() {
		return idPregunta;
	}
	public void setIdPregunta(String idPregunta) {
		this.idPregunta = idPregunta;
	}
	public String getPregunta() {
		return Pregunta;
	}
	public void setPregunta(String pregunta) {
		Pregunta = pregunta;
	}
	public void imprimir(){
		System.out.println("\t\t" + this.Pregunta + "\n");
	}
	
	
}
