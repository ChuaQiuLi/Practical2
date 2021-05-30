package sg.edu.rp.c346.id20007649.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvFirst;
    TextView tvSecond;
    TextView tvThird;
    TextView tvFourth;
    TextView tvFifth;
    TextView tvSixth;
    TextView tvSeventh;
    TextView tvEighth;
    TextView tvNinth;
    TextView tvTenth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvFirst = findViewById(R.id.tvGermanShepherd);
        tvSecond = findViewById(R.id.tvGermanSheppit);
        tvThird = findViewById(R.id.tvGoldendoodle);
        tvFourth = findViewById(R.id.tvGoldenRetriever);
        tvFifth = findViewById(R.id.tvGreaterSwissMountain);
        tvSixth = findViewById(R.id.tvHavanese);
        tvSeventh = findViewById(R.id.tvHuskyJack);
        tvEighth = findViewById(R.id.tvHavashire);
        tvNinth = findViewById(R.id.tvHarrier);
        tvTenth = findViewById(R.id.tvHuskador);




        tvFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent (MainActivity.this,AnimalDetailsActivity.class);

                Intent intents = new Intent(Intent. ACTION_VIEW, Uri.parse("https://a-z-animals.com/animals/german-shepherd/"));

                intent.putExtra("name", "German Shepherd Guide ");
                intent.putExtra("description","They are from a luxurious double coat that can be anywhere from medium to long and comes in a variety of colors such as the traditional black and tan, solid white or solid black.");
                intent.putExtra("lifespan", "They have an average lifespan of 12 years. ");
                intent.putExtra("information","They are highly active and fearless dogs. Their exceptional intelligence and adaptability make them well-suited for a wide array of jobs, including police work, service training and, of course, loving companion.");
                intent.putExtra("link","For my information you can visit " +  intents);


                startActivity(intents);

                startActivity(intent);



            }
        });

        tvSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent (MainActivity.this,AnimalDetailsActivity.class);

                Intent intents = new Intent(Intent. ACTION_VIEW, Uri.parse("https://a-z-animals.com/animals/german-sheppit/"));

                intent.putExtra("name", "German Sheppit");
                intent.putExtra("description","The German Sheppit is a first-generation hybrid between two different breeds of dogs : a German Shepherd and a Pit Bull. ");
                intent.putExtra("lifespan","They have an average lifespan of 10 - 12 years. ");
                intent.putExtra("information", "The German Shepherd is a big herding dog that excels at many different tasks, including police work, search and rescue, and home protection. The Pit Bull, by contrast, is a group of several different breeds, like the Bull Terrier and many more. All these will be united to create a muscular, short hair appearance of the German Sheppit ");
                intent.putExtra("link","For my information you can visit " +  intents);


                startActivity(intents);
                startActivity(intent);


            }
        });


        tvThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent (MainActivity.this,AnimalDetailsActivity.class);

                Intent intents = new Intent(Intent. ACTION_VIEW, Uri.parse("https://a-z-animals.com/animals/goldendoodle/"));


                intent.putExtra("name", "Goldendoodle");
                intent.putExtra("description", "They are medium-sized and often have a shaggy, low-shedding coat. ");
                intent.putExtra("lifespan","They have an average lifespan of 12 - 15 years. ");
                intent.putExtra("information"," They are a mix of two dogs, they have the sweet and pleasing nature of the golden retriever and the intelligence level of a poodle.");
                intent.putExtra("link","For my information you can visit " +  intents);


                startActivity(intents);
                startActivity(intent);

            }
        });

        tvFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent (MainActivity.this,AnimalDetailsActivity.class);
                Intent intents = new Intent(Intent. ACTION_VIEW, Uri.parse("https://a-z-animals.com/animals/golden-retriever/"));

                intent.putExtra("name","Golden Retriever");
                intent.putExtra("description", " Its distinguishing quality is the impeccable and lustrous double coat of orange, golden, or light-colored fur.");
                intent.putExtra("lifespan","They have an average lifespan of 12 years ");
                intent.putExtra("information"," It is crossing a yellow retriever with the now-extinct tweed water spaniel, plus a mix of the bloodhound and Irish Setter. He intended for the breed to be a superior hunting dog which could retrieve dead game from all kinds of rugged terrain on land or water.");
                intent.putExtra("link","For my information you can visit " +  intents);


                startActivity(intents);
                startActivity(intent);


            }
        });

        tvFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent (MainActivity.this,AnimalDetailsActivity.class);

                Intent intents = new Intent(Intent. ACTION_VIEW, Uri.parse("https://a-z-animals.com/animals/greater-swiss-mountain-dog/"));

                intent.putExtra("name","Greater Swiss Mountain Dog");
                intent.putExtra("description","These dogs are covered in double coats, featuring an undercoat that is thick and an outer coat that is dense. The coat is about 1-1.5 inches long. ");
                intent.putExtra("lifespan","They have an average lifespan of 12 years. ");
                intent.putExtra("information","The Greater Swiss Mountain Dog is incredibly animated, showing exactly how they feel in their facial expression and smile.");
                intent.putExtra("link","For my information you can visit " +  intents);


                startActivity(intents);
                startActivity(intent);


            }
        });

        tvSixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent (MainActivity.this,AnimalDetailsActivity.class);
                Intent intents = new Intent(Intent. ACTION_VIEW, Uri.parse("https://a-z-animals.com/animals/havanese/"));

                intent.putExtra("name","Havanese");
                intent.putExtra("description","They are often welcomed into families for their soft fur, intelligence, and desire to please their loving owners.");
                intent.putExtra("lifespan","They have an average lifespan of 15 years.");
                intent.putExtra("information","The lack of shedding and clever mind of the Havanese dog has earned it a place as a common therapy dog in hospitals, bringing joy to patients that need their spirits lifted.");
                intent.putExtra("link","For my information you can visit " +  intents);


                startActivity(intents);
                startActivity(intent);


            }
        });

        tvSeventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,AnimalDetailsActivity.class);
                Intent intents = new Intent(Intent. ACTION_VIEW, Uri.parse("https://a-z-animals.com/animals/havanese/"));

                intent.putExtra("name","Husky Jack");
                intent.putExtra("description","Husky Jacks are a mixed breed with one Siberian Husky parent and one Jack Russell Terrier parent.");
                intent.putExtra("lifespan","They have an average lifespan of 11 - 16 years. ");
                intent.putExtra("information","Their personality can also vary quite a bit, but overall, they are very friendly and high-energy dogs. Since they have a tendency to be more stubborn, they are often a better choice for experienced owners or families with older children. ");

                startActivity(intent);


            }
        });

        tvEighth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,AnimalDetailsActivity.class);

                intent.putExtra("name","Havashire");
                intent.putExtra("description","The Havashire is a small and cuddly lapdog that was bred from a cross between a Yorkshire Terrier and a Havanese.");
                intent.putExtra("lifespan","They have an average lifespan of 13 - 15 years. ");
                intent.putExtra("information"," The Yorkie is a graceful and elegant long-haired toy dog with a working-class origin from northern England. This dog was originally supposed to be a vermin hunter in mills and factories, but it later became a favorite of the British nobility.");

                startActivity(intent);


            }
        });

        tvNinth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,AnimalDetailsActivity.class);

                intent.putExtra("name","Harrier");
                intent.putExtra("description",". Their coats are strikingly similar as the Beagle or the English Foxhound., even though the breeds are incredibly different.");
                intent.putExtra("lifespan","They have an average lifespan of 10 - 12 years. ");
                intent.putExtra("information","Harriers are affectionate and sweet, which is part of the reason that people love them as much as the Beagle or the English Foxhound.");

                startActivity(intent);



            }
        });

        tvTenth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,AnimalDetailsActivity.class);

                intent.putExtra("name","Huskador");
                intent.putExtra("description","The result of Huskador is that it is a breed of a Siberian husky with a Labrador retriever.");
                intent.putExtra("lifespan","They have an average lifespan of 10 - 15 years.");
                intent.putExtra("information","This dog is known for its intelligence and curious nature. Huskadors have an affectionate temperament that makes them a great pet for a family with kids.");

                startActivity(intent);


            }
        });



    }
}