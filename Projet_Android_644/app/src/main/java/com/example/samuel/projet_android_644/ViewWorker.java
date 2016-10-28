package com.example.samuel.projet_android_644;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class ViewWorker extends AppCompatActivity {
    public final static String CONTACT = "com.example.samuel.projet_android_644.WORKER";

    private Button modify;
    private TextView firstName;
    private TextView lastName;
    private TextView sex;
    private TextView active;
    private TextView birthdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_worker);

        modify = (Button) findViewById(R.id.btn_Modify);
        firstName = (TextView) findViewById(R.id.tv_firstname_value);
        lastName = (TextView) findViewById(R.id.tv_lastname_value);
        sex = (TextView) findViewById(R.id.tv_sex_value);
        active = (TextView) findViewById(R.id.tv_workerActivated_value);
        birthdate = (TextView) findViewById(R.id.tv_birthdate_value);

        modify.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String sFirstname = firstName.getText().toString();
                String sLastname = lastName.getText().toString();
                String sSex = sex.getText().toString();
                String sActive = active.getText().toString();
                String sBirthdate = birthdate.getText().toString();

                //Worker w = new Worker(sLastname,sFirstname,sBirthdate,sSex,sActive,sBirthdate);

                Intent intent = new Intent(ViewWorker.this, EditWorker.class);
                //intent.putExtra(CONTACT, w);
                ViewWorker.this.startActivity(intent);

            }
        });
    }
}
