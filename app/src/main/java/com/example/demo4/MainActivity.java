package com.example.demo4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.nightonke.boommenu.BoomButtons.ButtonPlaceEnum;
import com.nightonke.boommenu.BoomButtons.SimpleCircleButton;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.ButtonEnum;
import com.nightonke.boommenu.Piece.PiecePlaceEnum;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BoomMenuButton bmb = (BoomMenuButton)findViewById(R.id.bmb);

        bmb.setButtonEnum(ButtonEnum.SimpleCircle);

        bmb.setPiecePlaceEnum(PiecePlaceEnum.DOT_3_1);

        bmb.setButtonPlaceEnum(ButtonPlaceEnum.SC_3_3);

        for(int i=0;i<bmb.getButtonPlaceEnum().buttonNumber();i++){
            bmb.addBuilder(new SimpleCircleButton.Builder().normalImageRes(R.drawable.icon_menu));
        }
    }
}