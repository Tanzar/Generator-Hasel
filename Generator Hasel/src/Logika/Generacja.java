/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logika;

import java.util.Random;

/**
 *
 * @author SPAKOWSKI
 */
public class Generacja {
    private boolean Duze;
    private boolean Znaki;
    private boolean Cyfry;
    private int ilosc;
    private Random gen;
    
    public Generacja(){
        this.Duze = false;
        this.Cyfry = false;
        this.Znaki = false;
        this.ilosc = 10;
        gen = new Random();
    }
    
    private int losuj(int minimum, int maximum){
        int wynik;
        wynik = minimum+gen.nextInt(maximum);
        return wynik;
    }
    
    public String Generuj(){
        String wynik = "";
        int kod = 0;
        boolean trafil = false;
        
        for (int i=0; i<this.ilosc; i++){
            char znak = ' ';
            trafil = false;
            while(trafil == false){
                kod = losuj(0, 3);
                
                switch(kod){
                    case 0://litera
                        znak = litera(losuj(1, 24));
                        trafil = true;
                        break;
                    case 1://duza litera
                        if(this.Duze == true){
                            znak = literaD(losuj(1, 24));
                            trafil = true;
                        }
                        break;
                    case 2://cyfra
                        if(this.Cyfry == true){
                            znak = cyfry(losuj(0, 9));
                            trafil = true;
                        }
                        break;
                    case 3://znak
                        if(this.Znaki == true){
                            znak = znaki(losuj(1, 6));
                            trafil = true;
                        }
                        break;
                }
            }
            
            
            wynik = wynik + znak;
        }
        
        return wynik;
    }
    
    //1-6
    private char znaki(int numer){
        char wynik = ' ';
        switch (numer){
            case 1:
                wynik = '!';
                break;
            case 2:
                wynik = '@';
                break;
            case 3:
                wynik = '#';
                break;
            case 4:
                wynik = '$';
                break;
            case 5:
                wynik = '%';
                break;
            case 6:
                wynik = '*';
                break;
        }
        return wynik;
    }
    
    //0-9
    private char cyfry(int numer){
        char wynik = ' ';
        switch (numer){
            case 0:
                wynik = '0';
                break;
            case 1:
                wynik = '1';
                break;
            case 2:
                wynik = '2';
                break;
            case 3:
                wynik = '3';
                break;
            case 4:
                wynik = '4';
                break;
            case 5:
                wynik = '5';
                break;
            case 6:
                wynik = '6';
                break;
            case 7:
                wynik = '7';
                break;
            case 8:
                wynik = '8';
                break;
            case 9:
                wynik = '9';
                break;
        }
        return wynik;
    }
    
    //1-24
    private char litera(int numer){
        char wynik = ' ';
        
        switch (numer){
            case 1:
                wynik = 'a';
                break;
            case 2:
                wynik = 'b';
                break;
            case 3:
                wynik = 'c';
                break;
            case 4:
                wynik = 'd';
                break;
            case 5:
                wynik = 'e';
                break;
            case 6:
                wynik = 'f';
                break;
            case 7:
                wynik = 'g';
                break;
            case 8:
                wynik = 'h';
                break;
            case 9:
                wynik = 'i';
                break;
            case 10:
                wynik = 'j';
                break;
            case 11:
                wynik = 'k';
                break;
            case 12:
                wynik = 'l';
                break;
            case 13:
                wynik = 'm';
                break;
            case 14:
                wynik = 'n';
                break;
            case 15:
                wynik = 'o';
                break;
            case 16:
                wynik = 'u';
                break;
            case 17:
                wynik = 'p';
                break;
            case 18:
                wynik = 'r';
                break;
            case 19:
                wynik = 's';
                break;
            case 20:
                wynik = 't';
                break;
            case 21:
                wynik = 'w';
                break;
            case 22:
                wynik = 'x';
                break;
            case 23:
                wynik = 'y';
                break;
            case 24:
                wynik = 'z';
                break;
        }
        
        return wynik;
    }
    
    //1-24
    private char literaD(int numer){
        char wynik = ' ';
        
        switch (numer){
            case 1:
                wynik = 'A';
                break;
            case 2:
                wynik = 'B';
                break;
            case 3:
                wynik = 'C';
                break;
            case 4:
                wynik = 'D';
                break;
            case 5:
                wynik = 'E';
                break;
            case 6:
                wynik = 'F';
                break;
            case 7:
                wynik = 'G';
                break;
            case 8:
                wynik = 'H';
                break;
            case 9:
                wynik = 'I';
                break;
            case 10:
                wynik = 'J';
                break;
            case 11:
                wynik = 'K';
                break;
            case 12:
                wynik = 'L';
                break;
            case 13:
                wynik = 'M';
                break;
            case 14:
                wynik = 'N';
                break;
            case 15:
                wynik = 'O';
                break;
            case 16:
                wynik = 'U';
                break;
            case 17:
                wynik = 'P';
                break;
            case 18:
                wynik = 'R';
                break;
            case 19:
                wynik = 'S';
                break;
            case 20:
                wynik = 'T';
                break;
            case 21:
                wynik = 'W';
                break;
            case 22:
                wynik = 'X';
                break;
            case 23:
                wynik = 'Y';
                break;
            case 24:
                wynik = 'Z';
                break;
        }
        
        return wynik;
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
    
}
