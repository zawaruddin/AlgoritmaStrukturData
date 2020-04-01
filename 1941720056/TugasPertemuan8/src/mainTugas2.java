import java.util.Scanner;
public class mainTugas2 {
    public static void main(String[] args) {
        Scanner retno = new Scanner (System.in);
        
        System.out.print("Masukkan kalimat : ");
        String sentence = retno.nextLine();
        String word [] = sentence.split("\\s+");
        Tugas2 tumpukan = new Tugas2(word.length);
        for (int i = 0; i < word.length; i++) {
            tumpukan.push(word[i]);
        }
        tumpukan.print();
        
    }
    
}
