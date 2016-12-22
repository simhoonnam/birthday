package com.example.littlematwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class resultActivity extends AppCompatActivity {

    TextView res;

    String a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        res=(TextView)findViewById(R.id.result_tv);

        Intent intent = getIntent();
        a=intent.getStringExtra("a");
        b=intent.getStringExtra("b");
        c=intent.getStringExtra("c");

        onView();
    }

    private void onView() {

        int ai=Integer.parseInt(a);
        int bi=Integer.parseInt(b);
        int ci=Integer.parseInt(c);

        checkA(ai);
        checkB(bi);
        checkC(ci);


    }

    private void checkC(int ci) {
        switch (ci) {
            case 1:
                res.append("미인대회 탈락자");
                break;
            case 2:
                res.append("조폭 두목");
                break;
            case 3:
                res.append("노름꾼");
                break;
            case 4:
                res.append("게이");
                break;
            case 5: break;
            case 6: break;
            case 7: break;
            case 8: break;
            case 9: break;
            case 10: break;
            case 11: break;
            case 12: break;
            case 13: break;
            case 14: break;
            case 15: break;
            case 16: break;
            case 17: break;
            case 18: break;
            case 19: break;
            case 20: break;
            case 21: break;
            case 22: break;
            case 23: break;
            case 24: break;
            case 25: break;
            case 26: break;
            case 27: break;
            case 28: break;
            case 29: break;
            case 30: break;
            case 31: break;



        }
    }

    private void checkB(int bi) {
        switch (bi) {
            case 1 :
                res.append("남의 심부름만 하던 ");
                break;
            case 2 :
                res.append("굶을 일은 없었던 ");
                break;
            case 3 :
                res.append("돈망 펑펑 쓰던 ");
                break;
            case 4 :
                res.append("쫄쫄 굶었던 ");
                break;
            case 5 :
                break;
            case 6 :
                break;
            case 7 :
                break;
            case 8 :
                break;
            case 9 :
                break;
            case 10 :
                break;
            case 11 :
                break;
            case 12 :
                break;


        }
    }

    private void checkA(int ai) {
        if(ai%10==0) {
            res.append("외국에서 ");
        }
        else if(ai%10==1){
            res.append("밤마다 ");
        }
        else if(ai%10==2){
            res.append("어릴 적 부터 ");
        }
        else if(ai%10==3){
            res.append("부모 잘못 만나서 ");
        }
        else if(ai%10==4){
            res.append("타고나길 ");
        }
        else if(ai%10==5){
            res.append("참하게 생겨서는 ");
        }
        else if(ai%10==6){
            res.append("매일 아침마다 ");
        }
        else if(ai%10==7){
            res.append("할일 없이 ");
        }
        else if(ai%10==8){
            res.append("하루도 빠짐없이 ");
        }
        else if(ai%10==9){
            res.append("재수 없게 ");
        }
    }
}
