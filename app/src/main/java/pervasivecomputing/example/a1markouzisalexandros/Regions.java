package pervasivecomputing.example.a1markouzisalexandros;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Regions extends AppCompatActivity {

    boolean selected = false;
    LinearLayout central, crete, peloponnisos, thrace, thessaly, epirus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regions);

        central = (LinearLayout) findViewById(R.id.groupCentral);
        crete = (LinearLayout) findViewById(R.id.groupCrete);
        peloponnisos = (LinearLayout) findViewById(R.id.groupPeloponnisos);
        thrace = (LinearLayout) findViewById(R.id.groupThrace);
        thessaly = (LinearLayout) findViewById(R.id.groupThessaly);
        epirus = (LinearLayout) findViewById(R.id.groupEpirus);

        Intent intent = getIntent();
        String string = intent.getStringExtra("return");

        if(string.equals("Central Greece")){
            central.setVisibility(View.VISIBLE);
        }
        if(string.equals("Crete")){
            crete.setVisibility(View.VISIBLE);
        }
        if(string.equals("Peloponnisos")){
            peloponnisos.setVisibility(View.VISIBLE);
        }
        if(string.equals("Thrace")){
            thrace.setVisibility(View.VISIBLE);
        }
        if(string.equals("Thessaly")){
            thessaly.setVisibility(View.VISIBLE);
        }
        if(string.equals("Epirus")){
            epirus.setVisibility(View.VISIBLE);
        }
    }

    public void onRegionSelection(View view) {
        selected = true;
        String selection;
        switch(view.getId()) {
            case R.id.buttonVio:
                if (selected) {
                    selection = "Viotia";
                    Intent intent = new Intent(this, Cities.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonFth:
                if (selected) {
                    selection = "Fthiotida";
                    Intent intent = new Intent(this, Cities.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonFok:
                if (selected) {
                    selection = "Fokida";
                    Intent intent = new Intent(this, Cities.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonEv:
                if (selected) {
                    selection = "Evia";
                    Intent intent = new Intent(this, Cities.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonEyr:
                if (selected) {
                    selection = "Eyritania";
                    Intent intent = new Intent(this, Cities.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonCha:
                if (selected) {
                    selection = "Chania";
                    Intent intent = new Intent(this, Cities.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonRe:
                if (selected) {
                    selection = "Rethymno";
                    Intent intent = new Intent(this, Cities.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonHer:
                if (selected) {
                    selection = "Heraklion";
                    Intent intent = new Intent(this, Cities.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonLas:
                if (selected) {
                    selection = "Lasithi";
                    Intent intent = new Intent(this, Cities.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonArg:
                if (selected) {
                    selection = "Argolida";
                    Intent intent = new Intent(this, Cities.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonArk:
                if (selected) {
                    selection = "Arkadia";
                    Intent intent = new Intent(this, Cities.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonKor:
                if (selected) {
                    selection = "Korinthos";
                    Intent intent = new Intent(this, Cities.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonLak:
                if (selected) {
                    selection = "Lakonia";
                    Intent intent = new Intent(this, Cities.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonMes:
                if (selected) {
                    selection = "Messinia";
                    Intent intent = new Intent(this, Cities.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonDra:
                if (selected) {
                    selection = "Drama";
                    Intent intent = new Intent(this, Cities.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonEvr:
                if (selected) {
                    selection = "Evros";
                    Intent intent = new Intent(this, Cities.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonKav:
                if (selected) {
                    selection = "Kavala";
                    Intent intent = new Intent(this, Cities.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonXan:
                if (selected) {
                    selection = "Xanthi";
                    Intent intent = new Intent(this, Cities.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonRod:
                if (selected) {
                    selection = "Rodopi";
                    Intent intent = new Intent(this, Cities.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonKar:
                if (selected) {
                    selection = "Karditsa";
                    Intent intent = new Intent(this, Cities.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonLar:
                if (selected) {
                    selection = "Larisa";
                    Intent intent = new Intent(this, Cities.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonMag:
                if (selected) {
                    selection = "Magnesia";
                    Intent intent = new Intent(this, Cities.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonTri:
                if (selected) {
                    selection = "Trikala";
                    Intent intent = new Intent(this, Cities.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonArt:
                if (selected) {
                    selection = "Arta";
                    Intent intent = new Intent(this, Cities.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonThp:
                if (selected) {
                    selection = "Thesprotia";
                    Intent intent = new Intent(this, Cities.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonIo:
                if (selected) {
                    selection = "Ioannina";
                    Intent intent = new Intent(this, Cities.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonPre:
                if (selected) {
                    selection = "Preveza";
                    Intent intent = new Intent(this, Cities.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        }
    }
}
