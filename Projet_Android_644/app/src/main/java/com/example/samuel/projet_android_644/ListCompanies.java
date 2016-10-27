package com.example.samuel.projet_android_644;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ListCompanies extends AppCompatActivity {
    private ListView _listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_companies);


        _listView = (ListView) findViewById(R.id.lv_companies);

        List<Company> companies = get_AllCompanies();

        CompanyAdapter adapter = new CompanyAdapter(ListCompanies.this, companies);
        _listView.setAdapter(adapter);
    }

    private List<Company> get_AllCompanies(){
        List<Company> companies = new ArrayList<Company>();

        companies.add(new Company("HES-So",true));
        companies.add(new Company("Google",true));
        companies.add(new Company("Clip Industrie",false));

        return companies;
    }
}
