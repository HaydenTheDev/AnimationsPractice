package hayden.project.animationspractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView txtHelloWorld;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize
        txtHelloWorld = findViewById(R.id.txtHelloWorld);

        //Create onClick for the text
        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        //Log for button
                Log.i("MyTag", "This text was clicked.");
                txtHelloWorld.animate().rotation(10f).setDuration(1000);
            }
        });
    }
}
