package ru.vaszol.vas.list_test.model;

/**
 * Created by vas on 28.07.2015.
 */
public class ToDo {
    private Integer id;
    private String task;
    private Integer priority;

    public ToDo(Integer id, String task, Integer priority) {
        this.id = id;
        this.task = task;
        this.priority = priority;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}
