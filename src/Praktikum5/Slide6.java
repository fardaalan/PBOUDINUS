package Praktikum5;
import java.util.Scanner;

public class Slide6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan total inputan : ");
        int tot = input.nextInt();
        int[] nilai = new int[tot];
        for(int i = 0; i < tot; i++){
            System.out.print("Masukan nilai : ");
            nilai[i] = input.nextInt();
        }
        libSlide6 tampil = new libSlide6();
        tampil.daftarNilai(nilai,tot);
    }
}
