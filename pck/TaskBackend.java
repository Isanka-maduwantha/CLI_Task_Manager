package pck;

import pck.Task;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TaskBackend {
    Scanner input = new Scanner(System.in);
    Task task ;
    public void AddTask() {
        System.out.print("Enter Task Title: ");
        String Title =input.nextLine();

        System.out.print("Enter Task Description: ");
        String Desc =input.nextLine();

        System.out.print("Enter Task Due Date(yyyy-MM-dd): ");
        String Date = input.nextLine();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate date = LocalDate.parse(Date,formatter);

        task = new Task(Title,Desc,date);
        input.close();
    }
    public void RemoveTask() {
        System.out.print("Enter Task Id: ");
        int id =input.nextInt();
        
    }
    public void DisplayTasks() {
        
        
    }

}
