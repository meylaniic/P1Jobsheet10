
import java.util.Scanner;

public class antriankrsmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        antriankrs antrian = new antriankrs();
        int pilih;

        do { 
             System.out.println("\n=== Menu Antrian KRS ===");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Panggil KRS (2 mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Akhir");
            System.out.println("6. Cetak Jumlah Antrian");
            System.out.println("7. Cetak Jumlah yang Sudah Proses KRS");
            System.out.println("8. Cetak Sisa Kuota KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM\t: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama\t: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi\t: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas\t: ");
                    String kelas = sc.nextLine();
                    mahasiswa mhs = new mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahantrian(mhs);
                    break;

                case 2:
                    antrian.panggilkrs();
                    break;
                
                case 3:
                    antrian.tampilkansemua();
                    break;
                case 4:
                    antrian.lihatterdepan();
                    break;
                case 5:
                    antrian.lihatterakhir();
                    break;
                case 6:
                    System.out.println("Jumlah antrian : " + antrian.getjumlahantrian());
                    break;
                case 7:
                    System.out.println("Jumlah sudah KRS : " + antrian.getjumlahkrs());
                    break;
                case 8:
                    System.out.println("Sisa kuota KRS DPA : " + antrian.getsisakrs());
                    break;
                case 9:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terimakasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }

        } while (pilih != 0);
    }
}
