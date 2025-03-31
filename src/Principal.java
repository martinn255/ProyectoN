public class Principal {
    public static void main(String[] args) {
        Cadena n = new Cadena();
        int cantC, cantP;

        n.pala ="hola chicos de POO 2025" ;
        cantC = n.cantidadCaracteres();
        cantP = n.cantidadPalabras();

        System.out.println(n.pala);
        System.out.println(cantC);
        System.out.println(cantP);
    }
}
