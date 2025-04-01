public class Principal {
    public static void main(String[] args) {
        Cadena n = new Cadena();
        int cantC, cantP, cantVo, cantConso;

        n.pala ="hola chicos de POO 2025" ;
        cantC = n.cantidadCaracteres();
        cantP = n.cantidadPalabras();
        cantVo = n.cantidadVocales();
        cantConso = n.cantidadConsonantes();

        System.out.println("Frase utilizada: " + n.pala);
        System.out.println("Cantidad de Caracteres: " + cantC);
        System.out.println("Cantidad de Palabras: " + cantP);
        System.out.println("Cantidad de Vocales: " + cantVo);
        System.out.println("Cantidad de Consonates: " + cantConso);
    }   
}
