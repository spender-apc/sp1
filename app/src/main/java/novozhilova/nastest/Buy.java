package novozhilova.nastest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Date;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by Sonya on 02.04.2016.
 */

public class Buy extends MainActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buy);//изначально экран активности пуст ,нужен для размещ польз интерфейса
        Intent intent = getIntent();
    }

    public void AddDataBase(View v) {
        DatabaseHandler db = new DatabaseHandler(this);

        SQLiteDatabase qq = db.getWritableDatabase();
//qq.
}
/*
    // список для хранения элементов истории трат
    public LinkedList<String> expensesHistory = new LinkedList();
    int sum=0;//хр суммы
    // объект для доступа к постоянному хранилищу. xml
    SharedPreferences sharedPref;
    ArrayAdapter<String> adapter;
//получаем доступ к постоянному хранилищу
        sharedPref = getSharedPreferences("date", MODE_PRIVATE);
        // вынимаем от туда сумму
        sum = sharedPref.getInt("MySum",1);

        final Button button = (Button) findViewById(R.id.button);

        final EditText editText = (EditText) findViewById(R.id.editText);
        final TextView textView  = (TextView) findViewById(R.id.textView);
        final ListView listView = (ListView)findViewById(R.id.listView);
        //чтение истории из постоянного хранилища и сохранение в списке
        Map<String, ?> allEntries = sharedPref.getAll();
        for (Map.Entry<String, ?> entry : allEntries.entrySet()) {
            expensesHistory.add(" " + entry.getKey() + " " + entry.getValue().toString());
            //Log.d("map values", entry.getKey() + ": " + entry.getValue().toString());




// задать соответствие между списком на экране и списке в памяти
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, expensesHistory);

        listView.setAdapter(adapter);

        // добавить текст на элементы интерфейса на экране
        textView.setText("The total sum is: " + sum);
        button.setText("Add expenses");

        editText.setText("");
//метод срабатывает при нажатии на экран




        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                //считать текущее значение из поля ввода и сохранить
                int current = Integer.parseInt((editText.getText()).toString());
                sum = sum + current;

                //сохранить сумму в постоянном хранилище
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("MySum", sum);

                // получить текущую дату
                Date d = new Date();
                d.getTime();
                //сохранить запись "дата траты" в постоянном хранилище
                editor.putInt(d.toString(), current);
                editor.commit();

                //добавить запсить в список
                expensesHistory.add(d.toString() + " " + current);
                adapter.notifyDataSetChanged();

                //отобразить сумму на экране
                textView.setText("The total sum is: " + sum);
            }


        });
    }

        */




}
