import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //a----------------
        String[] arrayString = {"bobek", "Hradeček", "taštička", "Jindra"};

        for (int i = 0; i < arrayString.length; i++) {
            System.out.print(arrayString[i] + " ");
        }
        System.out.println();
        System.out.println();


        //b----------------
        System.out.println("Jak velké chceš mít pole písmen?");
        int n = sc.nextInt();
        sc.nextLine();
        //int[] arrayInt = new int[n+1];
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






















    }
}





















































