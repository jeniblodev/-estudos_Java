public class TestaSomatorio {

    public static void main(String[] args) {
        int contador = 0;
        int total = 0;

        while (contador <= 10) {
            total += contador; //total = total + contador; -> Não precisa repetir a variável, substitui pelo +|- antes do =
            contador++;

           // System.out.println(total); -> Se imprimir aqui vai mostrar toda a sequência do total pois está dentro do escopo do while
        }
        System.out.println(total);
    }
}
