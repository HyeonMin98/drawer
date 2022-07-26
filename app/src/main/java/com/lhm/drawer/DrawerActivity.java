package com.lhm.drawer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class DrawerActivity extends AppCompatActivity {

    DrawerLayout drawer_layout;
    Button btn_open, btn_close,btn_close2;
    LinearLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);

        drawer_layout = findViewById(R.id.drawer_layout);
        btn_open = findViewById(R.id.btn_open);
        btn_close = findViewById(R.id.btn_close);
        btn_close2 = findViewById(R.id.btn_close2);
        drawer = findViewById(R.id.drawer);

        btn_open.setOnClickListener(click);
        btn_close.setOnClickListener(click);
        btn_close2.setOnClickListener(click);
    } //onCreate();

    View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            switch (view.getId()){
                case R.id.btn_open:
                    drawer_layout.openDrawer(drawer);
                    break;

                case R.id.btn_close:
                    drawer_layout.closeDrawers();
                    break;

                case R.id.btn_close2:
                    drawer_layout.closeDrawers();
                    break;

            }
        }
    };


}