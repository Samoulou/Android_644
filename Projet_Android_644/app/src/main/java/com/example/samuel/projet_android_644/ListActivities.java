package com.example.samuel.projet_android_644;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListActivities extends AppCompatActivity {
    private ListView _listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_activities);

        _listView = (ListView) findViewById(R.id.lv_activities);

        List<Activity> activities = get_AllActivities();

        ActivityAdapter adapter = new ActivityAdapter(ListActivities.this, activities);
        _listView.setAdapter(adapter);
    }

    private List<Activity> get_AllActivities(){
        List<Activity> activities = new ArrayList<Activity>();

        activities.add(new Activity("Projet A",false));
        activities.add(new Activity("Projet B",true));
        activities.add(new Activity("Chantier X",false));
        activities.add(new Activity("Chantier Y",true));
        activities.add(new Activity("Chantier Z",true));

        return activities;
    }
}
