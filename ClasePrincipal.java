/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examen1;

import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        int opcion_menu=EntradaSalida.mostrarMenu();
        ArrayList<Favorito> lista_favoritos=new ArrayList();
        /*String nombre_buscar=EntradaSalida.buscarContacto();*/
    
        while(opcion_menu!=3)
		{
			switch(opcion_menu)
			{
			case 1:
				Favorito fav=EntradaSalida.pedirDatosFavorito();
                                lista_favoritos.add(fav);
                                
				break;
			case 2:
                                String ruta_fichero= "C:\\examenjava\\fichero.html";
				String html_tabla=PintaHTML.crearTabla (lista_favoritos);
                                GrabarFichero.grabarLinea(html_tabla,ruta_fichero);
                                try{
                                String ruta2="\"/Program Files (x86)/Google/Chrome/Application/chrome.exe\"";
                                Process p=Runtime.getRuntime().exec(ruta2+ruta_fichero);
                                p.waitFor();
                                    System.out.println("Google Chrome launched!");}
                                catch (Exception e){
                                e.printStackTrace();
                                }
				break;
                        }
                        opcion_menu=EntradaSalida.mostrarMenu();
                }
    }
                        
}
