public class mahasiswa {
    String nim;
    String nama;
    String prodi;
    String kelas;

    public mahasiswa(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkandata() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas );
    }
    
}
