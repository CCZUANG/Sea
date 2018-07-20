package enunion.helloandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by enuni on 2018/1/24.
 */

public class OnClick01Activity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_onclick01);

        //method1
        Button button01 = (Button) findViewById(R.id.button01);
        MyListener01 myListener01 = new MyListener01();
        button01.setOnClickListener(myListener01);

       //mthod2 - anonymous listener class (interface_name  replace listener_class _name)
        Button button02 = (Button) findViewById(R.id.button02);
        Button button03 = (Button) findViewById(R.id.button03);
       View.OnClickListener myListener0203 = new View.OnClickListener(){
           @Override
           public void onClick(View v){
               int id = v.getId();

               if(id == R.id.button02){Toast.makeText(OnClick01Activity.this,"Button02, method2",Toast.LENGTH_SHORT).show();}
               else if (id == R.id.button03){Toast.makeText(OnClick01Activity.this,"Button03, method2",Toast.LENGTH_SHORT).show();}
           }
       };
       button02.setOnClickListener(myListener0203);
        button03.setOnClickListener(myListener0203);


        //method3 - anonymous listener object ( "new  interface_name" replace listener_object_name)
        Button button04 = (Button) findViewById(R.id.button04);
        button04.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(OnClick01Activity.this,"Button04, method3",Toast.LENGTH_SHORT).show();

            }
        });



    }

    private class MyListener01 implements View.OnClickListener {
        @Override
        public void onClick(View v){
            Toast.makeText(OnClick01Activity.this,"Button01, method1",Toast.LENGTH_SHORT).show();
        }
    }
}
