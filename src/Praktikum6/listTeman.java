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
        System.out.println("Berhasil menghapus " + temanYangDibuang + " dari daftar pertemanan (POP)");
    }
    public void temanPalingBaru() {
        String temanBaru = this.daftarTeman.peek();
        System.out.println(temanBaru + " berhasil di tambahkan ke daftar pertemanan (PEEK)");
    }
    public void cariTeman(String namaTeman) {
        Integer pos = (Integer) daftarTeman.search(namaTeman);
        if(pos == -1) {
            System.out.println(namaTeman + " tidak ada di daftar pertemanan (SEARCH)");
            return;
        }
        System.out.println(namaTeman + " ada di daftar pertemanan (SEARCH)");
    }
    public boolean cekTeman() {
        if(this.daftarTeman.empty()) {
            System.out.println("Anda belum memiliki list pertemanan (EMPTY)");
            return false;
        }
        System.out.println("Nama teman di list anda " + this.daftarTeman.size() + " (EMPTY)");
        return true;
    }
}
