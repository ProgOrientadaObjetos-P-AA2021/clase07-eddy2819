/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author USUARIO
 */
public class Hospital {
   
    String nombre;
    int numeroCamas;
    double presupuesto;
public Hospital(String n,int cm, double pre){
    nombre = n;
    numeroCamas = cm;
    presupuesto = pre;
}

public void establecerNombre(String n){
    nombre = n;
}
public void establecerNumeroCamas(int n){
    numeroCamas = n;
}
public void establecerPresupuesto(double n){
    presupuesto = n;
}

public String obtenerNombre(){
    return nombre;
}
public int obtenerNumeroCamas(){
    return numeroCamas;
}
public double obtenerPresupuesto(){
    return presupuesto;
}

/* 
    Agregar valor de objetos de tipo Hospital a un archivo
    Y leer el archivo
*/

}
