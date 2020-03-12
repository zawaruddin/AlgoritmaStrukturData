/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasminggu3;

/**
 *
 * @author Daffa Cahyo
 */
public class nilaiObject {
    public String namaMhs;
    public int nilaiTugas, nilaiQuiz, nilaiUTS, nilaiUAS;
    
    public nilaiObject(){
        
    }
    
    public nilaiObject(String namaMhs, int nilaiTugas, int nilaiQuiz, int nilaiUTS, int nilaiUAS){
        this.namaMhs = namaMhs;
        this.nilaiTugas = nilaiTugas;
        this.nilaiQuiz = nilaiQuiz;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    
    public String getnamaMhs(){
        return namaMhs;
    }
    
    public void setnamaMhs(String namaMhs){
        this.namaMhs = namaMhs;
    }
    
    public int getNilaiTugas(){
        return nilaiTugas;
    }
    
    public void setNilaiTugas(int nilaiTugas){
        this.nilaiTugas = nilaiTugas;
    }
    
    public int getNilaiQuiz(){
        return nilaiQuiz;
    }
    
    public void setNilaiQuiz(int nilaQuiz){
        this.nilaiQuiz = nilaiQuiz;
    }
    
    public int getNilaiUTS(){
        return nilaiUTS;
    }
    
    public void setNilaiUTS(int nilaiUTS){
        this.nilaiUTS = nilaiUTS;
    }
    
    public int getNilaiUAS(){
        return nilaiUAS;
    }
    
    public void setNilaiUAS(int nilaiUAS){
        this.nilaiUAS = nilaiUAS;
    }
    
    double getNilaiTotal(){
        double nilaiTugas = this.nilaiTugas * 0.3;
        double nilaiQuiz = this.nilaiQuiz * 0.2;
        double nilaiUTS = this.nilaiUTS * 0.2;
        double nilaiUAS = this.nilaiUAS * 0.3;
        return nilaiTugas + nilaiQuiz + nilaiUTS + nilaiUAS;
    }
}