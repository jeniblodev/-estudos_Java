public class TestaEscopo {

    public static void main(String[] args) {

        System.out.println("testando condicionais");

        int idade = 16;
        int quantidadePessoas = 3;
       // boolean acompanhado = quantidadePessoas >= 2;


        boolean acompanhado;
        if (quantidadePessoas >= 2) {
            acompanhado = true; //se essa variável fosse criada aqui existiria somente dentro do escopo > entre as {}
        } else {
            acompanhado = false;
        }
        System.out.println("O valor de acompanhado é = " + acompanhado);
    }
}