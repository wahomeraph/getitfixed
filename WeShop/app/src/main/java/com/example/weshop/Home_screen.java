package com.example.weshop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class Home_screen extends Activity {
    GridView widgets;

    Integer[] img={R.drawable.mpesa,R.drawable.ic_account_circle_red,R.drawable.ic_message_ble,R.drawable.ic_account_balance_darkblue};
    String[] name={"FINACIAL SUMMARISER","MY BUDGET","Contact us","Check Balance",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        widgets=(GridView)findViewById(R.id.gv_1);

        CustomAdapter some=new CustomAdapter();
        widgets.setAdapter(some);

        widgets.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent sawa=new Intent(getApplicationContext(),M_pesa.class);

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

            View lash=getLayoutInflater().inflate(R.layout.item_used,null);

            ImageView de_image=(ImageView)lash.findViewById(R.id.iv_1);
            TextView de_name=(TextView)lash.findViewById(R.id.tv_1);



            de_image.setImageResource(img[position]);
            de_name.setText(name[position]);
            return lash;
        }

    }
}
