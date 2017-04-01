package paquete;

public class Ejemplo {
	
	//Constructor de cadena vacia
	StringBuffer c = new StringBuffer();
	
	//Constructor a partir de otra cadena
	String cad = "Paloma de altos vuelos";
	StringBuffer nvd = new StringBuffer(cad);
	
	//Constructor con una capacidad - 81 caracteres
	StringBuffer cap = new StringBuffer(81);
	
	//Conversion a String
	String una = "La comedia ";
	StringBuffer dnm = new StringBuffer(una+ " de Paloma");
	System.out.print(dnm.toString());
	
	//Numero de caracteres
	StringBuffer dim = new StringBuffer("Casa Espe");
	System.out.println("Longitud "+dim.length()+ "Capacidad "+dim.capacity());
	//length devuelve la longitud y capacity la capacidad
	
	//Añadir en Stringbuffer
	StringBuffer fiesta = new StringBuffer("Fecha de las fiestas: ");
	fiesta.append(24);
	fiesta.append(" de Agosto");
	System.out.println(fiesta.toString());
	
	//Insertar en Stringbuffer
	StringBuffer pd = new StringBuffer("Lista de deseos");
	pd.insert(3,"++"); //lis++ta de acciones
	
	//Eliminar y cambiar caracteres
	StringBuffer cpd = new StringBuffer("Lista de caracteres");
	cpd.delete(2,5); //elimina los caracteres 2,3 y 4
	StringBuffer cadd = new StringBuffer("La masa de la luna rota");
	int p;
	for(p=0; p<cad.lenght(); p++){
		if(cadd.charAt(p) == ' '){
			cad.deleteChartAt(p); //elimina caracteres en blanco
		}
	}
}
