package com.yirmak.mycitybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.yirmak.mycitybook.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    TextView nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        Cityy selectedCityy = (Cityy) intent.getSerializableExtra("city");

        binding.nameText.setText(selectedCityy.name);
        binding.nameText2.setText(selectedCityy.city);
        binding.imageView2.setImageResource(selectedCityy.image);


    }
}