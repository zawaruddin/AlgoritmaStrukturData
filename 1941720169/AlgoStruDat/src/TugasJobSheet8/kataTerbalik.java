package TugasJobSheet8;

public class kataTerbalik {

    int size, top;
    String kata[] = new String[10];
    String kalimat;

    kataTerbalik(String kalimat) {
        this.kalimat = kalimat;
        size = kalimat.length();
        top = -1;
    }
    void push(String temp) {
        top++;
        kata[top] = temp;
    }

    void pop(int top) {
        String x = kata[top];
        top--;
    }

    public void tukar() {
        String kata = "";
        for (int i = 0; i < size; i++) {
            kata += String.valueOf(kalimat.charAt(i));
            if (kalimat.charAt(i) == ' ') {
                push(kata);
                kata = "";
            }
        }
        push(kata);
    }

    public void print() {
        System.out.print("Kata dibalik      : ");
        for (int i = top; i >= 0; i--) {
            System.out.print(kata[i] + " ");
        }
        System.out.println("");
    }
}
