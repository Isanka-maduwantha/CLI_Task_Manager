import java.util.Scanner;

import pck.*;
public class TaskManager{
     static CliUi Cli = new CliUi();
     static Scanner input = new Scanner(System.in);
     static TaskBackend Controll = new TaskBackend();
    public static void main(String[] args){
      
        Cli.displayMenu();
        SelectOption();

    }
        public static void SelectOption() {
        
        int Option = input.nextInt();

        switch (Option) {
            case 1:
                Cli.QuitMessage();
                break;
            case 2:
                Cli.AddTaskMessage();
                Controll.AddTask();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                break;

        }
        input.close();
    }

}