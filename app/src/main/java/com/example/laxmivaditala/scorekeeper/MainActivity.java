package com.example.laxmivaditala.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int teamScoreA;
    private int teamScoreB;

    private TextView scoreTeamATxtView;
    private TextView scoreTeamBTxtView;
    private Button resetBtn;
    private Button freeThrowBtnA;
    private Button freeThrowBtnB;
    private Button twoPointsA;
    private Button twoPointsB;
    private Button threePointsA;
    private Button threePointsB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreTeamATxtView = (TextView) findViewById(R.id.score_a);
        scoreTeamBTxtView = (TextView) findViewById(R.id.score_b);
        resetBtn = (Button) findViewById(R.id.reset_btn);
        freeThrowBtnA = (Button) findViewById(R.id.free_a);
        freeThrowBtnB = (Button) findViewById(R.id.free_b);
        twoPointsA = (Button) findViewById(R.id.points_btn);
        threePointsA = (Button) findViewById(R.id.points_a);
        twoPointsB = (Button) findViewById(R.id.points_button);
        threePointsB = (Button) findViewById(R.id.points_b);

        resetBtn.setOnClickListener(this);

        freeThrowBtnA.setOnClickListener(this);
        freeThrowBtnB.setOnClickListener(this);
        twoPointsA.setOnClickListener(this);
        twoPointsB.setOnClickListener(this);
        threePointsA.setOnClickListener(this);
        threePointsB.setOnClickListener(this);

        updateScore();
    }

    private void updateScore() {
        scoreTeamATxtView.setText(String.valueOf(teamScoreA));
        scoreTeamBTxtView.setText(String.valueOf(teamScoreB));
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.reset_btn:
                teamScoreA = 0;
                teamScoreB = 0;
                break;
            case R.id.free_a:
                teamScoreA++;
                break;

            case R.id.free_b:
                teamScoreB++;
                break;

            case  R.id.points_btn:
                teamScoreA = teamScoreA +2;
                break;

            case R.id.points_a:
                teamScoreA = teamScoreA+3;
                break;

            case R.id.points_button:
                teamScoreB = teamScoreB +2;
                break;

            case R.id.points_b:
                teamScoreB = teamScoreB +3;
                break;
        }

        updateScore();
    }
}
