public class Node2 {
    String noRekening,nama;
    Node2 next;
    public Node2(String noRekening, String nama, Node2 next) {
        this.noRekening = noRekening;
        this.nama = nama;
        this.next = next;
    }     
    public void print() {
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("No. Rekening    : " + noRekening);
        System.out.println("Nama            : " + nama);
        System.out.println("-------------------------------------");
    }
}
