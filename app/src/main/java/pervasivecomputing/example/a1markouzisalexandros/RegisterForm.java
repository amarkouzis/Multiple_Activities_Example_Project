package pervasivecomputing.example.a1markouzisalexandros;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class RegisterForm extends AppCompatActivity {
    EditText first, last;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_form);
        first = findViewById(R.id.editFirst);
        last = findViewById(R.id.editLast);

    }
    public void Done (View view){

        String name1 = first.getText().toString().trim();
        String name2 = last.getText().toString().trim();

        Intent intent = new Intent();
        intent.putExtra("name1", name1);
        intent.putExtra("name2", name2);
        setResult(RESULT_OK, intent);
        finish();
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
