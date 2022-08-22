package com.tryreal.firstproject.entity;

import javax.persistence.*;

@Entity
public class TodoList {
    @Column(name = "index")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer index;

    @Column(name = "task")
    private String task;

    @Column(name = "iscomplete")
    private boolean iscomplete;

    public TodoList() {
    }

    public TodoList(String task, boolean iscomplete) {
        this.task = task;
        this.iscomplete = iscomplete;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isIscomplete() {
        return iscomplete;
    }

    public void setIscomplete(boolean iscomplete) {
        this.iscomplete = iscomplete;
    }
}
