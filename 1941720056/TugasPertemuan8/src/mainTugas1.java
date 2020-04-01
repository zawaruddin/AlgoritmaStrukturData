import java.util.Scanner;
public class mainTugas1 {
    public static void main(String[] args) {
        Scanner retno = new Scanner (System.in);
        
        System.out.print("Masukkan kalimat : ");
        String sentence = retno.nextLine();
        String word [] = sentence.split("\\s+");
        Tugas1 tumword = new Tugas1(word.length);
        for (int i = 0; i < word.length; i++) {
            tumword.push(word[i]);
        }
        tumword.print();
        tumword.pop();
        tumword.peek();
        tumword.print();
    }
    
}
