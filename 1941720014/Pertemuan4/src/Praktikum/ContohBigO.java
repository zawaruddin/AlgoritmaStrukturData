package Praktikum;

/**
 *
 * @author Aulafz
 */
public class ContohBigO {                                            //-

    public static void contohBigO(int[] angka) {                    //-
        System.out.println("Pairs : ");                             //O(1)
        int n = angka.length;                                       //O(1)

        for (int i = 0; i < n; i++) {                               //O(n)
            for (int j = 0; j < n; j++) {                           //O(n)
                System.out.println(angka[i] + "-" + angka[j]);      //O(1)
            }                                                       //-
        }                                                           //-
        for (int i = 0; i < n; i++) {                               //O(n)
            for (int j = 0; j < n; j++) {                           //O(n)
                System.out.println("Hai");                          //O(1)
            }                                                       //-
        }                                                           //-
    }                                                               //-

}                                                                   //-
