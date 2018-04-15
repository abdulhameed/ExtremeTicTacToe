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
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by USER on 4/11/2018.
 */

public class singlePlayer5 extends AppCompatActivity implements View.OnClickListener {


    int chance = 0;
    int xScore = 0;
    int oScore = 0;
    int playCount = 0;
    //    String player1Name = "CPU";
    String player2Name = "";
    String player2Symbol = "O";
    String player1Symbol = "X";
    Boolean gameOver = false;
    Button currentBtn;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25, reset;
    Button[] btnArray = new Button[]{btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25};

    private RadioGroup symbolRadio;
    private RadioButton symbolRadioBtn;
    private Button continueBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.board5x5);

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
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        btn13 = findViewById(R.id.btn13);
        btn14 = findViewById(R.id.btn14);
        btn15 = findViewById(R.id.btn15);
        btn16 = findViewById(R.id.btn16);
        btn17 = findViewById(R.id.btn17);
        btn18 = findViewById(R.id.btn18);
        btn19 = findViewById(R.id.btn19);
        btn20 = findViewById(R.id.btn20);
        btn21 = findViewById(R.id.btn21);
        btn22 = findViewById(R.id.btn22);
        btn23 = findViewById(R.id.btn23);
        btn24 = findViewById(R.id.btn24);
        btn25 = findViewById(R.id.btn25);
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
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);
        btn15.setOnClickListener(this);
        btn16.setOnClickListener(this);
        btn17.setOnClickListener(this);
        btn18.setOnClickListener(this);
        btn19.setOnClickListener(this);
        btn20.setOnClickListener(this);
        btn21.setOnClickListener(this);
        btn22.setOnClickListener(this);
        btn23.setOnClickListener(this);
        btn24.setOnClickListener(this);
        btn25.setOnClickListener(this);
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
        playerText1.setText("CPU");

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

            case R.id.btn10:
                if (btn10.getText().toString().equals("")) {
                    if (chance == 0) {
                        currentBtn = btn10;
                        oPlay();
                    }

                }
                break;

            case R.id.btn11:
                if (btn11.getText().toString().equals("")) {
                    if (chance == 0) {
                        currentBtn = btn11;
                        oPlay();
                    }

                }
                break;


            case R.id.btn12:
                if (btn12.getText().toString().equals("")) {
                    if (chance == 0) {
                        currentBtn = btn12;
                        oPlay();
                    }

                }
                break;

            case R.id.btn13:
                if (btn13.getText().toString().equals("")) {
                    if (chance == 0) {
                        currentBtn = btn13;
                        oPlay();
                    }

                }
                break;

            case R.id.btn14:
                if (btn14.getText().toString().equals("")) {
                    if (chance == 0) {
                        currentBtn = btn14;
                        oPlay();
                    }

                }
                break;

            case R.id.btn15:
                if (btn15.getText().toString().equals("")) {
                    if (chance == 0) {
                        currentBtn = btn15;
                        oPlay();
                    }

                }
                break;

            case R.id.btn16:
                if (btn16.getText().toString().equals("")) {
                    if (chance == 0) {
                        currentBtn = btn16;
                        oPlay();
                    }

                }
                break;

            case R.id.btn17:
                if (btn17.getText().toString().equals("")) {
                    if (chance == 0) {
                        currentBtn = btn17;
                        oPlay();
                    }

                }
                break;

            case R.id.btn18:
                if (btn18.getText().toString().equals("")) {
                    if (chance == 0) {
                        currentBtn = btn18;
                        oPlay();
                    }

                }
                break;

            case R.id.btn19:
                if (btn19.getText().toString().equals("")) {
                    if (chance == 0) {
                        currentBtn = btn19;
                        oPlay();
                    }

                }
                break;

            case R.id.btn20:
                if (btn20.getText().toString().equals("")) {
                    if (chance == 0) {
                        currentBtn = btn20;
                        oPlay();
                    }

                }
                break;

            case R.id.btn21:
                if (btn21.getText().toString().equals("")) {
                    if (chance == 0) {
                        currentBtn = btn21;
                        oPlay();
                    }

                }
                break;

            case R.id.btn22:
                if (btn22.getText().toString().equals("")) {
                    if (chance == 0) {
                        currentBtn = btn22;
                        oPlay();
                    }

                }
                break;

            case R.id.btn23:
                if (btn23.getText().toString().equals("")) {
                    if (chance == 0) {
                        currentBtn = btn23;
                        oPlay();
                    }

                }
                break;

            case R.id.btn24:
                if (btn24.getText().toString().equals("")) {
                    if (chance == 0) {
                        currentBtn = btn24;
                        oPlay();
                    }

                }
                break;

            case R.id.btn25:
                if (btn25.getText().toString().equals("")) {
                    if (chance == 0) {
                        currentBtn = btn25;
                        oPlay();
                    }

                }
                break;

            case R.id.reset:
                reset();
                break;
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

        Button[] btnArray = new Button[]{btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25};

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
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        btn13.setEnabled(false);
        btn14.setEnabled(false);
        btn15.setEnabled(false);
        btn16.setEnabled(false);
        btn17.setEnabled(false);
        btn18.setEnabled(false);
        btn19.setEnabled(false);
        btn20.setEnabled(false);
        btn21.setEnabled(false);
        btn22.setEnabled(false);
        btn23.setEnabled(false);
        btn24.setEnabled(false);
        btn25.setEnabled(false);
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
        btn10.setText("");
        btn11.setText("");
        btn12.setText("");
        btn13.setText("");
        btn14.setText("");
        btn15.setText("");
        btn16.setText("");
        btn17.setText("");
        btn18.setText("");
        btn19.setText("");
        btn20.setText("");
        btn21.setText("");
        btn22.setText("");
        btn23.setText("");
        btn24.setText("");
        btn25.setText("");

        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        btn10.setEnabled(true);
        btn11.setEnabled(true);
        btn12.setEnabled(true);
        btn13.setEnabled(true);
        btn14.setEnabled(true);
        btn15.setEnabled(true);
        btn16.setEnabled(true);
        btn17.setEnabled(true);
        btn18.setEnabled(true);
        btn19.setEnabled(true);
        btn20.setEnabled(true);
        btn21.setEnabled(true);
        btn22.setEnabled(true);
        btn23.setEnabled(true);
        btn24.setEnabled(true);
        btn25.setEnabled(true);
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

        if ((btn1.getText().toString().equals(player1Symbol) && btn2.getText().toString().equals(player1Symbol) && btn3.getText().toString().equals(player1Symbol) && btn4.getText().toString().equals(player1Symbol) && btn5.getText().toString().equals(player1Symbol)) && (playCount < 25)) {
            Toast.makeText(this, " Player " + player1Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        } else if ((btn6.getText().toString().equals(player1Symbol) && btn7.getText().toString().equals(player1Symbol) && btn8.getText().toString().equals(player1Symbol) && btn9.getText().toString().equals(player1Symbol) && btn10.getText().toString().equals(player1Symbol)) && (playCount < 25)) {
            Toast.makeText(this, " Player " + player1Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        } else if ((btn11.getText().toString().equals(player1Symbol) && btn12.getText().toString().equals(player1Symbol) && btn13.getText().toString().equals(player1Symbol) && btn14.getText().toString().equals(player1Symbol) && btn15.getText().toString().equals(player1Symbol)) && (playCount < 25)) {
            Toast.makeText(this, " Player " + player1Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        } else if ((btn16.getText().toString().equals(player1Symbol) && btn17.getText().toString().equals(player1Symbol) && btn18.getText().toString().equals(player1Symbol) && btn19.getText().toString().equals(player1Symbol) && btn20.getText().toString().equals(player1Symbol)) && (playCount < 25)) {
            Toast.makeText(this, " Player " + player1Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        } else if ((btn21.getText().toString().equals(player1Symbol) && btn22.getText().toString().equals(player1Symbol) && btn23.getText().toString().equals(player1Symbol) && btn24.getText().toString().equals(player1Symbol) && btn25.getText().toString().equals(player1Symbol)) && (playCount < 25)) {
            Toast.makeText(this, " Player " + player1Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        } else if ((btn1.getText().toString().equals(player2Symbol) && btn2.getText().toString().equals(player2Symbol) && btn3.getText().toString().equals(player2Symbol) && btn4.getText().toString().equals(player2Symbol) && btn5.getText().toString().equals(player2Symbol)) && (playCount < 25)) {
            Toast.makeText(this, " Player " + player2Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            gameOver = true;
            displayScoreO();
            playCount = 0;
            reset();
        } else if ((btn6.getText().toString().equals(player2Symbol) && btn7.getText().toString().equals(player2Symbol) && btn8.getText().toString().equals(player2Symbol) && btn9.getText().toString().equals(player2Symbol) && btn10.getText().toString().equals(player2Symbol)) && (playCount < 25)) {
            Toast.makeText(this, " Player " + player2Symbol + " WINS! ", Toast.LENGTH_SHORT).show();

            oScore = oScore + 1;
            gameOver = true;
            displayScoreO();
            playCount = 0;
            reset();
        } else if ((btn11.getText().toString().equals(player2Symbol) && btn12.getText().toString().equals(player2Symbol) && btn13.getText().toString().equals(player2Symbol) && btn14.getText().toString().equals(player2Symbol) && btn15.getText().toString().equals(player2Symbol)) && (playCount < 25)) {
            Toast.makeText(this, " Player " + player2Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            gameOver = true;
            displayScoreO();
            playCount = 0;
            reset();
        } else if ((btn16.getText().toString().equals(player2Symbol) && btn17.getText().toString().equals(player2Symbol) && btn18.getText().toString().equals(player2Symbol) && btn19.getText().toString().equals(player2Symbol) && btn20.getText().toString().equals(player2Symbol)) && (playCount < 25)) {
            Toast.makeText(this, " Player " + player2Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            gameOver = true;
            displayScoreO();
            playCount = 0;
            reset();
        } else if ((btn21.getText().toString().equals(player2Symbol) && btn22.getText().toString().equals(player2Symbol) && btn23.getText().toString().equals(player2Symbol) && btn24.getText().toString().equals(player2Symbol) && btn25.getText().toString().equals(player2Symbol)) && (playCount < 25)) {
            Toast.makeText(this, " Player " + player2Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            gameOver = true;
            displayScoreO();
            playCount = 0;
            reset();
        } else if ((btn1.getText().toString().equals(player1Symbol) && btn6.getText().toString().equals(player1Symbol) && btn11.getText().toString().equals(player1Symbol) && btn16.getText().toString().equals(player1Symbol) && btn21.getText().toString().equals(player1Symbol)) && (playCount < 25)) {
            Toast.makeText(this, " Player " + player1Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        } else if ((btn2.getText().toString().equals(player1Symbol) && btn7.getText().toString().equals(player1Symbol) && btn12.getText().toString().equals(player1Symbol) && btn17.getText().toString().equals(player1Symbol) && btn22.getText().toString().equals(player1Symbol)) && (playCount < 25)) {
            Toast.makeText(this, " Player " + player1Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        } else if ((btn3.getText().toString().equals(player1Symbol) && btn8.getText().toString().equals(player1Symbol) && btn13.getText().toString().equals(player1Symbol) && btn18.getText().toString().equals(player1Symbol) && btn23.getText().toString().equals(player1Symbol)) && (playCount < 25)) {
            Toast.makeText(this, " Player " + player1Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        } else if ((btn4.getText().toString().equals(player1Symbol) && btn9.getText().toString().equals(player1Symbol) && btn14.getText().toString().equals(player1Symbol) && btn19.getText().toString().equals(player1Symbol) && btn24.getText().toString().equals(player1Symbol)) && (playCount < 25)) {
            Toast.makeText(this, " Player " + player1Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        } else if ((btn5.getText().toString().equals(player1Symbol) && btn10.getText().toString().equals(player1Symbol) && btn15.getText().toString().equals(player1Symbol) && btn20.getText().toString().equals(player1Symbol) && btn25.getText().toString().equals(player1Symbol)) && (playCount < 25)) {
            Toast.makeText(this, " Player " + player1Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        } else if ((btn1.getText().toString().equals(player2Symbol) && btn6.getText().toString().equals(player2Symbol) && btn11.getText().toString().equals(player2Symbol) && btn16.getText().toString().equals(player2Symbol) && btn21.getText().toString().equals(player2Symbol)) && (playCount < 25)) {
            Toast.makeText(this, " Player " + player2Symbol + " WINS! ", Toast.LENGTH_SHORT).show();

            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        } else if ((btn2.getText().toString().equals(player2Symbol) && btn7.getText().toString().equals(player2Symbol) && btn12.getText().toString().equals(player2Symbol) && btn17.getText().toString().equals(player2Symbol) && btn22.getText().toString().equals(player2Symbol)) && (playCount < 25)) {
            Toast.makeText(this, " Player " + player2Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        } else if ((btn3.getText().toString().equals(player2Symbol) && btn8.getText().toString().equals(player2Symbol) && btn13.getText().toString().equals(player2Symbol) && btn18.getText().toString().equals(player2Symbol) && btn23.getText().toString().equals(player2Symbol)) && (playCount < 25)) {
            Toast.makeText(this, " Player " + player2Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            gameOver = true;
            displayScoreO();
            playCount = 0;
            reset();
        } else if ((btn4.getText().toString().equals(player2Symbol) && btn9.getText().toString().equals(player2Symbol) && btn14.getText().toString().equals(player2Symbol) && btn19.getText().toString().equals(player2Symbol) && btn24.getText().toString().equals(player2Symbol)) && (playCount < 25)) {
            Toast.makeText(this, " Player " + player2Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            gameOver = true;
            displayScoreO();
            playCount = 0;
            reset();
        } else if ((btn5.getText().toString().equals(player2Symbol) && btn10.getText().toString().equals(player2Symbol) && btn15.getText().toString().equals(player2Symbol) && btn20.getText().toString().equals(player2Symbol) && btn25.getText().toString().equals(player2Symbol)) && (playCount < 25)) {
            Toast.makeText(this, " Player " + player2Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            gameOver = true;
            displayScoreO();
            playCount = 0;
            reset();
        } else if ((btn5.getText().toString().equals(player1Symbol) && btn9.getText().toString().equals(player1Symbol) && btn13.getText().toString().equals(player1Symbol) && btn17.getText().toString().equals(player1Symbol) && btn21.getText().toString().equals(player1Symbol)) && (playCount < 25)) {
            Toast.makeText(this, " Player " + player1Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        } else if ((btn1.getText().toString().equals(player1Symbol) && btn7.getText().toString().equals(player1Symbol) && btn13.getText().toString().equals(player1Symbol) && btn19.getText().toString().equals(player1Symbol) && btn25.getText().toString().equals(player1Symbol)) && (playCount < 25)) {
            Toast.makeText(this, " Player " + player1Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        } else if ((btn5.getText().toString().equals(player2Symbol) && btn9.getText().toString().equals(player2Symbol) && btn13.getText().toString().equals(player2Symbol) && btn17.getText().toString().equals(player2Symbol) && btn21.getText().toString().equals(player2Symbol)) && (playCount < 25)) {
            Toast.makeText(this, " Player " + player2Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            gameOver = true;
            displayScoreO();
            playCount = 0;
            reset();
        } else if ((btn1.getText().toString().equals(player2Symbol) && btn7.getText().toString().equals(player2Symbol) && btn13.getText().toString().equals(player2Symbol) && btn19.getText().toString().equals(player2Symbol) && btn25.getText().toString().equals(player2Symbol)) && (playCount < 25)) {
            Toast.makeText(this, " Player " + player2Symbol + " WINS! ", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            gameOver = true;
            displayScoreO();
            playCount = 0;
            reset();
        } else if (playCount == 25) {
            Toast.makeText(this, "Game is a TIE", Toast.LENGTH_SHORT).show();
            gameOver = true;
            reset();
            playCount = 0;

        }


    }
}
