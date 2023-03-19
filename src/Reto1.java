import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) throws Exception {
        double cel,kel;
        int gramo = 13;
        double kg;
        double kilogramos = 1000;
        int Can_per = 0;

        Scanner temperatura = new Scanner(System.in);
        System.out.println("ingresa los grados celcius a convertir");
        cel = temperatura.nextDouble();

        System.out.println("ingresa la cantidad de personas que comeran de la torta");
        Can_per = temperatura.nextInt();

        gramo= Math.abs(gramo*Can_per);
        kg= Math.abs(gramo/kilogramos);
        kel= cel + 273.15;

        System.out.println(+cel+" los grados que a ingresado aquibalen a "+kel+" grados kelvin");
        System.out.println("los kilogramos que nesesitas para la torta es "+kg);

        temperatura.close();
    }
}
