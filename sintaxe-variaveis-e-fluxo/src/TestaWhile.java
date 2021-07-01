public class TestaWhile {

    public static void main(String[] args) {

        int contador = 0;
        while(contador <= 10) {
            System.out.println(contador);
            contador += 1;  // contador = contador + 1; ou contador++; se for adicionar só uma unidade
        }
        System.out.println(contador);
    }
}
