package com.example.jisuanqi;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {

    private Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0;
    private Button btn_jia,btn_jian,btn_chen,btn_chu,btn_deng,btn_dian,btn_ce,btn_del,btn_00;
    private TextView tv_show;
    String result = "";
    private  TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_jia = findViewById(R.id.btn_jia);
        btn_jian = findViewById(R.id.btn_jian);
        btn_chen = findViewById(R.id.btn_chen);
        btn_chu = findViewById(R.id.btn_chu);
        btn_deng = findViewById(R.id.btn_deng);
        btn_dian = findViewById(R.id.btn_dian);
        btn_ce = findViewById(R.id.btn_ce);
        btn_del = findViewById(R.id.btn_del);
        btn_00 = findViewById(R.id.btn_00);
        tts = new TextToSpeech(MainActivity.this,this);
        tv_show = findViewById(R.id.tv_show);


        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = "0"+result;
                tv_show.setText(result);
                tts.speak("零",TextToSpeech.QUEUE_FLUSH,null);

            }
        });
        btn_00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "00";
                tv_show.setText(result);
                tts.speak("零零",TextToSpeech.QUEUE_FLUSH,null);

            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "1";
                tv_show.setText(result);
                tts.speak("一",TextToSpeech.QUEUE_FLUSH,null);

            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "2";
                tv_show.setText(result);
                tts.speak("二",TextToSpeech.QUEUE_FLUSH,null);

            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "3";
                tv_show.setText(result);
                tts.speak("三",TextToSpeech.QUEUE_FLUSH,null);

            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "4";
                tv_show.setText(result);
                tts.speak("四",TextToSpeech.QUEUE_FLUSH,null);

            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "5";
                tv_show.setText(result);
                tts.speak("五",TextToSpeech.QUEUE_FLUSH,null);

            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "6";
                tv_show.setText(result);
                tts.speak("六",TextToSpeech.QUEUE_FLUSH,null);

            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "7";
                tv_show.setText(result);
                tts.speak("七",TextToSpeech.QUEUE_FLUSH,null);

            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "8";
                tv_show.setText(result);
                tts.speak("八",TextToSpeech.QUEUE_FLUSH,null);

            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "9";
                tv_show.setText(result);
                tts.speak("九",TextToSpeech.QUEUE_FLUSH,null);

            }
        });
        btn_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "del";
                tv_show.setText(result);
                tts.speak("删除",TextToSpeech.QUEUE_FLUSH,null);

            }
        });
        btn_ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = "";
                tv_show.setText(result);
                tts.speak("清除",TextToSpeech.QUEUE_FLUSH,null);

            }
        });
        btn_jia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "+";
                tv_show.setText(result);
                tts.speak("加",TextToSpeech.QUEUE_FLUSH,null);

            }
        });
        btn_jian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "-";
                tv_show.setText(result);
                tts.speak("减",TextToSpeech.QUEUE_FLUSH,null);

            }
        });
        btn_chen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "*";
                tv_show.setText(result);
                tts.speak("乘以",TextToSpeech.QUEUE_FLUSH,null);

            }
        });
        btn_chu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "/";
                tv_show.setText(result);
                tts.speak("除以",TextToSpeech.QUEUE_FLUSH,null);

            }
        });
        btn_dian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + ".";
                tv_show.setText(result);
                tts.speak("点",TextToSpeech.QUEUE_FLUSH,null);

            }
        });
        btn_deng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkInput(result);


                Double resulter1 = null;
                Long resulter2 = null;
                if(result.indexOf(".")>=0) {
                    if (result.indexOf("+") >= 0){
                        String[] tempArray = result.split("\\+");
                        Double ob1 = Double.parseDouble(tempArray[0]);
                        Double ob2 = Double.parseDouble(tempArray[1]);
                        resulter1 = ob1 + ob2;
                    }
                    if(result.indexOf("-")>=0)
                    {
                        String[] tempArray = result.split("\\-");
                        Double ob1 = Double.parseDouble(tempArray[0]);
                        Double ob2 = Double.parseDouble(tempArray[1]);
                        resulter1 = ob1 - ob2;
                    }
                    if(result.indexOf("*")>=0)
                    {
                        String[] tempArray = result.split("\\*");
                        Double ob1 = Double.parseDouble(tempArray[0]);
                        Double ob2 = Double.parseDouble(tempArray[1]);
                        resulter1 = ob1 * ob2;
                    }
                    if(result.indexOf("/")>=0)
                    {
                        String[] tempArray = result.split("\\/");
                        Double ob1 = Double.parseDouble(tempArray[0]);
                        Double ob2 = Double.parseDouble(tempArray[1]);
                        resulter1 = ob1 / ob2;
                    }
                    tv_show.setText(""+resulter1);
                }
                else if(result.indexOf(".")!=0)
                {
                    if(result.indexOf("+")>=0)
                    {
                        String[] tempArray = result.split("\\+");
                        Long ob1 = Long.parseLong(tempArray[0]);
                        Long ob2 = Long.parseLong(tempArray[1]);
                        resulter2 = ob1 +ob2;
                    }
                    if(result.indexOf("-")>=0)
                    {
                        String[] tempArray = result.split("\\-");
                        Long ob1 = Long.parseLong(tempArray[0]);
                        Long ob2 = Long.parseLong(tempArray[1]);
                        resulter2 = ob1 -ob2;
                    }
                    if(result.indexOf("*")>=0)
                    {
                        String[] tempArray = result.split("\\*");
                        Long ob1 = Long.parseLong(tempArray[0]);
                        Long ob2 = Long.parseLong(tempArray[1]);
                        resulter2 = ob1 *ob2;
                    }
                    if(result.indexOf("/")>=0)
                    {
                        String[] tempArray = result.split("\\/");
                        Long ob1 = Long.parseLong(tempArray[0]);
                        Long ob2 = Long.parseLong(tempArray[1]);
                        resulter2 = ob1 /ob2;
                    }
                    tv_show.setText(""+resulter2);
                }
                tts.speak("等于",TextToSpeech.QUEUE_FLUSH,null);


            }
        });
    }

    private void checkInput(String result) {

        if(result==null||result.equals(""))
        {
            Toast.makeText(MainActivity.this,"input is null",Toast.LENGTH_LONG).show();
            return;
        }
        int opNum = 0;
        if(result.indexOf("+")>=0)
            opNum++;
        if(result.indexOf("-")>=0)
            opNum++;
        if(result.indexOf("*")>=0)
            opNum++;
        if(result.indexOf("/")>=0)
            opNum++;
        if(opNum!=1) {
            Toast.makeText(MainActivity.this,"the league is null",Toast.LENGTH_LONG).show();
            return;
        }


    }

    @Override
    public void onInit(int i) {
        if(i==TextToSpeech.SUCCESS){
         tts.setLanguage(Locale.CHINESE);
        }
    }
}
