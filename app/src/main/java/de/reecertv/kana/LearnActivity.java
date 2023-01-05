package de.reecertv.kana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Random;

public class LearnActivity extends AppCompatActivity {

    ViewPager2 viewPager2;
    CharFSA charFSA;
    Stuff.Script script;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        script = Stuff.selectedScript;

        viewPager2 = findViewById(R.id.LearnViewPager2);
        charFSA = new CharFSA(getSupportFragmentManager(), getLifecycle());

        loadChars();

        viewPager2.setAdapter(charFSA);
    }

    private void loadChars() {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        int bound = Stuff.charNum;

        ScriptManager sm = new ScriptManager();

        for (int i = 0; i < bound; i++) {
            Random rand = new Random();
            int num = rand.nextInt(bound);
            while (numList.contains(num)) {
                num = rand.nextInt(bound);
            }
            numList.add(num);

            num++;

            if (script == Stuff.Script.Hiragana) {
                addChar(sm.getHiragana(num)[0], sm.getHiragana(num)[1], sm.getHiragana(num)[2]);
                //loadHiragana(num++);
            } else if (script == Stuff.Script.Katakana) {
                addChar(sm.getKatakana(num)[0], sm.getKatakana(num)[1], sm.getKatakana(num)[2]);
                //loadKatakana(num++);
            }

        }
    }

    private void addChar(String _char, String _charLatin, String _writingLink) {
        charFSA.addFragment(new CharFragment(_char, _charLatin, _writingLink));
    }
}