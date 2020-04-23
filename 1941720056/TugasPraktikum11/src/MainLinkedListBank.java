import java.util.Scanner;
public class MainLinkedListBank {
    public static void menu() {
        String dataMenu[] = 
        {
            "Add First","Add","Add Last","GetFirst","GetLast","Get","Search","Remove","Print","Clear"         
        };
        System.out.println("==============================");
        System.out.println("        MENU NASABAH          ");
        System.out.println("==============================");
        for (int i = 0; i < dataMenu.length; i++) {
            System.out.println((i+1)+". "+dataMenu[i]);
        }
        System.out.println("----------------------");
        System.out.print("Pilih : ");
        
    } 
  public static void main(String[] args) {
      Scanner retno = new Scanner(System.in);
      Scanner fajar = new Scanner(System.in);
      LinkedListBank data = new LinkedListBank();
      String noRek, nama;
      int pilih, index;
      do {
          menu();
          pilih = retno.nextInt();
          switch (pilih) {
              case 1:
                  System.out.println("----------------------");
                  System.out.print("Masukkan no rekening  :");
                  noRek = retno.next(); 
                  System.out.print("Masukkan nama         :");
                  nama = fajar.nextLine(); 
                  try {
                      data.addFirst(noRek, nama);
                  } catch (Exception e) { 
                      System.out.println(e.getMessage()); 
                  }                     
                  System.out.println();
                  break; 
              case 2: 
                  System.out.println("-----------------------");
                  System.out.print("Masukkan no rekening  :"); 
                  noRek = retno.next(); 
                  System.out.print("Masukkan nama         :");
                  nama = fajar.nextLine(); 
                  System.out.print("Masukkan posisi       : ");
                  index = retno.nextInt(); 
                  try { 
                      data.add(noRek, nama, index);
                      
 
  
                    }
                  catch (Exception e) {
                      System.out.println(e.getMessage());
                  } 
                  System.out.println();
                  break;
              case 3:
                  System.out.println("-----------------------");
                  System.out.print("Masukkan no rekening  :"); 
                  noRek = retno.next();
                  System.out.print("Masukkan nama         :");
                  nama = fajar.next();
                  try {
                      data.addLast(noRek, nama);
                  } catch (Exception e) {
                      System.out.println(e.getMessage());
                  }   
                  System.out.println();
                  break; 
              case 4:
                  try {
                      data.getFirst();
                  } catch (Exception e) {
                      System.out.println(e.getMessage());
                  }
                  System.out.println(); 
                  break;
              case 5:
                  try {
                      data.getLast();
                  } 
                  catch (Exception e) {
                      System.out.println(e.getMessage());
                  }
                  System.out.println();
                  break;
              case 6:
                  System.out.print("Cari data ke-: ");
                  index = retno.nextInt(); 
                  try {
                      data.get(index);
                      
  
                    }
                  catch (Exception e) {
                      System.out.println(e.getMessage());
                  }
                  System.out.println(); 
                  break;
              case 7:
                  data.print();
                        System.out.println("-----------------------------");
                        System.out.println("      Cari Data Nasabah     ");
                        System.out.println("-----------------------------");
                            System.out.print("Masukan NoRekening yang ingin anda cari :");
                            String norek = retno.next();
                            
                            data.carikey(norek);
                            
                        break;
              case 8:
                  System.out.print("Hapus data ke-: ");
                  index = retno.nextInt();
                  try { 
                      data.remove(index);
                  } catch (Exception e) 
                  {
                      System.out.println(e.getMessage());
                  }                     
                  System.out.println();
                  break;
              case 9: 
                  data.print();
                  break;
              case 10:
                  data.clear();
                  break; 
          }
      } while (pilih >= 1 && pilih <= 10);     } 
} 
 

