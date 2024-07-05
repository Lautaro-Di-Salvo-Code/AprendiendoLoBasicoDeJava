package POO.PracricaSetterGetter_Y_Array;

import java.util.*;

class Calendario_1 {
    public static void main(String[] args) {
    }

}

/**
 * InnerCalendario
 */
class InfoDetodosLos_empleados {
    private String nombre;
    private double sueldo;
    private Date altaDeContrato;
    
    public InfoDetodosLos_empleados(String nom, double sue, int año, int mes, int dia){
        
        GregorianCalendar caledarioJava = new GregorianCalendar(año, mes-1, dia );
        this.nombre = nom;
        this.sueldo = sue;
        this.altaDeContrato = caledarioJava.getTime();
    }
    

    public String GetInfoEmpleado (){
        return "Nombre empleado: "+ this.nombre + "\n" + "Sueldo: " + this.sueldo +"\n" + "AltaDeContrato: "+ this.altaDeContrato  ;
    }

    public void SubirSueldo(double porcentaje ){
        double aumentado = this.sueldo*porcentaje/100;
        this.sueldo += aumentado;
    }
}

public class InfoTodosLos_empleados {
    public static void main(String[] args) {
        
        InfoDetodosLos_empleados[] Array_empleado = new InfoDetodosLos_empleados[3];

        Array_empleado[0] = new InfoDetodosLos_empleados("Alberto", 400, 2000, 12, 15);
        Array_empleado[1] = new InfoDetodosLos_empleados("Matias", 500, 1998, 12, 13);
        Array_empleado[2] = new InfoDetodosLos_empleados("Felipe", 700, 2005, 12, 11);

        
        for (InfoDetodosLos_empleados innerCalendario : Array_empleado) {
            
            innerCalendario.SubirSueldo(6);
            System.out.println(innerCalendario.GetInfoEmpleado());
        }
        
    }
    
}