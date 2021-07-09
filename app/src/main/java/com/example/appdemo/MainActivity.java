package com.example.appdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.tv);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //不带参数的传递
//                ARouter.getInstance().build("/home/MainActivity").navigation();

                //携带参数的传递
                ARouter.getInstance().build("/home/MainActivity")
                        .withLong("key1", 666L)
                        .withString("key2", "888")
//                        .withObject("key4", new Test("Jack", "Rose"))
                        .navigation();
            }
        });

    }


}
