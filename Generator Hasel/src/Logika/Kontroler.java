/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logika;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author SPAKOWSKI
 */
public class Kontroler {
    Generacja Generator;
    private boolean Duze;
    private boolean Znaki;
    private boolean Cyfry;
    private int ilosc;
    
    
    public Kontroler(){
        this.Generator = new Generacja();
        this.Duze = false;
        this.Cyfry = false;
        this.Znaki = false;
        this.ilosc = 10;
    }
    
    public void setDuze(boolean D){
        this.Duze = D;
    }
    
    public void setZnaki(boolean Z){
        this.Znaki = Z;
    }
    
    public void setCyfry(boolean C){
        this.Cyfry = C;
    }
    
    public void setIlosc(int I){
        this.ilosc = I;
    }
    
    public String generuj(){
        String has = " ";
        
        this.Generator.setCyfry(this.Cyfry);
        this.Generator.setDuze(this.Duze);
        this.Generator.setIlosc(this.ilosc);
        this.Generator.setZnaki(this.Znaki);
        has = this.Generator.Generuj();
        
        return has;
    }
    
    public int dopisz(String tekst){
        int kod = 0;
        
        try{
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("lista.txt", true)));
            
            out.append(tekst+System.lineSeparator());
            
            out.close();
        }
        catch(IOException e){
            kod = 1;
        }
        
        return kod;
    }
}
