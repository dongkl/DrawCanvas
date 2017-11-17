package com.example.engg6600.drawcanvas;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class DrawCanvasActivity extends AppCompatActivity {

    ImageView imageView;
    Button drawButton;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_draw_canvas);
         imageView = (ImageView) findViewById(R.id.imageView);
         drawButton = (Button)findViewById(R.id.button);


         drawButton.setOnClickListener(new View.OnClickListener() {



             @Override
             public void onClick(View v) {


                 Bitmap imageBitmap = Bitmap.createBitmap(imageView.getWidth(),
                         imageView.getHeight(), Bitmap.Config.ARGB_8888);
                 Canvas canvas = new Canvas(imageBitmap);
                 float scale = getResources().getDisplayMetrics().density;
                 Paint p = new Paint();
                 p.setColor(Color.BLUE);
                 p.setTextSize(16*scale);
                 canvas.drawText("Hello ENGG6600", imageView.getWidth()/2,
                         imageView.getHeight()/4, p);
                 imageView.setImageBitmap(imageBitmap);
             }
         });
     }

}
