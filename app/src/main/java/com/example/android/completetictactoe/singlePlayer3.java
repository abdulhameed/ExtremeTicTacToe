package com.example.android.completetictactoe;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by USER on 4/10/2018.
 */

public class singlePlayer3 extends AppCompatActivity implements View.OnClickListener {

    int chance = 0;
    int xScore = 0;
    int oScore = 0;
    int playCount = 0;
    String player2Name = "";
    String player2Symbol = "O";
    String player1Symbol = "X";
    Boolean gameOver = false;
    Button currentBtn = null;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, reset;
    Button[] btnArray = new Button[]{btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.board);

        LinearLayout playerName = findViewById(R.id.singlePlayerName);
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

        buttonOnStart();
    }

    public void singlePlayerRadioClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        ImageView player1image = findViewById(R.id.player1Symbol);
        ImageView player2image = findViewById(R.id.player2Symbol);

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radioButtonX:
                if (checked)

                    player1image.setImageResource(R.drawable.sign_o);
                player2image.setImageResource(R.drawable.sign_x);
                player2Symbol = "X";
                player1Symbol = "O";

                // Symbol X Clicked
                break;
            case R.id.radioButtonO:
                if (checked)

                    player1image.setImageResource(R.drawable.sign_x);
                player2image.setImageResource(R.drawable.sign_o);

                player2Symbol = "O";
                player1Symbol = "X";

                // Symbol O Clicked
                break;
        }
    }

/* Collects and saves player names at Game start */

    public void savePlayerName(View view) {


        EditText player2 = findViewById(R.id.singlePlayer1Text);
        String name2Text = player2.getText().toString();

        TextView playerText1 = findViewById(R.id.playerNameOne);
        playerText1.setText(R.string.COM_Player);

        TextView playerText2 = findViewById(R.id.playerNameTwo);
        player2Name = name2Text;
        playerText2.setText(player2Name);

        LinearLayout playerName = findViewById(R.id.singlePlayerName);
        playerName.setVisibility(View.INVISIBLE);
        reset();

    }


    public void onClick(View view) {


        List<Button> buttonsList = new ArrayList<>(9);

        Collections.addAll(buttonsList, btnArray);
        gameOver = false;

        switch (view.getId()) {
            case R.id.btn1:
                if (btn1.getText().toString().equals("")) {
                    if (chance == 0) {

                        currentBtn = btn1;
                        oPlay();
                    }

                }
                break;

            case R.id.btn2:
                if (btn2.getText().toString().equals("")) {
                    if (chance == 0) {
                        currentBtn = btn2;
                        oPlay();

                    }

                }
                break;

            case R.id.btn3:
                if (btn3.getText().toString().equals("")) {
                    if (chance == 0) {
                        currentBtn = btn3;
                        oPlay();

                    }

                }
                break;

            case R.id.btn4:
                if (btn4.getText().toString().equals("")) {
                    if (chance == 0) {

                        currentBtn = btn4;
                        oPlay();

                    }

                }
                break;

            case R.id.btn5:
                if (btn5.getText().toString().equals("")) {
                    if (chance == 0) {
                        currentBtn = btn5;
                        oPlay();

                    }

                }
                break;

            case R.id.btn6:
                if (btn6.getText().toString().equals("")) {
                    if (chance == 0) {

                        currentBtn = btn6;
                        oPlay();

                    }

                }
                break;

            case R.id.btn7:
                if (btn7.getText().toString().equals("")) {
                    if (chance == 0) {
                        currentBtn = btn7;
                        oPlay();

                    }

                }
                break;

            case R.id.btn8:
                if (btn8.getText().toString().equals("")) {
                    if (chance == 0) {
                        currentBtn = btn8;
                        oPlay();

                    }

                }

                break;

            case R.id.btn9:
                if (btn9.getText().toString().equals("")) {
                    if (chance == 0) {
                        currentBtn = btn9;
                        oPlay();
                    }

                }
                break;
            case R.id.reset:
                reset();
        }

    }

/* Routine for Player O's Turn*/

    public void oPlay() {
        currentBtn.setText(player2Symbol);
        currentBtn.setTextColor(Color.parseColor("#FF5252"));
        currentBtn.setEnabled(false);
        playCount = playCount + 1;
        chance = 1;
        result();
        if (gameOver == false) {
            clickRandom(0);
        }

        return;

    }


/* COM Player Logic*/

    public void clickRandom(int turns) {

        Button[] btnArray = new Button[]{btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9};

        //pass the number of times the method should until it finds an Enabled Button
        if (turns < btnArray.length) {
            Random random = new Random();
            //now select a button from your button list or array.

            Button btn = btnArray[random.nextInt(btnArray.length - 1)];
            //now check if the button is enabled
            if (btn.isEnabled()) {
                //set the text of the button to X or O
                btn.setText(player1Symbol);
                //then disable the button
                btn.setTextColor(Color.parseColor("#1976D2"));
                btn.setEnabled(false);
                chance = 0;
                playCount = playCount + 1;
                result();
                return;
            } else {
                turns++;
                clickRandom(turns);
            }
        } else {
            return;
        }
    }

/* Prepares Board for new Game Play*/

    public void buttonOnStart() {

        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
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


        if (btn1.getText().toString().equals(player1Symbol) && btn2.getText().toString().equals(player1Symbol) && btn3.getText().toString().equals(player1Symbol)) {
            Toast.makeText(this, " Player " + player1Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        } else if (btn4.getText().toString().equals(player1Symbol) && btn5.getText().toString().equals(player1Symbol) && btn6.getText().toString().equals(player1Symbol)) {
            Toast.makeText(this, " Player " + player1Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        } else if (btn7.getText().toString().equals(player1Symbol) && btn8.getText().toString().equals(player1Symbol) && btn9.getText().toString().equals(player1Symbol)) {
            Toast.makeText(this, " Player " + player1Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        } else if (btn1.getText().toString().equals(player2Symbol) && btn2.getText().toString().equals(player2Symbol) && btn3.getText().toString().equals(player2Symbol)) {
            Toast.makeText(this, " Player " + player2Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            gameOver = true;
            displayScoreO();
            playCount = 0;
            reset();
        } else if (btn4.getText().toString().equals(player2Symbol) && btn5.getText().toString().equals(player2Symbol) && btn6.getText().toString().equals(player2Symbol)) {
            Toast.makeText(this, " Player " + player2Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            gameOver = true;
            displayScoreO();
            playCount = 0;
            reset();
        } else if (btn7.getText().toString().equals(player2Symbol) && btn8.getText().toString().equals(player2Symbol) && btn9.getText().toString().equals(player2Symbol)) {
            Toast.makeText(this, " Player " + player2Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            gameOver = true;
            displayScoreO();
            playCount = 0;
            reset();
        } else if (btn1.getText().toString().equals(player1Symbol) && btn4.getText().toString().equals(player1Symbol) && btn7.getText().toString().equals(player1Symbol)) {
            Toast.makeText(this, " Player " + player1Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        } else if (btn2.getText().toString().equals(player1Symbol) && btn5.getText().toString().equals(player1Symbol) && btn8.getText().toString().equals(player1Symbol)) {
            Toast.makeText(this, " Player " + player1Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        } else if (btn3.getText().toString().equals(player1Symbol) && btn6.getText().toString().equals(player1Symbol) && btn9.getText().toString().equals(player1Symbol)) {
            Toast.makeText(this, " Player " + player1Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        } else if (btn1.getText().toString().equals(player2Symbol) && btn4.getText().toString().equals(player2Symbol) && btn7.getText().toString().equals(player2Symbol)) {
            Toast.makeText(this, " Player " + player2Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            gameOver = true;
            displayScoreO();
            playCount = 0;
            reset();
        } else if (btn2.getText().toString().equals(player2Symbol) && btn5.getText().toString().equals(player2Symbol) && btn8.getText().toString().equals(player2Symbol)) {
            Toast.makeText(this, " Player " + player2Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            gameOver = true;
            displayScoreO();
            playCount = 0;
            reset();
        } else if (btn3.getText().toString().equals(player2Symbol) && btn6.getText().toString().equals(player2Symbol) && btn9.getText().toString().equals(player2Symbol)) {
            Toast.makeText(this, " Player " + player2Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            gameOver = true;
            displayScoreO();
            playCount = 0;
            reset();
        } else if (btn1.getText().toString().equals(player1Symbol) && btn5.getText().toString().equals(player1Symbol) && btn9.getText().toString().equals(player1Symbol)) {
            Toast.makeText(this, " Player " + player1Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        } else if (btn3.getText().toString().equals(player1Symbol) && btn5.getText().toString().equals(player1Symbol) && btn7.getText().toString().equals(player1Symbol)) {
            Toast.makeText(this, " Player " + player1Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        } else if (btn1.getText().toString().equals(player2Symbol) && btn5.getText().toString().equals(player2Symbol) && btn9.getText().toString().equals(player2Symbol)) {
            Toast.makeText(this, "Player " + player2Symbol + " WINS!", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            gameOver = true;
            displayScoreO();
            playCount = 0;
            reset();
        } else if (btn3.getText().toString().equals(player2Symbol) && btn5.getText().toString().equals(player2Symbol) && btn7.getText().toString().equals(player2Symbol)) {
            Toast.makeText(this, "Player " + player2Symbol + " WINS!", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            gameOver = true;
            displayScoreO();
            playCount = 0;
            reset();
        } else if (playCount == 9) {
            Toast.makeText(this, "Game is a TIE", Toast.LENGTH_SHORT).show();
            gameOver = true;
            reset();
            playCount = 0;

        }


    }

}
