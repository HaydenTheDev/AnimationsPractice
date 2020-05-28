package hayden.project.animationspractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView txtHelloWorld;
    private TextView txtHiWorld;
    private ImageView lion;
    private ImageView tiger;
    private TextView txtAnimation;

    private boolean isHelloWorldShowing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize
        lion = findViewById(R.id.imageViewLion);
        tiger = findViewById(R.id.imageViewTiger);
        txtAnimation = findViewById(R.id.txtAnimation);
//        txtHelloWorld = findViewById(R.id.txtHelloWorld);
//        txtHiWorld = findViewById(R.id.txtHiWorld);

        //Create onClick for the text
//        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //Log for button
//                Log.i("MyTag", "This text was clicked.");
//                if(isHelloWorldShowing){
//                    animateHello();
//                    isHelloWorldShowing = false;
//                }else if(!isHelloWorldShowing) {
//                    animateHi();
//                    isHelloWorldShowing = true;
//                }
//
//            }
//        });
        tiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log for button
                Log.i("MyTag", "This text was clicked.");

                if(isHelloWorldShowing){
                    animateHello();
                    isHelloWorldShowing = false;
                }else if(!isHelloWorldShowing) {
                    animateHi();
                    isHelloWorldShowing = true;
                }

            }
        });

        txtAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtAnimation.animate().translationX(3000).setDuration(3000);
                txtAnimation.animate().translationY(3000).setDuration(3000);
            }
        });






    }

    public void animateHello(){
        tiger.animate().alpha(0f).setDuration(3000);
        lion.animate().alpha(1).setDuration(4000);
    }

    public void animateHi(){
        lion.animate().alpha(0f).setDuration(3000);
        tiger.animate().alpha(1).setDuration(4000);

    }

}
