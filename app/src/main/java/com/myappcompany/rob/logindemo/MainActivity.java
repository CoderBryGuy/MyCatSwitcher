package com.myappcompany.rob.logindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean toggleCatPic = true;

    public void changeCatAction(View view) {

        ImageView catImageView = (ImageView) findViewById(R.id.catImage);
        if (toggleCatPic) {
            toggleCatPic = false;
            catImageView.setImageResource(R.drawable.cat1);

        } else {
            toggleCatPic = true;
            catImageView.setImageResource(R.drawable.cat2);
        }

        Log.i("Info", "Button pressed");

//        toastCat(catImageView);
    }

    private void toastCat(ImageView imageView) {
        Toast.makeText(this, "changing pic to " + imageView, Toast.LENGTH_SHORT ).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}