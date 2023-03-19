import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);

        String nombreC,nombrec,nombreP;
        int precio,total,iva;

        for (int i = 1; i < 3; i++) {
            
            System.out.println("engrese nombre del cajero");
            nombreC=leer.next();

            System.out.println("ingrese nombre del cliente");
            nombrec=leer.next();

            System.out.println("ingtrese el nombre del producto");
            nombreP=leer.next();

            System.out.println("ingrese el valor del producto");
            precio=leer.nextInt();

            iva=precio/100*19;
            total=iva+precio;

            System.out.println("nombre cajero: "+nombreC);
            System.out.println("nombre cliente: "+nombrec);
            System.out.println("nombre producto: "+nombreP);
            System.out.println("precio producto: "+precio);
            System.out.println("iva producto: "+iva);
            System.out.println("total producto: "+total);

            leer.close();
        }
    }
}
