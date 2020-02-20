import java.util.Scanner;
public class arrayPacMan {
    static Scanner retno = new Scanner(System.in);
    public static void setting (){
        System.out.println("====GAME PacMan====");
        System.out.println("w = bergerak ke atas ");
        System.out.println("s = bergerak ke bawah");
        System.out.println("a = bergerak ke kiri");
        System.out.println("d = bergerak ke kanan");
        
    }
    public static void attention(){
        System.out.println("Mohon Masukkan input yang tepat !!!");
        input();
    }
    
    public static void over(){
        System.out.println("Koordinat tidak boleh kurang dari 0 !!!");
        input();
    }
    public static void input(){
        PacMan pc = new PacMan();
        pc.width = 3;
        pc.height = 3;
        
        setting();
        System.out.print("Masukkan kontrol : ");
        pc.select = retno.nextLine().toLowerCase();
        
        switch (pc.select){
            case "w" :
                if ((pc.y-1)<0){
                    over();
                }
                break;
            case "s" :   
                if ((pc.y+1)>=pc.width){
                    over();
                }
                break;
            case "a" : 
                 if ((pc.x-1)<0){
                    over();
                }
                break;
            case "d" : 
                if ((pc.y+1)>=pc.height){
                    over();
                }
                break;
            default:
        }
         switch (pc.select){
             case "w" : pc.moveUp();
             break;
             case "s" : pc.moveDown();
             break;
             case "a" : pc.moveLeft();
             break;
             case "d" : pc.moveRight();
             break;
             default: attention();
         }
         pc.printPosition();
         System.out.println("Titik koordinat adalah ("+pc.x+" , "+ pc.y+")");
         input();
    }
    public static void main(String[] args) {
        input();
    }
}
