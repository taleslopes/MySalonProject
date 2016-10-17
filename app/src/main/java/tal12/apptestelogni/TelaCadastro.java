package tal12.apptestelogni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class TelaCadastro extends AppCompatActivity {

    EditText editNome, editEmail2, editSenha2;
    Button btnCancelar, btnRegistrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cadastro);

        editNome = (EditText) findViewById(R.id.editNome);
        editEmail2 = (EditText)findViewById(R.id.editEmail2);
        editSenha2 = (EditText)findViewById(R.id.editSenha2);
        btnCancelar = (Button)findViewById(R.id.btnCancelar);
        btnRegistrar = (Button) findViewById(R.id.btnRegistrar);



    }
}
