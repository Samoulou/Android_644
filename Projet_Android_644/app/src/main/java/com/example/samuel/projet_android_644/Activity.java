package com.example.samuel.projet_android_644;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jacques on 26.10.2016.
 */

public class Activity {
    private String _name;
    private boolean _active;
    private List<Worker> workers = new ArrayList<Worker>();

    public Activity(String name, boolean active) {
        this._name = name;
        this._active = active;
    }

    public boolean is_active() {
        return _active;
    }

    public String get_name() {
        return _name;
    }

    public List<Worker> getWorkers() {
        return workers;
    }
}
