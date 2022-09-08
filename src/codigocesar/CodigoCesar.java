/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigocesar;

import javax.swing.JOptionPane;

/**
 *
 * @author sofia
 */
public class CodigoCesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       codificar cod = new codificar();
       String letras="ABCDEFJHIJKLMNOPQRSTUVWXYZ";
       String numeros="1234567890";
       String frase;
       
       int opc=0,num;
       boolean cont=true;
       
       
       do{
        try{ 

            opc=Integer.parseInt(
                     JOptionPane.showInputDialog(
                             "Ingresa 1 para codificar "+
                             "y 2 para descodificar"));
            cont=false;
            if(opc <= 0 && opc>3)
            {
                JOptionPane.showMessageDialog(null,"Ingresa un numero correcto: ");
                opc=Integer.parseInt(
                     JOptionPane.showInputDialog(
                             "Ingresa 1 para codificar "+
                             "y 2 para descodificar"));
                
                cont=false;

            }
        }  
        catch(Exception e){
            cont=false;
           JOptionPane.showMessageDialog(null,"Hay un error");
        }
       }while(cont);
        

        switch(opc){

            case 1:
                
                do{
                
                    frase=JOptionPane.showInputDialog("Ingresa la frase a cifrar: ");
                    num=0;

                    try{
                        num= Integer.parseInt(
                                JOptionPane.showInputDialog("Ingresa el codex: ")
                        );
                        cont=false;
                        

                        if(num<=0){

                            JOptionPane.showMessageDialog(null,"Introduzca numeros correctos");
                            cont=false;
                        }   
                    }
                    catch(Exception e){
                        cont=false;
                        JOptionPane.showMessageDialog(null,"Hay un error");
                    }
                }while(cont);

                String cifrado=cod.codificar(letras.concat(numeros), frase, num);

                JOptionPane.showMessageDialog(null,"El texto original: "
                        +frase+
                        "\nTexto Codificado a "
                        +num+
                        "Posiciones: "
                        +cifrado);
                break;

            case 2:

                frase=JOptionPane.showInputDialog("Ingresa la frase a decifrar: ");
                
                do{
                    num=0;

                    try{
                        num= Integer.parseInt(
                                JOptionPane.showInputDialog("Ingresa el codex: ")
                        );
                        cont=false;

                        if(num<=0){

                            JOptionPane.showMessageDialog(null,"Introduzca numeros correctos");
                            cont=false;
                        }   
                    }
                    catch(Exception e){
                        cont=false;
                        JOptionPane.showMessageDialog(null,"Hay un error");
                    }
                }while(cont);

                String descifrado=cod.desCodificar(letras.concat(numeros), frase, num);

                JOptionPane.showMessageDialog(null,"El texto original: "
                        +frase+
                        "\nTexto Codificado a "
                        +num+
                        "Posiciones: "
                        +descifrado);

             break;
    
        }
        
     
       
    }
    
}
