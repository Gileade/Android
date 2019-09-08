package br.com.gile.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView aluno = new TextView(this);
        aluno.setText("Gileade Trindade");
        setContentView(aluno);
    }
}
