package com.myfstrong.mylistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView mTxt_1st;
    TextView mTxt_2nd;
    TextView mTxt_3rd;

    Button mBtn_1st;
    Button mBtn_2nd;
    Button mBtn_3rd;

    private MyOnClickListener l = new MyOnClickListener();

    private class MyOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            mTxt_1st.setText("第一种实现方式");
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTxt_1st = (TextView)findViewById(R.id.txt_1st);
        mTxt_2nd = (TextView)findViewById(R.id.txt_2nd);
        mTxt_3rd = (TextView)findViewById(R.id.txt_3rd);

        mBtn_1st = (Button)findViewById(R.id.btn_1st);
        mBtn_2nd = (Button)findViewById(R.id.btn_2nd);
        mBtn_3rd = (Button)findViewById(R.id.btn_3rd);

        mBtn_1st.setOnClickListener(l);

        mBtn_2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTxt_2nd.setText("第二种实现方式");
            }
        });

        mBtn_3rd.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        mTxt_3rd.setText("第三种实现方式");
    }
}
