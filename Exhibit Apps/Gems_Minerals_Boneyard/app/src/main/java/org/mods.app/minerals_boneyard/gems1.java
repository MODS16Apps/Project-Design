package org.mods.app.minerals_boneyard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

import org.mods.app.minerals_boneyard.R;


public class gems1 extends Activity implements OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.gems_and_minerals1);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.gems_and_minerals1);

        View homeButton = findViewById(R.id.button3);
        homeButton.setOnClickListener(this);

        View nextButton = findViewById(R.id.imageButton11);
        nextButton.setOnClickListener(this);

        View quartzButton = findViewById(R.id.imageButton3);
        quartzButton.setOnClickListener(this);

        View pyriteButton = findViewById(R.id.imageButton);
        pyriteButton.setOnClickListener(this);

        View galenaButton = findViewById(R.id.imageButton4);
        galenaButton.setOnClickListener(this);

        View gypsumButton = findViewById(R.id.imageButton5);
        gypsumButton.setOnClickListener(this);

        View mimetiteButton = findViewById(R.id.imageButton6);
        mimetiteButton.setOnClickListener(this);

        View biotite_micaButton = findViewById(R.id.imageButton7);
        biotite_micaButton.setOnClickListener(this);

        View okeniteButton = findViewById(R.id.imageButton8);
        okeniteButton.setOnClickListener(this);

        View celestiteButton = findViewById(R.id.imageButton9);
        celestiteButton.setOnClickListener(this);

        View apophylliteButton = findViewById(R.id.imageButton10);
        apophylliteButton.setOnClickListener(this);

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
                Intent h = new Intent(this, MineralsBoneyard.class);
                startActivity(h);
                break;

            case R.id.imageButton11:
                Intent g = new Intent(this, gems2.class);
                startActivity(g);
                break;

            case R.id.imageButton3:
                Intent q = new Intent(this, quartz.class);
                startActivity(q);
                break;
            case R.id.imageButton:
                Intent p = new Intent(this, pyrite.class);
                startActivity(p);
                break;
            case R.id.imageButton4:
                Intent ga = new Intent(this, galena.class);
                startActivity(ga);
                break;
            case R.id.imageButton5:
                Intent gy = new Intent(this, gypsum.class);
                startActivity(gy);
                break;
            case R.id.imageButton6:
                Intent m = new Intent(this, mimetite.class);
                startActivity(m);
                break;
            case R.id.imageButton7:
                Intent b = new Intent(this, biotite_mica.class);
                startActivity(b);
                break;

            case R.id.imageButton8:
                Intent o = new Intent(this, okenite.class);
                startActivity(o);
                break;

            case R.id.imageButton9:
                Intent ce = new Intent(this, celestite.class);
                startActivity(ce);
                break;

            case R.id.imageButton10:
                Intent a = new Intent(this, apophyllite.class);
                startActivity(a);
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


}//end all
