package com.yirmak.mycitybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

import com.yirmak.mycitybook.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    ArrayList<Cityy> cityyArrayList;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        cityyArrayList = new ArrayList<>();

        Cityy anitkabir = new Cityy("Anıtkabir", "Anıtkabir is the mausoleum of Mustafa Kemal Atatürk founder and first president of the Turkish Republic.", R.drawable.anitkabir);
        Cityy altinkoy = new Cityy("Altınköy", "Altınköy, with its village coffee house, stables, gardens and traditional Turkish village houses, was established to reflect a village life.", R.drawable.altinkoy);
        Cityy castle = new Cityy("Ankara Castle", "The Ankara Castle is one of the Turkish capital’s oldest sights, dating back to the Roman, Seljuk, and Ottoman Empires.", R.drawable.castle);
        Cityy lake = new Cityy("Eymir Lake", "Eymir Lake is sheltered inside a park, which is visited by people for a number of exciting activities such as jogging, cycling, and walking.", R.drawable.eymirlake);
        Cityy hamamonu = new Cityy("Hamamönü","Hamamönü is a friendly area where you can simply enjoy the atmosphere and scenery.", R.drawable.hamamonu);
        Cityy museum = new Cityy("Museum of Anatolian Civilizations", "Which has been home to the original works of Anatolian lands since the Paleolithic Age, consists of two historical buildings.", R.drawable.museum);
        Cityy atakule = new Cityy("Atakule", "Atakule is a 1989-built communications and observation tower in central Ankara.", R.drawable.atakule);
        Cityy beypazari = new Cityy("Beypazarı", "Beypazarı today is a small town in a rural district famous for its carrots, silverwork (Telkari), and a high quality natural mineral water.", R.drawable.beypazari);
        Cityy estergon = new Cityy("Estergon Castle", "It was opened on May 29, 2005 and is a cultural center built as a replica of the Estergon Castle in Hungary.", R.drawable.estergon);
        Cityy karagol = new Cityy("Karagöl", "Picnic, sightseeing, fishing activities are among the activities that can be carried out in a controlled manner within the Nature Park.", R.drawable.karagol);
        Cityy kizilay = new Cityy("Kızılay Square", "Which carries the traces of the Republic, offers modern life experiences to new Ankara residents with Ataturk Boulevard and Guvenpark.", R.drawable.kizilay);
        Cityy kugulupark = new Cityy("Kuğulu Park", "In addition to the pool in the park, there is a cafeteria on the children's playgrounds and the part facing Atatürk Boulevard.", R.drawable.kugulupark);
        Cityy library = new Cityy("T.C. National Library", "A large up-to-date facility, situated in the very heart of Ankara, in one of the most modern and fashionable quarters of the city. ", R.drawable.library);
        Cityy mavigol = new Cityy("Mavi Göl", "The Blue Lake, which has the most natural lake structure of Ankara, is a peaceful corner of the Capital with its peaceful environment, green and blue.", R.drawable.mavi);
        Cityy moganlake = new Cityy("Mogan Lake", "Mogan Lake has always been one of the picnic and fishing areas of Ankara.", R.drawable.moganlake);
        Cityy segmenler = new Cityy("Seğmenler Park", "There are also pools, a children's playground and an amphitheater where concerts are held from time to time in the park.", R.drawable.segmenler);

        cityyArrayList.add(anitkabir);
        cityyArrayList.add(altinkoy);
        cityyArrayList.add(castle);
        cityyArrayList.add(lake);
        cityyArrayList.add(hamamonu);
        cityyArrayList.add(museum);
        cityyArrayList.add(atakule);
        cityyArrayList.add(beypazari);
        cityyArrayList.add(estergon);
        cityyArrayList.add(karagol);
        cityyArrayList.add(kizilay);
        cityyArrayList.add(kugulupark);
        cityyArrayList.add(library);
        cityyArrayList.add(mavigol);
        cityyArrayList.add(moganlake);
        cityyArrayList.add(segmenler);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,cityyArrayList.stream().map(cityy -> cityy.name).collect(Collectors.toList()));
        binding.listView.setAdapter(arrayAdapter);

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(MainActivity.this,cityyArrayList.get(i).name,Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("city",cityyArrayList.get(i));
                startActivity(intent);

            }
        });


    }


}