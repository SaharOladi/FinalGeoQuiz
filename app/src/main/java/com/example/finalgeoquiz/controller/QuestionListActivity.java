package com.example.finalgeoquiz.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.finalgeoquiz.R;
import com.example.finalgeoquiz.fragment.QuestionListFragment;

public class QuestionListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_list);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_container_list);

        if (fragment == null) {
            QuestionListFragment questionListFragment = new QuestionListFragment();
            fragmentManager.beginTransaction().add(R.id.fragment_container_list,
                    questionListFragment)
                    .commit();
        }
    }
}