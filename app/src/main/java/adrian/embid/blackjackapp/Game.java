package adrian.embid.blackjackapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Game extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        TextView score = (TextView) findViewById(R.id.Score);
        TextView valoractual = (TextView) findViewById(R.id.handvalue);

        Button restart = (Button) findViewById(R.id.btn_restart);
        Button deal = (Button) findViewById(R.id.btn_deal);
        Button otracarta = (Button) findViewById(R.id.btn_ask);
        Button parar = (Button) findViewById(R.id.btn_stop);

        restart.setOnClickListener(this);
        otracarta.setOnClickListener(this);
        parar.setOnClickListener(this);

        ImageView b1 = (ImageView) findViewById(R.id.bank1);
        ImageView b2 = (ImageView) findViewById(R.id.bank2);
        ImageView b3 = (ImageView) findViewById(R.id.bank3);
        ImageView b4 = (ImageView) findViewById(R.id.bank4);

        ImageView u1 = (ImageView) findViewById(R.id.user1);
        ImageView u2 = (ImageView) findViewById(R.id.user2);
        ImageView u3 = (ImageView) findViewById(R.id.user3);
        ImageView u4 = (ImageView) findViewById(R.id.user4);

        Hand userhand = new Hand();
        Hand bothand = new Hand();


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_ask:
                //TODO ADD CARD (1)
                //TODO UPDATE HANDVALUE
                //TODO STOP IF >21 -> UPDATE SCORE
                break;
            case R.id.btn_stop:
                //TODO CALCULATE RESULT
                //TODO UPDATE HANDVALUE, SCORE
                break;
            case R.id.btn_deal:
                //TODO PUT CARDS (4)
                //TODO UPDATE HANDVALUE
                break;
            case R.id.btn_restart:
                //TODO RESTART HANDVALUE, SCORE
                //TODO CLEAN BOARD
                //TODO PUT HIGHSCORE HERE?
                //TODO DEAL AGAIN
                break;
        }
    }
}
