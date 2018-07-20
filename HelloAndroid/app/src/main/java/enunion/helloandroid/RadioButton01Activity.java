package enunion.helloandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by enuni on 2017/9/12.
 */

public class RadioButton01Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_radiobuton01);
    }

    public void selectMovie (View view){
        RadioButton checkedRadio = (RadioButton) view;
        Toast.makeText(this,checkedRadio.getText(),Toast.LENGTH_SHORT).show();
    }
}
