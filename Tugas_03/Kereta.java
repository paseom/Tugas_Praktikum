public class Kereta {
    private String namaKereta;
    private int jumlahTiketTersedia;
    private Ticket[] daftarTiket;

    // Konstruktor untuk kereta komuter dengan jumlah tiket tersedia default 1000
    public Kereta() {
        this.namaKereta = "Kereta Komuter";
        this.jumlahTiketTersedia = 1000;
        this.daftarTiket = new Ticket[jumlahTiketTersedia];
    }

    // Konstruktor untuk kereta dengan nama kustom dan jumlah tiket tersedia kustom
    public Kereta(String namaKereta, int jumlahTiketTersedia) {
        this.namaKereta = namaKereta;
        this.jumlahTiketTersedia = jumlahTiketTersedia;
        this.daftarTiket = new Ticket[jumlahTiketTersedia];
    }

    // Method untuk menambahkan tiket tanpa asal dan tujuan
    public void tambahTiket(String namaPenumpang) {
        if (jumlahTiketTersedia > 0) {
            int i = daftarTiket.length - jumlahTiketTersedia;
            daftarTiket[i] = new Ticket();
            daftarTiket[i].setNamaPenumpang(new String[] { namaPenumpang });
            // Pesan konfirmasi jika tiket berhasil dipesan
            System.out.println("=================================================");
            System.out.println("Tiket berhasil dipesan");
        } else {
            // Pesan jika tiket habis
            System.out.println("=================================================");
            System.out.println("Kereta telah habis dipesan, silahkan cari jadwal keberangkatan lainnya");
        }
        // Mengurangi jumlah tiket yang tersedia
        --jumlahTiketTersedia;
        if (jumlahTiketTersedia < 30) {
            System.out.println("Sisa Tiket Tersedia: " + jumlahTiketTersedia);
        }
    }

    // Method untuk menambahkan tiket dengan asal dan tujuan
    public void tambahTiket(String namaPenumpang, String asal, String tujuan) {
        // Mengecek apakah kereta adalah KAJJ atau Kereta Komuter
        boolean isKAJJ = !namaKereta.equals("Kereta Komuter");
        if (isKAJJ && (asal == null || tujuan == null)) {
            // Pesan jika penumpang KAJJ tidak memiliki asal atau tujuan
            System.out.println("Penumpang KAJJ wajib memiliki asal dan tujuan tiket");
            return;
        }

        if (jumlahTiketTersedia > 0) {
            int index = daftarTiket.length - jumlahTiketTersedia;
            daftarTiket[index] = new Ticket();
            daftarTiket[index].setNamaPenumpang(new String[] { namaPenumpang });
            if (isKAJJ) {
                daftarTiket[index].setAsal(new String[] { asal });
                daftarTiket[index].setTujuan(new String[] { tujuan });
            }
            // Pesan konfirmasi jika tiket berhasil dipesan
            System.out.println("=================================================");
            System.out.println("Tiket berhasil dipesan. Sisa tiket tersedia: " + (--jumlahTiketTersedia));
        } else {
            // Pesan jika tiket habis
            System.out.println("=================================================");
            System.out.println("Kereta telah habis dipesan, silahkan cari jadwal keberangkatan lainnya");
        }
    }

    // Method untuk menampilkan daftar penumpang dan detailnya
    public void tampilkanTiket() {
        System.out.println("=================================================");
        if (namaKereta.equals("Kereta Komuter")) {
            System.out.println("Daftar penumpang kereta api komuter:");
        } else {
            System.out.println("Daftar penumpang kereta api " + namaKereta);
        }
        System.out.println("-------------------------------");
        boolean isEmpty = true;
        // Iterasi melalui array daftarTiket untuk menampilkan detail penumpang
        for (Ticket ticket : daftarTiket) {
            if (ticket != null) {
                isEmpty = false;
                System.out.println("Nama: " + ticket.getNamaPenumpang()[0]);
                // Menampilkan asal dan tujuan jika tidak merupakan kereta komuter dan data asal
                // dan tujuan tersedia
                if (!namaKereta.equals("Kereta Komuter") && ticket.getAsal() != null && ticket.getTujuan() != null) {
                    System.out.println("Asal: " + ticket.getAsal()[0]);
                    System.out.println("Tujuan: " + ticket.getTujuan()[0]);
                    System.out.println("-------------------------------");
                }
            }
        }
        // Pesan jika kereta kosong atau tidak ada penumpang
        if (isEmpty) {
            System.out.println("Kereta telah habis dipesan, silahkan cari jadwal keberangkatan lainnya");
        }
    }
}
