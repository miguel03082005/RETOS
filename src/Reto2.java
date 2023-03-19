import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) throws Exception{
        int Dbb=0;
        int Pbb=0;
        int Mbb=0;
        int fechaActual=0;
        int fechaRTA=0;
        String nom_bb="";
        String nom_padres="";
        String nom_doctor="";
        

        Scanner vacuna = new Scanner(System.in);

        System.out.println("ingresar nombre del medico:");
        nom_doctor=vacuna.nextLine();

        System.out.println("ingresar nombre de el padre o madre:");
        nom_padres=vacuna.nextLine();

        System.out.println("ingresar nombre del bebe:");
        nom_bb=vacuna.nextLine();

        System.out.println("ingresa el mes de nacimiento:");
        Mbb=vacuna.nextInt();

        System.out.println("ingrese el mes actual:");
        fechaActual=vacuna.nextInt();

        System.out.println("ingresa el peso de el bebe:");
        Pbb=vacuna.nextInt();

        fechaRTA=Math.abs(fechaActual - Mbb);
        
        Dbb=Math.abs(Pbb + 10);
        Dbb=Math.abs(Mbb * 10);
        Dbb=Math.abs(Mbb + Pbb * 8);

        System.out.println("el especialista medico que los esta atendiendo es "+nom_doctor);
        System.out.println("el padre o madre del bebe es "+nom_padres);
        System.out.println("el bb se llama "+nom_bb);
        System.out.println("el bebe tiene "+fechaRTA+" meses");
        System.out.println("el bebe pesa "+Pbb+" Kg");
        System.out.println("la dosis a suministrar es de "+Dbb+" ml");

        vacuna.close();
    }
}
