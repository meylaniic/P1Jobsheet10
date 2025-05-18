import java.util.Scanner;

public class layananakademiksiakad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        antrianlayanan antrian = new antrianlayanan(5);
        int pilihan;

        do { 
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa Ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Cek Antrian Paling Belakang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
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
                    mahasiswa dilayani = antrian.layanimahasiswa();
                    if (dilayani != null) {
                        System.out.println("Melayani mahasiswa: ");
                        dilayani.tampilkandata();
                    }
                    break;
                case 3: 
                    antrian.lihatterdepan();
                    break;
                case 4: 
                    antrian.tampilkansemua();
                    break;
                case 5: 
                    System.out.println("Jumlah dalam antrian: " + antrian.getjumlahantrian());
                    break;
                case 6:
                    antrian.lihatakhir();
                    break;
                case 0:
                    System.out.println("Terimakasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");;
            }

        } while (pilihan != 0);
    }
}
