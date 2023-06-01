package MiniProject;

import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("========== KALKULATOR KONVERSI JARAK ==========");
        System.out.println("By : Nico Arya Divano");
        System.out.println("===============================================");

        // memilih dan memasukkan nilai panjang
        System.out.printf("%-6s     %-6s \n", "1. KM", "5. DM");
        System.out.printf("%-6s     %-6s \n", "2. HM", "6. CM");
        System.out.printf("%-6s     %-6s \n", "3. DAM", "7. MM");
        System.out.printf("%-6s \n", "4. M");

        System.out.println("===============================================");

        System.out.printf("%-35s : ", "Pilih Satuan Awal (Angka Saja)");
        int initialUnit = input.nextInt();

        System.out.printf("%-35s : ", "Pilih Satuan Akhir (Angka Saja)");
        int convert = input.nextInt();

        System.out.printf("%-35s : ", "Masukkan Ukuran Panjang");
        float length = input.nextFloat();

        System.out.println("===============================================");

        //perhitungan konversi
        String unit = "";

        if (initialUnit == 1) {
            unit = "km";
        } else if (initialUnit == 2) {
            unit = "hm";
        } else if (initialUnit == 3) {
            unit = "dam";
        } else if (initialUnit == 4) {
            unit = "m";
        } else if (initialUnit == 5) {
            unit = "dm";
        } else if (initialUnit == 6) {
            unit = "cm";
        } else if (initialUnit == 7) {
            unit = "mm";
        }

        if (initialUnit >= 1 && initialUnit <= 7) {
            System.out.printf("%-10s : %f %s \n", "From", length, unit);
        } else {
            System.out.println("Error!!!");
        }

        if (initialUnit == 1 && convert == 1) {
            length = length * 1;
        } else if (initialUnit == 1 && convert == 2) {
            length = length * 10;
        } else if (initialUnit == 1 && convert == 3) {
            length = length * 100;
        } else if (initialUnit == 1 && convert == 4) {
            length = length * 1000;
        } else if (initialUnit == 1 && convert == 5) {
            length = length * 10000;
        } else if (initialUnit == 1 && convert == 6) {
            length = length * 100000;
        } else if (initialUnit == 1 && convert == 7) {
            length = length * 1000000;
        }

        if (initialUnit == 2 && convert == 1) {
            length = length / 10;
        } else if (initialUnit == 2 && convert == 2) {
            length = length * 1;
        } else if (initialUnit == 2 && convert == 3) {
            length = length * 10;
        } else if (initialUnit == 2 && convert == 4) {
            length = length * 100;
        } else if (initialUnit == 2 && convert == 5) {
            length = length * 1000;
        } else if (initialUnit == 2 && convert == 6) {
            length = length * 10000;
        } else if (initialUnit == 2 && convert == 7) {
            length = length * 100000;
        }

        if (initialUnit == 3 && convert == 1) {
            length = length / 100;
        } else if (initialUnit == 3 && convert == 2) {
            length = length / 10;
        } else if (initialUnit == 3 && convert == 3) {
            length = length * 1;
        } else if (initialUnit == 3 && convert == 4) {
            length = length * 10;
        } else if (initialUnit == 3 && convert == 5) {
            length = length * 100;
        } else if (initialUnit == 3 && convert == 6) {
            length = length * 1000;
        } else if (initialUnit == 3 && convert == 7) {
            length = length * 10000;
        }

        if (initialUnit == 4 && convert == 1) {
            length = length / 1000;
        } else if (initialUnit == 4 && convert == 2) {
            length = length / 100;
        } else if (initialUnit == 4 && convert == 3) {
            length = length / 10;
        } else if (initialUnit == 4 && convert == 4) {
            length = length * 1;
        } else if (initialUnit == 4 && convert == 5) {
            length = length * 10;
        } else if (initialUnit == 4 && convert == 6) {
            length = length * 100;
        } else if (initialUnit == 4 && convert == 7) {
            length = length * 1000;
        }

        if (initialUnit == 5 && convert == 1) {
            length = length / 10000;
        } else if (initialUnit == 5 && convert == 2) {
            length = length / 1000;
        } else if (initialUnit == 5 && convert == 3) {
            length = length / 100;
        } else if (initialUnit == 5 && convert == 4) {
            length = length / 10;
        } else if (initialUnit == 5 && convert == 5) {
            length = length * 1;
        } else if (initialUnit == 5 && convert == 6) {
            length = length * 10;
        } else if (initialUnit == 5 && convert == 7) {
            length = length * 100;
        }

        if (initialUnit == 6 && convert == 1) {
            length = length / 100000;
        } else if (initialUnit == 6 && convert == 2) {
            length = length / 10000;
        } else if (initialUnit == 6 && convert == 3) {
            length = length / 1000;
        } else if (initialUnit == 6 && convert == 4) {
            length = length / 100;
        } else if (initialUnit == 6 && convert == 5) {
            length = length / 10;
        } else if (initialUnit == 6 && convert == 6) {
            length = length * 1;
        } else if (initialUnit == 6 && convert == 7) {
            length = length * 10;
        }

        if (initialUnit == 7 && convert == 1) {
            length = length / 1000000;
        } else if (initialUnit == 7 && convert == 2) {
            length = length / 100000;
        } else if (initialUnit == 7 && convert == 3) {
            length = length / 10000;
        } else if (initialUnit == 7 && convert == 4) {
            length = length / 1000;
        } else if (initialUnit == 7 && convert == 5) {
            length = length / 100;
        } else if (initialUnit == 7 && convert == 6) {
            length = length / 10;
        } else if (initialUnit == 7 && convert == 7) {
            length = length * 1;
        }

        if (convert == 1) {
            unit = "km";
        } else if (convert == 2) {
            unit = "hm";
        } else if (convert == 3) {
            unit = "dam";
        } else if (convert == 4) {
            unit = "m";
        } else if (convert == 5) {
            unit = "dm";
        } else if (convert == 6) {
            unit = "cm";
        } else if (convert == 7) {
            unit = "mm";
        }

        //output hasil konversi
        if (convert >= 1 && convert <= 7) {
            System.out.printf("%-10s : %f %s \n", "To", length, unit);
        } else {
            System.out.println("Error!!!");
        }
        System.out.println("===============================================");

        if (convert >= 1 && convert <= 7) {
            System.out.println("Yeyy!!! Kamu Sudah Mengkonversi Jaraknya");
        } else {
            System.out.println("Yahh!!! Kamu Salah Memasukkan Pilihan :(");
        }
    }
}
