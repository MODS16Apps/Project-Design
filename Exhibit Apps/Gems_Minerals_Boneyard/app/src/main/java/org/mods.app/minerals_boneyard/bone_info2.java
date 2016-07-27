package org.mods.app.minerals_boneyard;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import org.mods.app.minerals_boneyard.R;

public class bone_info2  extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bone_infopg2);

        View homeButton = findViewById(R.id.button5);
        homeButton.setOnClickListener(this);

        View paleoButton = findViewById(R.id.Button17);
        paleoButton.setOnClickListener(this);

        View mesoButton = findViewById(R.id.Button18);
        mesoButton.setOnClickListener(this);

        View cenoButton = findViewById(R.id.Button19);
        cenoButton.setOnClickListener(this);

        View backButton = findViewById(R.id.imageButton13);
        backButton.setOnClickListener(this);

        View nextButton = findViewById(R.id.imageButton14);
        nextButton.setOnClickListener(this);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_boneyard, menu);
        return true;
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button5:
                Intent h = new Intent(this,MineralsBoneyard.class);
                startActivity(h);
                break;
            case R.id.Button17:
                Intent p = new Intent(this,paleozoic.class);
                startActivity(p);
                break;

            case R.id.Button18:
                Intent m = new Intent(this,mesozoic.class);
                startActivity(m);
                break;

            case R.id.Button19:
                Intent c = new Intent(this,cenozoic.class);
                startActivity(c);
                break;

            case R.id.imageButton13:
                Intent b = new Intent(this,bone_info1.class);
                startActivity(b);
                break;
            case R.id.imageButton14:
                Intent n = new Intent(this,bone_info3.class);
                startActivity(n);
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
