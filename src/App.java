import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        temp();
    }
    public static void temp(){
        Scanner leer =new Scanner (System.in);
        System.out.println("Por favor ingrese la temp en grados centigrados:");
        float cen= leer.nextFloat();
        float fh= 32+(9*cen/5);
        System.out.println("La temperatura en grados Fahrenheit es: "+fh);
        leer.close();
    }
}