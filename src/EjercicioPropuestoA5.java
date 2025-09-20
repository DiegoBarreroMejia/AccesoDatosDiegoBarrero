import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioPropuestoA5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> palabrasGuardadas=new ArrayList<>();
        System.out.println("Dime el nombre del archivo que deseas buscar (sin .txt): ");
        String nombre=sc.nextLine();
                                    //Pon el fichero llamado ficheroEjercicios2y3y4y5
        try(BufferedReader br=new BufferedReader(new FileReader(nombre + ".txt"));
            BufferedWriter bri=new BufferedWriter(new FileWriter("src/salida.txt"))){

            String linea;
            while ((linea=br.readLine()) !=null){
                palabrasGuardadas.add(linea);
            }
            System.out.println("El archivo fue Leido correctamente.");


            for (int i=palabrasGuardadas.size()-1;i>=0;i--){
                bri.write(palabrasGuardadas.get(i));
                bri.newLine();
            }
            System.out.println("El archivo fue escrito correctamente.");

        }catch (FileNotFoundException fn) {
            System.out.println("No se encuemtra el fichero");
        }catch (IOException io) {
            System.out.println("Error de E/S: " + io.getMessage());
        }
    }
}
