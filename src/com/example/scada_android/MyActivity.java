package com.example.scada_android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MyActivity extends Activity {
    private EditText height_EditText;
    private EditText weight_EditText;
    private Button computeBtn;
    private TextView computeResult;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        height_EditText = (EditText)findViewById(R.id.editText_height);
        weight_EditText = (EditText)findViewById(R.id.editText_weight);
        computeBtn = (Button)findViewById(R.id.btn_compute);
        computeResult = (TextView) findViewById(R.id.computeResult);

        computeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //To change body of implemented methods use File | Settings | File Templates.
                computeResult.setText(" 身高是：" + height_EditText.getText() + "(cm)" + "体重是：" + weight_EditText.getText() +"(kg)");
            }
        });
    }


}
