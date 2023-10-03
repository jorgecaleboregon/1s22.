import java.util.Scanner;

public class p15_1s22{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String operacion;

		System.out.println("programa que realizar operaciones basicas");
		System.out.println("que operaciones desea: suma, resta, division, multiplicacion?");
		operacion = teclado.nextLine();

	 }else if (operacion.equals("suma")){
			System.out.println("aqui debemos realizar una suma");
			System.out.println("pon el primer numero");
			num1 = teclado.nexByte();
			System.out.println("pon el segundo numero");
			num2 = teclado.nexByte();
			resultado = num1 + num2;
			System.out.println("la suma es " + resultado);

	} else if (operacion.equals("resta")){
		    System.out.println("aqui debemos realizar una resta");
			System.out.println("pon el primer numero");
			num1 = teclado.nexByte();
			System.out.println("pon el segundo numero");
			num2 = teclado.nexByte();
			resultado = num1 - num2;
			System.out.println("la resta es " + resultado);

    } else if (operacion.equals("multiplicacion")){
    	    System.out.println("aqui debemos realizar una multiplicacion");
			System.out.println("pon el primer numero");
			num1 = teclado.nexByte();
			System.out.println("pon el segundo numero");
			num2 = teclado.nexByte();
			resultado = num1 * num2;
			System.out.println("la multiplicacion es " + resultado);

	} else if (operacion.equals("division")){
    	    System.out.println("aqui debemos realizar una multiplicacion");
			System.out.println("pon el primer numero");
			num1 = teclado.nexByte();
			System.out.println("pon el segundo numero");
			num2 = teclado.nexByte();
			resultado = num1 % num2;
			System.out.println("la division es " + resultado);
		}else{
		System.out.println("no existe opcion a realizar");
	}
	}