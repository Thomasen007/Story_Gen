package com.example.storygenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.storygenerator.MESSAGE";
    EditText name;
    EditText gender;
    EditText color;
    EditText location;
    EditText number;
    EditText like_one;
    EditText like_two;
    EditText like_three;
    EditText dislike_one;
    EditText dislike_two;
    EditText dislike_three;
    Button clear_btn;
    Button submit_btn;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.name);
        gender=findViewById(R.id.gender);
        color=findViewById(R.id.color);
        location=findViewById(R.id.location);
        number=findViewById(R.id.number);
        like_one=findViewById(R.id.like_one);
        like_two=findViewById(R.id.like_two);
        like_three=findViewById(R.id.like_three);
        dislike_one=findViewById(R.id.dislike_one);
        dislike_two=findViewById(R.id.dislike_two);
        dislike_three=findViewById(R.id.dislike_three);
        clear_btn=findViewById(R.id.clear_btn);
        submit_btn=findViewById(R.id.submit_btn);
        clear_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.getText().clear();
                gender.getText().clear();
                color.getText().clear();
                location.getText().clear();
                number.getText().clear();
                like_one.getText().clear();
                like_two.getText().clear();
                like_three.getText().clear();
                dislike_one.getText().clear();
                dislike_two.getText().clear();
                dislike_three.getText().clear();
            }
        });
       // submit_btn.setOnClickListener(new View.OnClickListener() {
           // @Override

       // });
    }


    public void theSubmit(View view) {
        char result = name.getText().charAt(0);
        Character c1 = new Character(result);
        if (c1.equals('A') || c1.equals('B') || c1.equals('C') || c1.equals('D') || c1.equals('E') || c1.equals('F') || c1.equals('G') || c1.equals('H')) {
            System.out.println("First Test");
            MainActivity mainclass = new MainActivity();
            mainclass.firstStory();
        } else if (c1.equals('I') || c1.equals('J') || c1.equals('K') || c1.equals('L') || c1.equals('M') || c1.equals('N') || c1.equals('O') || c1.equals('P')) {
            System.out.println("Second Test");
            MainActivity mainclass = new MainActivity();
            mainclass.secondStory();
        } else if (c1.equals('Q') || c1.equals('R') || c1.equals('S') || c1.equals('T') || c1.equals('U') || c1.equals('V') || c1.equals('W') || c1.equals('X') || c1.equals('Y') || c1.equals('Z')) {
            System.out.println("Third Test");
            MainActivity mainclass = new MainActivity();
            mainclass.thirdStory();
        } else {
            MainActivity mainclass = new MainActivity();
            mainclass.error();
        }
    }

    public void firstStory() {

    }

    public void secondStory() {

    }

    public void thirdStory() {

    }

    public void error() {
        Intent intent = new Intent(this, SubmitPageError.class);
        String message = ("ERROR: Your name either didn't start with a letter or was not capitalized. Try Again.");
        final String TAG = "MyActivity";
        Log.d(TAG, "About to create intent with " + message);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}