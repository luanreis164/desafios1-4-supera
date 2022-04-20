import java.util.Scanner;

public class desafio4 {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantida de linhas:");
        int n = leitor.nextInt();


            for (int i = 0; i < n; i++) {
                System.out.println("Digite a linha: ");
                String frase = readLine(leitor);

                //Dividindo a frase na primeira metade para inverter-la
                StringBuilder parte1 = new StringBuilder(frase.substring(0, frase.length() / 2));

                //"Pegando" a outra metade para inverter-la
                StringBuilder parte2 = new StringBuilder(frase.substring(frase.length() / 2));
                parte1.reverse();
                parte2.reverse();
                System.out.println(parte1 + parte2.toString());
            }
    }

        public static String readLine(Scanner leitor) {
            String line = leitor.nextLine();
            while (line.isEmpty())
                line = leitor.nextLine();
            return line;
    }
}
