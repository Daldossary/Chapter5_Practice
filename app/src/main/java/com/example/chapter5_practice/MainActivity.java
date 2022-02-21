package com.example.chapter5_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    String[] attractions = {"Willis Tower", "Navy Pier", "Art Institute of Chicago",
            "Water Tower", "Magnificent Mile"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main,
                R.id.listView, attractions));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch(position) {
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.willistower.com")));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://navypier.org")));
                break;
            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.artic.edu")));
                break;
            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Water_tower")));
                break;
            case 4:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.themagnificentmile.com")));
                break;
        }
    }
}