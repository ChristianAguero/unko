/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.unko.negocio;

/**
 *
 * @author shiri
 */
public class Operacion {
    
    public String sacarCurp(String nombre, String apellidoPaterno, String apellidoMaterno, int diaNacimiento, String mesNacimiento, int anioNacimiento, String sexo, String estadoNacimiento){
        
        String curp = "";
        nombre = nombre.toUpperCase().trim();
        apellidoPaterno = apellidoPaterno.toUpperCase().trim();
        apellidoMaterno = apellidoMaterno.toUpperCase().trim();
        char[] letrasNombre = nombre.toCharArray();
        char[] letrasApellidoPaterno = apellidoPaterno.toCharArray();
        char[] letrasApellidoMaterno = apellidoMaterno.toCharArray();
        String dia = Integer.toString(diaNacimiento);
        String mes = "";
        String anio = Integer.toString(anioNacimiento);
        char[] letrasSexo = sexo.toCharArray();
        String estado = "";
        
        
        switch(mesNacimiento){
            
            case"Enero":
                mes = "01";
                break;
            case"Febrero":
                mes = "02";
                break;
            case"Marzo":
                mes = "03";
                break;
            case"Abril":
                mes = "04";
                break;
            case"Mayo":
                mes = "05";
                break;
            case"Junio":
                mes = "06";
                break;
            case"Julio":
                mes = "07";
                break;
            case"Agosto":
                mes = "08";
                break;
            case"Septiembre":
                mes = "09";
                break;
            case"Octubre":
                mes = "10";
                break;
            case"Noviembre":
                mes = "11";
                break;
            case"Diciembre":
                mes = "12";
                break;
            
        }
        
        switch(estadoNacimiento){
            
            case"Aguascalientes":
                estado = "AS";
                break;
            case"Baja California":
                estado = "BC";
                break;
            case"Baja California Sur":
                estado = "BS";
                break;
            case"Campeche":
                estado = "CC";
                break;
            case"Coahuila":
                estado = "CL";
                break;
            case"Colima":
                estado = "CM";
                break;
            case"Chiapas":
                estado = "CS";
                break;
            case"Chihuahua":
                estado = "CH";
                break;
            case"Ciudad de México":
                estado = "DF";
                break;
            case"Durango":
                estado = "DG";
                break;
            case"Guanajuato":
                estado = "GT";
                break;
            case"Guerrero":
                estado = "GR";
                break;
            case"Hidalgo":
                estado = "HG";
                break;
            case"Jalisco":
                estado = "JC";
                break;
            case"México":
                estado = "MC";
                break;
            case"Michoacán":
                estado = "MN";
                break;
            case"Morelos":
                estado = "MS";
                break;
            case"Nayarit":
                estado = "NT";
                break;
            case"Nuevo León":
                estado = "NL";
                break;
            case"Oaxaca":
                estado = "OC";
                break;
            case"Puebla":
                estado = "PL";
                break;
            case"Querétaro":
                estado = "QT";
                break;
            case"San Luis Potosí":
                estado = "SP";
                break;
            case"Sinaloa":
                estado = "SL";
                break;
            case"Sonora":
                estado = "SR";
                break;
            case"Tabasco":
                estado = "TC";
                break;
            case"Tamaulipas":
                estado = "TS";
                break;
            case"Tlaxcala":
                estado = "TL";
                break;
            case"Veracruz":
                estado = "VZ";
                break;
            case"Yucatán":
                estado = "YN";
                break;
            case"Zacatecas":
                estado = "ZS";
                break;
            case"Nacido en el Extranjero":
                estado = "NE";
                break;
            case"Quintana Roo":
                estado = "QR";
                break;
            
        }
        
        if(mes.equals("04") && mes.equals("06") && mes.equals("09") && mes.equals("11") && dia.equals("02")){
            
            if(mes.equals("04") && mes.equals("06") && mes.equals("09") && mes.equals("11")){
            
                if(dia.equals("31")){

                    

                }
                
            }
            
            if(mes.equals("02")){
            
                if(dia.equals("30") || dia.equals("31")){

                    

                }
                
            }
            
        }
        
        return curp;
        
    }
    
}
