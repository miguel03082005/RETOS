import java.util.Random;
import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);

        int rta;

        for (int i = 0; i < 4; i++) {
            
            System.out.println("ingresa un numero 0= cara  1= sello");
            rta=leer.nextInt();
            
            Random generator = new Random();
            int opcion = generator.nextInt(2);

            if (opcion == 0) {
                System.out.println("cara");
                System.out.println("salio "+opcion+" y tu elegiste"+rta);
            } else if (opcion == 1){
                System.out.println("sello");
                System.out.println("salio "+opcion+" y tu elegiste"+rta);
            }
        }
        leer.close();
    }
}
