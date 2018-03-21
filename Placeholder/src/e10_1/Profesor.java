package e10_1;

public class Profesor extends Persona {
	
	private String nombre;
	private int edad;
	String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	int getEdad() {
		return edad;
	}

	void setEdad(int edad) {
		this.edad = edad;
	}

	public Profesor(String numeroDeTelefono) {
		super(numeroDeTelefono);
	}
	
	public void printInformacionPersonal() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Edad " + getEdad());
		System.out.println("Telefono: " + numeroDeTelefono);
	}
	
	public void printTodaLaInformacion() {
		printInformacionPersonal();
		for (int p=1; p<5; p++){
			System.out.println(p);
		}
	}
}