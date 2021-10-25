package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoControllerTest {

    @Test
    void handleDeleteList() {
        // should properly call todoList.deleteList
        // even though already tested we can ensure that the file has been removed from persistence
    }

    @Test
    void handleTitle() {
        // should move current file to new location
        // also make sure that the todoList.editFileName has been properly called
    }

    @Test
    void handleFlags() {
        // if flagged items is empty it should fill flagged items with completed flags
        // if pressed again should fill with uncompleted flags
        // should from then on switch back and forth from uncompleted to completed
        // will fill table data everytime
    }

    @Test
    void handleAddButton() {
        // ensure that the function to add to the object works approvingly
        // should be appropriately calling todoList.add()
    }

    @Test
    void handleDeleteButton() {
        // ensure that the selected ID is removed from the list
        // ID will be selected via click but we can specify
    }

    @Test
    void handleExit() {
        // ensure that a file is written on exit
    }

    @Test
    void setTable() {
        // this should set todoList to the passed TodoList
    }

}