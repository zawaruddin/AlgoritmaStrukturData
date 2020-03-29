/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjobsheet;

import java.util.Scanner;

class test1 {

    public int panjang;
    public String kalimat = "";
    public int top = 0;
    public String[] kata = new String[10];
    public Scanner dataIn = new Scanner(System.in);

    public void setKalimat(String kalimat) {
        this.kalimat = kalimat;
    }

    public String getKalimat() {
        return kalimat;
    }

    public int getPanjang() {
        panjang = kalimat.length();
        return panjang;
    }
}

class pembalik extends test1 {

    void push(String temp) {
        top++;
        kata[top] = temp;
    }

    String pop(int top) {
        String temp = kata[top];
        top--;
        return temp;
    }

    public void exchange() {
        String temp = "";
        for (int a = 0; a < panjang; a++) {
            temp += String.valueOf(kalimat.charAt(a));
            if (kalimat.charAt(a) == ' ') {
                push(temp);
                temp = "";
            }
        }
        push(temp);
    }

    public void show() {
        String temp = "";
        for (int a = top; a >= 1; a--) {
            temp += pop(a) + " ";
        }
        System.out.println("reversed sentence : " + temp);
    }
}

class reverse_word {

    public static void main(String[] args) {
        Scanner dataIn = new Scanner(System.in);
        String input = "";
        pembalik kataterbalik = new pembalik();
        System.out.print("input sentence : ");
        input = dataIn.nextLine();
        kataterbalik.setKalimat(input);
        kataterbalik.getKalimat();
        kataterbalik.getPanjang();
        kataterbalik.exchange();
        kataterbalik.show();
    }
}
