import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class desafio3 {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        List<Integer> listaNumeros = new ArrayList<>();

        int resultado = 0;
        int tamanhoLista,valorAlvo;

        System.out.printf("Informe o tamanho da lista:");
        tamanhoLista = scanner.nextInt();

        System.out.printf("Informe o valor alvo:");
        valorAlvo = scanner.nextInt();

        System.out.println("Informe os numeros da lista:");
        for (int i = 0; i < tamanhoLista; i++) {
            listaNumeros.add(scanner.nextInt());
        }

        for(Integer num : listaNumeros){
            for (Integer numComparado : listaNumeros) {
                boolean aux = (num - numComparado == valorAlvo | numComparado - num == valorAlvo);
                if(numComparado - num == valorAlvo |  numComparado - num == valorAlvo) {
                    resultado++;
                 }
                System.out.println("Num: " + numComparado + " - " + num + " - Sobra " + valorAlvo + "? - Resultado: " + aux);
            }
            System.out.println("-----------");
        }
        System.out.println("Resultado: " + resultado);
    }

}
