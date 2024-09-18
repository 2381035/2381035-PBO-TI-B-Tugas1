package Tugas1;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Masukkan ukuran tangga(n)");
        int n = scanner.nextInt();

        cetakTangga(n);
    }
    public static void cetakTangga(int n){
        for (int i = 1; i <=n; i++){
            System.out.println("#");
        }
        System.out.println();
    }
}
