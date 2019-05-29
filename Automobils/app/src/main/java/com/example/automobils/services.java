package com.example.automobils;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class services extends AppCompatActivity {
GridView widgets;

    Integer[] img={R.drawable.toyota,R.drawable.honda,R.drawable.nissan,R.drawable.subaru};
    String[] name={"toyota kenya","Honda","Nissan","Subaru"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        widgets=(GridView)findViewById(R.id.gv_1);




        widgets=(GridView)findViewById(R.id.gv_1);

        CustomAdapter some=new CustomAdapter();
        widgets.setAdapter(some);

        widgets.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent sawa=new Intent(getApplicationContext(),fullsevice.class);

                sawa.putExtra("img",img[position]);
                sawa.putExtra("name",name[position]);



                startActivity(sawa);
            }
        });

    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return img.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View lash=getLayoutInflater().inflate(R.layout.items_used,null);

            ImageView de_image=(ImageView)lash.findViewById(R.id.iv_1);
            TextView de_name=(TextView)lash.findViewById(R.id.tv_1);



            de_image.setImageResource(img[position]);
            de_name.setText(name[position]);
            return lash;





    }



    }}

