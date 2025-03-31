//Cadena.java
public class Cadena{
    String pala;

    int cantidadCaracteres(){
        return pala.length();
    }
    int cantidadPalabras(){
        int cont = 0, i;
        char c;
        for(i=0 ; i < pala.length() ; i++ ){
            c = pala.charAt(i);             //Pone en una variable char un caracter de las palabras
            if(Character.isWhitespace(c)){  //Pregunta por el espaciado en una frase 
                cont++;
                /*if(Character.isWhitespace(pala.charAt(i))){   //Si hay mas de un espacio no lo cuenta
                    cont--;
                }*/
            }
        }
        return cont+1;
    }
}