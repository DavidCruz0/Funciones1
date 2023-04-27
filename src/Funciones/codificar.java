package Funciones;
import java.util.Scanner;

public class codificar {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int numero= entrada.nextInt();
		
		final int ENCRIPTACION_SAMUEL_CASTRO=1;
		final int ENCRIPTACION_SAMUEL_CAMARGO=2;
		final int ENCRIPTACION_SERGIO=3;
		final int ENCRIPTACION_ANGELA_PEÑA=4;
		final int ENCRIPTACION_YAIDER=5;
		final int ENCRIPTACION_MANUEL=6;
		final int ENCRIPTACION_SELENE=7;
		final int ENCRIPTACION_YIRMAN=8;
		final int ENCRIPTACION_LAURA_CAMPIÑO=9;
		final int ENCRIPTACION_JULIAN=10;
		final int ENCRIPTACION_SAMIR=11;
		final int ENCRIPTACION_NICOL=12;
		final int ENCRIPTACION_ELIAS=13;
		final int ENCRIPTACION_LAURA_CORREA=14;
		final int ENCRIPTACION_THOMAS=15;
		final int ENCRIPTACION_JUAN=16;
		final int ENCRIPTACION_DAVID=17;
		
		switch(numero) {
		
		case 1:
			String EncriptarSamuelCastro=funciones.samuelcastro("palabra");
			break;
			
		case 2:
			String EncriptarSamuelCamargo=funciones.samuelcamargo("frase");
			break;
			
		case 3:
			String EncriptarSergio=funciones.sergio("frase");
			break;
			
		case 4:
			String EncriptarAngelaPeña=funciones.angelapeña("frase");
			break;
			
		case 5:
			String EncriptarYaider=funciones.yaiderbecerra("palabra");
			break;
			
		case 6:
			String EncriptarManuel=funciones.manuel("palabraencriptar");
			break;
			
		case 7:
			String EncriptarSelene=funciones.selene("frase");
			break;
			
		case 8:
			//String EncriptarYirman=funciones.yirman("frase", año, mes);
			break;
			
		case 9:
			String EncriptarLauraCampiño=funciones.lauracampiño("frase");
			break;
			
		case 10:
			//EncriptarJulian=funciones
			break;
			
		case 11:
			String EncriptarSamir=funciones.samiryate("texto");
			break;
			
		case 12:
			String EncriptarNicol=funciones.nicolcepeda("frase");
			break;
			
		case 13:
			String EncriptarElias=funciones.eliascamargo("frase");
			break;
			
		case 14:
			String EncriptarLauraCorrea=funciones.lauracorrea("palabra");
			break;
			
		case 15:
			String EncriptarThomas=funciones.thomasespinel("palabra", numero, false);
			break;
			
		case 16:
			String EncriptarDavid=funciones.david("palabra");
			break;
		}
	}
}
