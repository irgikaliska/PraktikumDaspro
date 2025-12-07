package jobsheet11;

public class pengunjungCafe {
    static void daftarPengunjung(String...namaPengunjung) {
        System.out.println("Daftar Pengunjung Cafe:");
        for(String pengunjung : namaPengunjung) {
            System.out.println("-  " + pengunjung);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung();
        // daftarPengunjung("Doni", "Budi", "Siti", "Rina");
    }
}
