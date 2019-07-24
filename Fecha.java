/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1.edd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Jeany
 */
public class Fecha {
    public String NombreDia(String fecha)
    {
        String NombreD = null;
        int Dia = 0;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date FechaAc = null; 
        try {
            FechaAc = formato.parse(fecha);
        } catch (ParseException ex) {
            //Logger.getLogger(Tarea1EDD.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error en la fecha");
            ex.printStackTrace();
        }
        GregorianCalendar Calendario = new GregorianCalendar();
        Calendario.setTime(FechaAc);
        Dia = Calendario.get(Calendar.DAY_OF_WEEK);
        
        switch (Dia)
        {
            case 1: 
                //System.out.println("Domingo");
                NombreD = "Domingo";
                break;
            case 2:
                //System.out.println("Lunes");
                NombreD = "Lunes";
                break;
                
            case 3:
                //System.out.println("Martes");
                NombreD = "Martes";
                break;
                
            case 4: 
                NombreD = "Miercoles";
                break;
                
            case 5:
                NombreD = "Jueves";
                break;
                
            case 6: 
                NombreD = "Viernes";
                break; 
                
            case 7: 
                NombreD = "Sabado";
                break;
        }
        return NombreD;
    }
}
