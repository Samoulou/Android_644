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


    public Worker (String lastname, String firstname, Date birthdate, char sex){
        this._lastname=lastname;
        this._firstname=firstname;
        this._birthdate=birthdate;
        this._sex=sex;

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

}
