package com.abhilash.popularcocktails.detail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.abhilash.popularcocktails.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocktail_detail);

        Intent intent = getIntent();
        String id = intent.getStringExtra("cocktail_id");

        Bundle bundle = new Bundle();
        bundle.putString("cocktail_id", id);

        DetailFragment selectSongFragment = new DetailFragment();
        selectSongFragment.setArguments(bundle);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.detail_container, selectSongFragment)
                    .commit();
        }
    }

}
