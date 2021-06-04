package Praktikum11.BangunDatar;

public class Segitiga extends BangunDatar {
    int alas, tinggi;
    public Segitiga(int sisi, int alas, int tinggi) {
        super(sisi);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void draw() {

    }

    @Override
    public int getJumlahSisi() {
        return this.getJumlahSisi();
    }

    @Override
    public double getLuas() {
        return 0.5 * this.alas * this.tinggi;
    }

    @Override
    public double getKeliling() {
        return 0;
    }
}
