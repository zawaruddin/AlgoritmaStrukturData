package Kuis1;

public class HitungHuruf {

    public static void main(String[] args) {
        char nama[] = {'d', 'h', 'i', 'm', 'a', 's', 'a', 'r', 'b', 'i', 's',   //  O(1)
            'u', 'k', 'm', 'a', 'h', 'i', 'm', 'a', 'w', 'a', 'n'};
        char huruf[] = {'a', 'b', 'd', 'h', 'i', 'k', 'm', 'n', 'r', 's',       //  O(1)
            'w', 'u'};
        int jmlHuruf[] = new int[huruf.length];                                 //  O(1)
        for (int i = 0; i < nama.length; i++) {                                 //  O(n), n = 22
            for (int j = 0; j < huruf.length; j++) {                            //  O(n), n = 12
                if (nama[i] == huruf[j]) {
                    jmlHuruf[j]+=1;                                             //  O(1)*22
                }
            }
        }
        for (int i = 0; i < huruf.length; i++) {                                //  O(n), n = 11
            System.out.println(huruf[i] + ": " + jmlHuruf[i]);                  //  O(1)
        }                                                         //    Total   :   3+22*11*22+11*1 = 5339
    }
}
