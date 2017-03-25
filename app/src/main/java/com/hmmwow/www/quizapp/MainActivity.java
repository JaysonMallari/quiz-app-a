package com.hmmwow.www.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String name;
    int[] answer = { R.id.quack, R.id.meh, R.id.cock_a_doodle_doo, R.id.monkey, R.id.caterpillar};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Regiter and greet the user input
     * @param v
     */

    public void checkedName(View v){
        EditText userName  = (EditText) findViewById(R.id.user_name);
        name  = userName.getText().toString();
        CheckBox checkBoxName = (CheckBox) findViewById(R.id.check_name);
        checkBoxName.setText("Welcome to Quiz App " +name+ " and Goodluck !");

    }

    /**
     * Check the answers are correct
     */
    public void submit(View v){
        int total = 0;

        for(int x=0;x<answer.length;x++){

            RadioButton radioButton = (RadioButton) findViewById(answer[x]);
            Boolean correcthasChecked = radioButton.isChecked();

            if (correcthasChecked){
                total+=1;
            }
        }

        String output = name + " Score is "+total+"/5 .";
        Toast.makeText(getApplicationContext(),output ,Toast.LENGTH_LONG).show();

    }
}
