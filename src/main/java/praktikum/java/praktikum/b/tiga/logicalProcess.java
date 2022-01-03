/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.java.praktikum.b.tiga;

import java.text.DecimalFormat;

/**
 *
 * @author ira
 */
public class logicalProcess {
    
    public String getHello(){
        return"Hello World";
    }
    
    public int getJarak(int meter){
        
        int km = meter/1000;
        
        return km;
    }
    
    public double getLuasPP(){
        
        double hasil = 5.000;
               
        String pattern = "#0.00";
        DecimalFormat formatdesimal = new DecimalFormat(pattern);
        
        String a = formatdesimal.format(hasil);
        
        double parsingnumber = Double.parseDouble(a);
        
        return parsingnumber;
    }
}