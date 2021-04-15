package Praktikum6;
import java.util.Scanner;
import java.util.Stack;

public class listTeman {
    Stack<String> daftarTeman;
    listTeman(){
        daftarTeman = new Stack<String>();
    }
    public String tambahTeman() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nama teman (isikan done saat selesai) = ");
        String namaTeman = scanner.nextLine();
        if(namaTeman.equals("done")) {
            return namaTeman;
        }
        this.daftarTeman.push(namaTeman);
        return  namaTeman;
    }
    public void hapusTeman() {
        String temanYangDibuang = this.daftarTeman.pop();
        System.out.println(temanYangDibuang + " dihapus dari pertemanan karena utang terus (POP)");
    }
    public void temanPalingBaru() {
        String temanBaru = this.daftarTeman.peek();
        System.out.println(temanBaru + " Temen paling baru tapi sering utang (PEEK)");
    }
    public void cariTeman(String namaTeman) {
        Integer pos = (Integer) daftarTeman.search(namaTeman);
        if(pos == -1) {
            System.out.println(namaTeman + " dah gak bisa dikontak nih, punya temen baru kali ya (SEARCH)");
            return;
        }
        System.out.println(namaTeman + " Masih bisa dikontak nih, masih temenan berati (SEARCH)");
    }
    public boolean cekTeman() {
        if(this.daftarTeman.empty()) {
            System.out.println("Lah pas butuh kok pada ilang nih temen (EMPTY)");
            return false;
        }
        System.out.println("Tenang masih ada " + this.daftarTeman.size() + " teman (EMPTY)");
        return true;
    }
}
