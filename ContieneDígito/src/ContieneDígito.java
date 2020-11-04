import java.util.Scanner;		//IMPORTA SCANNER
public class ContieneDígito {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREA TECLADO
		int  n;		//INICIALIZA N
		int digito;		//INICIALIZA DIGITO
		
		System.out.print("Introduzca un dígito: ");		//SOLICITA VALOR
		int valor=teclado.nextInt();		//ALMACENA VALOR EN VALOR
		System.out.print("Introduzca una número: ");		//SOLICITA SUCESIÓN
		n=teclado.nextInt();				//ALMACENA NÚMERO EN N
		digito=n%10;				//DIGITO = SIGUIENTE DIGITO DE LA SUCESIÓN
		do {
			n=n/10;		//QUITAR UN DIGITO A N
			digito=n%10;		//COGER SIGUIENTE VALOR		
		} while (valor!=digito && n%10!=0); 		//CONDICIÓN
		if (n/10==0) {		//SI SE LA LLEGADO AL FINAL DEL NÚMERO
			System.out.print("La secuencia no contiene el número introducido.");		//OUTPUT
		} else {		//SI NO (EL BUCLE SE ROMPIÓ POR ENCONTRAR DOS VALORES IGUALES)
			System.out.print("La secuencia contiene el número introducido.");		//OUTPUT
		}
	}

}
