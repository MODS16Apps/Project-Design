package org.mods.app.minerals_boneyard;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

import org.mods.app.minerals_boneyard.R;

public class gems3 extends Activity implements OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gems_and_minerals3);

        View homeButton = findViewById(R.id.button3);
        homeButton.setOnClickListener(this);

        View previousButton = findViewById(R.id.imageButton12);
        previousButton.setOnClickListener(this);

        View nextButton = findViewById(R.id.imageButton11);
        nextButton.setOnClickListener(this);

        View wulfeniteButton = findViewById(R.id.imageButton);
        wulfeniteButton.setOnClickListener(this);

        View azuriteButton = findViewById(R.id.imageButton3);
        azuriteButton.setOnClickListener(this);

        View sphaleriteButton = findViewById(R.id.imageButton4);
        sphaleriteButton.setOnClickListener(this);

        View bariteButton = findViewById(R.id.imageButton5);
        bariteButton.setOnClickListener(this);

        View copperButton = findViewById(R.id.imageButton6);
        copperButton.setOnClickListener(this);

        View chrysocollaButton = findViewById(R.id.imageButton7);
        chrysocollaButton.setOnClickListener(this);

        View hubneriteButton = findViewById(R.id.imageButton8);
        hubneriteButton.setOnClickListener(this);

        View aragoniteButton = findViewById(R.id.imageButton9);
        aragoniteButton.setOnClickListener(this);

        View hematiteButton = findViewById(R.id.imageButton10);
        hematiteButton.setOnClickListener(this);

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
                Intent p = new Intent(this, gems2.class);
                startActivity(p);
                break;
            case R.id.imageButton11:
                Intent n = new Intent(this, gems4.class);
                startActivity(n);
                break;
            case R.id.imageButton:
                Intent wu = new Intent(this, wulfenite.class);
                startActivity(wu);
                break;
            case R.id.imageButton3:
                Intent az = new Intent(this, azurite.class);
                startActivity(az);
                break;
            case R.id.imageButton4:
                Intent sp = new Intent(this, sphalerite.class);
                startActivity(sp);
                break;
            case R.id.imageButton5:
                Intent ba = new Intent(this, barite.class);
                startActivity(ba);
                break;
            case R.id.imageButton6:
                Intent co = new Intent(this, copper.class);
                startActivity(co);
                break;
            case R.id.imageButton7:
                Intent ch = new Intent(this, chrysocolla.class);
                startActivity(ch);
                break;
            case R.id.imageButton8:
                Intent hu = new Intent(this, hubnerite.class);
                startActivity(hu);
                break;
            case R.id.imageButton9:
                Intent ar = new Intent(this, aragonite.class);
                startActivity(ar);
                break;
            case R.id.imageButton10:
                Intent he = new Intent(this, hematite.class);
                startActivity(he);
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
