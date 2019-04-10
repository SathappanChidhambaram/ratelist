package rmsk.team.ratelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Example extends AppCompatActivity {

    TextView payamount;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
        payamount=findViewById(R.id.payamount);
        st=getIntent().getExtras().getString("Value");
        payamount.setText(st);
    }
}
