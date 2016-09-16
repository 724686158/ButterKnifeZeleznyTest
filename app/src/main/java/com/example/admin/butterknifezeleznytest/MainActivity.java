package com.example.admin.butterknifezeleznytest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.edit_text)
    EditText mEditText;
    @BindView(R.id.do_translate)
    Button mDoTranslate;
    @BindView(R.id.progress_bar)
    ProgressBar mProgressBar;
    @BindView(R.id.answer_word)
    TextView mAnswerWord;
    @BindView(R.id.answer_amep)
    TextView mAnswerAmep;
    @BindView(R.id.answer_ames)
    Button mAnswerAmes;
    @BindView(R.id.answer_brep)
    TextView mAnswerBrep;
    @BindView(R.id.answer_bres)
    Button mAnswerBres;
    @BindView(R.id.answer_pos1)
    TextView mAnswerPos1;
    @BindView(R.id.answer_mn1)
    TextView mAnswerMn1;
    @BindView(R.id.mnpos1)
    LinearLayout mMnpos1;
    @BindView(R.id.answer_pos2)
    TextView mAnswerPos2;
    @BindView(R.id.answer_mn2)
    TextView mAnswerMn2;
    @BindView(R.id.mnpos2)
    LinearLayout mMnpos2;
    @BindView(R.id.answer_pos3)
    TextView mAnswerPos3;
    @BindView(R.id.answer_mn3)
    TextView mAnswerMn3;
    @BindView(R.id.mnpos3)
    LinearLayout mMnpos3;
    @BindView(R.id.answer_pos4)
    TextView mAnswerPos4;
    @BindView(R.id.answer_mn4)
    TextView mAnswerMn4;
    @BindView(R.id.mnpos4)
    LinearLayout mMnpos4;
    @BindView(R.id.answer_pos5)
    TextView mAnswerPos5;
    @BindView(R.id.answer_mn5)
    TextView mAnswerMn5;
    @BindView(R.id.mnpos5)
    LinearLayout mMnpos5;
    @BindView(R.id.answer_view)
    LinearLayout mAnswerView;
    @BindView(R.id.scrollView)
    ScrollView mScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mAnswerWord.setText("HELLO WORLD");
    }
}
