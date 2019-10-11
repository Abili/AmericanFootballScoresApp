package com.raisac.americanfootballscoresapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int scores_teamA = 0;
    int scores_teamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayTeam_A_Scores(int number) {
        TextView teamAScores = findViewById(R.id.team_a_scores);
        teamAScores.setText(String.valueOf(number));
    }

    public void touchDown_teamA(View view) {
        scores_teamA += 6;
        displayTeam_A_Scores(scores_teamA);

    }

    public void fieldGoal_teamA(View view) {
        scores_teamA += 3;
        displayTeam_A_Scores(scores_teamA);

    }

    public void pat_teamA(View view) {
        scores_teamA += 2;
        displayTeam_A_Scores(scores_teamA);

    }

    public void safety_teamA(View view) {
        scores_teamA += 1;
        displayTeam_A_Scores(scores_teamA);

    }

    public void displayTeam_B_Scores(int number) {
        TextView teamAScores = findViewById(R.id.team_b_scores);
        teamAScores.setText(String.valueOf(number));
    }

    public void touchDown_teamB(View view) {
        scores_teamB += 6;
        displayTeam_B_Scores(scores_teamB);

    }

    public void fieldGoal_teamB(View view) {
        scores_teamB += 3;
        displayTeam_B_Scores(scores_teamB);

    }

    public void pat_teamB(View view) {
        scores_teamB += 2;
        displayTeam_B_Scores(scores_teamB);

    }

    public void safety_teamB(View view) {
        scores_teamB += 1;
        displayTeam_B_Scores(scores_teamB);

    }

    public void reset(View view) {
        scores_teamA = 0;
        scores_teamB = 0;
        displayTeam_A_Scores(scores_teamA);
        displayTeam_B_Scores(scores_teamB);
    }
}
