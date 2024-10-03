import java.util.Scanner;

public class LatihanIndivdu07 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);

        String jenis;
        int jumlah;
        double  totalHarga, totalDiskon;
        double harga = 20000;
        double diskon = 0;

        System.out.println("Masukkan jenis buku = ");
        jenis = input07.nextLine();

        System.out.println("Masukkan jumlah buku = ");
        jumlah = input07.nextInt();

        if (jenis.equalsIgnoreCase("kamus")) {
            System.out.println("Jenis Buku = " + jenis);
            diskon = 0.10;

            if (jumlah > 2) {
                diskon += 0.02;
            }
        } else if (jenis.equalsIgnoreCase("novel")) {
            System.out.println("Jenis Buku = " + jenis);
            diskon = 0.07;

            if (jumlah > 3) {
                diskon += 0.02;
            } else if (jumlah <= 3) {
                diskon += 0.01;
            }
        } else {
            System.out.println("Jenis Buku = " + jenis);
            if (jumlah > 3) {
                diskon = 0.05;
            }
        }

        totalDiskon = (jumlah * harga) * diskon;
        totalHarga = harga - totalDiskon;

        System.out.println("Jadi total diskonnya adalah = " + totalDiskon);
        System.out.println("Jadi total harganya adalah = " + totalHarga);
    }
}
