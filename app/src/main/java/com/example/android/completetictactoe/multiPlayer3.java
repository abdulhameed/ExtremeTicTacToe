package com.example.android.completetictactoe;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by USER on 4/10/2018.
 */

public class multiPlayer3 extends AppCompatActivity implements View.OnClickListener {

    int chance = 0;
    int xScore = 0;
    int oScore = 0;
    int playCount = 0;
    boolean gameOver = false;
    boolean multiPlayer = true;
    Button currentBtn = null;

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, reset;
    Button[] btnArray = new Button[]{btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.board);

        LinearLayout playerName = findViewById(R.id.playerName);
        playerName.setVisibility(View.VISIBLE);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        reset = findViewById(R.id.reset);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        reset.setOnClickListener(this);
    }

/* Collects and saves player names at Game start */

    public void savePlayerName(View view) {
        EditText player1 = findViewById(R.id.player1Text);
        String name1Text = player1.getText().toString();

        EditText player2 = findViewById(R.id.player2Text);
        String name2Text = player2.getText().toString();

        TextView playerText1 = findViewById(R.id.playerNameOne);
        playerText1.setText(name1Text);

        TextView playerText2 = findViewById(R.id.playerNameTwo);
        playerText2.setText(name2Text);

        LinearLayout playerName = findViewById(R.id.playerName);
        playerName.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View view) {


        List<Button> buttonsList = new ArrayList<>(9);

        Collections.addAll(buttonsList, btnArray);

        switch (view.getId()) {
            case R.id.btn1:
                if (btn1.getText().toString().equals("")) {
                    if (chance == 0) {

                        currentBtn = btn1;
                        oPlay();
                    } else {
                        currentBtn = btn1;
                        xPlay();

                    }
                }
                break;

            case R.id.btn2:
                if (btn2.getText().toString().equals("")) {
                    if (chance == 0) {
                        currentBtn = btn2;
                        oPlay();
                    } else {
                        currentBtn = btn2;
                        xPlay();
                    }
                }
                break;

            case R.id.btn3:
                if (btn3.getText().toString().equals("")) {
                    if (chance == 0) {
                        currentBtn = btn3;
                        oPlay();

                    } else {
                        currentBtn = btn3;
                        xPlay();
                    }
                }
                break;

            case R.id.btn4:
                if (btn4.getText().toString().equals("")) {
                    if (chance == 0) {

                        currentBtn = btn4;
                        oPlay();

                    } else {
                        currentBtn = btn4;
                        xPlay();

                    }
                }
                break;

            case R.id.btn5:
                if (btn5.getText().toString().equals("")) {
                    if (chance == 0) {
                        currentBtn = btn5;
                        oPlay();

                    } else {
                        currentBtn = btn5;
                        xPlay();

                    }
                }
                break;

            case R.id.btn6:
                if (btn6.getText().toString().equals("")) {
                    if (chance == 0) {

                        currentBtn = btn6;
                        oPlay();

                    } else {
                        currentBtn = btn6;
                        xPlay();

                    }

                }
                break;

            case R.id.btn7:
                if (btn7.getText().toString().equals("")) {
                    if (chance == 0) {
                        currentBtn = btn7;
                        oPlay();

                    } else {
                        currentBtn = btn7;
                        xPlay();

                    }
                }
                break;

            case R.id.btn8:
                if (btn8.getText().toString().equals("")) {
                    if (chance == 0) {
                        currentBtn = btn8;
                        oPlay();
                    } else {
                        currentBtn = btn8;
                        xPlay();

                    }
                }
                break;

            case R.id.btn9:
                if (btn9.getText().toString().equals("")) {
                    if (chance == 0) {
                        currentBtn = btn9;
                        oPlay();
                    } else {
                        currentBtn = btn9;
                        xPlay();

                    }
                }
                break;
            case R.id.reset:
                reset();
        }

    }

/* Routine for Player O's Turn*/

    public Button oPlay() {
        currentBtn.setText("O");
        currentBtn.setTextColor(Color.parseColor("#FF5252"));
        currentBtn.setEnabled(false);
        chance = 1;
        playCount = playCount + 1;
        result();
        return currentBtn;

    }

        /* Routine for Player X's Turn*/

    public Button xPlay() {
        currentBtn.setText("X");
        currentBtn.setTextColor(Color.parseColor("#1976D2"));
        currentBtn.setEnabled(false);
        chance = 0;
        playCount = playCount + 1;
        result();
        return currentBtn;
    }

/* Prepares Board for fresh round of Game Play*/

    public void reset() {

        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        chance = 0;
        playCount = 0;
    }

/*Display Game score for player 'O' */

    public void displayScoreO() {

        TextView oTextView = findViewById(R.id.player2ScoreText);
        oTextView.setText("" + oScore);
    }

    /*Display Game score for player 'X' */

    public void displayScoreX() {

        TextView xTextView = findViewById(R.id.player1ScoreText);
        xTextView.setText("" + xScore);
    }

    /*Checks for a game WIN or TIE */

    public void result() {

        if (btn1.getText().toString().equals("X") && btn2.getText().toString().equals("X") && btn3.getText().toString().equals("X")) {
            Toast.makeText(this, "Player X WINS!", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            displayScoreX();
            reset();
        } else if (btn4.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn6.getText().toString().equals("X")) {
            Toast.makeText(this, "Player X WINS!", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            displayScoreX();
            reset();
        } else if (btn7.getText().toString().equals("X") && btn8.getText().toString().equals("X") && btn9.getText().toString().equals("X")) {
            Toast.makeText(this, "Player X WINS!", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            displayScoreX();
            reset();
        } else if (btn1.getText().toString().equals("O") && btn2.getText().toString().equals("O") && btn3.getText().toString().equals("O")) {
            Toast.makeText(this, "Player O WINS!", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            displayScoreO();
            reset();
        } else if (btn4.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn6.getText().toString().equals("O")) {
            Toast.makeText(this, "Player O WINS!", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            displayScoreO();
            reset();
        } else if (btn7.getText().toString().equals("O") && btn8.getText().toString().equals("O") && btn9.getText().toString().equals("O")) {
            Toast.makeText(this, "Player O WINS!", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            displayScoreO();
            reset();
        } else if (btn1.getText().toString().equals("X") && btn4.getText().toString().equals("X") && btn7.getText().toString().equals("X")) {
            Toast.makeText(this, "Player X WINS!", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            displayScoreX();
            reset();
        } else if (btn2.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn8.getText().toString().equals("X")) {
            Toast.makeText(this, "Player X WINS!", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            displayScoreX();
            reset();
        } else if (btn3.getText().toString().equals("X") && btn6.getText().toString().equals("X") && btn9.getText().toString().equals("X")) {
            Toast.makeText(this, "Player X WINS!", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            displayScoreX();
            reset();
        } else if (btn1.getText().toString().equals("O") && btn4.getText().toString().equals("O") && btn7.getText().toString().equals("O")) {
            Toast.makeText(this, "Player O WINS!", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            displayScoreO();
            reset();
        } else if (btn2.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn8.getText().toString().equals("O")) {
            Toast.makeText(this, "Player O WINS!", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            displayScoreO();
            reset();
        } else if (btn3.getText().toString().equals("O") && btn6.getText().toString().equals("O") && btn9.getText().toString().equals("O")) {
            Toast.makeText(this, "Player O WINS!", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            displayScoreO();
            reset();
        } else if (btn1.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn9.getText().toString().equals("X")) {
            Toast.makeText(this, "Player X WINS!", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            displayScoreX();
            reset();
        } else if (btn3.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn7.getText().toString().equals("X")) {
            Toast.makeText(this, "Player X WINS!", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            displayScoreX();
            reset();
        } else if (btn1.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn9.getText().toString().equals("O")) {
            Toast.makeText(this, "Player O WINS!", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            displayScoreO();
            reset();
        } else if (btn3.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn7.getText().toString().equals("O")) {
            Toast.makeText(this, "Player O WINS!", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            displayScoreO();
            reset();
        } else if (playCount == 9) {
            Toast.makeText(this, "Game is a TIE", Toast.LENGTH_SHORT).show();
            reset();

        }

    }

}
