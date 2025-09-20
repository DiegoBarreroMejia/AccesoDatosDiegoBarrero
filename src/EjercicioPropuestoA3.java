import java.io.*;
import java.util.Scanner;

public class EjercicioPropuestoA3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int contadorLineas=0;
        System.out.println("Dime el nombre del archivo que deseas buscar (sin .txt): ");
        String nombre=sc.nextLine();
                                //Pon el fichero llamado ficheroEjercicios2y3y4y5
        try(BufferedReader br=new BufferedReader(new FileReader(nombre+".txt"))){
            while (br.readLine() !=null){
                contadorLineas++;
            }
            System.out.println("El archivo tiene "+contadorLineas+" lineas");
            System.out.println("Archivo leido correctamente.");

        }catch (FileNotFoundException fn) {
            System.out.println("No se encuemtra el fichero");
        }catch (IOException io) {
            System.out.println("Error de E/S: " + io.getMessage());
        }
    }
}
