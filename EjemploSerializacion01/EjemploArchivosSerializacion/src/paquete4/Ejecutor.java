package paquete4;

public class Ejecutor {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "Hospitales.data";

        Hospital ho = new Hospital("Hospital Hisidro Ayora", 10, 500);
        Hospital ho2 = new Hospital("Hospital Vilcabamba", 40, 590);
        Hospital ho3 = new Hospital("Hospital San Agustin", 23, 984);
        Hospital ho4 = new Hospital("Hospital San Jose", 15, 840);

        Hospital[] lista = {ho, ho2, ho3, ho4};

        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(nombreArchivo);

        for (int i = 0; i < lista.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistro(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaHospital();
        System.out.println(lectura);
        System.out.println("++++++++++++++++++++++++++");
    }
}
