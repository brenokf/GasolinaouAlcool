package gasolinaoualcool.cursodeandroid.com.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    private EditText PreçodoAlcool;
    private EditText PreçodoGasolina;
    private Button BotaoVerificar;
    private TextView textoResultado ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PreçodoAlcool =(EditText) findViewById(R.id.preço_alcool_id);
        PreçodoGasolina = (EditText) findViewById(R.id.Preço_gasolina_id);
        BotaoVerificar =(Button) findViewById(R.id.botao_verificar_id);
        textoResultado = (TextView) findViewById(R.id.texto_resultado_id);

        BotaoVerificar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String TextoPreçoAlcool = PreçodoAlcool.getText().toString();
                String TextoPreçodoGasolina = PreçodoGasolina.getText().toString();

                Double valorAlcool = Double.parseDouble(TextoPreçoAlcool);
                Double valorGasolina = Double.parseDouble(TextoPreçodoGasolina);

                // alcool / gasolina

                Double resultado = valorAlcool/valorGasolina;

                if(resultado >= 0.7){
                    textoResultado.setText(" E melhor usar Gasolina");
                }
                else{
                    textoResultado.setText("E melhor usar Álcool");
                }
            }
        });
    }
}
