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
    
    public String sacarCurp(String nombre, String apellidoPaterno, String apellidoMaterno, String diaNacimiento, String mesNacimiento, int anioNacimiento, String sexo, String estadoNacimiento){
        
        String curp = "";
        nombre = nombre.toLowerCase().trim()
                .replace("á", "a").replace("í", "i").replace("ú", "u").replace("é", "e").replace("ó", "o")
                .toUpperCase();
        String[] arrayNombre = nombre.toLowerCase().split(" ");
        apellidoPaterno = apellidoPaterno.trim()
                .replace("á", "a").replace("í", "i").replace("ú", "u").replace("é", "e").replace("ó", "o")
                .toUpperCase();
        apellidoMaterno = apellidoMaterno.toLowerCase().trim()
                .replace("á", "a").replace("í", "i").replace("ú", "u").replace("é", "e").replace("ó", "o")
                .toUpperCase();
        char[] letrasNombre1 = arrayNombre[0].toCharArray();
        char[] letrasNombre2 = arrayNombre[1].toCharArray();
        char[] letrasApellidoPaterno = apellidoPaterno.toCharArray();
        char[] letrasApellidoMaterno = apellidoMaterno.toCharArray();
        String dia = diaNacimiento;
        char[] letrasDia = dia.toCharArray();
        String mes = "";
        String stringAnio = Integer.toString(anioNacimiento);
        char[] anio = stringAnio.toCharArray();
        char[] letrasSexo = sexo.toCharArray();
        String estado = "";
        int contador1 = 0;
        int contador2 = 0;
        int i = 0;
        int j = 1;
        
        
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
        
        char[] letrasMes = mes.toCharArray();
        
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
        
        char[] letrasEstado = estado.toCharArray();
        
        if(mes.equals("04") && mes.equals("06") && mes.equals("09") && mes.equals("11") && dia.equals("02")){
            
            if(mes.equals("04") && mes.equals("06") && mes.equals("09") && mes.equals("11")){
            
                if(dia.equals("31")){

                    

                }else{
                
                contador1 = 1;
                
                }
                
            }
            
            if(mes.equals("02")){
            
                if(dia.equals("30") || dia.equals("31")){

                    

                }else{
                
                contador1 = 1;
                
                }
                
            }
            
        }
        
        if(nombre.equals("") || apellidoPaterno.equals("") || stringAnio.equals("")){
            
            
            
        }else{
            
            contador2 = 1;
            
        }
        
        if(contador1 == 1 && contador2 == 1){
            
            curp += letrasApellidoPaterno[0];
            
            do{
                
                if (letrasApellidoPaterno[j] == 'A' || letrasApellidoPaterno[j] == 'E' || letrasApellidoPaterno[j] == 'I' || letrasApellidoPaterno[j] == 'O' || letrasApellidoPaterno[j] == 'U'){
                    
                    curp += letrasApellidoPaterno[j];
                    i++;
                    
                }
                
                j++;
                        
            }while(i == 0);
            
            if(apellidoMaterno.equals("")){
                
                curp += 'X';
                
            }else{
                
                curp += letrasApellidoMaterno[0];
                
            }
            
            if(arrayNombre[1].equals("")){
               
                curp += letrasNombre1[0];
                
            }else{
            
                if(arrayNombre[0].equals("JOSE") || arrayNombre[0].equals("MARIA")){
                    
                    curp += letrasNombre2[0];
                    
                }else{
                    
                    curp += letrasNombre1[0];
                    
                }
                    
            }
            
            curp += anio[2];
            curp += anio[3];
            curp += letrasMes[0];
            curp += letrasMes[1];
            curp += letrasDia[0];
            curp += letrasDia[1];
            curp += letrasSexo[0];
            curp += letrasEstado[0];
            curp += letrasEstado[1];
            i = 0;
            j = 1;
            
            do{
                
                if (letrasApellidoPaterno[j] == 'A' || letrasApellidoPaterno[j] == 'E' || letrasApellidoPaterno[j] == 'I' || letrasApellidoPaterno[j] == 'O' || letrasApellidoPaterno[j] == 'U'){
                    
                    
                    
                }else{
                    
                    curp += letrasApellidoPaterno[j];
                    
                }
                
                j++;
                
            }while(i == 0);
            
            if(apellidoMaterno.equals("")){
                
                curp += 'X';
                
            }else{
                
                i = 0;
                j = 1;
                
                do{
                
                    if (letrasApellidoMaterno[j] == 'A' || letrasApellidoMaterno[j] == 'E' || letrasApellidoMaterno[j] == 'I' || letrasApellidoMaterno[j] == 'O' || letrasApellidoMaterno[j] == 'U'){
                    
                    
                    
                    }else{
                    
                        curp += letrasApellidoMaterno[j];
                    
                    }
                
                    j++;
                
                }while(i == 0); 
                
            }
            
            i = 0;
            j = 1;
                
            do{
                
                if (letrasNombre1[j] == 'A' || letrasNombre1[j] == 'E' || letrasNombre1[j] == 'I' || letrasNombre1[j] == 'O' || letrasNombre1[j] == 'U'){
                    
                    
                    
                }else{
                    
                    curp += letrasNombre1[j];
                    
                }
                
                j++;
                
            }while(i == 0);
            
            if(anioNacimiento <= 1999){
                
                curp += '1';
                
            }else{
                
                curp += 'A';
                
            }
            
            curp += '1';
            
        }else{
            
            curp = "Error, no se puede generar la curp con los datos proporcionados";
            
        }
        
        return curp;
        
    }
    
}
