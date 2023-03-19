import java.util.Random;
import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        int rta;

        for (int i = 0; i < 4; i++) {
            
            System.out.println("ingresa un numero 0= piedra  1= papel 2=tigera");
            rta=leer.nextInt();
            
            Random generator = new Random();
            int opcion = generator.nextInt(3);

            if (opcion == 0) {
                System.out.println("piedra");
                System.out.println("salio "+opcion);
            } else if (opcion == 1){
                System.out.println("papel");
                System.out.println("salio "+opcion);
            } else if (opcion == 2){
                System.out.println("tigera");
                System.out.println("salio "+opcion);
            }
        }
        leer.close();
    }
}
