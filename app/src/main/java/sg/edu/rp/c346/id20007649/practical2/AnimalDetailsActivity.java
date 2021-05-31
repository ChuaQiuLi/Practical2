package sg.edu.rp.c346.id20007649.practical2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class AnimalDetailsActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnHomePage;
    Button btnLinkPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_details);

        tvDisplay = findViewById(R.id.tvDisplay);
        btnHomePage = findViewById(R.id.btnHomeButton);
        btnLinkPage = findViewById(R.id.btnLinkPage);

        registerForContextMenu(tvDisplay);



        Intent intentReceived = getIntent();

        String name = intentReceived.getStringExtra("name");
        String description = intentReceived.getStringExtra("description");
        String lifespan = intentReceived.getStringExtra("lifespan");
        String information = intentReceived.getStringExtra("information");
        String link = intentReceived.getStringExtra("link");
        String url = intentReceived.getStringExtra("url");



        String display ="";

        display += "Name : " + name;
        display += "\nDescription : " + description;
        display += "\nLifespan : " + lifespan;
        display += "\nInformation : " + information;
        display += "\nFor more information : " + link;


        tvDisplay.setText(display);



        btnHomePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onBackPressed();


            }
        });

        btnLinkPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                startActivity(intents);

                Toast.makeText(AnimalDetailsActivity.this, "Going to the webpage...", Toast.LENGTH_LONG).show();


            }
        });


    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);


        menu.add(0, 0, 0, "Increase font size");
        menu.add(0,1,1,"Decrease font size");


    }


    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == 0) {

            tvDisplay.setTextSize(0, tvDisplay.getTextSize() + 2.0f);

        }

        else{

            tvDisplay.setTextSize(0, tvDisplay.getTextSize() - 2.0f);


        }

        return super.onContextItemSelected(item);
    }
}