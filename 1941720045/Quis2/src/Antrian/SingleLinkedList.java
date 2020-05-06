/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Antrian;

/**
 *
 * @author HOSNOL ARIFIN
 */
public class SingleLinkedList {
       Node first ;

    public SingleLinkedList() {
        first=null;
    }


    public boolean isEmpty(){
        return (first==null);
    }

    public void enqueue(int no, String nama, int keluhan){
        Node node, help;
        node = new Node(no, nama, keluhan);
        node.next = null;

        if(isEmpty()){
            first = node;
            first.next = null;
        }else{
            help = first;
            while(help.next!=null){
                help=help.next;
            }
            help.next=node;
        }
    }

    public Node dequeue(){
        if(!isEmpty()){
            Node temp = first;
            first = first.next;
            return temp;
        }else{
            return null;
        }
    }

    public Node hapusPasienBaruDatang(){
        if(!isEmpty()){
            Node temp, current;
            current=first;
            while(current.next.next != null){
                current=current.next;
            }
            temp=current.next;
            current.next=null;
            return temp;
        }else{
            Node temp = first;
            first = null;
            return temp;
        }
    }
    
    public void cekAntrian(){
        Node current = first;
        int total_antrian = 0;
        int total_waktu = 0;
        
        if(current == null){
            System.out.println("Kosong!");
        }else{
            while(current != null){
                total_antrian++;
                total_waktu = total_waktu + current.waktu;
                
                current = current.next;
            }
            System.out.println("\nTotal antrian: "+ total_antrian);
            System.out.println("Total waktu  : "+ total_waktu + " menit\n");
        }
    }
    
    public void cekAntrianByNo(int no){
        Node current = first;
        int total_antrian = 0;
        int total_waktu = 0;
        String nama_pasien = "Tidak ditemukan (Semua pasien)";
        
        if(current == null){
            System.out.println("Kosong!");
        }else{
            while(current != null){
                if(current.no == no){
                    nama_pasien = current.nama;
                    break;
                }
                
                total_antrian++;
                total_waktu = total_waktu + current.waktu;
                current = current.next;
            }
            
            System.out.println("\nNama Pasien      : "+ nama_pasien);
            System.out.println("Total antrian      : "+ total_antrian + " orang lagi");
            System.out.println("Total waktu tunggu : "+ total_waktu + " menit lagi\n");
        }
    }
    
    public void cekPasienByNo(int no){
        Node current = first;
        int nomor = 0;
        int waktu = 0;
        String nama_keluhan = "-";
        String nama_pasien = "Tidak ditemukan";

        if(current == null){
            System.out.println("Kosong!");
        }else{
            while(current != null){
                if(current.no == no){
                    nama_pasien = current.nama;
                    nomor = current.no;
                    waktu = current.waktu;
                    nama_keluhan = current.nama_keluhan;
                    break;
                }
                current = current.next;
            }

            System.out.println("\nNama Pasien   : "+ nama_pasien);
            System.out.println("No antrian      : "+ nomor);
            System.out.println("Keluhan         : "+ nama_keluhan);
            System.out.println("Penanganan      : "+ waktu + " menit\n");
        }
    }
    
    public void rataWaktu(){
        Node current = first;
        int total_pasien = 0;
        int total_waktu = 0;
        
        if(current == null){
            System.out.println("Kosong!");
        }else{
            while(current != null){
                total_pasien++;
                total_waktu = total_waktu + current.waktu;
                
                current = current.next;
            }
            System.out.println("\nRata-rata waktu: "+ total_waktu/total_pasien +" menit\n");
        }
    }
    
    public void statistikKeluhan(){
        Node current = first;
        int demam = 0;
        int flu = 0;
        int sakit_kepala = 0;
        int asma = 0;
        int diare = 0;
        int sakit_gigi = 0;
        int sakit_mata = 0;
        int keseleo = 0;
        int susah_tidur = 0;
        
        if(current == null){
            System.out.println("Kosong!");
        }else{
            while(current != null){
                if(current.keluhan == 1){
                    demam++;
                }else if(current.keluhan == 2){
                    flu++;
                }else if(current.keluhan == 3){
                    sakit_kepala++;
                }else if(current.keluhan == 4){
                    asma++;
                }else if(current.keluhan == 5){
                    diare++;
                }else if(current.keluhan == 6){
                    sakit_gigi++;
                }else if(current.keluhan == 7){
                    sakit_mata++;
                }else if(current.keluhan == 8){
                    keseleo++;
                }else if(current.keluhan == 9){
                    susah_tidur++;
                }
                
                current = current.next;
            }
            
            System.out.println("\n");
            if(demam != 0){
                System.out.println("Demam: "+ demam +" orang");
            }
            if(flu != 0){
                System.out.println("Flu: "+ flu +" orang");
            }
            if(sakit_kepala != 0){
                System.out.println("Sakit Kepala: "+ sakit_kepala +" orang");
            }
            if(asma != 0){
                System.out.println("Asma: "+ asma +" orang");
            }
            if(diare != 0){
                System.out.println("Diare: "+ diare +" orang");
            }
            if(sakit_gigi != 0){
                System.out.println("Sakit Gigi: "+ sakit_gigi +" orang");
            }
            if(sakit_mata != 0){
                System.out.println("Sakit Mata: "+ sakit_mata +" orang");
            }
            if(keseleo != 0){
                System.out.println("Keseleo: "+ keseleo +" orang");
            }
            if(susah_tidur != 0){
                System.out.println("Susah Tidur: "+ susah_tidur +" orang");
            }
        }
    }

    public void tampilkan(){
        Node current = first;
        if(current == null){
            System.out.println("Kosong!");
        }else{
            System.out.println("\nData Pasien Saat Ini:");
            while(current != null){
                current.tampil();
                current = current.next;
            }
            System.out.println();
        }
    }
}
