package pck;


public class CliUi {

    public CliUi() {
            System.out.println("-----Welcome to Task Manager-----");
    }
    public void displayMenu(){
            System.out.println("Enter Your Choice");
            System.out.println("1.Quit");
            System.out.println("2.Add Task");
            System.out.println("3.Remove Task");
            System.out.println("4.Edit Task");
            System.out.println("5.Search Task");
            System.out.println("6.Mark Complete");
            System.out.print  ("Enter Here: ");
        }
    public void QuitMessage(){
        System.out.println("Quit From Task Manager");

    }
        public void AddTaskMessage(){
        System.out.println("\nAdding A New Task: ");

    }
}
