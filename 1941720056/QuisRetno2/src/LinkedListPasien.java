import java.text.DecimalFormat;
import java.util.HashMap;
public class LinkedListPasien {
    protected Node<DataPasien> front, rear;
    public int size;

    public LinkedListPasien() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int getSize() {
        return size;
    }

    public int getLastNo() {
        if (isEmpty()) {
            return 0;
        }
        return rear.getData().getNo();
    }

    public int getTotalWaktu() {
        if (isEmpty()) {
            return 0;
        } else {
            Node<DataPasien> tmp = front;
            int totl = 0;
            int i = 0;
            while (tmp != null && i < size) {
                totl = totl + tmp.data.getWaktu();
                tmp = tmp.getNext();
                i++;
            }
            return totl;
        }
    }

    public int getWaktuByNum(int no) {
        if (isEmpty() && no == 0) {
            return 0;
        } else {
            Node tmp = front;
            int i = 0;
            int totl = 0;
            while (tmp != null && i < (no - 1)) {
                totl += tmp.getData().getWaktu();
                i++;
                tmp = tmp.getNext();
            }
            return totl;
        }
    }

    public int getAntri(int no) {
        if (isEmpty() && no == 0 ) {
            return 0;
        } else {
            Node tmp = front;
            int i = 0;
            int totl = 0;
            while (i < size) {
                if (no == tmp.getData().getNo()) {
                    totl = no - 1;
                    break;
                }
                tmp = tmp.getNext();
                i++;
            }
            return totl;
        }
    }

    public double getRata() {
        if (isEmpty()) {
            return 0;
        } else {
            DecimalFormat df = new DecimalFormat("#.##");
            Node tmp = front;
            int i = 0;
            int ttl = 0;
            while (tmp != null && i < size) {
                ttl += tmp.getData().getWaktu();
                tmp = tmp.getNext();
                i++;
            }
            return Double.valueOf(df.format(ttl / size));
        }
    }

    public Object getInfo(int no) {
        if (isEmpty()) {
            return "Antrian masih kosong";
        } else {
            Node tmp = front;
            Object data = null;
            while (tmp != null) {
                if (no == tmp.getData().getNo()) {
                    data = tmp.getData();
                } 
                tmp = tmp.getNext();
            }
            return data;
        }
    }

    public void infoKeluhan() {
        Node head = front;
        if (isEmpty()) {
            System.out.println("kosong");
        }

        HashMap<Integer, Integer> a = new HashMap<>();
        a.put(head.data.getKeluhan(), 1);

        for (Node curr = head.next; curr != null; curr = curr.next) {
            if (a.containsKey(curr.data.getKeluhan())) {
                a.replace(curr.data.getKeluhan(), a.get(curr.getData().getKeluhan()) + 1);
            } else {
                a.put(curr.data.getKeluhan(), 0);
                a.replace(curr.data.getKeluhan(), a.get(curr.getData().getKeluhan()) + 1);
            }
        }

        a.entrySet().forEach((mapElement) -> {
            int marks = ((int) mapElement.getValue());
            String keluhan = "";

            switch (mapElement.getKey()) {
                case 1:
                    keluhan = "Demam";
                    break;
                case 2:
                    keluhan = "Flu";
                    break;
                case 3:
                    keluhan = "Sakit Kepala";
                    break;
                case 4:
                    keluhan = "Asma";
                    break;
                case 5:
                    keluhan = "Diare";
                    break;
                case 6:
                    keluhan = "Sakit Gigi";
                    break;
                case 7:
                    keluhan = "Sakit Mata";
                    break;
                case 8:
                    keluhan = "Kesleo";
                    break;
                case 9:
                    keluhan = "Susah Tidur";
                    break;
            }

            System.out.println(keluhan + "\t\t: " + marks);
        });
    }

    public void insert(DataPasien data) {
        Node tmp = new Node(data, null);
        if (rear == null) {
            front = rear = tmp;
        } else {
            rear.setNext(tmp);
            rear = rear.getNext();
        }
        size++;
    }

    public void remove() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        }
        Node<DataPasien> tmp = front;
        front = tmp.getNext();
        if (front == null) {
            rear = null;
        }
        size--;
        System.out.println("" + tmp.getData());
    }

    public void print() {
        System.out.println("Data antrian");
        System.out.println("----------------------------------");
        if (size == 0) {
            System.out.print("Antrian masih kosong\n");
            return;
        }
        Node<DataPasien> cetak = front;
        
        String format = "%1$-5s|%2$-20s|%3$-8s|%4$-10s\n";
        System.out.format(format, "No", "Nama", "Keluhan", "Waktu");
        
        while (cetak != rear.getNext()) {
            System.out.format(String.format(format, cetak.getData().getNo(), 
                    cetak.getData().getNama(), cetak.getData().getKeluhan(), cetak.getData().getWaktu()+" menit"));
            cetak = cetak.getNext();
        }
        System.out.println();
    }
}
