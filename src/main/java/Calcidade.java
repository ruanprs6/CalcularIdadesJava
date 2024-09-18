import java.util.Scanner;


public class Calcidade {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //declarando quais variaveis teremos
        Double anoAtual;
        Double anoNascimento;


        //Requisitar valor para as variaveis
        System.out.println("Digite o ano atual:");
        anoAtual = scanner.nextDouble();

        System.out.println("Digite o ano em que nasceu:");
        anoNascimento = scanner.nextDouble();

        System.out.println("A idade referente as estas datas é:" + realizarcalculo (anoAtual, anoNascimento));
    }
    public static Double realizarcalculo(Double anoAtual,Double anoNascimento){
        Double respostacalculo = 0.0;

        if (anoAtual > anoNascimento){

                respostacalculo = anoAtual - anoNascimento;
        }
        else {
            System.out.println("A data atual não pode ser menor que a data de nascimento!!");
        }
        return respostacalculo;



    }

}
