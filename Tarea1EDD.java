/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1.edd;

import java.util.Scanner;

/**
 *
 * @author Jeany
 */
public class Tarea1EDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Para la fecha 
        Fecha f = new Fecha();
        Scanner Leer = new Scanner(System.in);
        String FechaCalendario;
        //Para encontrar el día de la fecha 
        System.out.println("Ingrese una fecha con formato dd/MM/yyyy");
        FechaCalendario = Leer.nextLine();
        System.out.println(f.NombreDia(FechaCalendario));
        
        //Para el algoritmo de Criba 
        Primos p = new Primos();
        int num; 
        System.out.println("Ingrese un numero para encontrar los primos menores o igual");
        num = Leer.nextInt();
        p.AlCriba(num);
    }
     
}
