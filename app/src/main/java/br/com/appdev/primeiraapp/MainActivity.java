package br.com.appdev.primeiraapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOkOnClick(View view) {
        EditText txtNome = (EditText) findViewById(R.id.txtNome);
        ImageView img = (ImageView) findViewById(R.id.img);
        Toast.makeText(
                this,
                "Bom dia, " + txtNome.getText().toString(),
                Toast.LENGTH_LONG).show();
        img.setImageResource(R.drawable.tioavo);
    }

    public void optSexoOnClick(View v) {

        RadioGroup optSexo = (RadioGroup) findViewById(R.id.optSexo);

        if (optSexo.getCheckedRadioButtonId() == R.id.optMasc)
            Toast.makeText(this, "masculino", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "feminino", Toast.LENGTH_LONG).show();
    }
}
