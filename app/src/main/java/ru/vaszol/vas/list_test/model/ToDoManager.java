package ru.vaszol.vas.list_test.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vas on 28.07.2015.
 */
public class ToDoManager {
    private List<ToDo> todos = null;

    public ToDoManager() {
        todos=new ArrayList<ToDo>();
    }

    public List<ToDo> getTodos(){
        return todos;
    }

    public void removePosition(int position) {
        todos.remove(position);
    }

    public ToDo findByPosition(int position) {
        return todos.get(position);
    }
}
