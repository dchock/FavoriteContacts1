package com.example.favoritecontacts;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.content.Intent;
import android.net.Uri;

import java.net.URI;

public class MainActivity extends AppCompatActivity {


    TextView textView;
    Button button1, button2, button3, button4, button5, button6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textViewDisplay);
        ButtonClicks();

    }


    private void ButtonClicks () {

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
            // do something on button click
               textView.setText("Calling Braxton");

               //Resources res = getResources();
               //String[] Caller = res.getStringArray(R.array.caller_array);

               //String myString = getResources().getString(R.string.braxton);

                   Intent intent = new Intent(Intent.ACTION_DIAL);
                   intent.setData(Uri.parse("tel: " + R.string.braxton));
                           //parse("tel: " + R.string.braxton));

                   if (intent.resolveActivity(getPackageManager()) != null) {
                       startActivity(intent);
                   }
               }
           });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
          // @Override
           public void onClick(View v) {
               textView.setText("Text Braxton");
               Intent sendIntent = new Intent(Intent.ACTION_SENDTO);
               sendIntent.setData(Uri.parse("sms:6122323559"));
               sendIntent.putExtra("sms_body", "Hi");
               if (sendIntent.resolveActivity(getPackageManager()) != null) {
                   startActivity(sendIntent);
                    }
                }
            });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                // do something on button click
                textView.setText("Calling Jared");

                //Resources res = getResources();
                //String[] Caller = res.getStringArray(R.array.caller_array);

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + R.string.jared));

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            // @Override
            public void onClick(View v) {
                textView.setText("Texting Jared");
                Intent sendIntent = new Intent(Intent.ACTION_SENDTO);
                sendIntent.setData(Uri.parse("sms: 6127997095"));
                sendIntent.putExtra("sms_body", "Hi");
                if (sendIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(sendIntent);
                }
            }
        });

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                // do something on button click
                textView.setText("Calling Braxton");

                //Resources res = getResources();
                //String[] Caller = res.getStringArray(R.array.caller_array);

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 6122323559"));

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            // @Override
            public void onClick(View v) {
                textView.setText("Text Ryan");
                Intent sendIntent = new Intent(Intent.ACTION_SENDTO);
                sendIntent.setData(Uri.parse("sms:6122323559"));
                sendIntent.putExtra("sms_body", "Hi");
                if (sendIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(sendIntent);
                }
            }
        });


    }
}
