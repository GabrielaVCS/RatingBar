package application.example.com.ratingbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RatingBar rb;
    RatingBar rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb = (RatingBar)findViewById(R.id.rb1);
        rb2 = (RatingBar)findViewById(R.id.rb2);
    }

    public void verificar(View v){
        int quantidadeEstrelas = (int) rb.getRating();
        String message = null;

        switch (quantidadeEstrelas){
            case 1: message = "Poxa, apenas uma estrela"; break;
            case 2: message = "Um pouco abaixo da média, 2 estrelas"; break;
            case 3: message = "Na média"; break;
            case 4: message = "4 estrelas!"; break;
            case 5: message = "Perfeito!"; break;
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void verificar2(View v){
        int quantidadeEstrelas2 = (int) rb2.getRating();
        Integer quantidadeEstrela21 = new Integer(quantidadeEstrelas2);
        String quantidadeEstrela22 = quantidadeEstrela21.toString();
        String menssage2 = null;

        Toast.makeText(this,quantidadeEstrela22,Toast.LENGTH_LONG).show();
    }
}
