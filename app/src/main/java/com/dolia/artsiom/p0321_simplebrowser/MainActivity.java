package com.dolia.artsiom.p0321_simplebrowser;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final EditText etWebAddress = (EditText) findViewById(R.id.etWebAddress);

        (findViewById(R.id.btnWeb)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //start activity using the address from EditText field,
                //!NO INPUT CHECK!
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(etWebAddress.getText().toString())));
            }
        });
    }
}
