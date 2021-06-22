public class TestaCondicional2 {

    public static void main(String[] args) {

        System.out.println("testando condicionais");

        int idade = 16;
        boolean acompanhado = true; //pode ser uma expressão booleana >> boolean acompanhado = quantidadePessoas >= 2

        if (idade >=18 && acompanhado) { //não precisa colocar == true pois já está implícito na variável
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("Infelizmente você não pode entrar");
        }
    }
}
