package com.example.samuel.projet_android_644;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ListWorkers extends AppCompatActivity {
    ListView _listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_workers);

        _listView = (ListView) findViewById(R.id.lv_workers);

        List<Worker> workers = genererWorkers();

        WorkerAdapter adapter = new WorkerAdapter(ListWorkers.this, workers);
        _listView.setAdapter(adapter);
    }



    private List<Worker> genererWorkers(){
        List<Worker> workers = new ArrayList<Worker>();
        workers.add(new Worker("Duchmol","Florent", Date.valueOf("1980-07-07"),'m'));
        workers.add(new Worker("Schaler","Noémie", Date.valueOf("1991-12-12"),'f'));
        workers.add(new Worker("Dupont","Thierry", Date.valueOf("1971-10-09"),'m'));
        workers.add(new Worker("Fournier","Clémantine", Date.valueOf("1996-01-08"),'f'));
        return workers;
    }
}
