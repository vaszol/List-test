package ru.vaszol.vas.list_test;

import android.app.Application;

import ru.vaszol.vas.list_test.model.ToDo;
import ru.vaszol.vas.list_test.model.ToDoManager;

/**
 * Created by vas on 28.07.2015.
 */
public class ToDoApp extends Application {
    private ToDoManager toDoManager = null;

    public ToDoManager getToDoManager() {
        if (toDoManager == null)
            toDoManager = new ToDoManager();
            toDoManager.getTodos().add(new ToDo(1, "Buy milk", 5));
            toDoManager.getTodos().add(new ToDo(2, "Buy bred", 5));
            toDoManager.getTodos().add(new ToDo(3, "Buy chees", 5));
            toDoManager.getTodos().add(new ToDo(4, "Buy beer", 5));
            toDoManager.getTodos().add(new ToDo(2, "Buy meat", 5));
            toDoManager.getTodos().add(new ToDo(4, "Buy butter", 5));
            toDoManager.getTodos().add(new ToDo(3, "Buy book", 5));
            toDoManager.getTodos().add(new ToDo(1, "Buy newspaper", 5));
            toDoManager.getTodos().add(new ToDo(2, "Buy laptop", 5));
            toDoManager.getTodos().add(new ToDo(3, "Buy TV", 5));
            toDoManager.getTodos().add(new ToDo(1, "Buy smartphone", 5));
        return toDoManager;
    }
}
