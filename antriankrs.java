public class antriankrs {
    mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int jumlahkrs;
    

    public antriankrs() {
        this.max = 10;
        this.data = new mahasiswa[max];
        size = 0;
        front = rear = -1;
        jumlahkrs = 0;
    }

    public boolean isempty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isfull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        if (!isempty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void tambahantrian(mahasiswa mhs) {
        if (isfull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        } if (isempty()) {
            front = 0;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " Berhasil masuk ke antrian");
        }

    public void panggilkrs() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2, tidak bisa proses KRS.");
            return;
        }

        System.out.println("Memproses KRS untuk:");
        for (int i = 0; i < 2; i++) {
            data[front].tampilkandata();
            front = (front + 1) % max;
            size--;
            jumlahkrs++;
        }
        
    }

    public void tampilkansemua() {
            if (isempty()) {
                System.out.println("Antrian kosong.");
                return;
            }
            System.out.println("Daftar Mahasiswa dalam Antrian");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print(( i + 1) + ". ");
                data[index].tampilkandata();
            }
        }

    public void lihatterdepan() {
            if (size < 2) {
                System.out.println("Belum ada 2 antrian terdepan.");
                return;
            } else {
                System.out.println("2 Mahasiswa terdepan: ");
                for (int i = 0; i < 2; i++) {
                    int index = (front + i) % max;
                    data[index].tampilkandata();
                }
            }
        }
    public void lihatterakhir() {
            if (isempty()) {
                System.out.println("Antrian kosong.");
            } else {
                System.out.print("Mahasiswa paling belakang : ");
                System.out.println("NIM - NAMA - PRODI - KELAS");
                data[rear].tampilkandata();
            }
        }
    
    public int getjumlahantrian() {
            return size;
        }
    
    public int getjumlahkrs() {
            return jumlahkrs;
    }

    public int getsisakrs() {
            return 30 - jumlahkrs;
        }
}
