package org.mods.app.minerals_boneyard;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

import org.mods.app.minerals_boneyard.R;

public class gems4 extends Activity implements OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gems_and_minerals4);

        View homeButton = findViewById(R.id.button3);
        homeButton.setOnClickListener(this);

        View previousButton = findViewById(R.id.imageButton12);
        previousButton.setOnClickListener(this);

        View adamiteButton = findViewById(R.id.imageButton);
        adamiteButton.setOnClickListener(this);

        View haliteButton = findViewById(R.id.imageButton3);
        haliteButton.setOnClickListener(this);

        View amethystButton = findViewById(R.id.imageButton4);
        amethystButton.setOnClickListener(this);

        View opalButton = findViewById(R.id.imageButton5);
        opalButton.setOnClickListener(this);

        View dolomiteButton = findViewById(R.id.imageButton6);
        dolomiteButton.setOnClickListener(this);

        View smithsoniteButton = findViewById(R.id.imageButton7);
        smithsoniteButton.setOnClickListener(this);

        View citrineButton = findViewById(R.id.imageButton8);
        citrineButton.setOnClickListener(this);

        View gameButton = findViewById(R.id.button4);
        gameButton.setOnClickListener(this);



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_minerals, menu);
        return true;
    }
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button3:
                Intent z = new Intent(this, MineralsBoneyard.class);
                startActivity(z);
                break;
            case R.id.imageButton12:
                Intent p = new Intent(this, gems3.class);
                startActivity(p);
                break;
            case R.id.imageButton:
                Intent ad = new Intent(this, adamite.class);
                startActivity(ad);
                break;
            case R.id.imageButton3:
                Intent ha = new Intent(this, halite.class);
                startActivity(ha);
                break;
            case R.id.imageButton4:
                Intent am = new Intent(this, amethyst.class);
                startActivity(am);
                break;
            case R.id.imageButton5:
                Intent op = new Intent(this, opal.class);
                startActivity(op);
                break;
            case R.id.imageButton6:
                Intent dol = new Intent(this, dolomite.class);
                startActivity(dol);
                break;
            case R.id.imageButton7:
                Intent sm = new Intent(this, smithsonite.class);
                startActivity(sm);
                break;
            case R.id.imageButton8:
                Intent ct = new Intent(this, citrine.class);
                startActivity(ct);
                break;
            case R.id.button4:
                Intent game = new Intent(this, quizActivity.class);
                startActivity(game);
                break;


        }//end switch
    }//end void
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
