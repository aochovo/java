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
class PintaHTML {

    public static String crearTabla(ArrayList<Favorito> lista_favoritos)
            
    {
        String html="<html><head></head><body><table border=0><tr><th>Favorito</th></tr>";
        for (Favorito x : lista_favoritos)
        {
            html=html+"<tr><td><a href="+x.getUrl()+">"+x.getTexto()+"</a></td></tr>";
        }
        html=html+"</table></body></html>";
        return html;
    }
    
}
