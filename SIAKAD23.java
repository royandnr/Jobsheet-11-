import java.util.Scanner;

public class SIAKAD23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input jumlah siswa dan mata kuliah
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();

        // Membuat array 2D sesuai input user
        int nilai[][] = new int[jumlahMahasiswa][jumlahMatkul];

        // Input nilai tiap mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerMahasiswa = 0;

            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerMahasiswa += nilai[i][j];
            }

            System.out.println("Rata-rata nilai mahasiswa ke-" 
                               + (i + 1) + ": " 
                               + (totalPerMahasiswa / jumlahMatkul));
        }

        // Output rata-rata tiap mata kuliah
        System.out.println("\n====================================");
        System.out.println("Rata-rata nilai setiap mata kuliah: ");

        for (int j = 0; j < jumlahMatkul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jumlahMahasiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata kuliah " + (j + 1) + ": " 
                               + (totalPerMatkul / jumlahMahasiswa));
        }
    }
}
