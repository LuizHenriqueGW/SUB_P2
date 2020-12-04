package com.example.sub_p2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText Nome;
    private EditText DataNasc;
    private EditText Telefone;
    private EditText Endereço;
    private Dao Pessoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Nome=findViewById(R.id.cp_Nome);
        DataNasc=findViewById(R.id.cp_D_Nasc);
        Telefone=findViewById(R.id.cp_Telefone);
        Endereço=findViewById(R.id.cp_Endereco);
        setContentView(R.layout.activity_main);
    }
    public void salvar (View view) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        List<Dao> listaPessoa = new ArrayList<>();
        Pessoa.setNome(Nome.getText().toString());
        Pessoa.setDataNascm(sdf.parse(DataNasc.getText().toString()));
        Pessoa.setTelefone(Integer.parseInt(Telefone.getText().toString()));
        Pessoa.setEndereco(Endereço.getText().toString());
        listaPessoa.add(Pessoa);
    }
}