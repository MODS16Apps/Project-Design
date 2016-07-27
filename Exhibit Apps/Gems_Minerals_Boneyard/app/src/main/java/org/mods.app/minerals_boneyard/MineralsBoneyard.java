
package org.mods.app.minerals_boneyard;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

import org.mods.app.minerals_boneyard.R;


public class MineralsBoneyard extends Activity implements OnClickListener {

   private static final String TAG = "Minerals and Boneyard";
   /** Called when the activity is first created. */
   @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.main);

      // Set up click listeners for all the buttons
      View boneyardButton = findViewById(R.id.imageButton12);
      boneyardButton.setOnClickListener(this);

      View mineralsButton = findViewById(R.id.imageButton13);
      mineralsButton.setOnClickListener(this);

      View aboutButton = findViewById(R.id.imageButton2);
      aboutButton.setOnClickListener(this);

      View aboutButon = findViewById(R.id.imageButton16);
      aboutButon.setOnClickListener(this);

     // View exitButton = findViewById(R.id.exit_button);
      //exitButton.setOnClickListener(this);
   }



 /* @Override
  protected void onResume() {
      super.onResume();
      Music.play(this, R.raw.main);
  }
   @Override
   protected void onPause() {
      super.onPause();
      Music.stop(this);
   }*/
   public void onClick(View v) {
      switch (v.getId()) {
      case R.id.imageButton12:
            Intent b = new Intent(this, boneyard.class);
            startActivity(b);
         break;
      case R.id.imageButton13:
            Intent m = new Intent(this, minerals.class);
            startActivity(m);
         break;
      case R.id.imageButton2:
            Intent i = new Intent(this, About.class);
            startActivity(i);
        break;
          case R.id.imageButton16:
              Intent intent = new Intent();
              intent.setAction("com.example.modsexplorer");
              sendBroadcast(intent);
              break;
      //case R.id.exit_button:
        //    finish();
         //break;
      }
   }
   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      super.onCreateOptionsMenu(menu);
      MenuInflater inflater = getMenuInflater();
      inflater.inflate(R.menu.menu, menu);
      return true;
   }
   @Override
   public boolean onOptionsItemSelected(MenuItem item) {
      switch (item.getItemId()) {
      case R.id.settings:
         startActivity(new Intent(this, Prefs.class));
         return true;
      // More items go here (if any) ...
      }
      return false;
   }

   /** Ask the user what difficulty level they want */
   private void openNewGameDialog() {
      new AlertDialog.Builder(this)
              .setTitle(R.string.new_game_title)
              .setItems(R.array.difficulty,
                      new DialogInterface.OnClickListener() {
                         public void onClick(DialogInterface dialoginterface,
                                             int i) {
                startGame(i);
                    }
      })
           .show();
   }
   /** Start a new game with the given difficulty level */
   private void startGame(int i) {
      Log.d(TAG, "clicked on " + i);
      Intent intent = new Intent(this, Game.class);
      intent.putExtra(Game.KEY_DIFFICULTY, i);
      startActivity(intent);
   }
}