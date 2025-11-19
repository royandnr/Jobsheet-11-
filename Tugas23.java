import java.util.Scanner;

public class Tugas23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int responden = 10;
        int pertanyaan = 6;
        double[][] survei = new double[responden][pertanyaan];
        
        System.out.println("=== Survei Kepuasan Pelanggan ===");
        System.out.println("Gunakan pilihan berikut untuk setiap pertanyaan:");
        System.out.println("1. Sangat Tidak Puas");
        System.out.println("2. Tidak Puas");
        System.out.println("3. Cukup Puas");
        System.out.println("4. Puas");
        System.out.println("5. Sangat Puas\n");
        
        // Input nilai survei
        for (int i = 0; i < responden; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < pertanyaan; j++) {
                System.out.print("  Masukkan tingkat kepuasan untuk pertanyaan ke-" + (j + 1) + ": ");
                int pilihan;
                do {
                    pilihan = input.nextInt();
                    if (pilihan < 1 || pilihan > 5) {
                        System.out.print("  Pilihan tidak valid! Masukkan angka antara 1 sampai 5: ");
                    }
                } while (pilihan < 1 || pilihan > 5);
                survei[i][j] = pilihan;
            }
            System.out.println();
        }

        // Hitung rata-rata tiap responden
        System.out.println("\n=== Rata-Rata Tiap Responden ===");
        for (int i = 0; i < responden; i++) {
            double total = 0;
            for (int j = 0; j < pertanyaan; j++) {
                total += survei[i][j];
            }
            double rataResponden = total / pertanyaan;
            System.out.printf("Rata-rata Responden ke-%d = %.2f%n", (i + 1), rataResponden);
        }

        // Hitung rata-rata tiap pertanyaan
        System.out.println("\n=== Rata-Rata Tiap Pertanyaan ===");
        for (int j = 0; j < pertanyaan; j++) {
            double total = 0;
            for (int i = 0; i < responden; i++) {
                total += survei[i][j];
            }
            double rataPertanyaan = total / responden;
            System.out.printf("Rata-rata Pertanyaan ke-%d = %.2f%n", (j + 1), rataPertanyaan);
        }

        // Hitung rata-rata keseluruhan
        double totalSemua = 0;
        for (int i = 0; i < responden; i++) {
            for (int j = 0; j < pertanyaan; j++) {
                totalSemua += survei[i][j];
            }
        }
        double rataKeseluruhan = totalSemua / (responden * pertanyaan);
        System.out.printf( "\n=== Rata-Rata Keseluruhan Survei = %.2f ===%n", rataKeseluruhan);
        
        input.close();
    }
}
