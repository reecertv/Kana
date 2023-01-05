package de.reecertv.kana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ResultsActivity extends AppCompatActivity {

    private TextView textViewPercentage;
    private ListView listViewMistakes;
    private ArrayList<String[]> mistakes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        textViewPercentage = findViewById(R.id.ResultsTextViewPercentage);
        listViewMistakes = findViewById(R.id.ResultsListView);

        mistakes = Stuff.mistakes;

        double mistakesCount = (double) mistakes.size();
        double percentage = (20 - mistakesCount) / 20 * 100;
        textViewPercentage.setText(percentage + "%");
    }
}