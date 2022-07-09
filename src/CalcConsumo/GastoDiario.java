package CalcConsumo;
import java.util.*;

public class GastoDiario {
    public static void main(String[] args) {
        new Locale("pt", "BR");
        double kmDia, kmLitre, prGas, csDia;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantas km vc faz por dia.");
        kmDia = scan.nextFloat();

        new Scanner(System.in);
        System.out.println("Quantos km seu veículo faz por litro?");
        kmLitre = scan.nextFloat();

        new Scanner(System.in);
        System.out.println("Qual o preço por litro do combustivel que você utiliza?");
        prGas = scan.nextFloat();

        csDia = kmDia / kmLitre * prGas;
        if(csDia < 10.50) {
            System.out.println("Seu veículo é seu amigo, ele gasta,R$" + csDia);
        }else {
            System.out.println("Seu veículo consome, R$" + csDia + " por " + kmDia + " quilometros rodados diáriamente, reveja se esse consumo é compatível com seu padrão de vida.");
        }


    }
}
