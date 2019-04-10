package rmsk.team.ratelist;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private static final int rbid1=1001;
    private static final int rbid2=1002;
    private static final int rbid3=1003;
    private static final int rbid4=1004;
    public int i=0;
    TextView rate1, rate2, rate3, rate4, dis1, dis2, dis3, dis4,error;
    EditText domainname, areaname;
    Button search, pay;
    DatabaseReference reff;
    RadioGroup radioGroup;
    RadioButton radioButton;
    String radio="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioButton=new RadioButton(this);
        pay = (Button) findViewById(R.id.pay);
        areaname = (EditText) findViewById(R.id.areaname);
        domainname = (EditText) findViewById(R.id.domainname);
        rate1 = (TextView) findViewById(R.id.rate1);
        rate2 = (TextView) findViewById(R.id.rate2);
        rate3 = (TextView) findViewById(R.id.rate3);
        rate4 = (TextView) findViewById(R.id.rate4);
        dis1 = (TextView) findViewById(R.id.dis1);
        dis2 = (TextView) findViewById(R.id.dis2);
        dis3 = (TextView) findViewById(R.id.dis3);
        dis4 = (TextView) findViewById(R.id.dis4);
        error= (TextView) findViewById(R.id.error);
        radioGroup = findViewById(R.id.radiogroup);
        search = (Button) findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                rate1.setText("Pls Wait");
                rate2.setText("Pls Wait");
                rate3.setText("Pls Wait");
                rate4.setText("Pls Wait");
                dis1.setText("Pls Wait");
                dis2.setText("Pls Wait");
                dis3.setText("Pls Wait");
                dis4.setText("Pls Wait");
                final String domain = domainname.getText().toString();
                final String location = areaname.getText().toString();
                Toast.makeText(MainActivity.this, domain + "," + location, Toast.LENGTH_SHORT).show();

                if (domain.equals("Iot")) {
                    if (location.equals("Ambattur")) {
                        reff = FirebaseDatabase.getInstance().getReference().child("Domain").child("Iot").child("Ambattur");
                        reff.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                final String ratef, rateo, rater, ratew;
                                final String[] splitf, splito, splitr, splitw;
                                ratef = dataSnapshot.child("Fasttrack").getValue().toString();
                                splitf = ratef.split(",");
                                rate1.setText(splitf[0]);
                                rate1.setPaintFlags(rate1.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                dis1.setText(splitf[1]);

                                rateo = dataSnapshot.child("Online").getValue().toString();
                                splito = rateo.split(",");
                                rate2.setText(splito[0]);
                                rate2.setPaintFlags(rate2.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                dis2.setText(splito[1]);

                                rater = dataSnapshot.child("Regular").getValue().toString();
                                splitr = rater.split(",");
                                rate3.setText(splitr[0]);
                                rate3.setPaintFlags(rate3.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                dis3.setText(splitr[1]);

                                ratew = dataSnapshot.child("Weekend").getValue().toString();
                                splitw = ratew.split(",");
                                rate4.setText(splitw[0]);
                                rate4.setPaintFlags(rate4.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                dis4.setText(splitw[1]);

                            }

                            @Override
                            public void onCancelled(DatabaseError databaseError) {

                            }
                        });
                    } else if (location.equals("Avadi")) {
                        reff = FirebaseDatabase.getInstance().getReference().child("Domain").child("Iot").child("Avadi");
                        reff.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                final String ratef, rateo, rater, ratew;
                                final String[] splitf, splito, splitr, splitw;
                                ratef = dataSnapshot.child("Fasttrack").getValue().toString();
                                splitf = ratef.split(",");
                                rate1.setText(splitf[0]);
                                rate1.setPaintFlags(rate1.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                dis1.setText(splitf[1]);

                                rateo = dataSnapshot.child("Online").getValue().toString();
                                splito = rateo.split(",");
                                rate2.setText(splito[0]);
                                rate2.setPaintFlags(rate2.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                dis2.setText(splito[1]);

                                rater = dataSnapshot.child("Regular").getValue().toString();
                                splitr = rater.split(",");
                                rate3.setText(splitr[0]);
                                rate3.setPaintFlags(rate3.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                dis3.setText(splitr[1]);

                                ratew = dataSnapshot.child("Weeekend").getValue().toString();
                                splitw = ratew.split(",");
                                rate4.setText(splitw[0]);
                                rate4.setPaintFlags(rate4.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                dis4.setText(splitw[1]);

                            }

                            @Override
                            public void onCancelled(DatabaseError databaseError) {

                            }
                        });
                    } else {
                        rate1.setText("N.A.");
                        rate2.setText("N.A.");
                        rate3.setText("N.A.");
                        rate4.setText("N.A.");
                        dis1.setText("N.A.");
                        dis2.setText("N.A.");
                        dis3.setText("N.A.");
                        dis4.setText("N.A.");
                    }

                } else if (domain.equals("R Software")) {
                    if (location.equals("Ambattur")) {
                        reff = FirebaseDatabase.getInstance().getReference().child("Domain").child("R Software").child("Ambattur");
                        reff.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                final String ratef, rateo, rater, ratew;
                                final String[] splitf, splito, splitr, splitw;
                                ratef = dataSnapshot.child("Fasttrack").getValue().toString();
                                splitf = ratef.split(",");
                                rate1.setText(splitf[0]);
                                rate1.setPaintFlags(rate1.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                dis1.setText(splitf[1]);

                                rateo = dataSnapshot.child("Online").getValue().toString();
                                splito = rateo.split(",");
                                rate2.setText(splito[0]);
                                rate2.setPaintFlags(rate2.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                dis2.setText(splito[1]);

                                rater = dataSnapshot.child("Regular").getValue().toString();
                                splitr = rater.split(",");
                                rate3.setText(splitr[0]);
                                rate3.setPaintFlags(rate3.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                dis3.setText(splitr[1]);

                                ratew = dataSnapshot.child("Weekend").getValue().toString();
                                splitw = ratew.split(",");
                                rate4.setText(splitw[0]);
                                rate4.setPaintFlags(rate4.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                dis4.setText(splitw[1]);

                            }

                            @Override
                            public void onCancelled(DatabaseError databaseError) {

                            }
                        });
                    } else if (location.equals("Avadi")) {
                        reff = FirebaseDatabase.getInstance().getReference().child("Domain").child("R Software").child("Avadi");
                        reff.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                final String ratef, rateo, rater, ratew;
                                final String[] splitf, splito, splitr, splitw;
                                ratef = dataSnapshot.child("Fasttrack").getValue().toString();
                                splitf = ratef.split(",");
                                rate1.setText(splitf[0]);
                                rate1.setPaintFlags(rate1.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                dis1.setText(splitf[1]);

                                rateo = dataSnapshot.child("Online").getValue().toString();
                                splito = rateo.split(",");
                                rate2.setText(splito[0]);
                                rate2.setPaintFlags(rate2.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                dis2.setText(splito[1]);

                                rater = dataSnapshot.child("Regular").getValue().toString();
                                splitr = rater.split(",");
                                rate3.setText(splitr[0]);
                                rate3.setPaintFlags(rate3.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                dis3.setText(splitr[1]);

                                ratew = dataSnapshot.child("Weekend").getValue().toString();
                                splitw = ratew.split(",");
                                rate4.setText(splitw[0]);
                                rate4.setPaintFlags(rate4.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                dis4.setText(splitw[1]);

                            }

                            @Override
                            public void onCancelled(DatabaseError databaseError) {

                            }
                        });
                    } else {
                        rate1.setText("N.A.");
                        rate2.setText("N.A.");
                        rate3.setText("N.A.");
                        rate4.setText("N.A.");
                        dis1.setText("N.A.");
                        dis2.setText("N.A.");
                        dis3.setText("N.A.");
                        dis4.setText("N.A.");
                    }


                } else {
                    rate1.setText("N.A.");
                    rate2.setText("N.A.");
                    rate3.setText("N.A.");
                    rate4.setText("N.A.");
                    dis1.setText("N.A.");
                    dis2.setText("N.A.");
                    dis3.setText("N.A.");
                    dis4.setText("N.A.");
                }
            }
        });
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V)
            {

                if(i==0)
                    Toast.makeText(MainActivity.this, "Please Select the Course Duration", Toast.LENGTH_SHORT).show();
                else if(i==1)
                    radio=dis1.getText().toString();
                else if(i==2)
                    radio=dis2.getText().toString();
                else if(i==3)
                    radio=dis3.getText().toString();
                else
                    radio=dis4.getText().toString();
                if(radio.equals("") || radio.equals("Pls Wait") || radio.equals("N.A."))
                    Toast.makeText(MainActivity.this, "Inappropriate Amount", Toast.LENGTH_SHORT).show();
                else
                {
                    Intent i=new Intent(MainActivity.this,Example.class);
                    i.putExtra("Value",radio);
                    startActivity(i);
                    //finish();
                }
            }
        });
    }

    public void checkButton(View V)
    {
      boolean checked = ((RadioButton)V).isChecked();
      switch(V.getId())
      {
          case R.id.rb1:
              if(checked)
                  Toast.makeText(MainActivity.this,"Selected Course Duration : Fasttrack",Toast.LENGTH_SHORT).show();
                  i=1;
                  //radio=dis1.getText().toString();
           break;
          case R.id.rb2:
              if(checked)
                  Toast.makeText(MainActivity.this,"Selected Course Duration : Online",Toast.LENGTH_SHORT).show();
                  i=2;
                  //radio=dis2.getText().toString();
              break;
          case R.id.rb3:
              if(checked)
                  Toast.makeText(MainActivity.this,"Selected Course Duration : Regular",Toast.LENGTH_SHORT).show();
                  i=3;
                  //radio=dis3.getText().toString();
              break;
          case R.id.rb4:
              if(checked)
                  Toast.makeText(MainActivity.this,"Selected Course Duration : Weekend",Toast.LENGTH_SHORT).show();
                  i=4;
                  //radio=dis4.getText().toString();
              break;
      }

    }
}
