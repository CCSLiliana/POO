import java.util.Scanner;
public class pregunta5 {
		private static Scanner teclado;
		public static void main(String[] args) {
		    teclado= new Scanner (System.in);
		    System.out.println("Ingrese la palabra");
		    String texto= teclado.nextLine();
		    String texto1= " ";
		    String texto2= " ";
		    for (int k=0;k<texto.length();k++) {
		    	if (texto.charAt(k)!=' ') {
		    		 texto1=texto1+texto.charAt(k);
		    		 	 
		    	}
		    		
		    }
		    for ( int k= texto.length()-1;k>=0;k--) {
		    	if (texto.charAt(k)!=' ') {
		    		 texto2=texto2+texto.charAt(k);
		    		 	 
		    
	               }
		     }

			if (texto1.equals(texto2)) {
				System.out.print("Es un palindromo");
			} else {
				System.out.print("No es un palindromo");
				
				
			}
			
				
		}

	}


