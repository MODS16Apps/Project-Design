package org.mods.app.minerals_boneyard;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

import org.mods.app.minerals_boneyard.R;

public class gems2 extends Activity implements OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gems_and_minerals2);

        View homeButton = findViewById(R.id.button3);
        homeButton.setOnClickListener(this);

        View previousButton = findViewById(R.id.imageButton12);
        previousButton.setOnClickListener(this);

        View nextButton = findViewById(R.id.imageButton11);
        nextButton.setOnClickListener(this);

        View dioptaseButton = findViewById(R.id.imageButton);
        dioptaseButton.setOnClickListener(this);

        View fluoriteButton = findViewById(R.id.imageButton3);
        fluoriteButton.setOnClickListener(this);

        View malachiteButton = findViewById(R.id.imageButton4);
        malachiteButton.setOnClickListener(this);

        View vanadiniteButton = findViewById(R.id.imageButton5);
        vanadiniteButton.setOnClickListener(this);

        View rhodochrositeButton = findViewById(R.id.imageButton6);
        rhodochrositeButton.setOnClickListener(this);

        View tourmalineButton = findViewById(R.id.imageButton7);
        tourmalineButton.setOnClickListener(this);

        View calciteButton = findViewById(R.id.imageButton8);
        calciteButton.setOnClickListener(this);

        View garnetsButton = findViewById(R.id.imageButton9);
        garnetsButton.setOnClickListener(this);

        View kyaniteButton = findViewById(R.id.imageButton10);
        kyaniteButton.setOnClickListener(this);

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
                Intent p = new Intent(this, gems1.class);
                startActivity(p);
                break;
            case R.id.imageButton11:
                Intent n = new Intent(this, gems3.class);
                startActivity(n);
                break;

            case R.id.imageButton:
                Intent d = new Intent(this, dioptase.class);
                startActivity(d);
                break;

            case R.id.imageButton3:
                Intent f = new Intent(this, fluorite.class);
                startActivity(f);
                break;

            case R.id.imageButton4:
                Intent m = new Intent(this, malachite.class);
                startActivity(m);
                break;

            case R.id.imageButton5:
                Intent va = new Intent(this, vanadinite.class);
                startActivity(va);
                break;

            case R.id.imageButton6:
                Intent rh = new Intent(this, rhodochrosite.class);
                startActivity(rh);
                break;

            case R.id.imageButton7:
                Intent to = new Intent(this, tourmaline.class);
                startActivity(to);
                break;

            case R.id.imageButton8:
                Intent ca = new Intent(this, calcite.class);
                startActivity(ca);
                break;

            case R.id.imageButton9:
                Intent ga = new Intent(this, garnets.class);
                startActivity(ga);
                break;

            case R.id.imageButton10:
                Intent ky = new Intent(this,kyanite.class);
                startActivity(ky);
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
} //end all



