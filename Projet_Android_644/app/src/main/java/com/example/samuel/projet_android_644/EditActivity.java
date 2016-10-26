package com.example.samuel.projet_android_644;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class EditActivity extends AppCompatActivity {
    private ListView _listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_activity);
        _listView = (ListView) findViewById(R.id.adding_worker);

        List<Worker> workers = loadDefaultWorker();

        WorkerAdapter adapter = new WorkerAdapter(EditActivity.this, workers);
        _listView.setAdapter(adapter);
    }

    private List<Worker> loadDefaultWorker(){
        List<Worker> workers = new ArrayList<Worker>();
        workers.add(new Worker("Duchmol","Florent", Date.valueOf("1980-07-07"),'m',true));
        return workers;
    }
}
