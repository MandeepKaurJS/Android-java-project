package com.example.vrinmandulay.tipcal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTextChanged;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.entrno)
    EditText entrno;
    @BindView(R.id.tipr)
    TextView tipr;
   // @BindView(R.id.tiptl)
    //TextView tiptl;
    @BindView(R.id.finlamnt)
    TextView finlamnt;
    @BindView(R.id.tiptl)
    TextView tiptl2;
    @BindView(R.id.totlamnt)
    TextView totlamnt1;
    float percentage = 0;
    float finlaamnt=0;
    float tiptl=0;
    float totlamnt=0;
    float DEFAULT_TIP_PERCENTAGE=15;
    float REGULAR_TIP_PERCENTAGE=10;
    float EXCELLENT_TIP_PERCENTAGE=20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setTipValues();
    }

    private void setTipValues() {
       tipr.setText(getString(R.string.main_msg_tippercent,percentage));
        tiptl2.setText(getString(R.string.main_msg_tiptotal,tiptl));
        finlamnt.setText(getString(R.string.main_msg_Totalbillresults,finlaamnt));
    }

    @OnClick({R.id.img1, R.id.img2, R.id.img3})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img1:
                    percentage=DEFAULT_TIP_PERCENTAGE;
                break;
            case R.id.img2:
                percentage=REGULAR_TIP_PERCENTAGE;
                break;
            case R.id.img3:
                percentage=EXCELLENT_TIP_PERCENTAGE;
                break;
        }
        CalcutefinalBill();
        setTipValues();
    }

    @OnTextChanged(R.id.entrno)
        public void OnTextChanged(){
            CalcutefinalBill();
            setTipValues();
    }

    private void CalcutefinalBill() {
            if(percentage==0)
                percentage=DEFAULT_TIP_PERCENTAGE;

            if(!entrno.getText().toString().equals("") && !entrno.getText().toString().equals("."))
                totlamnt= Float.valueOf(entrno.getText().toString());
            else
                totlamnt=0;
            tiptl=(totlamnt*percentage)/100;
            finlaamnt=totlamnt+tiptl;
    }



}
