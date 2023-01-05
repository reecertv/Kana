package de.reecertv.kana;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.TextView;

public class MenuFragment extends Fragment {

    private String title, titleInLang;
    private Stuff.Script script;
    private int charNum;

    public MenuFragment(String _title, String _titleInLang, Stuff.Script _script, int _charNum) {
        // Required empty public constructor
        title = _title;
        titleInLang = _titleInLang;
        script = _script;
        charNum = _charNum;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false);
    }

    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Button buttonLearn = view.findViewById(R.id.MenuButtonLearn);
        Button buttonTest = view.findViewById(R.id.MenuButtonTest);
        TextView textViewTitle = view.findViewById(R.id.MenuTextViewTitle);
        TextView textViewTitleLang = view.findViewById(R.id.MenuTextViewTitleLang);

        // Set Text
        textViewTitle.setText(title);
        textViewTitleLang.setText(titleInLang);

        buttonLearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Stuff.selectedScript = script;
                Stuff.charNum = charNum;
                Intent intent = new Intent(getActivity(), LearnActivity.class);
                startActivity(intent);
            }
        });

        buttonTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Stuff.selectedScript = script;
                Stuff.charNum = charNum;
                Intent intent = new Intent(getActivity(), QuizActivity.class);
                startActivity(intent);
            }
        });
    }
}