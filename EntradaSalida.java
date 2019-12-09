/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examen1;

import java.util.Scanner;

/**
 *
 * @author alex
 */
public class EntradaSalida {
     public static int mostrarMenu()
    {
        System.out.println("1-Insertar favorito");
	System.out.println("2-Crear HTML");
	System.out.println("3-Salir");
        return (new Scanner(System.in)).nextInt();
    }
     public static Favorito pedirDatosFavorito()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Indique el nombre del favorito");
        String nombre=sc.nextLine();
        System.out.println("Escriba su URL");
        String URL=sc.nextLine();
        Favorito fav=new Favorito(nombre, URL);
        return fav;
    }
}
