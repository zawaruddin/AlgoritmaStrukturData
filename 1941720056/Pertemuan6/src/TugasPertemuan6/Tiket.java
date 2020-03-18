
package TugasPertemuan6;
public class Tiket {
    String nameAirlane;
    float price;
    int availableTicket;
    int code ;
    String flightNumber;
    
    
    Tiket(String nm , float pr , int at, int cd , String fn){
      nameAirlane = nm;
      price = pr;
      availableTicket = at;
      code = cd;
      flightNumber = fn;
    }
    
    void tampil(){
        System.out.println("==========================================");
        System.out.println("Nama Pesawat : "+ nameAirlane);
        System.out.println("Harga tiket : "+price);
        System.out.println("Seat yang tersedia : "+availableTicket);
        System.out.println("No Penerbangan: "+code+flightNumber);
    }   
}
