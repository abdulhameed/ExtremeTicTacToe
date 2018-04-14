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
 * Created by USER on 4/11/2018.
 */

public class multiPlayer5 extends AppCompatActivity implements View.OnClickListener{

    int chance = 0;
    int xScore = 0;
    int oScore = 0;
    int playCount = 0;
    String human = "O";
    String computer = "X";
    Boolean gameOver = false;
    Button currentBtn = null;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25, reset;
    Button[] btnArray = new Button[] {btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20,btn21, btn22, btn23, btn24, btn25};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.board5x5);

        LinearLayout playerName = (LinearLayout) findViewById(R.id.playerName) ;
        playerName.setVisibility(View.VISIBLE);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn10 = (Button) findViewById(R.id.btn10);
        btn11 = (Button) findViewById(R.id.btn11);
        btn12 = (Button) findViewById(R.id.btn12);
        btn13 = (Button) findViewById(R.id.btn13);
        btn14 = (Button) findViewById(R.id.btn14);
        btn15 = (Button) findViewById(R.id.btn15);
        btn16 = (Button) findViewById(R.id.btn16);
        btn17 = (Button) findViewById(R.id.btn17);
        btn18 = (Button) findViewById(R.id.btn18);
        btn19 = (Button) findViewById(R.id.btn19);
        btn20 = (Button) findViewById(R.id.btn20);
        btn21 = (Button) findViewById(R.id.btn21);
        btn22 = (Button) findViewById(R.id.btn22);
        btn23 = (Button) findViewById(R.id.btn23);
        btn24 = (Button) findViewById(R.id.btn24);
        btn25 = (Button) findViewById(R.id.btn25);
        reset = (Button) findViewById(R.id.reset);

        btn1.setOnClickListener((View.OnClickListener) this);
        btn2.setOnClickListener((View.OnClickListener) this);
        btn3.setOnClickListener((View.OnClickListener) this);
        btn4.setOnClickListener((View.OnClickListener) this);
        btn5.setOnClickListener((View.OnClickListener) this);
        btn6.setOnClickListener((View.OnClickListener) this);
        btn7.setOnClickListener((View.OnClickListener) this);
        btn8.setOnClickListener((View.OnClickListener) this);
        btn9.setOnClickListener((View.OnClickListener) this);
        btn10.setOnClickListener((View.OnClickListener) this);
        btn11.setOnClickListener((View.OnClickListener) this);
        btn12.setOnClickListener((View.OnClickListener) this);
        btn13.setOnClickListener((View.OnClickListener) this);
        btn14.setOnClickListener((View.OnClickListener) this);
        btn15.setOnClickListener((View.OnClickListener) this);
        btn16.setOnClickListener((View.OnClickListener) this);
        btn17.setOnClickListener((View.OnClickListener) this);
        btn18.setOnClickListener((View.OnClickListener) this);
        btn19.setOnClickListener((View.OnClickListener) this);
        btn20.setOnClickListener((View.OnClickListener) this);
        btn21.setOnClickListener((View.OnClickListener) this);
        btn22.setOnClickListener((View.OnClickListener) this);
        btn23.setOnClickListener((View.OnClickListener) this);
        btn24.setOnClickListener((View.OnClickListener) this);
        btn25.setOnClickListener((View.OnClickListener) this);
        reset.setOnClickListener((View.OnClickListener) this);
    }

    public void savePlayerName(View view) {
        EditText player1 = (EditText) findViewById(R.id.player1Text);
        String name1Text = player1.getText().toString();

        EditText player2 = (EditText) findViewById(R.id.player2Text);
        String name2Text = player2.getText().toString();

        TextView playerText1 = (TextView) findViewById(R.id.playerNameOne);
        playerText1.setText(name1Text);

        TextView playerText2 = (TextView) findViewById(R.id.playerNameTwo);
        playerText2.setText(name2Text);

        LinearLayout playerName = (LinearLayout) findViewById(R.id.playerName);
        playerName.setVisibility(view.INVISIBLE);
    }


    public void onClick(View view) {


        List<Button> buttonsList = new ArrayList<>(9);

        Collections.addAll(buttonsList, btnArray);
        gameOver = false;

        switch(view.getId()) {
            case R.id.btn1:
                if (btn1.getText().toString().equals("")) {
                    if (chance == 0) {

                        currentBtn = btn1;
                        oPlay();
                    }
                    else {
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

                    }

                    else {
                        currentBtn = btn2;
                        xPlay();
                    }
                }
                break;

            case R.id.btn3:
                if (btn3.getText().toString().equals("")){
                    if (chance==0){
                        currentBtn = btn3;
                        oPlay();
                    }
                    else {
                        currentBtn = btn3;
                        xPlay();
                    }

                }
                break;

            case R.id.btn4:
                if (btn4.getText().toString().equals("")){
                    if (chance==0){

                        currentBtn = btn4;
                        oPlay();

                    }
                    else {
                        currentBtn = btn4;
                        xPlay();
                    }

                }
                break;

            case R.id.btn5:
                if (btn5.getText().toString().equals("")){
                    if (chance==0){
                        currentBtn = btn5;
                        oPlay();

                    }
                    else {
                        currentBtn = btn5;
                        xPlay();
                    }

                }
                break;

            case R.id.btn6:
                if (btn6.getText().toString().equals("")){
                    if (chance==0){

                        currentBtn = btn6;
                        oPlay();

                    }
                    else {
                        currentBtn = btn6;
                        xPlay();
                    }

                }
                break;

            case R.id.btn7:
                if (btn7.getText().toString().equals("")){
                    if (chance==0){
                        currentBtn = btn7;
                        oPlay();

                    }
                    else {
                        currentBtn = btn7;
                        xPlay();
                    }

                }
                break;

            case R.id.btn8:
                if (btn8.getText().toString().equals("")){
                    if (chance==0){
                        currentBtn = btn8;
                        oPlay();

                    }
                    else {
                        currentBtn = btn8;
                        xPlay();
                    }

                }

                break;

            case R.id.btn9:
                if (btn9.getText().toString().equals("")){
                    if (chance==0){
                        currentBtn = btn9;
                        oPlay();
                    }
                    else {
                        currentBtn = btn9;
                        xPlay();
                    }

                }
                break;

            case R.id.btn10:
                if (btn10.getText().toString().equals("")){
                    if (chance==0){
                        currentBtn = btn10;
                        oPlay();
                    }
                    else {
                        currentBtn = btn10;
                        xPlay();
                    }

                }

            case R.id.btn11:
                if (btn11.getText().toString().equals("")){
                    if (chance==0){
                        currentBtn = btn11;
                        oPlay();
                    }
                    else {
                        currentBtn = btn11;
                        xPlay();
                    }

                }

            case R.id.btn12:
                if (btn12.getText().toString().equals("")){
                    if (chance==0){
                        currentBtn = btn12;
                        oPlay();
                    }
                    else {
                        currentBtn = btn12;
                        xPlay();
                    }

                }

            case R.id.btn13:
                if (btn13.getText().toString().equals("")){
                    if (chance==0){
                        currentBtn = btn13;
                        oPlay();
                    }
                    else {
                        currentBtn = btn13;
                        xPlay();
                    }

                }

            case R.id.btn14:
                if (btn14.getText().toString().equals("")){
                    if (chance==0){
                        currentBtn = btn14;
                        oPlay();
                    }
                    else {
                        currentBtn = btn14;
                        xPlay();
                    }

                }

            case R.id.btn15:
                if (btn15.getText().toString().equals("")){
                    if (chance==0){
                        currentBtn = btn15;
                        oPlay();
                    }
                    else {
                        currentBtn = btn15;
                        xPlay();
                    }

                }

            case R.id.btn16:
                if (btn16.getText().toString().equals("")){
                    if (chance==0){
                        currentBtn = btn16;
                        oPlay();
                    }
                    else {
                        currentBtn = btn16;
                        xPlay();
                    }

                }

            case R.id.btn17:
                if (btn17.getText().toString().equals("")){
                    if (chance==0){
                        currentBtn = btn17;
                        oPlay();
                    }
                    else {
                        currentBtn = btn17;
                        xPlay();
                    }

                }

            case R.id.btn18:
                if (btn18.getText().toString().equals("")){
                    if (chance==0){
                        currentBtn = btn18;
                        oPlay();
                    }
                    else {
                        currentBtn = btn18;
                        xPlay();
                    }

                }

            case R.id.btn19:
                if (btn19.getText().toString().equals("")){
                    if (chance==0){
                        currentBtn = btn19;
                        oPlay();
                    }
                    else {
                        currentBtn = btn19;
                        xPlay();
                    }

                }

            case R.id.btn20:
                if (btn20.getText().toString().equals("")){
                    if (chance==0){
                        currentBtn = btn20;
                        oPlay();
                    }
                    else {
                        currentBtn = btn20;
                        xPlay();
                    }

                }

            case R.id.btn21:
                if (btn21.getText().toString().equals("")){
                    if (chance==0){
                        currentBtn = btn21;
                        oPlay();
                    }
                    else {
                        currentBtn = btn21;
                        xPlay();
                    }

                }

            case R.id.btn22:
                if (btn22.getText().toString().equals("")){
                    if (chance==0){
                        currentBtn = btn22;
                        oPlay();
                    }
                    else {
                        currentBtn = btn22;
                        xPlay();
                    }

                }

            case R.id.btn23:
                if (btn23.getText().toString().equals("")){
                    if (chance==0){
                        currentBtn = btn23;
                        oPlay();
                    }
                    else {
                        currentBtn = btn23;
                        xPlay();
                    }

                }

            case R.id.btn24:
                if (btn24.getText().toString().equals("")){
                    if (chance==0){
                        currentBtn = btn24;
                        oPlay();
                    }
                    else {
                        currentBtn = btn24;
                        xPlay();
                    }

                }

            case R.id.btn25:
                if (btn25.getText().toString().equals("")){
                    if (chance==0){
                        currentBtn = btn25;
                        oPlay();
                    }
                    else {
                        currentBtn = btn25;
                        xPlay();
                    }

                }

            case R.id.reset:
                reset();
        }

    }

/* Routine for Player O's Turn*/

    public void oPlay(){
        currentBtn.setText("O");
        currentBtn.setTextColor(Color.parseColor("#FF5252"));
        currentBtn.setEnabled(false);
        playCount = playCount + 1;
        chance = 1;
        result();
        return ;

    }

    /* Routine for Player X's Turn*/

    public Button xPlay() {
        currentBtn.setText("X");
        currentBtn.setTextColor(Color.parseColor("#1976D2"));
        currentBtn.setEnabled(false);
        chance = 0;
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

    public void displayScoreO(){

        TextView oTextView = (TextView) findViewById(R.id.player2ScoreText);
        oTextView.setText(""+oScore);
    }

    /*Display Game score for player 'X' */

    public void displayScoreX(){

        TextView xTextView = (TextView) findViewById(R.id.player1ScoreText);
        xTextView.setText(""+xScore);
    }

        /*Checks for a game WIN or TIE */

    public void result() {


        if (btn1.getText().toString().equals("X") && btn2.getText().toString().equals("X") && btn3.getText().toString().equals("X") && btn4.getText().toString().equals("X")&& btn5.getText().toString().equals("X") ) {
            Toast.makeText(this, "Player X WINS!", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        }
        else if (btn6.getText().toString().equals("X") && btn7.getText().toString().equals("X") && btn8.getText().toString().equals("X") && btn9.getText().toString().equals("X")&& btn10.getText().toString().equals("X")){
            Toast.makeText(this, "Player X WINS!", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        }
        else if (btn11.getText().toString().equals("X") && btn12.getText().toString().equals("X") && btn13.getText().toString().equals("X")&& btn14.getText().toString().equals("X")&& btn15.getText().toString().equals("X")){
            Toast.makeText(this, "Player X WINS!", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        }
        else if (btn16.getText().toString().equals("X") && btn17.getText().toString().equals("X") && btn18.getText().toString().equals("X")&& btn19.getText().toString().equals("X")&& btn20.getText().toString().equals("X")){
            Toast.makeText(this, "Player X WINS!", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        }
        else if (btn21.getText().toString().equals("X") && btn22.getText().toString().equals("X") && btn23.getText().toString().equals("X")&& btn24.getText().toString().equals("X")&& btn25.getText().toString().equals("X")){
            Toast.makeText(this, "Player X WINS!", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        }
        else if (btn1.getText().toString().equals("O") && btn2.getText().toString().equals("O") && btn3.getText().toString().equals("O") && btn4.getText().toString().equals("O")&& btn5.getText().toString().equals("O") ) {
            Toast.makeText(this, "Player O WINS!", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            gameOver = true;
            displayScoreO();
            playCount = 0;
            reset();
        }
        else if (btn6.getText().toString().equals("O") && btn7.getText().toString().equals("O") && btn8.getText().toString().equals("O") && btn9.getText().toString().equals("O")&& btn10.getText().toString().equals("O")){
            Toast.makeText(this, "Player O WINS!", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            gameOver = true;
            displayScoreO();
            playCount = 0;
            reset();
        }
        else if (btn11.getText().toString().equals("O") && btn12.getText().toString().equals("O") && btn13.getText().toString().equals("O")&& btn14.getText().toString().equals("O")&& btn15.getText().toString().equals("O")){
            Toast.makeText(this, "Player X WINS!", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            gameOver = true;
            displayScoreO();
            playCount = 0;
            reset();
        }
        else if (btn16.getText().toString().equals("O") && btn17.getText().toString().equals("O") && btn18.getText().toString().equals("O")&& btn19.getText().toString().equals("O")&& btn20.getText().toString().equals("O")){
            Toast.makeText(this, "Player O WINS!", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            gameOver = true;
            displayScoreO();
            playCount = 0;
            reset();
        }
        else if (btn21.getText().toString().equals("O") && btn22.getText().toString().equals("O") && btn23.getText().toString().equals("O")&& btn24.getText().toString().equals("O")&& btn25.getText().toString().equals("O")){
            Toast.makeText(this, "Player O WINS!", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            gameOver = true;
            displayScoreO();
            playCount = 0;
            reset();
        }

        else if (btn1.getText().toString().equals("X") && btn6.getText().toString().equals("X") && btn11.getText().toString().equals("X") && btn16.getText().toString().equals("X")&& btn21.getText().toString().equals("X") ) {
            Toast.makeText(this, "Player X WINS!", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        }
        else if (btn2.getText().toString().equals("X") && btn7.getText().toString().equals("X") && btn12.getText().toString().equals("X") && btn17.getText().toString().equals("X")&& btn22.getText().toString().equals("X")){
            Toast.makeText(this, "Player X WINS!", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        }
        else if (btn3.getText().toString().equals("X") && btn8.getText().toString().equals("X") && btn13.getText().toString().equals("X")&& btn18.getText().toString().equals("X")&& btn23.getText().toString().equals("X")){
            Toast.makeText(this, "Player X WINS!", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        }
        else if (btn4.getText().toString().equals("X") && btn9.getText().toString().equals("X") && btn14.getText().toString().equals("X")&& btn19.getText().toString().equals("X")&& btn24.getText().toString().equals("X")){
            Toast.makeText(this, "Player X WINS!", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        }
        else if (btn5.getText().toString().equals("X") && btn10.getText().toString().equals("X") && btn15.getText().toString().equals("X")&& btn20.getText().toString().equals("X")&& btn25.getText().toString().equals("X")){
            Toast.makeText(this, "Player X WINS!", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        }
        else if (btn1.getText().toString().equals("O") && btn6.getText().toString().equals("O") && btn11.getText().toString().equals("O") && btn16.getText().toString().equals("O")&& btn21.getText().toString().equals("O") ) {
            Toast.makeText(this, "Player O WINS!", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        }
        else if (btn2.getText().toString().equals("O") && btn7.getText().toString().equals("O") && btn12.getText().toString().equals("O") && btn17.getText().toString().equals("O")&& btn22.getText().toString().equals("O")){
            Toast.makeText(this, "Player O WINS!", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        }
        else if (btn3.getText().toString().equals("O") && btn8.getText().toString().equals("O") && btn13.getText().toString().equals("O")&& btn18.getText().toString().equals("O")&& btn23.getText().toString().equals("O")){
            Toast.makeText(this, "Player O WINS!", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            gameOver = true;
            displayScoreO();
            playCount = 0;
            reset();
        }
        else if (btn4.getText().toString().equals("O") && btn9.getText().toString().equals("O") && btn14.getText().toString().equals("O")&& btn19.getText().toString().equals("O")&& btn24.getText().toString().equals("O")){
            Toast.makeText(this, "Player X WINS!", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            gameOver = true;
            displayScoreO();
            playCount = 0;
            reset();
        }
        else if (btn5.getText().toString().equals("O") && btn10.getText().toString().equals("O") && btn15.getText().toString().equals("O")&& btn20.getText().toString().equals("O")&& btn25.getText().toString().equals("O")){
            Toast.makeText(this, "Player O WINS!", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            gameOver = true;
            displayScoreO();
            playCount = 0;
            reset();
        }
        else if (btn5.getText().toString().equals("X") && btn9.getText().toString().equals("X") && btn13.getText().toString().equals("X")&& btn17.getText().toString().equals("X")&& btn21.getText().toString().equals("X")){
            Toast.makeText(this, "Player X WINS!", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        }
        else if (btn1.getText().toString().equals("X") && btn7.getText().toString().equals("X") && btn13.getText().toString().equals("X")&& btn19.getText().toString().equals("X")&& btn25.getText().toString().equals("X")){
            Toast.makeText(this, "Player X WINS!", Toast.LENGTH_SHORT).show();
            xScore = xScore + 1;
            gameOver = true;
            displayScoreX();
            playCount = 0;
            reset();
        }
        else if (btn5.getText().toString().equals("O") && btn9.getText().toString().equals("O") && btn13.getText().toString().equals("O")&& btn17.getText().toString().equals("O")&& btn21.getText().toString().equals("O")){
            Toast.makeText(this, "Player O WINS!", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            gameOver = true;
            displayScoreO();
            playCount = 0;
            reset();
        }
        else if (btn1.getText().toString().equals("O") && btn7.getText().toString().equals("O") && btn13.getText().toString().equals("O")&& btn19.getText().toString().equals("O")&& btn25.getText().toString().equals("O")){
            Toast.makeText(this, "Player O WINS!", Toast.LENGTH_SHORT).show();
            oScore = oScore + 1;
            gameOver = true;
            displayScoreO();
            playCount = 0;
            reset();
        }
        else if (playCount == 25 ){
            Toast.makeText(this, "Game is a TIE", Toast.LENGTH_SHORT).show();
            gameOver = true;
            reset();
            playCount = 0;

        }


    }

}
