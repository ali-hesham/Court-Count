package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private int scoreTeamA = 0, scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void three(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void two(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void freeThrow(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void threeB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void twoB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void freeThrowB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);

    }

    public void rest(View view) {
        scoreTeamA=0;
        displayForTeamA(scoreTeamA);
        scoreTeamB=0;
        displayForTeamB(scoreTeamB);
    }
}
