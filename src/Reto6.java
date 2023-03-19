import java.util.Random;
import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        int rta;
        int apuesta;
        int igual;

        for (int i = 0; i < 4; i++) {
            
            System.out.println("ingresa un numero 0= cara  1= sello");
            rta=leer.nextInt();

            System.out.println("ingresa tu apuesta");
            apuesta=leer.nextInt();
            
            Random generator = new Random();
            int opcion = generator.nextInt(2);

            if (opcion == 0) {
                System.out.println("cara");
                System.out.println("salio "+opcion+" y tu elegiste "+rta);
            } else if (opcion == 1){
                System.out.println("sello");
                System.out.println("salio "+opcion+" y tu elegiste "+rta);
            }

            if (opcion == rta) {
                igual=apuesta*2;
                System.out.println("as ganado "+igual);
            } else if (opcion < rta) {
                igual=apuesta-apuesta;
                System.out.println("as perdido "+igual);
            } else if (opcion > apuesta) {
                igual=apuesta-apuesta;
                System.out.println("as perdido "+igual);
            }
        }
        leer.close();
    }
}
