package exameespecial;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ex039 {
    public static void main(String[] args) {
        String nome;
        double salario, reajuste;
        List<String> listadenomes = new ArrayList<String>();
        List<Double> listadesalarios = new ArrayList<Double>();

        Scanner teclado = new Scanner(System.in);

        System.out.println("\n"+"Digite X para interromper a entrada de dados. "+"\n");

        do {
            System.out.print("Digite o nome do funcionário: ");
            nome = teclado.nextLine();
            if (!nome.equalsIgnoreCase("X")) {
                listadenomes.add(nome);
                System.out.println("Agora, informe o salário do funcionário: ");
                salario = teclado.nextDouble();
                teclado.nextLine();
                listadesalarios.add(salario);
            }
        } while (!nome.equalsIgnoreCase("X"));

        System.out.print("\n"+"Informe o índice de reajuste salarial: ");
        reajuste = teclado.nextDouble();

        for (int i = 0; i < listadesalarios.size(); i++) {
            if (listadesalarios.get(i)<1000) {
                listadesalarios.set(i, listadesalarios.get(i) + (listadesalarios.get(i) * reajuste / 100));
            }
        }

        for (int i = 0; i < listadenomes.size(); i++) {
            System.out.print("Nome do funcionário: "+listadenomes.get(i)+"\n"+"Salário: R$ "+listadesalarios.get(i)+"\n");
        }

        teclado.close();
    }
}
