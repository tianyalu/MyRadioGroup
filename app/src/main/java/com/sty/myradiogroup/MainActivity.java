package com.sty.myradiogroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.sty.myradiogroup.view.MyRadioGroup;

public class MainActivity extends AppCompatActivity {
    private MyRadioGroup radioGroup;
    protected int payTypeIndex = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (MyRadioGroup) findViewById(R.id.rg_pay_type);
        radioGroup.setChildMargin(0,0,6,5);
        payTypeIndex = 0;

        setListeners();
    }

    protected void setListeners(){
        radioGroup.setOnCheckedChangeListener(new MyRadioGroup.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(MyRadioGroup group, int checkedId) {
                if(group.getCheckedRadioButtonId() == R.id.rbtn_alipay){
                    payTypeIndex = 0;
                    Toast.makeText(MainActivity.this, "Alipay is checked", Toast.LENGTH_SHORT).show();
                }else if(group.getCheckedRadioButtonId() == R.id.rbtn_wcat){
                    payTypeIndex = 1;
                    Toast.makeText(MainActivity.this, "Wechat pay is checked", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
