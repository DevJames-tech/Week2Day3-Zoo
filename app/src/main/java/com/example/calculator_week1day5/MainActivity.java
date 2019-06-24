package com.example.calculator_week1day5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDisplay1 = findViewById(R.id.Display);
        myDisplay2 = findViewById(R.id.Display2);
    }
    TextView myDisplay1;
    TextView myDisplay2;

    public void listenUp(View view)
    {
      switch(view.getId()) {

          case R.id.one:
              myDisplay1.append("1");
              break;
          case R.id.two:
              myDisplay1.append("2");
          break;

          case R.id.three:
              myDisplay1.append("3");
          break;

          case R.id.four:
              myDisplay1.append("4");
          break;

          case R.id.five:
              myDisplay1.append("5");
          break;

          case R.id.six:
              myDisplay1.append("6");
          break;

          case R.id.seven:
              myDisplay1.append("7");
          break;

          case R.id.eight:
              myDisplay1.append("8");
          break;
          case R.id.nine:
              myDisplay1.append("9");
              break;

          case R.id.zero:
              myDisplay1.append("0");
                  break;

          case R.id.division:
              myDisplay1.append("/");
              break;

          case R.id.multiply:
              myDisplay1.append("*");
              break;
          case R.id.equal:
              DoMath mathTime = new DoMath();
             String data= mathTime.calculateResult(myDisplay1.getText().toString());

              myDisplay2.setText(data);
              break;

          case R.id.log:
              myDisplay1.append("log2(");
              break;

          case R.id.par2:
              myDisplay1.append(")");
              break;

          case R.id.Par1:
              myDisplay1.append("(");
              break;
          case R.id.squareRoot:
              myDisplay1.append("sqrt(");
              break;

          case R.id.clearAll:
              myDisplay1.setText("");
              myDisplay2.setText("");
              break;
          case R.id.exp:
              myDisplay1.append("exp(");
              break;

          case R.id.minus:
              myDisplay1.append("-");
              break;
          case R.id.plus:
              myDisplay1.append("+");
              break;

          case R.id.clearAll2:
                  myDisplay1.setText("");
                  myDisplay2.setText("");
                  break;



      }
    }
// if characters are followed by number else string replace character



}
