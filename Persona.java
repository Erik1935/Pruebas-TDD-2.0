/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

/**
 *
 * @author erikj
 */
public class Persona {
    public String Integrante(int pos,String clave){
        String tipo = "";
        if(pos==1){
            tipo = Alumno(clave);
        }else if(pos==2){
            tipo = Maestro(clave);
        }else if(pos==3){
            tipo = Intendente(clave);
        }
        return tipo;
    }
    private String Alumno(String palabra){
        String tipo = "ERROR01";
        int numero = Integer.parseInt(palabra);
        if(numero>=1000|numero<=9999){
            tipo = "Alumno";
        }
        return tipo;
    }
    private String Maestro(String palabra){
        String tipo = "ERROR02";
        String SubCadena = palabra.substring(0,1);
        String numeral = palabra.substring(2);
       
        if(SubCadena.equals("al0")&&(numeral.length()==6)){
            tipo = "Maestro";
        }else{
            return tipo;
        }
        return tipo;
    }
    private String Intendente(String palabra){
        String tipo = "ERROR02";
        String SubCadena = palabra.substring(2);
        int numero = Integer.parseInt(subCadena);
        return tipo;
    }
}
