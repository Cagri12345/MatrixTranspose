package Arrays;
import java.util.Scanner;
public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan matrisin boyutlarını al
        System.out.println("Matrisin satır sayısını girin: ");
        int rows = input.nextInt();
        System.out.println("Matrisin sütun sayısını girin: ");
        int cols = input.nextInt();


        //Matris oluştur
        int[][] matrix = new int[rows][cols];
        int[][] transpose = new int[cols][rows];


        //Matrisin elemanlarını kullanıcıdan al
        System.out.println("Matrisin elemanlarını girin: ");
        for (int i = 0; i < rows ; i++) {
            for (int j = 0 ; j < cols ; j++) {
                System.out.print("Matris[" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }


        //Matrisin transpozesi
        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0 ; j < cols ; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }


        //Orijinal matrisi ekrana yazdır
        System.out.println("Matris: ");
        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0 ; j < cols ; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }


        //Transpozu ekrana yazdır
        System.out.println("Transpoze: ");
        for (int i = 0 ; i < cols ; i++) {
            for (int j = 0 ; j < rows ; j++) {
                System.out.print(transpose[i][j] + "   ");
            }
            System.out.println();
        }


        //Scanner'ı kapat
        input.close();

    }
}
