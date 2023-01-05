package de.reecertv.kana;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.Random;

public class QuizActivity extends AppCompatActivity {

    private TextView textViewChar;
    private Button button1, button2, button3, button4;
    private int count = 1;
    private ArrayList<String[]> quizzes;
    private ArrayList<String[]> mistakes;
    private int bound;
    private Stuff.Script script;
    private ScriptManager sm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        textViewChar = findViewById(R.id.QuizTextViewChar);
        button1 = findViewById(R.id.QuizButton1);
        button2 = findViewById(R.id.QuizButton2);
        button3 = findViewById(R.id.QuizButton3);
        button4 = findViewById(R.id.QuizButton4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(button1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(button2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(button3);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(button4);
            }
        });

        //region Get Quizzes
        quizzes = new ArrayList<String[]>();
        mistakes = new ArrayList<String[]>();
        ArrayList<Integer> numList = new ArrayList<Integer>();
        bound = Stuff.charNum;
        script = Stuff.selectedScript;

        sm = new ScriptManager();

        for (int i = 0; i < 22; i++) {
            Random rand = new Random();
            int num = rand.nextInt(bound);
            while (numList.contains(num)) {
                num = rand.nextInt(bound);
            }
            numList.add(num);

            num++;

            if (script == Stuff.Script.Hiragana) {
                quizzes.add(new String[]{sm.getHiragana(num)[0], sm.getHiragana(num)[1], sm.getHiragana(num)[2]});
                //loadHiragana(num++);
            } else if (script == Stuff.Script.Katakana) {
                quizzes.add(new String[]{sm.getKatakana(num)[0], sm.getKatakana(num)[1], sm.getKatakana(num)[2]});
                //loadKatakana(num++);
            }
        }
        //endregion

        showQuiz(quizzes.get(count));
    }

    private void showQuiz(@NonNull String[] quiz) {
        textViewChar.setText(quiz[0]);

        ArrayList<Integer> numList = new ArrayList<Integer>();
        ArrayList<String[]> randButtonChars = new ArrayList<String[]>();

        for (int i = 0; i < 3; i++) {
            Random rand = new Random();
            int num = rand.nextInt(bound);
            while (numList.contains(num)) {
                num = rand.nextInt(bound);
            }
            numList.add(num);

            num++;

            if (script == Stuff.Script.Hiragana) {
                randButtonChars.add(new String[]{sm.getHiragana(num)[0], sm.getHiragana(num)[1], sm.getHiragana(num)[2]});
                //loadHiragana(num++);
            } else if (script == Stuff.Script.Katakana) {
                randButtonChars.add(new String[]{sm.getKatakana(num)[0], sm.getKatakana(num)[1], sm.getKatakana(num)[2]});
                //loadKatakana(num++);
            }
        }

        String[] texts = new String[]{quiz[1], randButtonChars.get(0)[1], randButtonChars.get(1)[1], randButtonChars.get(2)[1]};

        ArrayList<Integer> order = new ArrayList<Integer>();

        for (int i = 0; i < 4; i++) {
            Random rand = new Random();
            int num = rand.nextInt(4);
            while (order.contains(num)) {
                num = rand.nextInt(4);
            }
            order.add(num);
        }

        button1.setText(texts[order.get(0)]);
        button2.setText(texts[order.get(1)]);
        button3.setText(texts[order.get(2)]);
        button4.setText(texts[order.get(3)]);
    }

    private void checkAnswer(@NonNull Button button) {
        if (count == 20) {
            Stuff.mistakes = mistakes;
            Intent intent = new Intent(QuizActivity.this, ResultsActivity.class);
            startActivity(intent);
        }

        if (button.getText() == quizzes.get(count)[1]) {
            RelativeLayout relativeLayout = findViewById(R.id.QuizRelativeLayout);

            Snackbar snackbar = Snackbar.make(relativeLayout, "Correct!", Snackbar.LENGTH_LONG);
            //snackbar.show();
        } else {
            RelativeLayout relativeLayout = findViewById(R.id.QuizRelativeLayout);

            Snackbar snackbar = Snackbar.make(relativeLayout, "Wrong!", Snackbar.LENGTH_LONG);
            //snackbar.show();

            mistakes.add(new String[]{(String) textViewChar.getText(), quizzes.get(count)[1], (String) button.getText()});
        }

        count++;
        showQuiz(quizzes.get(count));
    }
}