package com.example.sarjhu.prochecq;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sarjhu.prochecq.ManualDetails;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText date1,payto,words,nums,accno,cheq,micr,brno,two;
    DatabaseReference mref;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        date1= findViewById(R.id.date1);
        payto=findViewById(R.id.payto);
        words=findViewById(R.id.words);
        nums=findViewById(R.id.nums);
        accno=findViewById(R.id.accno);
        cheq=findViewById(R.id.cheqno);
        micr=findViewById(R.id.micr);
        brno=findViewById(R.id.brno);
        two=findViewById(R.id.two);
        button = findViewById(R.id.ok);

        mref = FirebaseDatabase.getInstance().getReference("Manual Details");
        FirebaseApp.initializeApp(MainActivity.this);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                         public void onClick(View v) {
                             insert();
                        }
                    }

                    );
    }

    public void insert()
    {
        String textdate = date1.getText().toString().trim();
        String textpayto = payto.getText().toString().trim();
        String textwords = words.getText().toString().trim();
        Integer textnums = Integer.getInteger(nums.getText().toString());
        Integer textaccno = Integer.getInteger(accno.getText().toString());
        Integer textcheq = Integer.getInteger(cheq.getText().toString());
        Integer textmicr = Integer.getInteger(micr.getText().toString());
        Integer textbrno = Integer.getInteger(brno.getText().toString());
        Integer texttwo = Integer.getInteger(two.getText().toString());


        if(TextUtils.isEmpty(textpayto)){
            Toast.makeText(this, "Enter the name", Toast.LENGTH_LONG).show();
        }
        else
        {
            String dbId = mref.push().getKey();

            ManualDetails md = new ManualDetails (dbId, textdate, textpayto, textwords, textnums, textaccno, textcheq, textmicr, textbrno, texttwo);
            mref.child(dbId).setValue(md);

            Toast.makeText(this,"Values uploaded ", Toast.LENGTH_LONG).show();

        }

    }
}
