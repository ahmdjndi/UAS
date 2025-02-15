import java.util.Scanner;
public class Soal_1_UAS {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String[] nama = new String[100];
        String[] nim = new String[100];
        String[] jenisPrestasi = new String[100];
        String[] tingkatPrestasi = new String[100];
        int[] tahunPrestasi = new int[100];
        int Count = 0;
        int choice;

        do {
            System.out.println("=== PENCATATAN PRESTASI MAHASISWA ===");
            System.out.println("1. Tambah Data Prestasi");
            System.out.println("2. Tampilkan Semua Prestasi");
            System.out.println("3. Analisis Prestasi Berdasarkan Jenis");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            choice = input.nextInt();
            input.nextLine();
            System.out.println();

            switch (choice){
                case 1:
                if (Count >= 100) { 
                    System.out.println("Jumlah prestasi telah mencapai batas maksimal."); 
                    break; 
                    } 
                    System.out.print("Nama Mahasiswa: "); 
                    nama[Count] = input.nextLine(); 
                    System.out.print("NIM: "); 
                    nim[Count] = input.nextLine(); 
                    System.out.print("Jenis Prestasi: "); 
                    jenisPrestasi[Count] = input.nextLine(); 
                    while (true) { 
                        System.out.print("Tingkat Prestasi (Lokal/Nasional/Internasional): "); 
                        tingkatPrestasi[Count] = input.nextLine(); 
                        if (tingkatPrestasi[Count].equalsIgnoreCase("Lokal") || 
                        tingkatPrestasi[Count].equalsIgnoreCase("Nasional") || 
                        tingkatPrestasi[Count].equalsIgnoreCase("Internasional")) {
                            break; 
                        } else { 
                            System.out.println("Tingkat Prestasi tidak valid. Coba Lagi."); 
                        } 
                    }
                    while (true) { 
                        System.out.print("Tahun Prestasi (2010 - 2024): "); 
                        int tahun = input.nextInt(); 
                        input.nextLine(); 
                        if (tahun >= 2010 && tahun <= 2024) { 
                            tahunPrestasi[Count] = tahun; 
                            break; 
                        } else { 
                            System.out.println("Tahun Tidak Valid. Coba Lagi."); 
                        } 
                    }
                    Count++; 
                    System.out.println("Prestasi berhasil ditambahkan!");
                    break;

                case 2:
                if (Count > 0) {
                    System.out.println("=== DAFTAR SEMUA PRESTASI ==="); 
                    for (int i = 0; i < Count; i++) { 
                        System.out.println("Nama: " + nama[i] + " || NIM: " + nim[i] + " || Jenis: " + jenisPrestasi[i] + " || Tingkat: " + tingkatPrestasi[i] + " || Tahun: " + tahunPrestasi[i]); 
                    }
                } else {
                    System.out.println("belum ada data prestasi");
                }                  
                    break;

                case 3:
                System.out.print("Masukkan jenis prestasi yang ingin dianalisis: "); 
                String jenis = input.nextLine(); 
                System.out.println("=== ANALSIS PRESTASI ==="); 
                for (int i = 0; i < Count; i++) { 
                    if (jenisPrestasi[i].equalsIgnoreCase(jenis)){ 
                        System.out.println("Nama: " + nama[i] + " || NIM: " + nim[i] + " || Tingkat: " + tingkatPrestasi[i] + " || Tahun: " + tahunPrestasi[i]); 
                    } 
                }
                    break;

                case 4: 
                    System.out.println("Terima kasih!"); 
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 4);
    }
}
           