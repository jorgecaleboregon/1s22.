import java.util.Scanner;

public class p14_1s22{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String operacion;

		System.out.println("programa que realixs operaciones basicas");
		System.out.println("que operaciones desea: suma, resta, division, multiplicacion?");
		operacion = teclado.nextLine();
		if(operacion.equals("suma")){
			System.out.println("aqui debemos realizar una suma");
	} else if (operacion.equals("resta")){
			System.out.println("aqui debemos realizar una resta");
	} else {
		System.out.println("no existe opcion a realizar");
	}
	}
}
