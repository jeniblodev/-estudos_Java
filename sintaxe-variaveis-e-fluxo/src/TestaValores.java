import sun.awt.geom.AreaOp;

public class TestaValores {

    public static void main(String[] args) {

        int primeiroNumero = 5;
        int segundoNumero = 7;

        segundoNumero = primeiroNumero;
        primeiroNumero = 10;

        System.out.println(segundoNumero);
    }
}
