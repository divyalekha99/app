package com.example.sarjhu.prochecq;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText date1,payto,words,nums,accno,cheq,micr,brno,two;
    DatabaseReference mref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        date1=(EditText)findViewById(R.id.date1);
        payto=(EditText)findViewById(R.id.payto);
        words=(EditText)findViewById(R.id.words);
        nums=(EditText)findViewById(R.id.nums);
        accno=(EditText)findViewById(R.id.accno);
        cheq=(EditText)findViewById(R.id.cheqno);
        micr=(EditText)findViewById(R.id.micr);
        brno=(EditText)findViewById(R.id.brno);
        two=(EditText)findViewById(R.id.two);

        mref = FirebaseDatabase.getInstance().getReference();
        FirebaseApp.initializeApp(MainActivity.this);
        

    }
}
