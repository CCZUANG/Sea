package enunion.helloandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

/**
 * Created by enuni on 2017/9/12.
 */

public class Switch01Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_switch01);
    }

    public void isOpen(View view){
        CompoundButton open = (CompoundButton) view;
        String message = open.isChecked() ? "Open":"Close";
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
