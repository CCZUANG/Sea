package enunion.helloandroid;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button02);

//        TextView text_hello = (TextView) findViewById(R.id.text_hello);
//        Date now = new Date();
//        text_hello.setText(now.toString());

    }
    public void sayHello(View view){
        int id = view.getId();
        if (id == R.id.button01){
            Toast.makeText(this, "Button01!", Toast.LENGTH_SHORT).show();
        }else if (id == R.id.button02) {
            Toast.makeText(this, "Button02!", Toast.LENGTH_LONG).show();
        }
    }
}
