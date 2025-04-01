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
                if(Character.isWhitespace(pala.charAt(i+1))){   //Si hay mas de un espacio no lo cuenta
                    cont--;
                }
            }
        }
        return cont+1;
    }
    int cantidadVocales(){
        int contVoc = 0 ,i;
        char c;
        for(i=0 ; i < pala.length() ; i++ ){
            c = pala.charAt(i);
            if(Character.isLetter(c)){//verifica que sea una letra 
                if(c != Character.toLowerCase(c)){
                    c= Character.toLowerCase(c); //Convierte a minuscula el caracter
                }
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                    contVoc++;
                }
            }
        }
        return contVoc;
    }
    int cantidadConsonantes(){
        int contCons = 0, i;
        char c;
        for(i=0; i< pala.length() ; i++){
            c = pala.charAt(i);
            if(Character.isLetter(c)){
                if(c!=Character.toLowerCase(c)){
                    c = Character.toLowerCase(c);
                }
                if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u'){
                    contCons++;
                }
            }
        }
        return contCons;
    }
}