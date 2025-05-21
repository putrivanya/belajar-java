import java.util.Scanner;

public class CariNamaSiswa {
    public static void main(String[] args) {
        // Matriks nama siswa (2 dimensi)
        String[][] siswa = {
            {"Ali", "Budi", "Citra"},
            {"Dina", "Eka", "Fajar"},
            {"Gina", "Hana", "Indra"}
        };

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama yang ingin dicari: ");
        String namaCari = input.nextLine();

        boolean ditemukan = false;

        // Mencari nama dalam array 2 dimensi
        for (int i = 0; i < siswa.length; i++) {
            for (int j = 0; j < siswa[0].length; j++) {
                if (siswa[i][j].equalsIgnoreCase(namaCari)) {
                    System.out.println("Nama '" + namaCari + "' ditemukan pada baris ke-" + (i + 1) + ", kolom ke-" + (j + 1));
                    ditemukan = true;
                }
            }
        }

        if (!ditemukan) {
            System.out.println("Nama '" + namaCari + "' tidak ditemukan.");
        }

        input.close();
    }
}
