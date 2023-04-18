package Problema2;

import Problema2.model.Mall;
import Problema2.repository.CrudRepository;
import Problema2.repository.MallListRepository;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;

public class MainView {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String opc = "1";
        CrudRepository repo = new MallListRepository();
        do {
            Scanner s = new Scanner(System.in);
            System.out.print("Menu \n 1. Add  \n 2. List \n 3. Edit " +
                    "\n 4. Delete \n 5. Get by Id \n 6. Exit \n =>");
            opc = s.next();
            switch (opc) {
                case "1": {
                    System.out.println("Enter the name: ");
                    String n = s.next();
                    System.out.println("Enter the city: ");
                    String c = s.next();
                    System.out.println("Enter the direction: ");
                    String d = s.next();
                    repo.create(new Mall(n, c, d));
                    break;
                }
                case "2": {
                    List<Mall> malls = repo.list();
                    malls.forEach(System.out::println);
                    break;
                }
                case "3": {
                    System.out.println("===== EDIT ====");
                    System.out.print("Enter the mall id: ");
                    Integer i = s.nextInt();
                    System.out.print("Enter the name: ");
                    String n = s.next();
                    System.out.print("Enter the city: ");
                    String c = s.next();
                    System.out.print("Enter the direction: ");
                    String d = s.next();
                    Mall beaUpdate = new Mall(n, c, d);
                    beaUpdate.setId(i);
                    repo.edit(beaUpdate);
                    break;
                }
                case "4": {
                    System.out.println("===== DELETE ======");
                    System.out.print("Enter the mall id: ");
                    Integer id = s.nextInt();
                    repo.delete(id);
                    repo.list().forEach(System.out::println);
                    break;
                }
                case "5": {
                    System.out.println("===== GET BY ID ===== ");
                    System.out.print("Enter the mall id: ");
                    Integer id = s.nextInt();
                    repo.getByID(id);
                    System.out.print("Get by Id: " + repo.getByID(id));
                    break;
                }
                case "6": {
                    opc = "6";
                    break;
                }
            }
        } while (opc != "6");
    }
}
