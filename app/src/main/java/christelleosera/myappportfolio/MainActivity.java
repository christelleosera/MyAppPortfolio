package christelleosera.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Toast toast;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spotify_button = (Button) findViewById(R.id.spotify_button);
        spotify_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "Spotify";
                int duration = Toast.LENGTH_SHORT;

                if(toast == null) toast = Toast.makeText(context, text, duration);
                toast.setText(text);
                toast.show();
            }
        });
        Button scores_button = (Button) findViewById(R.id.scores_button);
        scores_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "Scores";
                int duration = Toast.LENGTH_SHORT;

                if(toast == null) toast = Toast.makeText(context, text, duration);
                toast.setText(text);
                toast.show();
            }
        });
        Button library_button = (Button) findViewById(R.id.library_button);
        library_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "Library";
                int duration = Toast.LENGTH_SHORT;

                if(toast == null) toast = Toast.makeText(context, text, duration);
                toast.setText(text);
                toast.show();
            }
        });
        Button build_button = (Button) findViewById(R.id.build_button);
        build_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "Build";
                int duration = Toast.LENGTH_SHORT;

                if(toast == null) toast = Toast.makeText(context, text, duration);
                toast.setText(text);
                toast.show();
            }
        });
        Button xyz_button = (Button) findViewById(R.id.xyz_button);
        xyz_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "XYZ";
                int duration = Toast.LENGTH_SHORT;

                if(toast == null) toast = Toast.makeText(context, text, duration);
                toast.setText(text);
                toast.show();
            }
        });
        Button capstone_button = (Button) findViewById(R.id.capstone_button);
        capstone_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "Capstone";
                int duration = Toast.LENGTH_SHORT;

                if(toast == null) toast = Toast.makeText(context, text, duration);
                toast.setText(text);
                toast.show();
            }
        });
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


}
