package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;

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

    /**
     * This method is called when the "+3 points" button for Team A is clicked.
     */
    public void plusThreeButton(View view) {
        scoreTeamA = scoreTeamA + 3;
        display(scoreTeamA);
    }

    /**
     * This method is called when the "+2 points" button for Team A is clicked.
     */
    public void plusTwoButton(View view) {
        scoreTeamA = scoreTeamA + 2;
        display(scoreTeamA);
    }

    /**
     * This method is called when the "Free throw" button for Team A is clicked.
     */
    public void freeThrow(View view) {
        scoreTeamA = scoreTeamA + 1;
        display(scoreTeamA);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_a_score);
        quantityTextView.setText("" + number);
    }
}