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
public class ExcepcionesDni extends Exception{
    private int error;
    public ExcepcionesDni(int error){
        this.error=error;
    }
    @Override
    public String getMessage(){
        switch (this.error) {
            case 1:return "Contiene caracteres que no son digitos";
            case 2:return "No es correcto el ultimo digito tiene que ser una letra";
            case 3:return "La letra de tu dni no es correcta";
            default: return "Esto es un error";
                
        }
    }
}//fin class
