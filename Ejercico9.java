package FicherosDeTexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercico9 {

	public static void main(String[] args) 
	{
	    Scanner teclado = new Scanner (System.in);
	    String nombreFichero="";
	    String palabra="";
	    String cadena="";
	    String contenido="";
	    boolean encontrada=false;
	    System.out.println("Dame el nombre del fichero:");
	    nombreFichero=teclado.nextLine();
	    System.out.println("Dame la palabra a buscar:");
	    palabra=teclado.nextLine();
	    teclado.close();
	    
	    FileReader fr;
		try {
			fr = new FileReader (nombreFichero);
			BufferedReader br= new BufferedReader(fr);
		    
		    while((cadena=br.readLine()) !=null)
		    {
		    
		    	contenido+=cadena;
		    }
		    if(contenido.contains(palabra))
		    {
		    	encontrada = true;
		    }
		    br.close();
		    fr.close();
		    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
	    
	    if (encontrada)
	    {
	    	
	    System.out.print("Se ha encontrado la palabra");
	   
	    }
	    	
	    else {
	    	
	    	System.out.println("No se ha encontrado la palabra");
	    }
	}

}
