package com.androidwind.image.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.androidwind.image.glide.GlideOptions;
import com.androidwind.image.glide.GlideManager;
import com.androidwind.image.glide.GlideStrategy;
import com.androidwind.image.ImageLoader;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView iv;
    String url = "https://hbimg.huabanimg.com/5cdceea9b410bc159f06d6593eaceed3c82d0f4c302dc-qqGjbf_fw658";
    String gif = "https://hbimg.huabanimg.com/d015f868a3a2fc5b8417a4ede1ccd26d5833022e2723e-WaJhH4_fw658";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = findViewById(R.id.imageView);
        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button1) {
            GlideOptions options = GlideOptions.builder().url(url).imageView(iv).build();
            GlideManager.getInstance().display(this, options);
        } else if (v.getId() == R.id.button2) {
            GlideOptions options = GlideOptions.builder().url(gif).imageView(iv).gif(true).build();
            GlideManager.getInstance().display(this, options);
        } else if (v.getId() == R.id.button3) {
            ImageLoader.getInstance().setStrategy(new GlideStrategy());
            GlideOptions options = GlideOptions.builder().url(url).imageView(iv).build();
            ImageLoader.getInstance().loadImage(MainActivity.this, options);
        }
    }
}
