
package paquete6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public final class ArchivoLectura {
     private Scanner entrada;
    private String nombreArchivo;
    private String rutaArchivo;
    private ArrayList<Hospital> listas;
    
    public ArchivoLectura(String n) {
        nombreArchivo = n;
        
        rutaArchivo = String.format("data/%s",
                obtenerNombreArchivo());
        File f = new File(rutaArchivo);
        if (f.exists()) {
            try {
                entrada = new Scanner(new File(rutaArchivo));
            } // fin de try
            catch (FileNotFoundException e) {
                System.err.println("Error al leer del archivo: " + e);

            } // fin de catch
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRutaArchivo() {
        rutaArchivo = String.format("data/%s.txt",
                obtenerNombreArchivo());
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerRutaArchivo() {
        return rutaArchivo;
    }

    // establecer valores de cada línea
    // en la lista de tipo Profesor
    public void establecerLista() {
        listas = new ArrayList<>();
        File f = new File(rutaArchivo);
        
       if (f.exists()) {
        
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                // la línea en el archivo tiene la siguiente
                // estructura
                // "%s;%.2f;%s|%s"
                ArrayList<String> linea_partes = new ArrayList<>(
                        Arrays.asList(linea.split(";")));
                // los dos primeros parametros se los relaciona
                // con materia y nota
                String nombre = linea_partes.get(0);
                
                int numerocamas = Integer.parseInt(linea_partes.get(1));
                double presupuesto = Double.parseDouble(linea_partes.get(2));
                
               
                
                Hospital hos = new Hospital(nombre, numerocamas,presupuesto);
                
                listas.add(hos);

            } // fin de while
       }
    }

    public ArrayList<Hospital> obtenerLista() {
        
        return listas;
    }

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close();
        } // cierra el archivo

    }

    @Override
    public String toString(){
        String cadena = "Hospitales\n";
        
        for (int i = 0; i < obtenerLista().size(); i++) {
            cadena = String.format("%s(%d) %s %d %.4f \n", cadena,
                    i+1,
                    obtenerLista().get(i).obtenerNombre(),
                    obtenerLista().get(i).obtenerNumeroCamas(),
                    obtenerLista().get(i).obtenerPresupuesto());
        }

        return cadena;
    }
}


