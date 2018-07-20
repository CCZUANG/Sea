package enunion.helloandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by enuni on 2018/1/24.
 */


//this App is same as OnClick02Activity, but with advised  wording
public class OnClick02Activity extends AppCompatActivity {
    private Button button01,button02,button03,button04;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_onclick01);

        processViews();
        processControllers();
    }

    private void processViews(){
        button01 = (Button) findViewById(R.id.button01);
        button02 = (Button) findViewById(R.id.button02);
        button03 = (Button) findViewById(R.id.button03);
        button04 = (Button) findViewById(R.id.button04);
    }

    private void processControllers(){

        //method1
        button01.setOnClickListener(new MyListener01());

        //mthod2 - anonymous listener class (interface_name  replace listener_class _name)
        View.OnClickListener myListener0203 = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int id = v.getId();

                if(id == R.id.button02){
                    Toast.makeText(OnClick02Activity.this,"Button02, method2, wording2",Toast.LENGTH_SHORT).show();}
                else if (id == R.id.button03){Toast.makeText(OnClick02Activity.this,"Button03, method2, wording2",Toast.LENGTH_SHORT).show();}
            }
        };
        button02.setOnClickListener(myListener0203);
        button03.setOnClickListener(myListener0203);

        //method3 - anonymous listener object ( "new  interface_name" replace listener_object_name)
        button04.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(OnClick02Activity.this,"Button04, method3, wording2",Toast.LENGTH_SHORT).show();

            }
        });

    }
    private  class MyListener01 implements View.OnClickListener{
        @Override
        public void onClick(View v){
            Toast.makeText(OnClick02Activity.this,"Button01, method1, wording2",Toast.LENGTH_SHORT).show();
        }
    }
}

