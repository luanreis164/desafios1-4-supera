import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class desafio1 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        List<Integer> listaNumeros = new ArrayList<>();

        System.out.println("Digite o quantidade de numeros que serao digitados:");
        int numeros = scanner.nextInt();

        System.out.println("Digite os numeros:");
        for (int i = 0; i < numeros; i++) {
            listaNumeros.add(scanner.nextInt());
        }

        /* Usando metodo stream e filter para filtar por par ou impar,
         metodo sorted com parametro para inverter a ordem com o Comparator e adicionando na lista com o collect; */
        var pares = listaNumeros.stream().filter(l -> l % 2 == 0).sorted().collect(Collectors.toList());
        var impares = listaNumeros.stream().filter(l -> l % 2 != 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        List<Integer> total = new ArrayList<>();

        total.addAll(pares);
        total.addAll(impares);

        total.forEach(System.out::println);

    }


}
