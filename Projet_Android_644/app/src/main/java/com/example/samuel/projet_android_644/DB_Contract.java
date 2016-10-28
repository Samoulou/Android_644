package com.example.samuel.projet_android_644;

import android.provider.BaseColumns;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DB_Contract  {

    public static abstract class workers implements BaseColumns
    {
        public static final String TABLE_NAMES = "Workers";
        public static final String COLUMN_NAME_WORKER_ID = "idWorker";
        public static final String COLUMN_NAME_FIRSTNAME = "Firstname";
        public static final String COLUMN_NAME_NAME = "Name";
        public static final String COLUMN_NAME_BIRTHDATE = "Birthdate";
        public static final String COLUMN_NAME_SEXE = "Sexe";

    }

    //public static abstract class activity implements  BaseColumns


}
