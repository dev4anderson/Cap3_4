package com.example.andersonmacedo.cap3_4;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Criação do objeto no Java
        Button btLogin = (Button) findViewById(R.id.btLogin);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Criação dos textos no Java
                TextView tLogin = (TextView) findViewById(R.id.tLogin);
                TextView tSenha = (TextView) findViewById(R.id.tSenha);

                //Conversão do objeto para texto
                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();

                //Condição para validação de login
                if ("anderson".equals(login) && "123".equals(senha)){
                    alert("Bem Vindo, login realizado com sucesso");
                } else {
                    alert("Login e senha incorretos");
                }

            }
        });

    }

    private void alert(String s) {
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }
}
