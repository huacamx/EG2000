package Ex;

public class TestUnidad extends Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Unidad unidad = new Unidad(1);
			
		unidad.agregarPregunta(0, 0, "¿De que lado masca la iguana?");//fail
		unidad.imprimir();
		
		unidad.agregarTema("Primer tema");
		unidad.imprimir();
		unidad.agregarPregunta(0, 1, "¿De que lado masca la iguana?"	);//fail
		unidad.imprimir();
		
		unidad.agregarPregunta(1, 0, "¿De que lado masca la rana");//fail
		unidad.imprimir();
		
	
		
		
		unidad.agregarPregunta(0, 0, "¿De que lado masca la enana?");//chido
		unidad.imprimir();
		unidad.agregarPregunta(1, 1, "¿De que lado masca la marrana?");
		unidad.imprimir();
		
		unidad.agregarSubtema("Primer tema", "primer subtema del primer tema");
		unidad.agregarSubtema(" Primer tema", "primer subtema del primer tema");//NEL
		unidad.agregarSubtema("Segundo tema", "primer subtema del segundo tema");//NEL
		unidad.imprimir();
		print("*\n");
		///Hasta este punto se tiene un tema con un subtema
		//por lo que solo entra el iTema 0 iSubtema 0
		unidad.agregarPregunta(0, 1, "¿De que lado mascas la iguana?");//fail
		unidad.imprimir();
		
		unidad.agregarPregunta(1, 0, "¿De que lado mascas la rana");//fail
		unidad.imprimir();
		
			
		unidad.agregarPregunta(0, 0, "¿De que lado mascas la enana?");//chido
		unidad.imprimir();
		unidad.agregarPregunta(1, 1, "¿De que lado mascas la marrana?");
		unidad.imprimir();
		
		print("**\n");
		///Hasta este punto se tienen dos temas con un subtema
		//por lo que entran itema<2 subtema 0
		unidad.agregarTema("Segundo tema");
		unidad.agregarPregunta(0, 1, "¿De que lado mascan la iguana?");//fail
		unidad.imprimir();
		
		unidad.agregarPregunta(1, 0, "¿De que lado mascan la rana");//chido
		unidad.imprimir();
		unidad.agregarPregunta(0, 0, "¿De que lado mascan la enana?");//chido
		unidad.imprimir();
		
		unidad.agregarPregunta(1, 1, "¿De que lado mascan la marrana?");//fail
		unidad.imprimir();
		unidad.agregarPregunta(2, 0, "¿De que lado mascan la macana?");//fail
		unidad.agregarPregunta(0, 2, "¿De que lado mascan la banana?");//fail
		unidad.agregarPregunta(1, 2, "¿De que lado mascan la cacarota?");//fail
		unidad.imprimir();
		
		unidad.agregarSubtema("Primer tema", "segundo subtema del primer tema");
		unidad.agregarSubtema("Segundo tema", "primer subtema del segundo tema");
		unidad.agregarSubtema("Segundo tema", "segundo subtema del segundo tema");
		unidad.agregarSubtema("Segundo tema", "tercer subtema del segundo tema");
		unidad.imprimir();
		
		print("***\n");
		///Hasta este punto se tienen dos temas 
		//Segundo tema con 3 subtemas
		//por lo que entran itema<2 subtema 0,  < 3
		unidad.agregarTema("Segundo tema");///NO Ya existe
		unidad.agregarPregunta(0, 1, "¿De que lado mascar la iguana?");//fail
		unidad.imprimir();
		
		unidad.agregarPregunta(1, 0, "¿De que lado mascar la rana");//chido
		unidad.imprimir();
		unidad.agregarPregunta(0, 0, "¿De que lado mascar la enana?");//chido
		unidad.imprimir();
		
		unidad.agregarPregunta(1, 1, "¿De que lado mascar la marrana?");//chido
		unidad.imprimir();
		unidad.agregarPregunta(2, 0, "¿De que lado mascar la macana?");//fail
		unidad.agregarPregunta(0, 2, "¿De que lado mascar la banana?");//fail
		unidad.agregarPregunta(1, 2, "¿De que lado mascar la cacarota?");//chido
		unidad.imprimir();
		
	}

}
