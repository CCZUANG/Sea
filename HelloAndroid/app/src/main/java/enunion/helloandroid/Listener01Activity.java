package enunion.helloandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View.OnFocusChangeListener;
import android.view.View;
import android.widget.EditText;

/**
 * Created by enuni on 2018/2/5.
 */

public class Listener01Activity extends AppCompatActivity{
    private EditText edit;
    @Override
    protected  void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_listener01);

        processViews ();
        processControllers();

    }

    private void processViews(){

        edit = (EditText) findViewById(R.id.edit)
    }

    private void processControllers(){

        edit.setOnFocusChangeListener(new MyFocus());
    }

    private class MyFocus implements View.OnFocusChangeListener {

        @Override

        public void onFocusChamnge(View v, boolean hasFocus){
            info.setText(hasFocus ? "EditText Focused" : "INFO");
        }

    }

}
