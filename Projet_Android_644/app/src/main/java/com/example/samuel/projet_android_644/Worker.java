package com.example.samuel.projet_android_644;

import java.util.Date;

/**
 * Created by Jacques on 26.10.2016.
 */

public class Worker {
    private String _lastname;
    private String _firstname;
    private Date _birthdate;
    private char _sex;
    private boolean _active;


    public Worker (String lastname, String firstname, Date birthdate, char sex, boolean active){
        this._lastname=lastname;
        this._firstname=firstname;
        this._birthdate=birthdate;
        this._sex=sex;
        this._active=active;

    }

    public String get_lastname() {
        return _lastname;
    }

    public String get_firstname() {
        return _firstname;
    }

    public Date get_birthdate() {
        return _birthdate;
    }

    public char get_sex() {
        return _sex;
    }

    public boolean get_active() {
        return _active;
    }

}
