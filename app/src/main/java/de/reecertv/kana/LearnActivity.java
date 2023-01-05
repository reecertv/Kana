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

    private void loadHiragana(int i) {
        switch (i) {
            // A-O
            case 1:
                addChar("あ", "a", "lol.com");
                break;

            case 2:
                addChar("い", "i", "lol.com");
                break;

            case 3:
                addChar("う", "u", "lol.com");
                break;

            case 4:
                addChar("え", "e", "lol.com");
                break;

            case 5:
                addChar("お", "o", "lol.com");
                break;

            // K
            case 6:
                addChar("か", "ka", "lol.com");
                break;

            case 7:
                addChar("き", "ki", "lol.com");
                break;

            case 8:
                addChar("く", "ku", "lol.com");
                break;

            case 9:
                addChar("け", "ke", "lol.com");
                break;

            case 10:
                addChar("こ", "ko", "lol.com");
                break;

            // S
            case 11:
                addChar("さ", "sa", "lol.com");
                break;

            case 12:
                addChar("し", "shi", "lol.com");
                break;

            case 13:
                addChar("す", "su", "lol.com");
                break;

            case 14:
                addChar("せ", "se", "lol.com");
                break;

            case 15:
                addChar("そ", "so", "lol.com");
                break;

            // T
            case 16:
                addChar("た", "ta", "lol.com");
                break;

            case 17:
                addChar("ち", "chi", "lol.com");
                break;

            case 18:
                addChar("つ", "tsu", "lol.com");
                break;

            case 19:
                addChar("て", "te", "lol.com");
                break;

            case 20:
                addChar("と", "to", "lol.com");
                break;

            // N
            case 21:
                addChar("な", "na", "lol.com");
                break;

            case 22:
                addChar("に", "ni", "lol.com");
                break;

            case 23:
                addChar("ぬ", "nu", "lol.com");
                break;

            case 24:
                addChar("ね", "ne", "lol.com");
                break;

            case 25:
                addChar("の", "no", "lol.com");
                break;

            // H
            case 26:
                addChar("は", "ha", "lol.com");
                break;

            case 27:
                addChar("ひ", "hi", "lol.com");
                break;

            case 28:
                addChar("ふ", "fu", "lol.com");
                break;

            case 29:
                addChar("へ", "he", "lol.com");
                break;

            case 30:
                addChar("ほ", "ho", "lol.com");
                break;

            // M
            case 31:
                addChar("ま", "ma", "lol.com");
                break;

            case 32:
                addChar("み", "mi", "lol.com");
                break;

            case 33:
                addChar("む", "mu", "lol.com");
                break;

            case 34:
                addChar("め", "me", "lol.com");
                break;

            case 35:
                addChar("も", "mo", "lol.com");
                break;

            // Y
            case 36:
                addChar("や", "ya", "lol.com");
                break;

            case 37:
                addChar("ゆ", "yu", "lol.com");
                break;

            case 38:
                addChar("よ", "yo", "lol.com");
                break;

            // R
            case 39:
                addChar("ら", "ra", "lol.com");
                break;

            case 40:
                addChar("り", "ri", "lol.com");
                break;

            case 41:
                addChar("る", "ru", "lol.com");
                break;

            case 42:
                addChar("れ", "re", "lol.com");
                break;

            case 43:
                addChar("ろ", "ro", "lol.com");
                break;

            // Others
            case 44:
                addChar("わ", "wa", "lol.com");
                break;

            case 45:
                addChar("を", "o / wo", "lol.com");
                break;

            case 46:
                addChar("ん", "n", "lol.com");
                break;
        }
    }

    private void loadKatakana(int i) {
        switch (i) {
            case 1:
                addChar("ア", "a", "lol.com");
                break;

            case 2:
                addChar("イ", "i", "lol.com");
                break;

            case 3:
                addChar("ウ", "u", "lol.com");
                break;

            case 4:
                addChar("エ", "e", "lol.com");
                break;

            case 5:
                addChar("オ", "o", "lol.com");
                break;
        }
    }
}