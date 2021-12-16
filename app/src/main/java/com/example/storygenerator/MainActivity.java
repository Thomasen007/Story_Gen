package com.example.storygenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
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

        name = findViewById(R.id.name);
        gender = findViewById(R.id.gender);
        color = findViewById(R.id.color);
        location = findViewById(R.id.location);
        number = findViewById(R.id.number);
        like_one = findViewById(R.id.like_one);
        like_two = findViewById(R.id.like_two);
        like_three = findViewById(R.id.like_three);
        dislike_one = findViewById(R.id.dislike_one);
        dislike_two = findViewById(R.id.dislike_two);
        dislike_three = findViewById(R.id.dislike_three);
        clear_btn = findViewById(R.id.clear_btn);
        submit_btn = findViewById(R.id.submit_btn);
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

        if (c1.toString().matches("[A-Ha-h]")) {
            System.out.println("First Test");
            firstStory(view);
        } else if (c1.toString().matches("[I-Pi-p]")) {
            System.out.println("Second Test");
            secondStory(view);
        } else if (c1.toString().matches("[Q-Zq-z]")) {
            System.out.println("Third Test");
            thirdStory(view);
        } else {
            error();
        }
    }


    public void firstStory(View view) {
        Intent intent = new Intent(this, FirstStory.class);
        EditText text1 = (EditText) name;
        EditText text2 = (EditText) gender;
        EditText text3 = (EditText) color;
        EditText text4 = (EditText) number;
        EditText text5 = (EditText) location;
        EditText text6 = (EditText) like_one;
        EditText text7 = (EditText) like_two;
        EditText text8 = (EditText) like_three;
        EditText text9 = (EditText) dislike_one;
        EditText text10 = (EditText) dislike_two;
        EditText text11 = (EditText) dislike_three;
        String name1 = text1.getText().toString();
        String gender1 = text2.getText().toString();
        String color1 = text3.getText().toString();
        String number1 = text4.getText().toString();
        String location1 = text5.getText().toString();
        String like1 = text6.getText().toString();
        String like2 = text7.getText().toString();
        String like3 = text8.getText().toString();
        String dislike1 = text9.getText().toString();
        String dislike2 = text10.getText().toString();
        String dislike3 = text11.getText().toString();
        name1 = randomName(name1);

        if (gender1.matches("[Ff]")) {
            String the_gender = "woman";
            String he_she = "she";
            String his_her = "her";
            String message = ("Once upon a time, in the year 2019, there was a " + the_gender + " named " + name1 + ". " + name1 + " was looking for an adventure to go on, but didn't know what to do! One day, " + name1 + " was able to go to " + location1 + ". This was crazy, because this is " + name1 + "s favorite place ever! So " + name1 + " put on the best " + color1 + " shirt and decided that " + he_she + " would stay there for " + number1 + " days! " + name1 + " decided to include all of " + his_her + " favorite things in this adventure! " + like1 + ", " + like2 + ", and " + like3 + "! As " + he_she + " started the trip, " + name1 + " encountered " + dislike3 + ". 'Of course!', thought " + name1 + ". 'This is one of my least favorite things ever! The only thing worse is if I found " + dislike2 + " or " + dislike1 + "'. After spending a few days in " + location1 + ", however, " + name1 + " learned to appreciate the small things. Although, the adventure didn't go exactly how " + he_she + " planned it, it was an adventure nonetheless! And that is what " + name1 + " was desperately wanting in the first place! The End. ");
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        } else if (gender1.matches("[Mm]")) {
            String the_gender = "man";
            String he_she = "he";
            String his_her = "his";
            String message = ("Once upon a time, in the year 2019, there was a " + the_gender + " named " + name1 + ". " + name1 + " was looking for an adventure to go on, but didn't know what to do! One day, " + name1 + " was able to go to " + location1 + ". This was crazy, because this is " + name1 + "s favorite place ever! So " + name1 + " put on the best " + color1 + " shirt and decided that " + he_she + " would stay there for " + number1 + " days! " + name1 + " decided to include all of " + his_her + " favorite things in this adventure! " + like1 + ", " + like2 + ", and " + like3 + "! As " + he_she + " started the trip, " + name1 + " encountered " + dislike3 + ". 'Of course!', thought " + name1 + ". 'This is one of my least favorite things ever! The only thing worse is if I found " + dislike2 + " or " + dislike1 + "'. After spending a few days in " + location1 + ", however, " + name1 + " learned to appreciate the small things. Although, the adventure didn't go exactly how " + he_she + " planned it, it was an adventure nonetheless! And that is what " + name1 + " was desperately wanting in the first place! The End. ");
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        } else {
            error();
        }

    }

    public void secondStory(View view) {
        Intent intent = new Intent(this, SecondStory.class);
        EditText text1 = (EditText) name;
        EditText text2 = (EditText) gender;
        EditText text3 = (EditText) color;
        EditText text4 = (EditText) number;
        EditText text5 = (EditText) location;
        EditText text6 = (EditText) like_one;
        EditText text7 = (EditText) like_two;
        EditText text8 = (EditText) like_three;
        EditText text9 = (EditText) dislike_one;
        EditText text10 = (EditText) dislike_two;
        EditText text11 = (EditText) dislike_three;
        String name1 = text1.getText().toString();
        String gender1 = text2.getText().toString();
        String color1 = text3.getText().toString();
        String number1 = text4.getText().toString();
        String location1 = text5.getText().toString();
        String like1 = text6.getText().toString();
        String like2 = text7.getText().toString();
        String like3 = text8.getText().toString();
        String dislike1 = text9.getText().toString();
        String dislike2 = text10.getText().toString();
        String dislike3 = text11.getText().toString();
        name1 = randomName(name1);

        if (gender1.matches("[Ff]")) {
            String the_gender = "woman";
            String he_she = "she";
            String his_her = "her";
            String message = ("A long time ago, there lived a " + the_gender + ". " + his_her + " name was " + name1 + ". " + he_she + " lived in a little " + color1 + " house in " + location1 + ". This was " + his_her + " favorite place in the world, so " + he_she + " never wanted to leave! " + he_she + " loved this place so much because it had all of " + his_her + " favorite things! " + like1 + ", " + like2 + ", and " + like3 + ". 'I will never go anywhere else', thought " + name1 + ". Then, one day, a mysterious wizard appeared in " + name1 + "s home. This wizard spoke to " + name1 + " and said, 'You need to learn to live outside your comfort zone every once in a while.' He waved his wand " + number1 + " times and *poof*! Before " + name1 + " knew it, " + he_she + " was sitting in a chair in a weird cold room. As " + he_she + " looked around, " + he_she + " began to see all of the things " + he_she + " hates! " + dislike1 + ", " + dislike2 + ", and even " + dislike3 + ". 'This is the worst!', " + he_she + " thought. The wizard came back after a few days. " + name1 + " begged him to send " + his_her + " butt back to " + location1 + ". The wizard said, 'not until you learn your lesson!'. Eventually, " + name1 + " learned to love the things " + he_she + " once hated. The wizard finally came again and offered " + name1 + " a chance to go back to " + his_her + " home. 'This is my home. I am right where I want to be', said " + name1 + ". " + name1 + " finally learned " + his_her + " lesson. The End.");
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        } else if (gender1.matches("[Mm]")) {
            String the_gender = "man";
            String he_she = "he";
            String his_her = "his";
            String message = ("A long time ago, there lived a " + the_gender + ". " + his_her + " name was " + name1 + ". " + he_she + " lived in a little " + color1 + " house in " + location1 + ". This was " + his_her + " favorite place in the world, so " + he_she + " never wanted to leave! " + he_she + " loved this place so much because it had all of " + his_her + " favorite things! " + like1 + ", " + like2 + ", and " + like3 + ". 'I will never go anywhere else', thought " + name1 + ". Then, one day, a mysterious wizard appeared in " + name1 + "s home. This wizard spoke to " + name1 + " and said, 'You need to learn to live outside your comfort zone every once in a while.' He waved his wand " + number1 + " times and *poof*! Before " + name1 + " knew it, " + he_she + " was sitting in a chair in a weird cold room. As " + he_she + " looked around, " + he_she + " began to see all of the things " + he_she + " hates! " + dislike1 + ", " + dislike2 + ", and even " + dislike3 + ". 'This is the worst!', " + he_she + " thought. The wizard came back after a few days. " + name1 + " begged him to send " + his_her + " butt back to " + location1 + ". The wizard said, 'not until you learn your lesson!'. Eventually, " + name1 + " learned to love the things " + he_she + " once hated. The wizard finally came again and offered " + name1 + " a chance to go back to " + his_her + " home. 'This is my home. I am right where I want to be', said " + name1 + ". " + name1 + " finally learned " + his_her + " lesson. The End.");
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        } else {
            error();
        }
    }

    public void thirdStory(View view) {
        Intent intent = new Intent(this, ThirdStory.class);
        EditText text1 = (EditText) name;
        EditText text2 = (EditText) gender;
        EditText text3 = (EditText) color;
        EditText text4 = (EditText) number;
        EditText text5 = (EditText) location;
        EditText text6 = (EditText) like_one;
        EditText text7 = (EditText) like_two;
        EditText text8 = (EditText) like_three;
        EditText text9 = (EditText) dislike_one;
        EditText text10 = (EditText) dislike_two;
        EditText text11 = (EditText) dislike_three;
        String name1 = text1.getText().toString();
        String gender1 = text2.getText().toString();
        String color1 = text3.getText().toString();
        String number1 = text4.getText().toString();
        String location1 = text5.getText().toString();
        String like1 = text6.getText().toString();
        String like2 = text7.getText().toString();
        String like3 = text8.getText().toString();
        String dislike1 = text9.getText().toString();
        String dislike2 = text10.getText().toString();
        String dislike3 = text11.getText().toString();
        name1=randomName(name1);



        if (gender1.matches("[Ff]")) {
            String the_gender = "woman";
            String he_she = "she";
            String his_her = "her";
            String himself_herself = "herself";
            String message = (name1 + " was born into a family with very little money. As " + he_she + " grew up, " + name1 + " continuously thought to " + himself_herself + " that being poor was not fun at all! 'Why can't we just be rich?'. Other than the fact the their house was " + his_her + " favorite color, " + color1 + ", everything else was terrible. " + dislike1 + ", " + dislike2 + ", and " + dislike3 + " were all part of " + his_her + " daily life. 'Dad, why can't we be rich', " + name1 + " said to " + his_her + " dad. That is when " + his_her + " dad taught a very important lesson. '" + name1 + ", just because we don't have a lot of money, does not mean we are not rich. Think about all of your favorite things! " + like1 + ", " + like2 + ", " + like3 + ". All these things would probably not be so special to you if we had all the money in the world!'. " + name1 + " has thought about this lesson at least " + number1 + " times since that day. Now, no matter what the financial situation looks like in " + his_her + " life, " + name1 + " will always be rich. The End.");
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        } else if (gender1.matches("[Mm]")) {
            String the_gender = "man";
            String he_she = "he";
            String his_her = "his";
            String himself_herself = "himself";
            String message = (name1 + " was born into a family with very little money. As " + he_she + " grew up, " + name1 + " continuously thought to " + himself_herself + " that being poor was not fun at all! 'Why can't we just be rich?'. Other than the fact the their house was " + his_her + " favorite color, " + color1 + ", everything else was terrible. " + dislike1 + ", " + dislike2 + ", and " + dislike3 + " were all part of " + his_her + " daily life. 'Dad, why can't we be rich', " + name1 + " said to " + his_her + " dad. That is when " + his_her + " dad taught a very important lesson. '" + name1 + ", just because we don't have a lot of money, does not mean we are not rich. Think about all of your favorite things! " + like1 + ", " + like2 + ", " + like3 + ". All these things would probably not be so special to you if we had all the money in the world!'. " + name1 + " has thought about this lesson at least " + number1 + " times since that day. Now, no matter what the financial situation looks like in " + his_her + " life, " + name1 + " will always be rich. The End.");
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        } else {
            error();
        }
    }

    public void error() {
        Intent intent = new Intent(this, SubmitPageError.class);
        String message = ("ERROR: Your name didn't start with a letter. Alternatively, you may have incorrectly put in your gender. Make sure you put either 'M' or 'F' for the Gender. Try Again.");
        final String TAG = "MyActivity";
        Log.d(TAG, "About to create intent with " + message);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public String randomName(String input) {
        String newName = "";
        String[] strArr = input.split("");
        String[] vow = newArray(strArr, 0);
        String[] con = newArray(strArr, 1);
        int len = input.length();
        for (int i = 0; i < strArr.length; i++) {

            if (i % 2 == 0) {
                int k = getRandomNumber(0, con.length);
                if (newName == "") {
                    String cap = con[k].toUpperCase();
                    newName = newName.concat(cap);
                } else {
                    newName = newName.concat(con[k]);
                }
            } else {
                int k = getRandomNumber(0, vow.length);
                newName = newName.concat(vow[k]);
            }
        }
        return newName;
    }

    public static String[] newArray(String[] arr, int input) {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (input == 0) {
                if (arr[i].matches("[AEIOUYaeiouy]")) {
                    str = str.concat(arr[i].toLowerCase());
                }
            } else {
                if (arr[i].matches("[^AEIOUYaeiouy]")) {
                    str = str.concat(arr[i].toLowerCase());
                }
            }
        }
        String[] newArr = str.split("");
        return newArr;
    }

    public static String[] removeTheElement(String[] arr, int index) {
        if (arr == null || index < 0
                || index >= arr.length) {

            return arr;
        }

        String[] anotherArray = new String[arr.length - 1];

        for (int i = 0, k = 0; i < arr.length; i++) {

            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }

        return anotherArray;
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

}