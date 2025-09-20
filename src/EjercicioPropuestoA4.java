import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioPropuestoA4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int contadorLineas=0;
        ArrayList<String> palabrasGuardadas=new ArrayList<>();
        System.out.println("Dime el nombre del archivo que deseas buscar (sin .txt): ");
        String nombre=sc.nextLine();
                                //Pon el fichero llamado ficheroEjercicios2y3y4y5
        try(BufferedReader br=new BufferedReader(new FileReader(nombre+".txt"))){
            String linea;
            while ((linea=br.readLine()) !=null){
                palabrasGuardadas.add(linea);
                contadorLineas++;
            }
            System.out.println("El archivo tiene "+contadorLineas+" lineas");

            for (int i=palabrasGuardadas.size()-1;i>=0;i--){
                System.out.println(palabrasGuardadas.get(i));
            }
            System.out.println("Archivo leido correctamente.");

        }catch (FileNotFoundException fn) {
            System.out.println("No se encuemtra el fichero");
        }catch (IOException io) {
            System.out.println("Error de E/S: " + io.getMessage());
        }
    }
}
