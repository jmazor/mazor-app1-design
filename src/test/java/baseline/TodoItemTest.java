package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoItemTest {

    // create a TodoItem

    @Test
    void changeName() {
        // ensure that we can properly change the name of a TodoItem
        // assert getName after changed
    }

    @Test
    void editDate() {
        // ensure we can properly edit the Date of a TodoItem
        // assert getDate after changed
    }

    @Test
    void editDescription() {
        // ensure we can properly edit the desc of a TodoItem
        // assert getDescription after changed
    }

    @Test
    void changeFlag() {
        // ensure we can properly switch the flag of a TodoItem
        // if true should change to false
        // if false should change to true
    }

    @Test
    void editID() {
        // ensure we can properly change the ID of an item
        // no error checking is done here
        // assert getID after changed
    }
}