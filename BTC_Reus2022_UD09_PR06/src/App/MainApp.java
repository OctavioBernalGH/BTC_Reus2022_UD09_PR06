package App;

import java.util.Random;

import Class.EspectadorClass;
import Class.PeliculaClass;

/*
 * @author:		Josep Oriol López Bosch / 	David Dalmau Dieguez / Octavio Bernal Vilana
 * @fecha:		19/04/2022
 * @version:	0.0.1
 */


public class MainApp {
	public static String[] apellidos = { "Gomez", "Guerrero", "Cardenas", "Cardiel", "Cardona", "Cardoso", "Cariaga", "Carillo",
			"Carion", "Castiyo", "Castorena", "Castro", "Grande", "Grangenal", "Grano", "Grasia", "Griego",
			"Grigalva"};
	public static EspectadorClass[] espectadores;

	public static void main(String[] args) {
		
		//TODO: Crear cine
		//TODO: Crear butacas
		//TODO: Crear y Asignar Pelicula
		PeliculaClass pelicula = new PeliculaClass();
		//TODO: Crear espectadores
			//La capacidad de la sala es 72
			crearEspectadores(72);
		//TODO: Sentar espectadores
			sentarEspectadores(espectadores);

	}
//Methods
	
	//Crea x espectadores, donde x se pasa por parametro
	public static void crearEspectadores(int numEspectadores) {
		/*
		 *
		 * espectadores = new Espectador[numEspectadores];
		 * for(int i=0; i<numEspectadores;i++){
		 * 		EspectadorClass espectador = new EspectadorClass(generadorDeNombres(0, apellidos.lenght), 
		 * 				generadorDeEdad(15,50), 
		 * 				generadorDeDinero());
		 * }
		 */
	}
	public static void sentarEspectadores(EspectadorClass[] espectadores) {
		//TODO: sentar aleatoriamente
		//TODO: solo sentar si tienen suficiente dinero y butaca libre y edad suficiente
		//TODO: si asiento ocupado, buscar otro
	}
	//TODO: Pasarlo al package TOOLS
	//Generador de edades
	public static int generadorDeEdad(int inicio, int cantidad) {
		int edad=0;
		Random rnd = new Random();
		
		edad = (int) (rnd.nextDouble() * cantidad + inicio);
		
		return edad;
	}
	//Generador de dinero de 0 a 40 euros
		public static int generadorDeDinero() {
		
			int edad=0;
			Random rnd = new Random();
			
			edad = (int) (rnd.nextDouble() * 40 + 0);
			
			return edad;
		}
	//Generador de alumnos usando un listado
	public static String generadorDeNombres(int inicio, int cantidad) {
		Random rnd = new Random();
		
		String nombre = "";
		int randomNum = (int) (rnd.nextDouble() * cantidad + inicio);;
		
		
		nombre = apellidos[randomNum];
		
		return nombre;
	}
}
