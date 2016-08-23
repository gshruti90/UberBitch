package com.gargdaughters.uberbitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PackageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.package_add);
        ImageButton button = (ImageButton) findViewById(R.id.imageButton1);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //shikha to share code
            }
        });
    }
}
