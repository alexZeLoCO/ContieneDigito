import java.util.Scanner;		//IMPORTA SCANNER
public class ContieneD�gito {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREA TECLADO
		int  n;		//INICIALIZA N
		int digito;		//INICIALIZA DIGITO
		
		System.out.print("Introduzca un d�gito: ");		//SOLICITA VALOR
		int valor=teclado.nextInt();		//ALMACENA VALOR EN VALOR
		System.out.print("Introduzca una n�mero: ");		//SOLICITA SUCESI�N
		n=teclado.nextInt();				//ALMACENA N�MERO EN N
		digito=n%10;				//DIGITO = SIGUIENTE DIGITO DE LA SUCESI�N
		do {
			n=n/10;		//QUITAR UN DIGITO A N
			digito=n%10;		//COGER SIGUIENTE VALOR		
		} while (valor!=digito && n%10!=0); 		//CONDICI�N
		if (n/10==0) {		//SI SE LA LLEGADO AL FINAL DEL N�MERO
			System.out.print("La secuencia no contiene el n�mero introducido.");		//OUTPUT
		} else {		//SI NO (EL BUCLE SE ROMPI� POR ENCONTRAR DOS VALORES IGUALES)
			System.out.print("La secuencia contiene el n�mero introducido.");		//OUTPUT
		}
	}

}
