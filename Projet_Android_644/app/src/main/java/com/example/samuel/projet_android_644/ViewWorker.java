package com.example.samuel.projet_android_644;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class ViewWorker extends AppCompatActivity {
    public final static String WORKER_VIEW = "com.example.samuel.projet_android_644.WORKER";

    private Button _btnModify;
    private TextView _tvFirstname;
    private TextView _tvLastname;
    private TextView _tvSex;
    private TextView _tvActive;
    private TextView _tvBirthdate;

    private Worker _worker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_worker);


        Intent intent = getIntent();
        _worker = intent.getParcelableExtra(ListWorkers.WORKER);


        _tvLastname = (TextView) findViewById(R.id.tv_lastname_value);
        _tvFirstname = (TextView) findViewById(R.id.tv_firstname_value);
        _tvBirthdate = (TextView) findViewById(R.id.tv_birthdate_value);
        _tvSex = (TextView) findViewById(R.id.tv_sex_value);
        _tvActive = (TextView) findViewById(R.id.tv_workerActivated_value);




//        _tvLastname.setText(_worker.get_lastname());
  //      _tvFirstname.setText(_worker.get_firstname());
    //    _tvBirthdate.setText(_worker.get_birthdate().toString());
      //  _tvSex.setText(String.valueOf(_worker.get_sex()));
        //_tvActive.setText(String.valueOf(_worker.is_active()));  //.setText(c.getCP());

        _btnModify = (Button) findViewById(R.id.btn_Modify);
        //_btnModify.setOnClickListener(new View.OnClickListener() {


            /*public void onClick(View v) {
                Intent intent = new Intent(ViewWorker.this, EditWorker.class);
                intent.putExtra("Class", "ViewWorker");
                intent.putExtra(ViewWorker.WORKER_VIEW, _worker);
                ViewWorker.this.startActivity(intent);
            }*/
        };
    }
