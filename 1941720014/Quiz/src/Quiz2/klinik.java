package Quiz2;

/**
 *
 * @author Aulafz
 */
public class klinik {
    node head;
    int size;
    
    public klinik() {
        head = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void addFirst(int no, String nama, int keluhan, int waktu) {
        head = new node(no, nama, keluhan, waktu, head);
        size++;
    }
    
    public void enqueue (int no, String nama, int keluhan, int waktu) {
        if (isEmpty()) {
            addFirst(no, nama, keluhan, waktu);
        } else {
            node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new node(no, nama, keluhan, waktu, null);
            size++;
        }

//        head = new node(no, nama, keluhan, waktu, head);
//        size++;
    }

    public void dequeue () throws Exception {
        head = head.next;
        size--;
//        int antri = 1;
//        if (isEmpty()) {
//            throw new Exception("Antrian kosong");
//        } else {
//            node prev = head;
//            node cur = head.next;
//            for (int i = 0; i < antri; i++) {
//                prev = cur;
//                cur = prev.next;
//            }
//            prev.next = cur.next;
//            size--;
//            
//        }
    }
    
    public void clear() {
        head = null;
        size = 0;
    }
    
    public void print() {
        if (!isEmpty()) {
            node tmp = head;
            while (tmp != null) {
                System.out.println("Nomor antrian       : " + tmp.no );
                System.out.println("Nama pasien         : " + tmp.nama);
                System.out.println("Nomor keluhan       : " + tmp.keluhan);
                System.out.println("Waktu penanganan    : " + tmp.waktu + " menit");
                System.out.println("********************************************");
                tmp = tmp.next;
                
            }
            System.out.println();
        } else {
            System.out.println("Antrian kosong");
        }
    }
    
    public void cekAntrian (){
        node tmp = head;
        int i = 0,total = 0;
        if (!isEmpty()) {
            while (tmp != null) {
                total += (int)tmp.waktu;
                tmp = tmp.next;
                i++;
            }
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Banyaknya Jumlah antrian sebelumnya     : " + i);
            System.out.println("Total waktu tunggu                      : " + total + " menit");
            System.out.println("--------------------------------------------------------------------");
       } else {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Tidak ada antrian");
            System.out.println("--------------------------------------------------------------------");
        }
    }    
    
    public void cekAntrianByNo(int antri) {
        node tmp = head;
        int i = 0, nomor, antrian ,total = 0;
        while (tmp != null) {
            ++i;
            nomor = (int)tmp.no;
            if (antri < nomor ){
                System.out.println("--------------------------------------------------------------------");
                System.out.println("Nomor antrian " + antri + " belum / sudah tidak terdaftar");
                System.out.println("--------------------------------------------------------------------");
                break;
            } 
            antrian = (int) tmp.waktu;
            total += (int) tmp.waktu;
            tmp = tmp.next;
            if (nomor == antri) {
                System.out.println("--------------------------------------------------------------------");
                System.out.println("Banyaknya antrian = " + (i-1));
                System.out.println("Lama waktu tunggu untuk antrian " + antri + " adalah " + (total-antrian) + " menit");
                System.out.println("--------------------------------------------------------------------");
                break;
            }
        }
    } 

    public void cariPasienByNo(int search) throws Exception {
        if (isEmpty()){
            System.out.println("Antrian masih kosong");
        }else {
            if (search < 0 || search > size) {
                throw new Exception("Data dengan nomor antrian " + search + " tidak ditemukan");
            } else {
                node tmp = head;
                int i = 1;
                while (i < search) {
                    tmp = tmp.next;
                    i++;
                }
                System.out.println("Data dengan nomor antrian " + search + " : ");
                System.out.println("Nama pasien         : " + tmp.nama);
                System.out.println("Nomor keluhan       : " + tmp.keluhan);
                System.out.println("Waktu penanganan    : " + tmp.waktu + " menit");
                System.out.println("********************************************");
            }
        }
//        int antri = 0;
//        boolean found = false;
//        node tmp = head;
//        if (isEmpty()){
//            System.out.println("Antrian masih kosong");
//        } else {
//            while (tmp.next != null) {
//                tmp = tmp.next;
//                antri++;
//                if ((int)head.no == search) {
//                    found = true;
//                    break;
//                } else if ((int)tmp.no == search) {
//                    found = true;
//                    antri++;
//                    break;
//                } 
//                antri++;
//            }
//        }
//        if (found) {
//            System.out.println("Data dengan nomor antrian " + search);
//            System.out.println("Nama pasien         : " + tmp.nama);
//            System.out.println("Nomor keluhan       : " + tmp.keluhan);
//            System.out.println("Waktu penanganan    : " + tmp.waktu + " menit");
//            System.out.println("********************************************");
//                
//        } else {
//            throw new Exception("Data dengan nomor antrian " + search + " tidak ditemukan");
//        }
        
    }
    
    public void rataWaktu () {
        node tmp = head;
        int i = 0, total = 0;
        double avg;
        if (isEmpty()){
            System.out.println("Tidak ada antrian");
        } else {
            while (tmp != null) {
                i++;
                total += (int)tmp.waktu;
                tmp = tmp.next;
            }
            avg = total / i;
            System.out.println("--------------------------------------------------------------------");
            System.out.printf("Rata rata waktu adalah : %.2f" , avg );
            System.out.println(" menit");
            System.out.println("--------------------------------------------------------------------");
        }
}
    
    public String jenisKeluhan(int nomor) {
        String keluhan = null;
        switch(nomor) {
                            case 1 :
                                keluhan = "Demam"; 
                                break;
                            case 2 :
                                keluhan = "Flu";
                                break;
                            case 3 :
                                keluhan = "Sakit Kepala";
                                break;
                            case 4 :
                                keluhan = "Asma";
                                break;
                            case 5 :
                                keluhan = "Diare";
                                break;
                            case 6 :
                                keluhan = "Sakit Gigi";
                                break;
                            case 7 :
                                keluhan = "Sakit Mata";
                                break;
                            case 8 :
                                keluhan = "Keseleo";
                                break;
                            case 9 :
                                keluhan = "Susah Tidur";
                                break;
                            default :
                                System.out.println("Nomor keluhan tidak terdefinisi");
                                break;
                    }
        return keluhan;
    }
    
    public void statistikKeluhan () {
        int i;
        if (isEmpty()){
            System.out.println("Tidak ada antrian");
        } else {
          for(i = 1; i <=9; i++){
                node tmp = head;
                int banyak = 0;
                while (tmp != null) {
                    if (i == (int)tmp.keluhan) {
                        banyak++;
                    }
                    tmp = tmp.next;
                }
                String jenisKeluhan = jenisKeluhan (i);
                System.out.println("--------------------------------------------------------------------");
                System.out.println(i + ".    Keluhan " + jenisKeluhan + " : " + banyak + " pasien");
                System.out.println("--------------------------------------------------------------------");
//                break;
            }
        }
    }
}
