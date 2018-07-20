package enunion.helloandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

/**
 * Created by enuni on 2017/9/12.
 */

public class Checkbox01Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox01);
    }
    public void isReady(View view){
        CheckBox ready = (CheckBox) view;
        String message = ready.isChecked() ? "Yes":"No";
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();

    }
}
