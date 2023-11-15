import  java.util.Scanner;

public class p3p1_1s22{

	static Scanner teclado = new Scanner(System.in);

	public static void suma(){
		System.out.println("suma de dos numeros");
		System.out.println("ingresar el primer numero");
		int a = teclado.nextInt();
		System.out.println("ingresa el segundo numero");
		int b = teclado.nextInt();
		int c = a+b;
		System.out.println("el resultado es"+c);

	}
	public static void resta(){
		System.out.println("resta de dos numeros");
		System.out.println("ingresar el primer numero");
		int a = teclado.nextInt();
		System.out.println("ingresa el segundo numero");
		int b = teclado.nextInt();
		int c = a-b;
		System.out.println("el resultado es"+c);

	}

	public static void divicion(){
		System.out.println("divicion de dos numeros");
		System.out.println("ingresar el primer numero");
		int a = teclado.nextInt();
		System.out.println("ingresa el segundo numero");
		int b = teclado.nextInt();
		int c = a/b;
		System.out.println("el resultado es"+c);

	}

	public static void multiplicacion(){
		System.out.println("multiplicacion de dos numeros");
		System.out.println("ingresar el primer numero");
		int a = teclado.nextInt();
		System.out.println("ingresa el segundo numero");
		int b = teclado.nextInt();
		int c = a*b;
		System.out.println("el resultado es"+c);

	}

    public static void menu(){
    	System.out.println("Menu de operaciones basico");
    	System.out.println("\n A) suma");
    	System.out.println("B) resta");
    	System.out.println("C)division");
    	System.out.println("D) mmultiplicacion");
    	System.out.println("que opcion deseas");
    }


    	public static void main(String[] args) {
    		String opc;
    		menu();
    		opc = teclado.nextLine();


    		if (opc.equals("A"))suma();
    		if(opc.equals("B"))resta();
    		if(opc.equals("C"))divicion();
    		if(opc.equals("D"))multiplicacion();


    		
    	}
    }
