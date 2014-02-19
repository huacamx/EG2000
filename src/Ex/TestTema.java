package Ex;

public class TestTema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(0<0);
		Tema tema = new Tema("Campos elicios");
		System.out.println(tema.getListaSubtemas().size());
		tema.agregarPregunta("퓉ue es elicio?");
		//System.out.println(tema.getListaPreguntas().get(0).getPregunta()); //imprime la pregunta
		
		tema.agregarPregunta("퓉ue es elicios?");
		tema.imprimir();
		//System.out.println(tema.getListaSubtemas().get(0).getNombreTema());
		//System.out.println(tema.getListaPreguntas().get(0).getPregunta()); //imprime la pregunta
		//System.out.println(tema.getListaSubtemas().get(0).getListaPreguntas().get(0).getPregunta());
		tema.agregarSubtema("Campos elicios 2");
		tema.agregarPregunta("퓉ue es elicior?");
		tema.imprimir();
		tema.agregarSubtema("Campos elicios 3");
		tema.agregarSubtema("Campos elicios 2");
		tema.agregarPregunta("퓉ue es elicion?");
		tema.imprimir();
		
		
	//Agregar pregunta dentro de un subtema
		if(!tema.getListaSubtemas().isEmpty()){
			//buscar un Subtema
			int iSubtema = 0;
			tema.getListaSubtemas().get(iSubtema).agregarPregunta("퓉ue es elicion?");
			
		}
		
		
		
	}
	
	

}
