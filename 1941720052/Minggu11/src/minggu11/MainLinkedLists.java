/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu11;

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;
public class MainLinkedLists {
    
    static Scanner luluk = new Scanner(System.in);
    static Scanner mufida = new Scanner(System.in);

    public static void menu() {
        System.out.println("Enter Number Operation Want To Run");
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Seacrh");
        System.out.println("4. Exit");
    }
    public static void subMenu(int menu) {
        System.out.println("Choose SubMenu: ");
        switch (menu) {
            case 1:
                System.out.println("1. Add First");
                System.out.println("2. Add(item,index)");
                System.out.println("3. Add Last");
                System.out.println("4. Add by value");
                break;
            case 2:
                System.out.println("1. Delete By index");
                System.out.println("2. Delete  By Value");
                System.out.println("3. Clear");
                break;
            case 3:
                System.out.println("1. Seacrh By index");
                System.out.println("2. Seacrh By Value ");
                break;
            case 4:
                System.out.println("Log Out");
                System.exit(0);
                break;
        }
    }

    public static void main(String[] args) {

        LinkedList data = new LinkedList();
        int option, index;
        String item;
        try {
            data.addFirst("5");
            data.add("4", 1);
            data.add("3", 2);
            data.add("3", 3);
            data.add("2",4);
            do {
                menu();
                System.out.print("Choose Option : ");
                option = luluk.nextInt();
                subMenu(option);
                System.out.print("Choose Operation: ");
                int pilih = luluk.nextInt();
                switch (option) {
                    case 1:
                        if (pilih == 1) {
                            System.out.print("Enter First data: ");
                            item = mufida.nextLine();
                            data.addFirst(item);
                        } else if (pilih == 2) {
                            System.out.print("Enter data: ");
                            item = mufida.nextLine();
                            System.out.print("Enter index: ");
                            index = luluk.nextInt();
                            data.add(item, index);
                        } else if (pilih == 3) {
                            System.out.print("Enter Last Data: ");
                            item = mufida.nextLine();
                            data.addLast(item);
                        } else {
                            data.print();
                            System.out.print("Adding data : ");
                            item = mufida.nextLine();
                            System.out.print("Data Postition: ");
                            String siap = mufida.nextLine();
                            data.addByValue(item, siap);
                            data.print();
                        }
                        break;
                    case 2:
                        if (pilih == 1) {
                            System.out.print("delete data on index-");
                            index = luluk.nextInt();
                            data.remove(index);
                        } else if (pilih == 2) {
                            data.print();
                            System.out.print("Enter data: ");
                            item = mufida.nextLine();
                            data.removeByValue(item);
                            data.print();
                        } else if (pilih == 3) {
                            System.out.print("Prossced Delete");
                            data.clear();
                        } else {
                        }
                        break;
                    case 3:
                        if (pilih == 1) {
                            System.out.print("Search data on index-");
                            index = luluk.nextInt();
                            data.cariByIndex(index);
                        } else if (pilih == 2) {
                            System.out.print("enter data: ");
                            item = mufida.nextLine();
                            data.cari(item);
                        } else {
                        }
                        break;
                    default:
                }
            } while (option == 1 || option == 2 || option == 3 || option == 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
    

