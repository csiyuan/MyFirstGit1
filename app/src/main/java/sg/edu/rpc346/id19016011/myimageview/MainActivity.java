package sg.edu.rpc346.id19016011.myimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //Declare the ImageView object called ivDay2
    ImageView ivDay1;
    ImageView ivDay2;
    ImageView ivDay3;
    ImageView ivDay4;
    ImageView ivDay5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Get the ImageView obj and assign to ivDay2
        ivDay1 = (ImageView) findViewById(R.id.imageView1);

        //Set the Image
        ivDay1.setImageResource(R.drawable.day1);
        //Get the ImageView obj and assign to ivDay2
        ivDay2 = (ImageView) findViewById(R.id.imageView2);

        //Set the Image
        ivDay2.setImageResource(R.drawable.day2);
        //Get the ImageView obj and assign to ivDay2
        ivDay3 = (ImageView) findViewById(R.id.imageView3);

        //Set the Image
        ivDay3.setImageResource(R.drawable.day3);
        //Get the ImageView obj and assign to ivDay2
        ivDay4 = (ImageView) findViewById(R.id.imageView4);

        //Set the Image
        ivDay4.setImageResource(R.drawable.day4);
        //Get the ImageView obj and assign to ivDay2
        ivDay5 = (ImageView) findViewById(R.id.imageView5);

        //Set the Image
        ivDay5.setImageResource(R.drawable.day5);
    }
}