import java.util.Scanner;

public class kuvvet {
    public static void main(String[] args) {
        int h;
        Scanner num = new Scanner(System.in);
        System.out.print("sınır syısını giriniz:");
        h = num.nextInt();
        System.out.println("Dördün kuvvetleri:");

        for (int i = 1; i <= h; i *= 4) {
            System.out.println(i);

        }
        System.out.print("Beşin kuvvetleri:");

        
        for (int i = 1; i <= h; i *= 5) {
            System.out.println( i);


        }
    }
}