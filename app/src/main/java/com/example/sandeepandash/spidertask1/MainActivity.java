package com.example.sandeepandash.spidertask1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private int Count ;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Declare Increment Button
        final Button IncrementButton;

        // Declare Reset Button
        final Button ResetButton;

        // Declare Count text view
        final TextView CountText=(TextView)findViewById(R.id.CountText);


        // Init count
        Count = 0;



        IncrementButton = (Button) findViewById(R.id.IncrementButton);

        IncrementButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // Update Count
                Count++;

                // Get reference of Text View


                CountText.setText( "Count is: " + Count);





            }
        });
    }


}
