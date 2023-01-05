package de.reecertv.kana;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class CharFragment extends Fragment {

    private String vChar, vCharLatin, writingLink;

    public CharFragment(String _vChar, String _vCharLatin, String _writingLink) {
        // Required empty public constructor
        vChar = _vChar;
        vCharLatin = _vCharLatin;
        writingLink = _writingLink;
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
        return inflater.inflate(R.layout.fragment_char, container, false);
    }

    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Button buttonLearn = view.findViewById(R.id.CharButtonShowWriting);
        TextView textViewChar = view.findViewById(R.id.CharTextViewChar);
        TextView textViewCharLatin = view.findViewById(R.id.CharTextViewCharLatin);

        // Set Text
        textViewChar.setText(vChar);
        textViewCharLatin.setText(vCharLatin);
    }
}