package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sample.model.Task;

import java.time.LocalDate;


public class AddTask {
    private Task task;


    @FXML
    private TextField taskTitle; // название
    @FXML
    private TextArea taskDescription;
    @FXML
    private DatePicker taskDate; // дата

    @FXML
    public void addTask() {
        String title = taskTitle.getText();
        String description = taskDescription.getText();
        LocalDate date = taskDate.getValue();
        Task task = new Task(title,description,date);

        setTask(task);
        taskDate.getScene().getWindow().hide();

    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

}