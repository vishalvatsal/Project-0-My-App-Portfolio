package au.com.diainfot.portfolioapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void onClickSportifyStreamer(View view) {
        displayMessage("This button will launch Spotify Streamer app");
    }

    public void onClickScoresApp(View view) {
        displayMessage("This button will launch Score app");
    }

    public void onClickLibraryApp(View view) {
        displayMessage("This button will launch Library app");
    }

    public void onClickBuildItBigger(View view) {
        displayMessage("This button will launch Build it Bigger app");
    }

    public void onClickXYZReader(View view) {
        displayMessage("This button will launch XYZ Reader app");
    }

    public void onClickCapstone(View view) {
        displayMessage("This button will launch Capstone app");
    }

    private void displayMessage(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
