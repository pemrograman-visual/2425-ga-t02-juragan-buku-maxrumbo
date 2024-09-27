// 12S24037 - Maxwell Rumahorbo
// 12S24030 - Swasti Sihombing

import java.util.*;
import java.lang.Math;

public class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int stok, tahunterbit;
        String isbn, judul, penulis, penerbit, formatbukuelektrik, none, kategori;
        double hargapembelian, minimummargin, rating;

        isbn = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahunterbit = input.nextInt();
        penerbit = input.nextLine();
        formatbukuelektrik = input.nextLine();
        hargapembelian = input.nextDouble();
        minimummargin = input.nextDouble();
        stok = input.nextInt();
        rating = input.nextDouble();
        if (rating >= 4.7) {
            kategori = "Best Pick";
        } else {
            if (rating >= 4.5) {
                kategori = "Must Read";
            } else {
                if (rating >= 4.0) {
                    kategori = "Recommended";
                } else {
                    if (rating >= 3.0) {
                        kategori = "Average";
                    } else {
                        if (rating >= 0 && rating < 3.0) {
                            kategori = "Low";
                        } else {
                            kategori = "none";
                        }
                    }
                }
            }
        }
        System.out.println(isbn + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbukuelektrik + "|" + hargapembelian + "|" + minimummargin + "|" + stok + "|" + rating + "|" + kategori);
    }
}
