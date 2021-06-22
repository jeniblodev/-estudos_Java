public class TestaConversao {

    public static void main(String[] args) {

        double salario = 1270.50;
        int valor = (int) salario; //chamado de casting > transforma decimais em inteiros
        System.out.println(valor);

        long numeroGrande = 32432432523l; //para números maiores ou menores que int - o l no final indica que o valor é literal
        short valorPequeno = 2131; //para números de 16 bits
        byte valorMinusculo = 127; //para numeros de 8 bits
    }
}
