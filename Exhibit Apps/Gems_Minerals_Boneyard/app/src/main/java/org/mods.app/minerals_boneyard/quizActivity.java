package org.mods.app.minerals_boneyard;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;


public class quizActivity extends Activity {
    ImageView mainImage;
    Button submit;
    TextView tv;
    Button exit;
    Spinner spinner;
    quizpart q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16, q17, q18, q19, q20,
            q21, q22, q23, q24, q25, q26, q27, q28, q29, q30, q31, q32, q33, q34;
    quizpart selectedquestion;
    ArrayList<quizpart> allQuizQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        allQuizQuestions = new ArrayList<quizpart>();
        mainImage = (ImageView) findViewById(R.id.imageView);
        exit = (Button) findViewById(R.id.button6);
        submit = (Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.textView);
        spinner = (Spinner) findViewById (R.id.spinner);

        q1 = new quizpart(R.drawable.adamite_x, "What mineral is this?", "Adamite");   //ignore cases
        q2 = new quizpart(R.drawable.amethyst_x, getString(R.string.q1), "Amethyst");
        q3 = new quizpart(R.drawable.apophyllite_x, getString(R.string.q1), "Apophyllite");
        q4 = new quizpart(R.drawable.aragonite_x, getString(R.string.q1), "Aragonite");
        q5 = new quizpart(R.drawable.azurite_x, getString(R.string.q1), "Azurite");
        q6 = new quizpart(R.drawable.barite_x, getString(R.string.q1), "Barite");
        q7 = new quizpart(R.drawable.biotite_x, getString(R.string.q1), "Biotite Mica");
        q8 = new quizpart(R.drawable.calcite_x, getString(R.string.q1), "Calcite");
        q9 = new quizpart(R.drawable.celestite_x, getString(R.string.q1), "Celestite");
        q10 = new quizpart(R.drawable.chrysocolla_x, getString(R.string.q1), "Chrysocolla");
        q11 = new quizpart(R.drawable.citrine_x, getString(R.string.q1), "Citrine");
        q12 = new quizpart(R.drawable.copper_x, getString(R.string.q1), "Copper");
        q13 = new quizpart(R.drawable.dioptase_x, getString(R.string.q1), "Dioptase");
        q14 = new quizpart(R.drawable.dolomite_x, getString(R.string.q1), "Dolomite");
        q15 = new quizpart(R.drawable.fluorite_x, getString(R.string.q1), "Fluorite");
        q16 = new quizpart(R.drawable.galena_x, getString(R.string.q1), "Galena");
        q17 = new quizpart(R.drawable.garnets_x, getString(R.string.q1), "Garnets");
        q18 = new quizpart(R.drawable.gypsum_x, getString(R.string.q1), "Gypsum");
        q19 = new quizpart(R.drawable.halite_x, getString(R.string.q1), "Halite");
        q20 = new quizpart(R.drawable.hematite_x, getString(R.string.q1), "Hematite");
        q21 = new quizpart(R.drawable.hubnerite_x, getString(R.string.q1), "Hubnerite");
        q22 = new quizpart(R.drawable.kyanite_x, getString(R.string.q1), "Kyanite");
        q23 = new quizpart(R.drawable.malachite_x, getString(R.string.q1), "Malachite");
        q24 = new quizpart(R.drawable.mimetite_x, getString(R.string.q1), "Mimetite");
        q25 = new quizpart(R.drawable.okenite_x, getString(R.string.q1), "Okenite");
        q26 = new quizpart(R.drawable.opal_x, getString(R.string.q1), "Opal");
        q27 = new quizpart(R.drawable.pyrite_x, getString(R.string.q1), "Pyrite");
        q28 = new quizpart(R.drawable.quartz_x, getString(R.string.q1), "Quartz");
        q29 = new quizpart(R.drawable.rhodochrosite_x, getString(R.string.q1), "Rhodochrosite");
        q30 = new quizpart(R.drawable.smithsonite_x, getString(R.string.q1), "Smithsomite");
        q31 = new quizpart(R.drawable.sphalerite_x, getString(R.string.q1), "Sphalerite");
        q32 = new quizpart(R.drawable.tourmaline_x, getString(R.string.q1), "Tourmaline");
        q33 = new quizpart(R.drawable.vanadinite_x, getString(R.string.q1), "Vanadinite");
        q34 = new quizpart(R.drawable.wulfenite_x, getString(R.string.q1), "Wulfenite");


        allQuizQuestions.add(q1);
        allQuizQuestions.add(q2);
        allQuizQuestions.add(q3);
        allQuizQuestions.add(q4);
        allQuizQuestions.add(q5);
        allQuizQuestions.add(q6);
        allQuizQuestions.add(q7);
        allQuizQuestions.add(q8);
        allQuizQuestions.add(q9);
        allQuizQuestions.add(q10);
        allQuizQuestions.add(q11);
        allQuizQuestions.add(q12);
        allQuizQuestions.add(q13);
        allQuizQuestions.add(q14);
        allQuizQuestions.add(q15);
        allQuizQuestions.add(q16);
        allQuizQuestions.add(q17);
        allQuizQuestions.add(q18);
        allQuizQuestions.add(q19);
        allQuizQuestions.add(q20);
        allQuizQuestions.add(q21);
        allQuizQuestions.add(q22);
        allQuizQuestions.add(q23);
        allQuizQuestions.add(q24);
        allQuizQuestions.add(q25);
        allQuizQuestions.add(q26);
        allQuizQuestions.add(q27);
        allQuizQuestions.add(q28);
        allQuizQuestions.add(q29);
        allQuizQuestions.add(q30);
        allQuizQuestions.add(q31);
        allQuizQuestions.add(q32);
        allQuizQuestions.add(q33);
        allQuizQuestions.add(q34);
        nextquestion();


         spinner= (Spinner) findViewById(R.id.spinner);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Check answer
                if(selectedquestion.getAnswer().equals(spinner.getSelectedItem().toString())) {


                    final Dialog dialog = new Dialog(quizActivity.this);
                    dialog.setContentView(R.layout.correct);
                    dialog.show();





                    //Get next question
                    nextquestion();
                }
                 else{
                    final Dialog dialog = new Dialog(quizActivity.this);
                    dialog.setContentView(R.layout.incorrect);
                    dialog.show();



                }


            }
        });

        /*exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


               Intent h = new Intent(this,gems1.class);
               startActivity(h);
            }
        });  */
    }

    public void nextquestion() {
        Random rand = new Random();
        int i = rand.nextInt(allQuizQuestions.size() - 1);
        tv.setText(allQuizQuestions.get(i).getQuestion());
        mainImage.setImageResource(allQuizQuestions.get(i).getImage());
        selectedquestion = allQuizQuestions.get(i);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quiz, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}