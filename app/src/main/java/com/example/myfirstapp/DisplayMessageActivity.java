package com.example.myfirstapp;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.support.design.widget.Snackbar;

public class DisplayMessageActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    EditText uEmail;
    EditText uPass;
    TextView pInvalid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView);
    }

    public void managerAuth(View view) {
        uEmail = (EditText) findViewById(R.id.uEmail);
        uPass = (EditText) findViewById(R.id.uPass);
        pInvalid = (TextView) findViewById(R.id.pInvalid);

        String uE = uEmail.getText().toString(); String cE = "manager@store.com";
        String uP = uPass.getText().toString(); String cP = "123456";

        Intent intent = new Intent(this, MainActivity.class);

        if (cP.equals(uP) && cE.equals(uE)) {
            pInvalid.setText("Welcome");
            startActivity(intent);
        }
        else
        {
            pInvalid.setText("Invalid Cridentials " + System.lineSeparator() + uEmail.getText().toString() + System.lineSeparator() +  uPass.getText().toString());
        }



    }
}
