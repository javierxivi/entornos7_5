
package prop04ej01;

import Sleer2.SLeer2;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * @author Javier
 * @version 1.0 15 de Enero de 2018
 */
public class Prop04Ej01 {

   /**
    * Pide datos al usuario
    * @return devuelve el dato
    */
    public static int pedirDato(){
        
        int num;
     do{
        num = SLeer2.datoInt("Introduce el tamaño de la matriz(0 para salir): ");
     
        if(num<0){
            System.out.print("pon un numero positivo");
        }
     }while(num <0);
     return num;
    }
    /**
     * Encuentra de forma recursiva cada número de la matriz
     * @param fila
     * @param columna
     * @return int devuelve el número
     */
    public static int elemento(int fila, int columna){
        if(fila <1 || columna < 1) return 0;
        if (columna == 1 || fila ==1) return 1;
        return elemento(fila-1,columna)+elemento(fila,columna-1);
  
    }
    /**
     * Imprime la matriz
     * @param num 
     */
    public static void matriz(int num){
        int max;
        String blanco = "";
        String format = "";
        max = elemento(num,num);
        while(max>0){
            max = max/10;
            blanco += " ";
            format += "0";
        }
        
        NumberFormat formatter = new DecimalFormat(format);
            
            for(int i = 1; i<num+1; i++){
            System.out.println("");
            for (int j=0; j<num+1;j++){
                int dato = elemento(i,j);
                if (dato > 0 )System.out.print(formatter.format(dato)+blanco);
                
        }
            }
    }
    
        
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        int num;
        int max;
        int longitud;
        num=pedirDato();
        matriz(num);
       
        while (num!=0){
             num=pedirDato();
            matriz(num);
        }
        
        
        
               
            }
        }
        
        
    
    

