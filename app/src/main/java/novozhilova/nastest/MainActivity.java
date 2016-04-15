package novozhilova.nastest;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import java.util.LinkedList;
import android.widget.ListView;
import java.util.Map;
import android.view.View;
import java.util.Date;



public class MainActivity extends AppCompatActivity {
    /*
    int sum=0;//хр суммы
    // объект для доступа к постоянному хранилищу. xml
    SharedPreferences sharedPref;

    // список для хранения элементов истории трат
    public LinkedList<String> expensesHistory = new LinkedList();
    ArrayAdapter<String> adapter;

*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);//изначально экран активности пуст ,нужен для размещ польз интерфейса

        final Button button = (Button) findViewById(R.id.button);
        final Button button2= (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final Button button4= (Button) findViewById(R.id.button4);
        final Button button5 = (Button) findViewById(R.id.button5);
        final Button button6= (Button) findViewById(R.id.button6);

        button.setOnClickListener(new View.OnClickListener()

        {
        /*
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, Buy.class);

                startActivity(intent);


            }
  */
            public void onClick(View v){
                switch (v.getId()) {
                    case R.id.button:
                        Intent intent = new Intent(MainActivity. this, Buy.class);
                        startActivity(intent);
                        break;
                    default:
                        break;
                }
            }




        });


        button2.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, Attraction.class);
                startActivity(intent);
            }
        });


        button3.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, Transport.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, Pay.class);
                startActivity(intent);
            }
        });


        button5.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, Statistic.class);
                startActivity(intent);
            }
        });


        button6.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, Mail.class);
                startActivity(intent);
            }
        });

    }



}



