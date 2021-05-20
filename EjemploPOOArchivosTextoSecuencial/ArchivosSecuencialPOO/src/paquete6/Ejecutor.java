
package paquete6;


public class Ejecutor {
    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "Hospital.txt";

        Hospital hos = new Hospital("Hospital IESS",50,542);
        Hospital hos2 = new Hospital("Hospital Maria Axiliadora",90,1230);
        Hospital hos3 = new Hospital("Hospital Quito",100,230);
        
        

        Hospital[] lista = {hos, hos2, hos3};

        ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);

        for (int i = 0; i < lista.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistro(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}

    

