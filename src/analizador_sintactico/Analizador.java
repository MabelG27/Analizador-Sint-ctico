package analizador_sintactico;

public class Analizador {

    static char Tipo_Token;

    private Lista_Caracteres ultimo_caracter;

    public Analizador() {
        ultimo_caracter = null;

    }
//Metodo para guardar caracteres ingresados   

    public void caracteres_ingresados(char valor) {

        Lista_Caracteres caracter = new Lista_Caracteres();
        caracter.cadena = valor; //Se guarda el valor ingresado

        if (ultimo_caracter == null) {
            caracter.siguiente = null;
            ultimo_caracter = caracter;
        } else {
            caracter.siguiente = ultimo_caracter;
            ultimo_caracter = caracter;
        }

    }

    //Método para extraer caracter por caracter  
    public char extraer_caracteres() {
        
        if (ultimo_caracter!=null ) {
            
            char valor  = ultimo_caracter.cadena;
            ultimo_caracter = ultimo_caracter.siguiente;
            return  valor;
        }else{
            
            return Character.MAX_VALUE;
        }

    }
    
  //Método para saber si es una cadena vacia 
    public boolean Comprobar_Cadena_Vacia(){
        return ultimo_caracter == null;
        
    }
   
}
