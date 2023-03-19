import java.util.Scanner;

public class Reto8 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        int rta;
        String nombreA;
        String apellidoA;
        int ficha;
        int estrato;
        String nivelE;
        int aplica=3;


        System.out.println("VIENVENIDO APRENDIZ");
        System.out.println("selecciona el auxilio de transpote al que deseas aplicar");
        System.out.println("1= auxilio de tarnsporte  2= auxilio del alimentacion  3= auxilio de sostenimiento");
        rta=leer.nextInt();

        switch (rta) {
            case 1:{
                System.out.println("as elegido el auxilio de transporte");

                System.out.println("ingrese el nombre del aprediz");
                nombreA=leer.next();

                System.out.println("ingrese el apellido del aprendiz");
                apellidoA=leer.next();

                System.out.println("ingrese el numero de ficha del aprendiz");
                ficha=leer.nextInt();

                System.out.println("ingrese el nivel de estrato");
                System.out.println("1= estrato 1  2= estrato 2  3= estrato 3  4= estrato 4");
                estrato=leer.nextInt();

                System.out.println("ingrese su nivel de estufio");
                nivelE=leer.next();

                if (estrato <= aplica) {
                    System.out.println("usted a sido admitido en el programa de auxilio de transporte");
                } else {
                    System.out.println("usted no a sido admitido en el programa de transporte");
                }
            }
            case 2:{
                System.out.println("as elegido el auxilio de alimentacion");

                System.out.println("ingrese el nombre del aprediz");
                nombreA=leer.next();

                System.out.println("ingrese el apellido del aprendiz");
                apellidoA=leer.next();

                System.out.println("ingrese el numero de ficha del aprendiz");
                ficha=leer.nextInt();

                System.out.println("ingrese el nivel de estrato");
                System.out.println("1= estrato 1  2= estrato 2  3= estrato 3  4= estrato 4");
                estrato=leer.nextInt();

                System.out.println("ingrese su nivel de estufio");
                nivelE=leer.next();

                if (estrato <= aplica) {
                    System.out.println("usted a sido admitido en el programa de auxilio de alimentacion");
                } else {
                    System.out.println("usted no a sido admitido en el programa de alimentacion");
                }
            }
            case 3:{
                System.out.println("as elegido el auxilio de sostenimiento");

                System.out.println("ingrese el nombre del aprediz");
                nombreA=leer.next();

                System.out.println("ingrese el apellido del aprendiz");
                apellidoA=leer.next();

                System.out.println("ingrese el numero de ficha del aprendiz");
                ficha=leer.nextInt();

                System.out.println("ingrese el nivel de estrato");
                System.out.println("1= estrato 1  2= estrato 2  3= estrato 3  4= estrato 4");
                estrato=leer.nextInt();

                System.out.println("ingrese su nivel de estufio");
                nivelE=leer.next();

                if (estrato <= aplica) {
                    System.out.println("usted a sido admitido en el programa de auxilio de sostenimiento");
                } else {
                    System.out.println("usted no a sido admitido en el programa de sostenimiento");
                }
            }
        }
        leer.close();
    }
}