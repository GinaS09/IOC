package com.example.cbir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.cbir.adapters.HomeAdapter;

public class HomeActivity extends AppCompatActivity {
    ListView list;
    ListView list2;
    ListView list3;

    String[] maintitle ={
            "Title 1","Title 2",
            "Title 3","Title 4",
            "Title 5",
    };

    String[] descriere ={
            "Sub Title 1","Sub Title 2",
            "Sub Title 3","Sub Title 4",
            "Sub Title 5",
    };

    Integer[] imgid={
            R.drawable.ro,R.drawable.ro,
            R.drawable.ro,R.drawable.ro,
            R.drawable.ro,
    };

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

//        List<String> elemente=new ArrayList<>();
//        elemente.add("Elementul 1");
//        elemente.add("Elementul 2");
//        elemente.add("Elementul 3");
//        elemente.add("Elementul 4");
//
//        ArrayAdapter<String> adapter=new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_list_item_1,
//                elemente);
//        ListView lv=findViewById(R.id.listView);
//        lv.setAdapter(adapter);

        HomeAdapter adapter=new HomeAdapter(this, maintitle,descriere,imgid);
        adapter.notifyDataSetChanged();
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list2=(ListView) findViewById(R.id.list2);
        list2.setAdapter(adapter);

        btn = (Button) findViewById(R.id.button111);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlaceActivity();
            }
        });

    }

    private void openPlaceActivity(){
        Intent intent = new Intent(this, PlaceDescriptionActivity.class);
        intent.putExtra("path","Cantacuzino");
        startActivity(intent);
    }
}