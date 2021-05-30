package sg.edu.rp.c346.id20007649.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AnimalDetailsActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnBackPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_details);

        tvDisplay = findViewById(R.id.tvDisplay);
        btnBackPage = findViewById(R.id.btnBackButton);


        Intent intentReceived = getIntent();

        String name = intentReceived.getStringExtra("name");
        String description = intentReceived.getStringExtra("description");
        String lifespan = intentReceived.getStringExtra("lifespan");
        String information = intentReceived.getStringExtra("information");
        String link = intentReceived.getStringExtra("link");




        String display ="";

        display += "Name : " + name;
        display += "\nDescription : " + description;
        display += "\nLifespan : " + lifespan;
        display += "\nInformation : " + information;
        display +="\nLinks : " + link;

        tvDisplay.setText(display);

        btnBackPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });










    }
}