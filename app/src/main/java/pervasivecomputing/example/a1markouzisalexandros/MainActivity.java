package pervasivecomputing.example.a1markouzisalexandros;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView firstName, lastName;
    boolean selected = false;
    Button button;
    LinearLayout group;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = findViewById(R.id.textView);
        lastName = findViewById(R.id.textView);

        button = (Button) findViewById(R.id.registerButton);
        group = (LinearLayout) findViewById(R.id.groupRegions);
    }

    androidx.activity.result.ActivityResultLauncher<Intent> ActivityResultLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        Intent data = result.getData();

                        String name1 = data.getStringExtra("name1");
                        firstName.setText(name1);
                        String name2 = data.getStringExtra("name2");
                        firstName.setText(name2);

                        TextView text = (TextView) findViewById(R.id.textView);
                        text.setText("Wellcome " + name1 + " " + name2 + "!");

                        group.setVisibility(View.VISIBLE);
                    }
                }
            });
    public void Register(View view) {
        Intent setResultsIntent = new Intent(this, RegisterForm.class);
        ActivityResultLauncher.launch(setResultsIntent);

        button.setVisibility(view.INVISIBLE);
    }
    public void onFirstSelection(View view) {
        selected = true;
        String selection;
        switch(view.getId()) {
            case R.id.buttonCen:
                if (selected) {
                    selection = "Central Greece";
                    Intent intent = new Intent(this, Regions.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonCre:
                if (selected) {
                    selection = "Crete";
                    Intent intent = new Intent(this, Regions.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonPel:
                if (selected) {
                    selection = "Peloponnisos";
                    Intent intent = new Intent(this, Regions.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonThr:
                if (selected) {
                    selection = "Thrace";
                    Intent intent = new Intent(this, Regions.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonThe:
                if (selected) {
                    selection = "Thessaly";
                    Intent intent = new Intent(this, Regions.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonEpi:
                if (selected) {
                    selection = "Epirus";
                    Intent intent = new Intent(this, Regions.class);
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
