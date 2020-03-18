package TugasMinggu5;

public class Tiket {

    String nmPesawat;
    float harga;
    int stokTersedia, stokTerjual, pilihan, urut;
    Tiket t[] = new Tiket[5];

    Tiket(String n, float a, int b, int c) {
        nmPesawat = n;
        harga = a;
        stokTersedia = b;
        stokTerjual = c;
    }

    void tampil() {
        System.out.println("Nama Pesawat    : " + nmPesawat);
        System.out.println("Harga Tiket     : " + harga);
        System.out.println("Stok Tersedia   : " + stokTersedia);
        System.out.println("Stok Terjual    : " + stokTerjual);
    }

    void bubbleSort() {
        switch (urut) {
            case 1:
                if (pilihan == 1) {
                    for (int i = 0; i < t.length - 1; i++) {
                        for (int j = 1; j < t.length - i; j++) {
                            if (t[j].stokTersedia < t[j - 1].stokTersedia) {
                                Tiket tmp = t[j];
                                t[j] = t[j - 1];
                                t[j - 1] = tmp;
                            }
                        }
                    }
                } else if (pilihan == 2) {
                    for (int i = 0; i < t.length - 1; i++) {
                        for (int j = 1; j < t.length - i; j++) {
                            if (t[j].stokTersedia > t[j - 1].stokTersedia) {
                                Tiket tmp = t[j];
                                t[j] = t[j - 1];
                                t[j - 1] = tmp;
                            }
                        }
                    }
                } else {
                    System.out.println("Input salah!!");
                }   break;
            case 2:
                if (pilihan == 1) {
                    for (int i = 0; i < t.length - 1; i++) {
                        for (int j = 1; j < t.length - i; j++) {
                            if (t[j].harga < t[j - 1].harga) {
                                Tiket tmp = t[j];
                                t[j] = t[j - 1];
                                t[j - 1] = tmp;
                            }
                        }
                    }
                } else if (pilihan == 2) {
                    for (int i = 0; i < t.length - 1; i++) {
                        for (int j = 1; j < t.length - i; j++) {
                            if (t[j].harga > t[j - 1].harga) {
                                Tiket tmp = t[j];
                                t[j] = t[j - 1];
                                t[j - 1] = tmp;
                            }
                        }
                    }
                } else {
                    System.out.println("Input salah!!!");
                }   break;
            default:
                break;
        }
    }

    void selectionSort() {
        if (urut == 1) {
            if (pilihan == 1) {
                for (int i = 0; i < t.length - 1; i++) {
                    int idxMin = i;
                    for (int j = i + 1; j < t.length; j++) {
                        if (t[j].stokTersedia < t[idxMin].stokTersedia) {
                            idxMin = j;
                        }
                        Tiket tmp = t[idxMin];
                        t[idxMin] = t[i];
                        t[i] = tmp;
                    }
                }
            } else if (pilihan == 2) {
                for (int i = 0; i < t.length - 1; i++) {
                    int idxMin = i;
                    for (int j = i + 1; j < t.length; j++) {
                        if (t[j].stokTersedia > t[idxMin].stokTersedia) {
                            idxMin = j;
                        }
                        Tiket tmp = t[idxMin];
                        t[idxMin] = t[i];
                        t[i] = tmp;
                    }
                }
            } else {
                System.out.println("Input salah!!");
            }
        } else if (urut == 2) {
            if (pilihan == 1) {
                for (int i = 0; i < t.length - 1; i++) {
                    int idxMin = i;
                    for (int j = i + 1; j < t.length; j++) {
                        if (t[j].harga < t[idxMin].harga) {
                            idxMin = j;
                        }
                        Tiket tmp = t[idxMin];
                        t[idxMin] = t[i];
                        t[i] = tmp;
                    }
                }
            } else if (pilihan == 2) {
                for (int i = 0; i < t.length - 1; i++) {
                    int idxMin = i;
                    for (int j = i + 1; j < t.length; j++) {
                        if (t[j].harga > t[idxMin].harga) {
                            idxMin = j;
                        }
                        Tiket tmp = t[idxMin];
                        t[idxMin] = t[i];
                        t[i] = tmp;
                    }
                }
            } else {
                System.out.println("Input salah!!!");
            }
        } else {

        }

    }
}
