package pck;

import java.time.LocalDate;
import java.time.LocalDate;

public class Task {

    private static int NextId = 1;
    private int Id;
    private String Title;
    private String Description;
    private boolean isCompleted;
    private LocalDate DateCreated;
    private LocalDate DueDate;

    public Task() {
        this.Id = NextId++;
        this.DateCreated = LocalDate.now();
    }

    public Task(String tit, String des, LocalDate due) {
        this.Id = NextId++;
        this.DateCreated = LocalDate.now();
        this.Title = tit;
        this.Description = des;
        this.DueDate = due;
    }

    public void TaskComplete() {
        isCompleted = true;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setDueDate(LocalDate dueDate) {
        DueDate = dueDate;
    }

    public int getId() {
        return Id;
    }

    public String getTitle() {
        return Title;
    }

    @Override
    public String toString() {
        return "Task [Id=" + Id + ", Title=" + Title + ", Description=" + Description + ", isCompleted=" + isCompleted
                + ", DateCreated=" + DateCreated + ", DueDate=" + DueDate + "]";
    }

}
