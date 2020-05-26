package hayden.project.animationspractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView txtHelloWorld;
    private TextView txtHiWorld;

    private boolean isHelloWorldShowing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize
        txtHelloWorld = findViewById(R.id.txtHelloWorld);
        txtHiWorld = findViewById(R.id.txtHiWorld);

        //Create onClick for the text
        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
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





    }

    public void animateHello(){
        txtHelloWorld.animate().alpha(0f).setDuration(3000);
        txtHiWorld.animate().alpha(1).setDuration(4000);
    }

    public void animateHi(){
        txtHiWorld.animate().alpha(0f).setDuration(3000);
        txtHelloWorld.animate().alpha(1).setDuration(4000);

    }

}
