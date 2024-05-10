import java.text.NumberFormat;
import java.util.Locale;

class PemesananTiket {
  // Do your magic here...
  private String nama;
  private TiketKonser tiket;
  private String kodeBooking;
  private String tanggalPesanan;

  // konstruktor untuk pemesananTiket
  public PemesananTiket(String nama, TiketKonser tiket) {
    this.nama = nama;
    this.tiket = tiket;
    this.kodeBooking = Main.generateKodeBooking();
    this.tanggalPesanan = Main.getCurrentDate();
  }

  public void cetakNota() {
    // untuk format uang ke dollar
    double totalHarga = tiket.getHarga();
    NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
    String formatHarga = format.format(tiket.getHarga());

    // mencetak isi nota
    System.out.println("----- Detail Pemesanan -----");
    System.out.println("Nama Pemesan: " + nama);
    System.out.println("Kode Booking: " + kodeBooking);
    System.out.println("Tanggal Pesanan: " + tanggalPesanan);
    System.out.println("Tiket yang dipesan: " + tiket.getJenis());
    System.out.println("Total harga: " + formatHarga);
  }
}