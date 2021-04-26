package Praktikum7;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {
    private static  int queueCapacity = 10;
    private static Queue<String> queue = new LinkedList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean continueProgram = true;
            System.out.println("");
            System.out.println("");
            System.out.println("Menu");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Keluarkan Antrian");
            System.out.println("3. Cari nama dalam antrian");
            System.out.println("4. Keluar dari aplikasi");
            System.out.println("Antrian Saat ini = " + queue);
            System.out.print("Pilih salah satu menu = ");
            int selectedMenu = scanner.nextInt();
            switch(selectedMenu) {
                case 1:
                    enQueue();
                    break;
                case 2:
                    deQueue();
                    break;
                case 3:
                    searchQueue();
                    break;
                case 4:
                    continueProgram = false;
                    break;
                default:
                    continueProgram = false;
                    break;
            }
            System.out.println("Antrian saat ini = " + queue);
            if (continueProgram == false) {
                break;
            }
        }
    }
    public static void enQueue() {
        if(queue.size() == queueCapacity) {
            System.out.println("Antrian sudah penuh, tidak bisa menambah antrian");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nama = ");
        String name = scanner.next();
        queue.add(name);
        System.out.println(name + " Berhasil ditambahkan ke antrian");
    }
    public static void deQueue() {
        if(queue.size() == 0) {
            System.out.println("Antrian masih kosong");
            return;
        }
        String removedName = queue.remove();
        System.out.println(removedName + " dikeluarkan dari antrian");
    }
    public static void  searchQueue() {
        if(queue.size() == 0) {
            System.out.println("Antrian masih kosong");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nama = ");
        String name = scanner.next();
        if(!queue.contains(name)) {
            System.out.println(name + " Tidak ditemukan dalam antrian");
        }
        System.out.println(name + " ditemukan dalam antrian");
    }
}
