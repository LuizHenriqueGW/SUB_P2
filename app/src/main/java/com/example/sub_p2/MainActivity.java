package com.example.sub_p2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Dao> listaPessoa = new ArrayList<>();
    private EditText Nome;
    private EditText DataNasc;
    private EditText Telefone;
    private EditText Endereço;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Nome=findViewById(R.id.cp_Nome);
        DataNasc=findViewById(R.id.cp_D_Nasc);
        Telefone=findViewById(R.id.cp_Telefone);
        Endereço=findViewById(R.id.cp_Endereco);
        setContentView(R.layout.activity_main);
        atualizalistagem();
    }
    public void salvar (View view) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        Dao Pessoa = new Dao();
        Pessoa.setNome(Nome.getText().toString());
        Pessoa.setDataNascm(sdf.parse(DataNasc.getText().toString()));
        Pessoa.setTelefone(Integer.parseInt(Telefone.getText().toString()));
        Pessoa.setEndereco(Endereço.getText().toString());
        listaPessoa.add(Pessoa);
        atualizalistagem();
    }
    public void atualizalistagem() {
        ListView lista = (ListView) findViewById(R.id.Listagem);
        ArrayAdapter<Dao> adapter = new ArrayAdapter<Dao>(this, android.R.layout.simple_list_item_1, listaPessoa);
        lista.setAdapter(adapter);
    }
}