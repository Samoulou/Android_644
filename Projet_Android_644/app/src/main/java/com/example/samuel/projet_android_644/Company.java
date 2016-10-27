package com.example.samuel.projet_android_644;

/**
 * Created by Jacques on 26.10.2016.
 */

public class Company {
    private String _name;
    private boolean _active;


    public Company(String name, boolean active) {
        this._name = name;
        this._active = active;

    }

    public boolean is_active() {
        return _active;
    }

    public String get_name() {

        return _name;
    }
}
