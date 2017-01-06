package adrian.embid.blackjackapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BlackJack extends AppCompatActivity implements View.OnClickListener {

    Button btstart, btexit, btabout, btscores;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_black_jack);

        btscores = (Button) findViewById(R.id.btn_scores);
        btabout = (Button) findViewById(R.id.btn_scores);
        btexit = (Button) findViewById(R.id.btn_exit);
        btstart = (Button) findViewById(R.id.btn_play);

        btstart.setOnClickListener(this);
        btexit.setOnClickListener(this);
        btabout.setOnClickListener(this);
        btscores.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_exit:
                Toast.makeText(this, R.string.bye, Toast.LENGTH_SHORT).show();
                this.finish();
                break;
            case R.id.btn_about:
                //TODO page about app
                break;
            case R.id.btn_scores:
                //TODO extract info and show in floating space
                break;
            case R.id.btn_play:
                startActivity(new Intent(this, Game.class));
                break;
        }
    }
}
