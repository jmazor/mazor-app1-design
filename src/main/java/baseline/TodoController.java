package baseline;

/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Justin Mazor
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class TodoController implements Initializable {

    // Spreadsheet data
    private TodoList todoList;
    private ObservableList<TodoItem> flaggedItems;

    @FXML
    private Button addButton;

    @FXML
    private Button deleteButton;

    @FXML
    private TextField inputDate;

    @FXML
    private TextField inputDesc;

    @FXML
    private TextField inputName;

    @FXML
    private TableView<TodoItem> table;

    @FXML
    private TableColumn<TodoItem, String> todoDate;

    @FXML
    private TableColumn<TodoItem, String> todoDesc;

    @FXML
    private TableColumn<TodoItem, Boolean> todoFlag;

    @FXML
    private TableColumn<TodoItem, String> todoItem;

    @FXML
    private Menu exitMenu;

    @FXML
    private MenuItem completedItems;

    @FXML
    private MenuItem deleteList;

    @FXML
    private MenuItem changeTitle;

    @FXML
    public void handleDeleteList() {
        // TodoList.deleteList
        // TODO
        // I need to research if i can listen to a method somehow like listing to a port
        // if I can accomplish this we will return to the original screen on delete

        // Currently I will close the program.

        // TODO
        // we print to file on close so ensure if we implement a listener to no print file
    }

    @FXML
    public void handleTitle() {
        // prompt User for new title
        // either this or file explorer. (This program seems to abstract away from files so I doubt this will be the case)
        // try catch
        // todoList.editFileName();

        // if catch complain and ask again
    }


    @FXML
    public void handleFlags() {
        // if finished item is null
        // set flaggedItems  = todoList.getCompletedFlags()

        // else if flaggedItems.get(0).getFlag is true
        // this works because we do not modify the flaggedItems list, only the display and todoList gets modified
        // set flaggedItems = todoList.getUncompletedFlags()

        // else set flaggedItems = todolist.getCompleteFlags()

        // set table Data to flaggedItems
    }

    @FXML
    public void handleAddButton() {
        // create a new person
        // read data from inputName inputDesc and inputDate
        // try catch
        // call todoList.add()
        // catch display error message
    }

    @FXML
    public void handleDeleteButton() {
        // determine ID from selected table field
        // call todoList.delete(ID)
    }

    @FXML
    public void handleExit() {
        // call printToFile()
        // exit program safely
    }



    public void setTable(TodoList inputData) {
        // set todoList = inputData
        // set table to todoList.getTable
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // set Date Column
        // set Desc column
        // set flag column
        // call readInput and pass persistant File name
        // set table data to todoList.getList()
        // set table to editable
        // set todoDate to editable
        // on todoDate edit call todoList.editDate()

        // set todoItem to editabale
        // on todoItem edit call todoList.editName()

        // set todoDesc to editable
        // on todoDesc edit call todoList.editDesc()

        // make todoFlag an editable Checkbox cell
        // on edit call toodList.changeFlag()
    }
}

