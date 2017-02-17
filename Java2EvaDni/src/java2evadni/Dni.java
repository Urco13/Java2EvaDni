/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2evadni;

/**
 *
 * @author dam115
 */
public class Dni {
    private static String[] codigo={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
    public Dni(String dni){
       
    }
    
    public String numeroDni(String numeroDni){
        String numero;
        numero = numeroDni.substring(0, 8);
        return numero;
    }
    public String letraDni(String letraDni){
        String letra;
        letra = letraDni.substring(8);
        return letra;
    }
    public void comprobacion(String numeroDni, String letraDni){
       
    }
    public boolean comprobacionNumero(String numeroDni) throws ExcepcionesDni{
        boolean sw=true;
        for (int i = 0; i < numeroDni.length(); i++) {
            if (Character.isDigit(numeroDni.charAt(i))) {
            }else{
                throw new ExcepcionesDni(1);
            }
        }
        return sw;
    }
    public boolean comprobacionLetra(String letraDni, String numeroDni) throws ExcepcionesDni{
        boolean sw=true;
        int numero;
        numero=Integer.parseInt(numeroDni);
        if (letraDni.compareTo(codigo[numero%23])) {
            
        }
        
       
       
        if(!Character.isDigit(letraDni.charAt(0))){
        }else{
            throw new ExcepcionesDni(2);
        }
        return sw;
    }
    
    
}//fin class
