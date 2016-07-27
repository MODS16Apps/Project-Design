package org.mods.app.minerals_boneyard;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

import org.mods.app.minerals_boneyard.R;

public class aragonite extends Activity implements OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aragonite);

        View homeButton = findViewById(R.id.button3);
        homeButton.setOnClickListener(this);
        View backButton = findViewById(R.id.imageButton12);
        backButton.setOnClickListener(this);

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
                Intent h = new Intent(this,MineralsBoneyard.class);
                startActivity(h);
                break;
            case R.id.imageButton12:
                Intent b = new Intent(this,gems3.class);
                startActivity(b);
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
