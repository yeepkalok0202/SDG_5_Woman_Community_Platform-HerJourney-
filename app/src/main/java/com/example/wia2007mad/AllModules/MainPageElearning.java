package com.example.wia2007mad.AllModules;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.ui.AppBarConfiguration;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.wia2007mad.R;
import com.example.wia2007mad.databinding.MainpageELearningBinding;

public class MainPageElearning extends AppCompatActivity {

    private MainpageELearningBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= MainpageELearningBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        String  article1=getString(R.string.virtualthumbnaillink1),
                article2=getString(R.string.virtualthumbnaillink2),
                article3=getString(R.string.virtualthumbnaillink3);
        Glide.with(this)
                .load(article1)
                .into(binding.workshopimage1);
        Glide.with(this)
                .load(article2)
                .into(binding.workshopimage2);
        Glide.with(this)
                .load(article3)
                .into(binding.workshopimage3);

        binding.virtualbuttongogogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Workshop.class);
                startActivity(intent);
            }
        });

        binding.scholarshipbuttongogogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), ScholarshipGrant.class);
                startActivity(intent);
            }
        });

        binding.resourcesharinghubsection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), ResourceSharingHub.class);
                startActivity(intent);
            }
        });

        binding.workshopcardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainPageElearning.this, Workshop.class);
                intent.putExtra("searchQuery","Java");
                startActivity(intent);

            }
        });
        binding.workshopcardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainPageElearning.this, Workshop.class);
                intent.putExtra("searchQuery","Tey");
                startActivity(intent);

            }
        });
        binding.workshopcardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainPageElearning.this, Workshop.class);
                intent.putExtra("searchQuery","BlackPenRedPen");
                startActivity(intent);

            }
        });
        binding.scholarshipcardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainPageElearning.this, ScholarshipGrant.class);
                intent.putExtra("searchQuery","Daikin");
                startActivity(intent);

            }
        });
        binding.scholarshipcardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainPageElearning.this, ScholarshipGrant.class);
                intent.putExtra("searchQuery","Sunway");
                startActivity(intent);

            }
        });
        binding.scholarshipcardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainPageElearning.this, ScholarshipGrant.class);
                intent.putExtra("searchQuery","British");
                startActivity(intent);

            }
        });
    }

}