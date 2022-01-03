/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.java.praktikum.b.tiga;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import praktikum.java.praktikum.b.tiga.logicalProcess; //import class logicalprocess
    
/**
 *
 * @author ira
 */

@Controller
@ResponseBody
public class projectController {
    
    @RequestMapping("perhitungan")
    public String getHasil(){
        String hasil = "";
        
        int angka1 =2;
        int angka2 =5;
        
        int hitung = angka1 * angka2; //proses komputasi
        
        hasil = "Hasil perkalian = " + hitung;
        
        return hasil;
    }
    
    logicalProcess logic = new logicalProcess();
    
    @RequestMapping("/tampilanhello")
    public String tampilkan(){
        String view = logic.getHello(); //proses untuk memanggil si getHello
        
        return view;
    }
    
    @RequestMapping("/tampilanjarak")
    public String tampiljarak(){
        
        int jarak = logic.getJarak(36000);
        
        String view = "Hasil = " + jarak;
        
        return view;
    }
    
    @RequestMapping("/tampilanformatting")
    public String tampilkanjarak(){
        
        double jarak = logic.getLuasPP();
        
        String view = "Hasil = " + jarak;
        
        return view;
    }
}