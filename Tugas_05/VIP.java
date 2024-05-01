// Kelas turunan untuk tiket VIP
class VIP extends Tiket {
   // Do your magic here
   public VIP() {
      super("VIP", 150);
   }

   public VIP(double harga) {
      super("VIP", harga);
   }

   // Implementasi metode hitungTotalHarga untuk VIP
   @Override
   public double hitungTotalHarga(int jumlah, String tahap) {
      double totalHarga = getHarga() * jumlah;
      if (tahap.equalsIgnoreCase("Presale")) {
         totalHarga *= 0.8; // diskon 20% untuk presale
      }
      return totalHarga;
   }
}