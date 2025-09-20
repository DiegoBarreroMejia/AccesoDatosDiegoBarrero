import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EjercicioPropuestoA1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe Salir cuando desees salir del programa");

        try (BufferedWriter br = new BufferedWriter(new FileWriter("ficheroEjercicio1.txt"))) {
            while (true) {
                System.out.println("Dame una frase");
                String frase=sc.nextLine();
                if (frase.equalsIgnoreCase("Salir")) {
                    break;
                }
                br.write(frase);
                br.newLine();
            }
            System.out.println("Archivo guardado correctamente.");

        } catch (FileNotFoundException fn) {
            System.out.println("No se encuemtra el fichero");
        }catch (IOException io) {
            System.out.println("Error de E/S: " + io.getMessage());
        }
    }
}
