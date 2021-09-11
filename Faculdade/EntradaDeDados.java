import java.util.Scanner;
public class EntradaDeDados {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um número: ");
        String valor = entrada.nextLine();
        entrada.close();
        System.out.println("valor digitado: " + valor);

    }
}
