package sg.edu.rp.c326.id22015010.p04quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText etEventCode, etEmail;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etEventCode=findViewById(R.id.etEventCode);
        etEmail=findViewById(R.id.etEmail);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Validation for Event Code
                String eventCode = etEventCode.getText().toString();
                if (eventCode.length() == 7) {
                    Toast.makeText(MainActivity.this, "Successful", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Please enter 7 characters, Invalid Input", Toast.LENGTH_LONG).show();
                }

                // Validation for Email
                String email = etEmail.getText().toString();
                if (email.endsWith("rp.edu.sg")) {
                    Toast.makeText(MainActivity.this, "Successful", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Please enter a valid email ending with rp.edu.sg", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}