public class antrianlayanan {
    mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;

    public antrianlayanan(int max) {
        this.max = max;
        this.data = new mahasiswa[max];
        size = 0;
        front = rear = -1;
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

        public mahasiswa layanimahasiswa() {
            if (isempty()) {
                System.out.println("Antrian kosong.");
                return null;
            }
            mahasiswa mhs = data[front];
            front = (front + 1) % max;
            size--;
            return mhs;
        }

        public void lihatterdepan() {
            if (isempty()) {
                System.out.println("Antrian kosong.");
            } else {
                System.out.print("Mahasiswa terdepan: ");
                System.out.println("NIM - NAMA - PRODI - KELAS");
                data[front].tampilkandata();
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

        public int getjumlahantrian() {
            return size;
        }
        
        public void lihatakhir() {
            if (isempty()) {
                System.out.println("Antrian kosong.");
            } else {
                System.out.print("Mahasiswa terakhir: ");
                System.out.println("NIM - NAMA - PRODI - KELAS");
                data[rear].tampilkandata();
            }
        }
        }