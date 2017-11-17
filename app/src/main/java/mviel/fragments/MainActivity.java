package mviel.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import static java.security.AccessController.getContext;

public class MainActivity extends Activity implements Fragment2.OnFragmentInteractionListener2,Fragment3.OnFragmentInteractionListener3 {
    Fragment fr1, fr2;
    FrameLayout fra1, fra2;
    static int fr2Click = 0;
    static TextView count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fr1 = (Fragment) getFragmentManager().findFragmentById(R.id.canto_superior_dret);
        fr2 = (Fragment) getFragmentManager().findFragmentById(R.id.canto_inferior_dret);

        fra1 = (FrameLayout) findViewById(R.id.canto_superior_dret);
        fra2 = (FrameLayout) findViewById(R.id.canto_inferior_dret);
        count = (TextView) findViewById(R.id.contador_text);



    }



    @Override
    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount() > 0) {
            Toast.makeText(this, "Has eliminado el ultimo Fragment creado", Toast.LENGTH_SHORT).show();
            getFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }
    /*@Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub
        if (keyCode == event.KEYCODE_BACK) {
            event.KEYCODE_BACK.
            Log.d("dddd","dddd");

            if(estaFragment3EnActivity()){

                getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.canto_inferior_dret));

            }else if(estaFragment2EnActivity()){


                getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.canto_superior_dret));

            }

        }
        return super.onKeyDown(keyCode, event);
    }

*/
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

    @Override
    public void onFragmentInteraction2(Uri uri) {



    }

    @Override
    public boolean estaFragment3EnActivity() {
       Fragment3 f3= (Fragment3)getFragmentManager().findFragmentById(R.id.canto_inferior_dret);
        if(f3==null)
            return false;
        else
            return true;
    }


    public boolean estaFragment2EnActivity() {
        Fragment2 f2= (Fragment2)getFragmentManager().findFragmentById(R.id.canto_superior_dret);
        if(f2==null)
            return false;
        else
            return true;
    }

    @Override
    public void onFragmentInteraction3(Uri uri) {


        }

}

