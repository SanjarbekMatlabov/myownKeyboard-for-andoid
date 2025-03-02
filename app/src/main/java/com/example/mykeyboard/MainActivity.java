package com.example.mykeyboard;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button enableImeButton = findViewById(R.id.enable_ime_button);
        Button enableAccessibilityButton = findViewById(R.id.enable_accessibility_button);

        enableImeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Settings.ACTION_INPUT_METHOD_SETTINGS);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Enable 'My Custom Keyboard' and select it as default", Toast.LENGTH_LONG).show();
            }
        });

        enableAccessibilityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Enable 'My Keyboard Accessibility Service'", Toast.LENGTH_LONG).show();
            }
        });
    }
}