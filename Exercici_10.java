import java.util.Scanner;

public class Exercici10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int[] a = new int[5];
        int[] b = new int[5];
        int[] resultat = new int[5];

        System.out.println("Introdueix els 5 valors de l'array a:");
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = lector.nextInt();
        }

        System.out.println("Introdueix els 5 valors de l'array b:");
        for (int i = 0; i < b.length; i++) {
            System.out.print("b[" + i + "]: ");
            b[i] = lector.nextInt();
        }

        for (int i = 0; i < resultat.length; i++) {
            resultat[i] = a[i] + b[i];
        }

        System.out.println("Array a:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("Array b:");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        System.out.println("Array resultat:");
        for (int i = 0; i < resultat.length; i++) {
            System.out.println(resultat[i]);
        }

        lector.close();
    }
}