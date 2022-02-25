/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q8;

import java.util.Scanner;

/**
 *
 * @author taysa
 */
public class Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int linha, coluna, linha2, coluna2;
        System.out.print("Informe a quantidade de linhas da primeira matriz: ");
        linha = sc.nextInt();
        System.out.print("Informe a quantidade de colunas da primeira matriz: ");
        coluna = sc.nextInt();
        System.out.print("Informe a quantidade de linhas da segunda matriz, de forma que seja igual ao número de colunas da primeira: ");
        linha2 = sc.nextInt();
        System.out.print("Informe a quantidade de colunas da segunda matriz: ");
        coluna2 = sc.nextInt();
        int A[][] = new int[linha][coluna];
        int B[][] = new int[linha2][coluna2];
        int C[][] = new int[linha][coluna2];
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print("Informe o elemento da linha " + i + " " + "coluna " + j + "da matriz A :");
                A[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < linha2; i++) {
            for (int j = 0; j < coluna2; j++) {
                System.out.print("Informe o elemento da linha " + i + " " + "coluna " + j + "da matriz B :");
                B[i][j] = sc.nextInt();

            }
        }
        if (coluna == linha2) {
            for (int i = 0; i < linha; i++) {
                for (int j = 0; j < coluna2; j++) {
                    for (int c = 0; c < coluna; c++) {
                        C[i][j] += A[i][c] * B[c][j];
                    }
                }
            }
            for(int i=0;i<linha;i++){
                for(int j=0;j<coluna2;j++){
                     System.out.print(C[j][i]+"  ");
                }
                System.out.println("");
            }

        }
    }
    
}
