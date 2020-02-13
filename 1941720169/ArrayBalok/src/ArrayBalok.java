
public class ArrayBalok {

    public static void main(String[] args) {
        balok[] blArray = new balok[4];
        
        blArray[0] = new balok(100, 30, 12);
        blArray[1] = new balok(120, 40, 15);
        blArray[2] = new balok(210, 50, 25);
        
        for(int i=0;i<3;i++){
            System.out.println("Volume balok ke "+i+": "+blArray[i].hitungVolume());
        }
    }
}
