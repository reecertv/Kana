package de.reecertv.kana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    ViewPager2 viewPager2;
    FSA fsa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        viewPager2 = findViewById(R.id.HomeViewPager2);
        fsa = new FSA(getSupportFragmentManager(), getLifecycle());

        fsa.addFragment(new MenuFragment("Hiragana", "ひらがな", Stuff.Script.Hiragana, 46));
        fsa.addFragment(new MenuFragment("Katakana", "カタカナ", Stuff.Script.Katakana, 46));

        viewPager2.setAdapter(fsa);
    }
}