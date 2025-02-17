import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //a----------------
        String[] poleString = {"bobek", "Hradeček", "taštička", "Jindra"};

        for (int i = 0; i < poleString.length; i++) {
            System.out.print(poleString[i] + " ");
        }
        System.out.println();
        System.out.println();


        //b----------------
        System.out.println("Jak velké chceš mít pole písmen?");
        int n = sc.nextInt();
        sc.nextLine();
        //int[] poleInt = new int[n+1];
        char[] pismena = new char[n+1];

        for (int i = 1; i < pismena.length; i++) {
            System.out.print("Zadej" +i+ ". písmeno");
            pismena[i] = sc.next().charAt(0);
        }

        System.out.println("Kolikáté číslo chceš znát?");
        int kolik = sc.nextInt();
        sc.nextLine();

        if (kolik > n) {
            System.out.println("ČÍSLO JE MIMO DOSAH POLE");
        }else{
            System.out.println(pismena[kolik]);
        }


        //c----------------
        Hodnoceni[] vysvedceni = new Hodnoceni[5];
        vysvedceni[0] = new Hodnoceni("Biologie", 2);
        vysvedceni[1] = new Hodnoceni("Zeměpis", 5);
        vysvedceni[2] = new Hodnoceni("Chemie", 4);



















    }
}





















































