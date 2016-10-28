package com.example.samuel.projet_android_644;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ListWorkers extends AppCompatActivity {
    public final static String WORKER = "com.example.samuel.projet_android_644.WORKER";
    private ListView _lvWorkers;
    List<Worker> _workers = new ArrayList<Worker>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_workers);

        _lvWorkers = (ListView) findViewById(R.id.lv_workers);

        _workers = get_AllWorkers();

        WorkerAdapter adapter = new WorkerAdapter(ListWorkers.this, _workers);
        _lvWorkers.setAdapter(adapter);


        _lvWorkers.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                WorkerAdapter adapter = new WorkerAdapter(ListWorkers.this, _workers);
                Worker w = adapter.getItem(position);

                Intent intent = new Intent(ListWorkers.this, ViewWorker.class);
                intent.putExtra(ViewWorker.WORKER_VIEW, w);
                ListWorkers.this.startActivity(intent);
            }
        });
    }



    private List<Worker> get_AllWorkers(){
        List<Worker> workers = new ArrayList<Worker>();

        workers.add(new Worker("Duchmol","Florent", Date.valueOf("1980-07-07"),'m',false));
        workers.add(new Worker("Schaler","Noémie", Date.valueOf("1991-12-12"),'f',true));
        workers.add(new Worker("Dupont","Thierry", Date.valueOf("1971-10-09"),'m',false));
        workers.add(new Worker("Fournier","Pierre", Date.valueOf("1996-01-08"),'m',true));
        workers.add(new Worker("Fournier","Pierre", Date.valueOf("1948-12-18"),'m',true));
        workers.add(new Worker("Fournier","Clémentine", Date.valueOf("1996-01-08"),'f',true));
        workers.add(new Worker("Nanchen","Xavier", Date.valueOf("1969-10-27"),'m',true));
        workers.add(new Worker("Coppey","Samuel", Date.valueOf("1991-05-18"),'m',true));
        workers.add(new Worker("Pannatier","Alphonse", Date.valueOf("1990-10-18"),'m',false));
        workers.add(new Worker("Herren","Jacques", Date.valueOf("1975-12-29"),'m',true));
        workers.add(new Worker("Herren","Véronique", Date.valueOf("1981-01-08"),'f',true));
        workers.add(new Worker("Nobs","Olivia", Date.valueOf("1986-05-05"),'f',true));

        return workers;
    }
}
