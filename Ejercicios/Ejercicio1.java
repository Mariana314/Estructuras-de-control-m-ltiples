package Ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		   int dia = 3;
	        String diaNombre;

	        switch (dia) {
	            case 1:
	            	diaNombre= "Lunes";
	                break;
	            case 2:
	            	diaNombre = "Martes";
	                break;
	            case 3:
	            	diaNombre = "Miércoles";
	                break;
	            case 4:
	            	diaNombre = "Jueves";
	                break;
	            case 5:
	            	diaNombre = "Viernes";
	                break;
	            case 6:
	            	diaNombre = "Sábado";
	                break;
	            case 7:
	            	diaNombre = "Domingo";
	                break;
	            default:
	            	diaNombre = "Día No Existente";
	                break;
	        }

	        System.out.println("El día es: " + diaNombre);

	}

}
