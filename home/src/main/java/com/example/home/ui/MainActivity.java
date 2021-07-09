package com.example.home.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.home.R;

@Route(path = "/home/MainActivity")
public class MainActivity extends AppCompatActivity {

    // 两种方式都能获取到值

    @Autowired
    long key1;

    @Autowired(name = "key2")
    String str;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity_main);
        ARouter.getInstance().inject(this);
        Toast.makeText(this,"key1-----"+key1+",     key2"+str+"    ",Toast.LENGTH_LONG).show();
    }
}
