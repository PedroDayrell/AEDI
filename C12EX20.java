package etapa3;

import java.util.Scanner;

public class C12EX20 {
    // Autor: Pedro Augusto Barros Dayrell;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int vet[]= new int[10];
        int soma=0, cont=0;
        double media=0;

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe um número inteiro: ");
            vet[i] = teclado.nextInt();
        }

        System.out.println("Números maiores que o último: ");

        for (int i = 0; i < vet.length; i++) {
            if (vet[i]>vet[vet.length-1]) {
                System.out.print(vet[i]+"  "+"\n");
                cont++;
                soma+=vet[i];
            }
        }

        media = (float) soma/cont;
        System.out.println("A média dos números que são maiores que o último número do vetor é: "+media);
    }
}
