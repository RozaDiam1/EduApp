package com.example.android.eduapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    RadioButton Firstradiobutton, First1radiobutton, Second0radiobutton, Second_radiobutton;
    RadioButton Secondradiobutton, Second1radiobutton, Firts0radiobutton, First_radiobutton;
    RadioButton Thirdradiobutton, Third1radiobutton, Third0radiobutton, Third_radiobutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button continue_playing = (Button) findViewById(R.id.gotourl);
        continue_playing.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("http://www.proprofs.com/quiz-school/topic/greece"));
                startActivity(myWebLink);
            }
        });


        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
                System.exit(0);
            }
        });
    }


    public void onRadioButtonClicked(View view) {
// Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.Firstradiobutton:
                if (checked)
                // RadioButton id 1
                {
                    Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.First1radiobutton:
                if (checked)
                //RadioButton id 2
                {
                    Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                }

                break;
            case R.id.Second0radiobutton:
                if (checked)
                //RadioButton id 2
                {
                    Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                }

                break;
            case R.id.Second_radiobutton:
                if (checked)
                //RadioButton id 2
                {
                    Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                }
                break;


            case R.id.Secondradiobutton:
                if (checked) {
                    Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
                }
                break;


            case R.id.Thirdradiobutton:
                if (checked) {
                    Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.Second1radiobutton:
                if(checked)
                {
                    Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.Third1radiobutton:
                if(checked)
                {
                    Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.First0radiobutton:
                if(checked)
                {
                    Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.Third0radiobutton:
                if(checked)
                {
                    Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.First_radiobutton:
                if(checked)
                {
                    Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.Third_radiobutton:
                if(checked)
                {
                    Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
                }
                break;
        }


    };}




