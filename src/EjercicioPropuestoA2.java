import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EjercicioPropuestoA2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime el nombre del archivo que deseas buscar (sin .txt): ");
        String nombre=sc.nextLine();
                                //Pon el fichero llamado ficheroEjercicios2y3y4y5
        try(BufferedReader br=new BufferedReader(new FileReader(nombre+".txt"))) {
            String linea;
            int contador=0;

            while ((linea=br.readLine()) !=null) {
                System.out.println(linea);
                contador++;

                if (contador>=24) {
                    System.out.println("Pulsa intro para continuar");
                    sc.nextLine();
                    contador=0;
                }
            }
            System.out.println("Archivo leido correctamente.");

        }catch (FileNotFoundException fn) {
            System.out.println("No se encuemtra el fichero");
        }catch (IOException io) {
            System.out.println("Error de E/S: " + io.getMessage());
        }
    }
}
