/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examen1;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alex
 */
class GrabarFichero {

    
     public static void grabarLinea(String linea, String ruta) {
		try 
                {
                    
			FileWriter fw=new FileWriter(ruta, true);
			
			fw.write(linea);
			fw.close();
		} 
                
                catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    }
    

