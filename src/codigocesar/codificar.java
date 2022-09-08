/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigocesar;

/**
 *
 * @author sofia
 */
public class codificar {
    
    String textoCod="",textoDesCod="";
    
    
    public String codificar(String letras,String texto, int codex){
        texto=texto.toUpperCase();
        char caracter;
        for(int i =0;i<texto.length();i++){
            
            caracter=texto.charAt(i);
            int posicion= letras.indexOf(caracter);
            if(posicion == -1){
                textoCod+=caracter;
            }else{
                textoCod+=letras.charAt((posicion+codex)%letras.length());
            }
           
        }
        System.out.println(textoCod);
        return textoCod;
    }
    
    
    
      
    public String desCodificar(String letras,String texto, int codex){
        texto=texto.toUpperCase();
        char caracter;
        for(int i =0;i<texto.length();i++){
            
            caracter=texto.charAt(i);
            int posicion= letras.indexOf(caracter);
            if(posicion == -1){
                textoDesCod+=caracter;
            }
            else{
                textoDesCod+=letras.charAt((posicion-codex)%letras.length());
            }
           
        }
        System.out.println(textoDesCod);
        return textoDesCod;
    }
    
}
