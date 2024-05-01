import java.util.Scanner;

public class PesanTiketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pemesanan tiket!");

        // Do your magic here
        System.out.print("Nama pembeli: ");
        String nama = scanner.nextLine();

        String tahapPilihan = "";

        System.out.println("Tahap pembelian:");
        System.out.println("1. Presale");
        System.out.println("2. Reguler");
        System.out.print("Pilih tahap pembelian (1/2): ");
        tahapPilihan = scanner.nextLine();

        System.out.println();

        String tahap;
        switch (tahapPilihan) {
            case "1":
                tahap = "Presale";
                break;
            case "2":
                tahap = "Reguler";
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }

        // Menampilkan jenis tiket berdasarkan tahap pembelian
        if (tahapPilihan.equals("1")) {
            System.out.println("Jenis tiket:");
            System.out.println("1. Festival");
            System.out.println("2. VIP");
            System.out.println("3. VVIP");
            System.out.print("Pilih jenis tiket (1/2/3): ");
        } else {
            System.out.println("Jenis tiket:");
            System.out.println("1. VIP");
            System.out.println("2. VVIP");
            System.out.print("Pilih jenis tiket (1/2): ");
        }
        int jenisPilihan = scanner.nextInt();

        scanner.nextLine();

        String jenis;
        switch (jenisPilihan) {
            case 1:
                jenis = (tahapPilihan.equals("1")) ? "Festival" : "VIP";
                break;
            case 2:
                jenis = (tahapPilihan.equals("1")) ? "VIP" : "VVIP";
                break;
            case 3:
                jenis = "VVIP";
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }

        System.out.print("Jumlah tiket: ");
        int jumlah = scanner.nextInt();

        System.out.println();

        // Membuat objek tiket sesuai dengan jenis tiket yang dipilih
        Tiket tiket;
        switch (jenis.toUpperCase()) {
            case "FESTIVAL":
                tiket = new Festival();
                break;
            case "VIP":
                tiket = new VIP();
                break;
            case "VVIP":
                tiket = new VVIP();
                break;
            default:
                System.out.println("Jenis tiket tidak valid!");
                return;
        }

        // Membuat objek pemesanan
        Pemesanan pemesanan = new Pemesanan(nama, tahap, tiket, jumlah);

        // Cetak nota pembelian
        pemesanan.cetakNota();
    }
}
