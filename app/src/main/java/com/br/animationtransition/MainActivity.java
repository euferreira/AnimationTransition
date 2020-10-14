package com.br.animationtransition;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewGroup root = findViewById(R.id.root);

        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(root, new Fade());
                //TransitionManager.beginDelayedTransition(root, new Explode());
                //TransitionManager.beginDelayedTransition(root, new Slide());
                imageView.setVisibility(imageView.getVisibility() == View.INVISIBLE ? View.VISIBLE : View.INVISIBLE);
            }
        });
    }
}