package Praktikum6;
import java.util.Scanner;   
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        listTeman listTeman = new listTeman();
        while (true) {
            String namaTeman = listTeman.tambahTeman();
            if(namaTeman.equals("done")) {
                break;
            }
        }
        if(!listTeman.cekTeman()){
            return;
        }
        listTeman.temanPalingBaru();
        listTeman.hapusTeman();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukan nama teman (isikan done saat selesai) = ");
            String namaTeman = scanner.nextLine();
            if(namaTeman.equals("done")) {
                break;
            }
            listTeman.cariTeman(namaTeman);
        }
    }
}
