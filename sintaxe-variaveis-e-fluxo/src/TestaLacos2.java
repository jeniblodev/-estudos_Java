public class TestaLacos2 {

    public static void main(String[] args) {
        for (int linha = 0; linha < 10; linha++) {
            for (int coluna = 0; coluna < 10; coluna++) {
                if (coluna >= linha) {   // ao invés de usar o if com break poderia ter colocado no booleano do segundo for -> coluna <= linha
                    break; // para o laço mais interno
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
