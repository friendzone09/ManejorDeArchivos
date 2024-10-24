import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManejoArchivos{

    public static void leerArchivos(String fileName){
        File file; // Apunta a un archivo fisico del dd
        FileReader reader; //llave con permisos de lectura.
        BufferedReader bufer; //Recuperar info del archivo
        String line;

        try{
            //Crear un apuntador al archivo fisico.
            file = new File("C:\\archivos\\" + fileName + ".txt");
            //Abrir el archivo para lectura.
            reader = new FileReader(file);
            // Configurar el bufer para leer el archivo
            bufer = new BufferedReader(reader);
            while ((line = bufer.readLine()) != null) {

                System.out.println("Linea leida: " + line);
            }
            reader.close();
        } catch( Exception e ){
            System.out.println("Error al leer el archivo: " + e.toString());
        }        
        
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String fileName;

        System.out.println("Lectura de archivos de texto.");
        System.out.println("Escribe el nombre del archivo: ");
        fileName = bufer.readLine();
        leerArchivos(fileName);
    }
}