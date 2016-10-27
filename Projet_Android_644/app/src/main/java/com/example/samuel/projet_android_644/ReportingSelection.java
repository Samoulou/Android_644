package com.example.samuel.projet_android_644;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ReportingSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporting_selection);

        spinner_filler(R.id.worker_spinner, R.array.workers);
        spinner_filler(R.id.company_spinner, R.array.companies);
        spinner_filler(R.id.activitiy_spinner, R.array.activities);
    }

    public void spinner_filler(int spinner_name, int array_name)
    {
        Spinner spinner = (Spinner) findViewById(spinner_name);
        //Remplissage du spinner avec le string-array du strings.xml
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, array_name, android.R.layout.simple_spinner_item);
        //spécification du layout
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //application de l'adapter au spinner
        spinner.setAdapter(adapter);

    }
}
