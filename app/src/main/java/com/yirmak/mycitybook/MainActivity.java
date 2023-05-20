package com.yirmak.mycitybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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

        Cityy anitkabir = new Cityy("Anıtkabir", "Ankara", R.drawable.anitkabir);
        Cityy altinkoy = new Cityy("Altınköy", "Ankara", R.drawable.altinkoy);
        Cityy castle = new Cityy("Ankara Castle", "Ankara", R.drawable.castle);
        Cityy lake = new Cityy("Eymir Lake", "Ankara", R.drawable.eymirlake);
        Cityy hamamonu = new Cityy("Hamamönü","Ankara", R.drawable.hamamonu);
        Cityy museum = new Cityy("Museum of Anatolian Civilizations", "Ankara", R.drawable.museum);

        cityyArrayList.add(anitkabir);
        cityyArrayList.add(altinkoy);
        cityyArrayList.add(castle);
        cityyArrayList.add(lake);
        cityyArrayList.add(hamamonu);
        cityyArrayList.add(museum);

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