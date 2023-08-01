public class Modulo09 {

    public static void main(String[] args) {

        double nota1 = 7.5;
        int nota2 = 8;
        double nota3 = 5;
        int nota4 = 9;
        double resultado;

        resultado = (nota1 + nota2 + nota3 + nota4) / 4;


        System.out.printf("A Média nota é: %.2f".formatted( resultado) );


        if (resultado >= 7){
            System.out.println(" Você esta aprovado! ");
        } else if (resultado < 7 && resultado >= 5) {
            System.out.println(" Você esta em recuperação");

        }
        else {
            System.out.println(" Você esta reprovado!");
        }


    }

}
