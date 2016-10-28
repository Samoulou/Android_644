package com.example.samuel.projet_android_644;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class EditWorker extends AppCompatActivity {
    private Button _btnSave;
    private Button _btnCancel;
    private Button _btnDelete;
    private EditText _etFirstname;
    private EditText _etLastname;
    private RadioButton _rbSexF;
    private RadioButton _rbSexM;
    private Switch _swActive;
    private EditText _etBirthdate;

    private Worker _worker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_worker);
        Intent intent = getIntent();
        _worker = intent.getParcelableExtra(ViewWorker.WORKER_VIEW);

        _etFirstname = (EditText) findViewById(R.id.et_firstname);
        _etLastname = (EditText) findViewById(R.id.et_lastname);
        _etBirthdate = (EditText) findViewById(R.id.et_Birthdate);
        _rbSexF = (RadioButton) findViewById(R.id.rb_female);
        _rbSexM = (RadioButton) findViewById(R.id.rb_male);
        _swActive = (Switch) findViewById(R.id.sw_worker_activated);


        _etFirstname.setText(_worker.get_firstname());
        _etLastname.setText(_worker.get_lastname());
        _etBirthdate.setText(_worker.get_birthdate().toString());
        if (_worker.get_sex() == 'm') {
            _rbSexM.setActivated(true);
            _rbSexF.setActivated(false);
        } else {
            _rbSexM.setActivated(false);
            _rbSexF.setActivated(true);
        }

        _swActive.setActivated(_worker.is_active());
        //setText(String.valueOf(_worker.is_active()));  //.setText(c.getCP());

        _btnSave = (Button) findViewById(R.id.btn_Save);
        _btnSave.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditWorker.this, ViewWorker.class);
                intent.putExtra(ViewWorker.WORKER_VIEW, _worker);
                EditWorker.this.startActivity(intent);
            }
        });
    }
}
