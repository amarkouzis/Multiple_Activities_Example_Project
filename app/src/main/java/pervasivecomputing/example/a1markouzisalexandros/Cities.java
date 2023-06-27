package pervasivecomputing.example.a1markouzisalexandros;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Cities extends AppCompatActivity {
    String url, map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cities);

        Intent intent = getIntent();
        String region = intent.getStringExtra("return");

        if(region.equals("Viotia")){
            TextView text = (TextView) findViewById(R.id.textCity);
            text.setText("A city in the region of Viotia is Thiva.");
            url = "https://el.wikipedia.org/wiki/%CE%98%CE%AE%CE%B2%CE%B1";
            map = "geo:38.32263096555218, 23.320625305682107";
        }
        if(region.equals("Fthiotida")){
            TextView text = (TextView) findViewById(R.id.textCity);
            text.setText("A city in the region of Fthiotida is Lamia.");
            url = "https://el.wikipedia.org/wiki/%CE%9B%CE%B1%CE%BC%CE%AF%CE%B1";
            map = "geo:38.89971422684526, 22.433539394447376";
        }
        if(region.equals("Fokida")){
            TextView text = (TextView) findViewById(R.id.textCity);
            text.setText("A city in the region of Fokida is Amfissa.");
            url = "https://el.wikipedia.org/wiki/%CE%86%CE%BC%CF%86%CE%B9%CF%83%CF%83%CE%B1";
            map = "geo:38.52764932636731, 22.378768426364797";
        }
        if(region.equals("Evia")){
            TextView text = (TextView) findViewById(R.id.textCity);
            text.setText("A city in the region of Evia is Chalkida.");
            url = "https://el.wikipedia.org/wiki/%CE%A7%CE%B1%CE%BB%CE%BA%CE%AF%CE%B4%CE%B1";
            map = "geo:38.46867167062918, 23.622642303651215";
        }
        if(region.equals("Eyritania")){
            TextView text = (TextView) findViewById(R.id.textCity);
            text.setText("A city in the region of Eyritania is Karpenisi.");
            url = "https://el.wikipedia.org/wiki/%CE%9A%CE%B1%CF%81%CF%80%CE%B5%CE%BD%CE%AE%CF%83%CE%B9";
            map = "geo:38.91511099734579, 21.793781965832416";
        }
        if(region.equals("Chania")){
            TextView text = (TextView) findViewById(R.id.textCity);
            text.setText("A city in the region of Chania is Frangokastello.");
            url = "https://el.wikipedia.org/wiki/%CE%A6%CF%81%CE%B1%CE%B3%CE%BA%CE%BF%CE%BA%CE%AC%CF%83%CF%84%CE%B5%CE%BB%CE%BB%CE%BF";
            map = "geo:35.187073175651655, 24.227183358173555";
        }
        if(region.equals("Rethymno")){
            TextView text = (TextView) findViewById(R.id.textCity);
            text.setText("A city in the region of Rethymno is Rethymno.");
            url = "https://el.wikipedia.org/wiki/%CE%A1%CE%AD%CE%B8%CF%85%CE%BC%CE%BD%CE%BF";
            map = "geo:35.36598266236711, 24.49150954961905";
        }
        if(region.equals("Heraklion")){
            TextView text = (TextView) findViewById(R.id.textCity);
            text.setText("A city in the region of Heraklion is Heraklion.");
            url = "https://el.wikipedia.org/wiki/%CE%97%CF%81%CE%AC%CE%BA%CE%BB%CE%B5%CE%B9%CE%BF_%CE%9A%CF%81%CE%AE%CF%84%CE%B7%CF%82";
            map = "geo:35.33909700984497, 25.144168202478";
        }
        if(region.equals("Lasithi")){
            TextView text = (TextView) findViewById(R.id.textCity);
            text.setText("A city in the region of Lasithi is Agios Nikolaos.");
            url = "https://el.wikipedia.org/wiki/%CE%86%CE%B3%CE%B9%CE%BF%CF%82_%CE%9D%CE%B9%CE%BA%CF%8C%CE%BB%CE%B1%CE%BF%CF%82_%CE%9B%CE%B1%CF%83%CE%B9%CE%B8%CE%AF%CE%BF%CF%85";
            map = "geo:35.19041772291735, 25.716011856854205";
        }
        if(region.equals("Argolida")){
            TextView text = (TextView) findViewById(R.id.textCity);
            text.setText("A city in the region of Argolida is Argos.");
            url = "https://el.wikipedia.org/wiki/%CE%86%CF%81%CE%B3%CE%BF%CF%82";
            map = "geo:37.63501034946374, 22.727924845418666";
        }
        if(region.equals("Arkadia")){
            TextView text = (TextView) findViewById(R.id.textCity);
            text.setText("A city in the region of Arkadia is Tripoli.");
            url = "https://el.wikipedia.org/wiki/%CE%A4%CF%81%CE%AF%CF%80%CE%BF%CE%BB%CE%B7_%CE%91%CF%81%CE%BA%CE%B1%CE%B4%CE%AF%CE%B1%CF%82";
            map = "geo:37.510294012205115, 22.372880410609426";
        }
        if(region.equals("Korinthos")){
            TextView text = (TextView) findViewById(R.id.textCity);
            text.setText("A city in the region of Korinthos is Loutraki.");
            url = "https://el.wikipedia.org/wiki/%CE%9B%CE%BF%CF%85%CF%84%CF%81%CE%AC%CE%BA%CE%B9";
            map = "geo:37.976052547589525, 22.977241816640333";
        }
        if(region.equals("Lakonia")){
            TextView text = (TextView) findViewById(R.id.textCity);
            text.setText("A city in the region of Lakonia is Sparti.");
            url = "https://el.wikipedia.org/wiki/%CE%A3%CF%80%CE%AC%CF%81%CF%84%CE%B7";
            map = "geo:37.074869173085126, 22.430838582733504";
        }
        if(region.equals("Messinia")){
            TextView text = (TextView) findViewById(R.id.textCity);
            text.setText("A city in the region of Messinia is Kalamata.");
            url = "https://el.wikipedia.org/wiki/%CE%9A%CE%B1%CE%BB%CE%B1%CE%BC%CE%AC%CF%84%CE%B1";
            map = "geo:37.03646944534818, 22.114926938817963";
        }
        if(region.equals("Drama")){
            TextView text = (TextView) findViewById(R.id.textCity);
            text.setText("A city in the region of Drama is Drama.");
            url = "https://el.wikipedia.org/wiki/%CE%94%CF%81%CE%AC%CE%BC%CE%B1_(%CF%80%CF%8C%CE%BB%CE%B7)";
            map = "geo:41.150470287568865, 24.14653020347361";
        }
        if(region.equals("Evros")){
            TextView text = (TextView) findViewById(R.id.textCity);
            text.setText("A city in the region of Evros is Alexandroupoli.");
            url = "https://el.wikipedia.org/wiki/%CE%91%CE%BB%CE%B5%CE%BE%CE%B1%CE%BD%CE%B4%CF%81%CE%BF%CF%8D%CF%80%CE%BF%CE%BB%CE%B7";
            map = "geo:40.845952660844766, 25.87316444360306";
        }
        if(region.equals("Kavala")){
            TextView text = (TextView) findViewById(R.id.textCity);
            text.setText("A city in the region of Kavala is Kavala.");
            url = "https://el.wikipedia.org/wiki/%CE%9A%CE%B1%CE%B2%CE%AC%CE%BB%CE%B1";
            map = "geo:40.937599653377575, 24.412378529443515";
        }
        if(region.equals("Xanthi")){
            TextView text = (TextView) findViewById(R.id.textCity);
            text.setText("A city in the region of Xanthi is Xanthi.");
            url = "https://el.wikipedia.org/wiki/%CE%9E%CE%AC%CE%BD%CE%B8%CE%B7";
            map = "geo:41.13628941079242, 24.887811706883088";
        }
        if(region.equals("Rodopi")){
            TextView text = (TextView) findViewById(R.id.textCity);
            text.setText("A city in the region of Rodopi is Komotini.");
            url = "https://el.wikipedia.org/wiki/%CE%9A%CE%BF%CE%BC%CE%BF%CF%84%CE%B7%CE%BD%CE%AE";
            map = "geo:41.122492178013886, 25.404783244172666";
        }
        if(region.equals("Karditsa")){
            TextView text = (TextView) findViewById(R.id.textCity);
            text.setText("A city in the region of Karditsa is Karditsa.");
            url = "https://el.wikipedia.org/wiki/%CE%9A%CE%B1%CF%81%CE%B4%CE%AF%CF%84%CF%83%CE%B1";
            map = "geo:39.3643056436263, 21.920442353723473";
        }
        if(region.equals("Larisa")){
            TextView text = (TextView) findViewById(R.id.textCity);
            text.setText("A city in the region of Larisa is Elassona.");
            url = "https://el.wikipedia.org/wiki/%CE%95%CE%BB%CE%B1%CF%83%CF%83%CF%8C%CE%BD%CE%B1";
            map = "geo:39.895045135131376, 22.188985880493043";
        }
        if(region.equals("Magnesia")){
            TextView text = (TextView) findViewById(R.id.textCity);
            text.setText("A city in the region of Magnesia is Volos.");
            url = "https://el.wikipedia.org/wiki/%CE%92%CF%8C%CE%BB%CE%BF%CF%82";
            map = "geo:39.36653127197993, 22.951268269299902";
        }
        if(region.equals("Trikala")){
            TextView text = (TextView) findViewById(R.id.textCity);
            text.setText("A city in the region of Trikala is Trikala.");
            url = "https://el.wikipedia.org/wiki/%CE%A4%CF%81%CE%AF%CE%BA%CE%B1%CE%BB%CE%B1";
            map = "geo:39.55594181877077, 21.769796716998442";
        }
        if(region.equals("Arta")){
            TextView text = (TextView) findViewById(R.id.textCity);
            text.setText("A city in the region of Arta is Arta.");
            url = "https://el.wikipedia.org/wiki/%CE%86%CF%81%CF%84%CE%B1";
            map = "geo:39.158256650132735, 20.987469493279338";
        }
        if(region.equals("Thesprotia")){
            TextView text = (TextView) findViewById(R.id.textCity);
            text.setText("A city in the region of Thesprotia is Igoumenitsa.");
            url = "https://el.wikipedia.org/wiki/%CE%97%CE%B3%CE%BF%CF%85%CE%BC%CE%B5%CE%BD%CE%AF%CF%84%CF%83%CE%B1";
            map = "geo:39.50635645668287, 20.265396917853206";
        }
        if(region.equals("Ioannina")){
            TextView text = (TextView) findViewById(R.id.textCity);
            text.setText("A city in the region of Ioannina is Metsovo.");
            url = "https://el.wikipedia.org/wiki/%CE%9C%CE%AD%CF%84%CF%83%CE%BF%CE%B2%CE%BF";
            map = "geo:39.770431780565616, 21.18193377984976";
        }
        if(region.equals("Preveza")){
            TextView text = (TextView) findViewById(R.id.textCity);
            text.setText("A city in the region of Preveza is Preveza.");
            url = "https://el.wikipedia.org/wiki/%CE%A0%CF%81%CE%AD%CE%B2%CE%B5%CE%B6%CE%B1";
            map = "geo:38.959105201542705, 20.752002864034438";
        }
    }
    public void goToWebPage(View view) {
        Uri webpage = Uri.parse(url);
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
    public void goToMap(View view){
        Uri location = Uri.parse(map);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
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
