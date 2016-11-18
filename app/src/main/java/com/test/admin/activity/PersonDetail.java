package com.test.admin.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.test.admin.R;

/**
 * Created by hc6 on 2016/11/18.
 */

public class PersonDetail extends BaseActivity implements View.OnClickListener {

    private TextView perIdentity;
    private TextView perEmail;
    private TextView perTelNumber;
    private TextView perQQNumber;
    private TextView perImPermission_2;
    private TextView perImPermission_1;
    private TextView perAcPermission_2;
    private TextView perAcPermission_1;
    private TextView perSupplement;
    private Button pass;
    private Button mot_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.person_detail);

        setCustomTitle("权限申请详情", false);
    }

    @Override
    public void onClick(View v) {
        findViewById(R.id.actNoPass_button).setOnClickListener(this);
        findViewById(R.id.actPass_button).setOnClickListener(this);
    }
}