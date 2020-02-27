/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mingguke3;

/**
 *
 * @author khoirul
 */
public class tugas2 {
    public String namaMhs;
    public int nilaiTugas;
    public int nilaiKuis;
    public int nilaiUTS;
    public int nilaiUAS;

    public double hitungTotal(){
        double total;
        total = (nilaiTugas*30/100)+(nilaiKuis*20/100)+(nilaiUTS*20/100)+(nilaiUAS*30/100);
        return total;
    }
}
