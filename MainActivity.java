package com.qurantshumovskiy.tj;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;






public class MainActivity extends AppCompatActivity {


    int global_position = 0;

    public MediaPlayer mediaPlayer=null;
    private RelativeLayout mRelativeLayout;


    ListView listView;
    ArrayList<ListPojo> list;

    AdapterList adapterList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRelativeLayout = (RelativeLayout) findViewById(R.id.rl);










        // gm = new Music(this); // pass context here to music
        //  gm.menuSound(true);

        listView = findViewById(R.id.list_view);




        listShow();

        adapterList = new AdapterList(this,list);
        listView.setAdapter(adapterList);
//        listView.getChildAt(5).setBackgroundColor(Color.RED);









    }



    String nameofmp3;
    public void mp3start() {
        // mediaPlayer.stop();

        if(mediaPlayer!=null) mediaPlayer.reset();
        //mediaPlayer.stop();

        // int numqur = AdapterList.nummp3+1;
        // Integer numqur = Integer.parseInt(AdapterList.nummp3)+1;
        //String nameofmp3 = String.format("sura%s", String.valueOf(numqur));

        Integer nnameofmp3 = AdapterList.nummp3+1;
        //String ss= String.valueOf(nnameofmp3);
        nameofmp3 = "sura" + nnameofmp3;
        //if (AdapterList.nummp3==0) nameofmp3 = "sura1";

        // int resID=getResources().getIdentifier("sura1", "raw", getPackageName());
        int resID = getResources().getIdentifier(nameofmp3, "raw", getPackageName());
        mediaPlayer = MediaPlayer.create(this, resID);
        //listView.getChildAt(5).setBackgroundColor(Color.RED);

       // listView.getChildAt(listView.getCheckedItemCount()).setBackgroundColor(Color.RED);

         //       listView.getChildAt(listView.getCheckedItemCount()).setBackgroundColor(Color.CYAN);

        listView.setSelected(true);
        mediaPlayer.start();
       // listView.setItemChecked(AdapterList.nummp3+1, true);
        //listView.setSelected(true);
       // listView.setSelection(listView.getCheckedItemPosition());
        //listView.setBackgroundColor(Color.CYAN);

        //listView.getChildAt(listView.getCheckedItemCount()).setBackgroundColor(Color.RED);









       // adapterList.notifyDataSetChanged();





    }





    private void listShow(){
        list = new ArrayList<ListPojo>();
        list.add(new ListPojo("Открывающая книгу","Сура 1",R.drawable.quran));
        list.add(new ListPojo("Корова","Сура 2",R.drawable.quran));

        list.add(new ListPojo("Семейство Имрана","Сура 3",R.drawable.quran));

        list.add(new ListPojo("Женщины","Сура 4",R.drawable.quran));

        list.add(new ListPojo("Трапеза","Сура 5",R.drawable.quran));

        list.add(new ListPojo("Скот","Сура 6",R.drawable.quran));

        list.add(new ListPojo("Преграды","Сура 7",R.drawable.quran));

        list.add(new ListPojo("Добыча","Сура 8",R.drawable.quran));

        list.add(new ListPojo("Покаяние","Сура 9",R.drawable.quran));

        list.add(new ListPojo("Иона","Сура 10",R.drawable.quran));

        list.add(new ListPojo("Худ","Сура 11",R.drawable.quran));

        list.add(new ListPojo("Иосиф","Сура 12",R.drawable.quran));

        list.add(new ListPojo("Гром","Сура 13",R.drawable.quran));

        list.add(new ListPojo("Авраам","Сура 14",R.drawable.quran));

        list.add(new ListPojo("Аль Хиджр","Сура 15",R.drawable.quran));

        list.add(new ListPojo("Пчёлы","Сура 16",R.drawable.quran));

        list.add(new ListPojo("Перенес ночью","Сура 17",R.drawable.quran));

        list.add(new ListPojo("Пещера","Сура 18",R.drawable.quran));

        list.add(new ListPojo("Мария","Сура 19",R.drawable.quran));

        list.add(new ListPojo("Таха","Сура 20",R.drawable.quran));

        list.add(new ListPojo("Пророки","Сура 21",R.drawable.quran));

        list.add(new ListPojo("Хадж","Сура 22",R.drawable.quran));

        list.add(new ListPojo("Верующие","Сура 23",R.drawable.quran));

        list.add(new ListPojo("Свет","Сура 24",R.drawable.quran));

        list.add(new ListPojo("Различение","Сура 25",R.drawable.quran));

        list.add(new ListPojo("Поэты","Сура 26",R.drawable.quran));

        list.add(new ListPojo("Муравьи","Сура 27",R.drawable.quran));

        list.add(new ListPojo("Рассказы","Сура 28",R.drawable.quran));

        list.add(new ListPojo("Паук","Сура 29",R.drawable.quran));

        list.add(new ListPojo("Греки","Сура 30",R.drawable.quran));

        list.add(new ListPojo("Лукман","Сура 31",R.drawable.quran));
        list.add(new ListPojo("Поклон","Сура 32",R.drawable.quran));
        list.add(new ListPojo("Сонмы ","Сура  33",R.drawable.quran));
        list.add(new ListPojo("Саба (Сава) ","Сура  34",R.drawable.quran));
        list.add(new ListPojo("Ангелы ","Сура  35",R.drawable.quran));
        list.add(new ListPojo("Йа Син ","Сура  36",R.drawable.quran));
        list.add(new ListPojo("Стоящие рядами","Сура  37",R.drawable.quran));
        list.add(new ListPojo("Сад (буква) ","Сура  38",R.drawable.quran));
        list.add(new ListPojo("Толпы ","Сура  39",R.drawable.quran));
        list.add(new ListPojo("Верующий ","Сура  40",R.drawable.quran));

        list.add(new ListPojo("Разъяснены ","Сура 41",R.drawable.quran));
        list.add(new ListPojo("Совет","Сура 42",R.drawable.quran));
        list.add(new ListPojo("Украшения ","Сура 43",R.drawable.quran));
        list.add(new ListPojo("Дым","Сура 44",R.drawable.quran));
        list.add(new ListPojo("Коленопреклоненная ","Сура 45",R.drawable.quran));
        list.add(new ListPojo("Пески ","Сура  46",R.drawable.quran));
        list.add(new ListPojo("Мухаммад","Сура  47",R.drawable.quran));
        list.add(new ListPojo("Победа ","Сура  48",R.drawable.quran));
        list.add(new ListPojo("Комнаты ","Сура  49",R.drawable.quran));
        list.add(new ListPojo("Каф (буква)","Сура  50",R.drawable.quran));

        list.add(new ListPojo("Рассеивающие ","Сура 51",R.drawable.quran));
        list.add(new ListPojo("Гора","Сура 52",R.drawable.quran));
        list.add(new ListPojo("Звезда ","Сура  53",R.drawable.quran));
        list.add(new ListPojo("Луна ","Сура  54",R.drawable.quran));
        list.add(new ListPojo("Милосердный ","Сура  55",R.drawable.quran));
        list.add(new ListPojo("Падающее ","Сура  56",R.drawable.quran));
        list.add(new ListPojo("Железо ","Сура  57",R.drawable.quran));
        list.add(new ListPojo("Препирательство ","Сура  58",R.drawable.quran));
        list.add(new ListPojo("Сбор ","Сура  59",R.drawable.quran));
        list.add(new ListPojo("Испытуемая","Сура  60",R.drawable.quran));

        list.add(new ListPojo("Ряды ","Сура 61",R.drawable.quran));
        list.add(new ListPojo("Собрание ","Сура 62",R.drawable.quran));
        list.add(new ListPojo("Лицемеры ","Сура  63",R.drawable.quran));
        list.add(new ListPojo("Взаимное обманывание ","Сура  64",R.drawable.quran));
        list.add(new ListPojo("Развод ","Сура  65",R.drawable.quran));
        list.add(new ListPojo("Запрещение ","Сура  66",R.drawable.quran));
        list.add(new ListPojo("Власть ","Сура  67",R.drawable.quran));
        list.add(new ListPojo("Письменная трость ","Сура  68",R.drawable.quran));
        list.add(new ListPojo("Неизбежное ","Сура  69",R.drawable.quran));
        list.add(new ListPojo("Ступени","Сура  70",R.drawable.quran));

        list.add(new ListPojo("Ной ","Сура 71",R.drawable.quran));
        list.add(new ListPojo("Гении","Сура 72",R.drawable.quran));
        list.add(new ListPojo("Завернувшийся ","Сура  73",R.drawable.quran));
        list.add(new ListPojo("Закутавшийся ","Сура  74",R.drawable.quran));
        list.add(new ListPojo("Воскресение","Сура  75",R.drawable.quran));
        list.add(new ListPojo("Человек","Сура  76",R.drawable.quran));
        list.add(new ListPojo("Посылаемые","Сура  77",R.drawable.quran));
        list.add(new ListPojo("Весть","Сура  78",R.drawable.quran));
        list.add(new ListPojo("Вырывающие ","Сура  79",R.drawable.quran));
        list.add(new ListPojo("Нахмурился ","Сура  80",R.drawable.quran));

        list.add(new ListPojo("Скручивание ","Сура 81",R.drawable.quran));
        list.add(new ListPojo("Раскалывание ","Сура 82",R.drawable.quran));
        list.add(new ListPojo("Обвешивающие ","Сура  83",R.drawable.quran));
        list.add(new ListPojo("Разрушение ","Сура  84",R.drawable.quran));
        list.add(new ListPojo("Башни ","Сура  85",R.drawable.quran));
        list.add(new ListPojo("Идуший ночью ","Сура  86",R.drawable.quran));
        list.add(new ListPojo("Высочайший","Сура  87",R.drawable.quran));
        list.add(new ListPojo("Покрывающее ","Сура  88",R.drawable.quran));
        list.add(new ListPojo("Заря ","Сура  89",R.drawable.quran));
        list.add(new ListPojo("Город ","Сура  90",R.drawable.quran));

        list.add(new ListPojo("Солнце ","Сура 91",R.drawable.quran));
        list.add(new ListPojo("Ночь ","Сура 92",R.drawable.quran));
        list.add(new ListPojo("Утро","Сура  93",R.drawable.quran));
        list.add(new ListPojo("Разве Мы не раскрыли","Сура  94",R.drawable.quran));
        list.add(new ListPojo("Смоковница ","Сура  95",R.drawable.quran));
        list.add(new ListPojo("Сгусток","Сура  96",R.drawable.quran));
        list.add(new ListPojo("Могущество ","Сура  97",R.drawable.quran));
        list.add(new ListPojo("Ясное знамение ","Сура  98",R.drawable.quran));
        list.add(new ListPojo("Землетрясение ","Сура  99",R.drawable.quran));
        list.add(new ListPojo("Мчащиеся ","Сура  100",R.drawable.quran));

        list.add(new ListPojo("Поражающее ","Сура 101",R.drawable.quran));
        list.add(new ListPojo("Охота к умножению","Сура 102",R.drawable.quran));
        list.add(new ListPojo("Предвечернее время ","Сура  103",R.drawable.quran));
        list.add(new ListPojo("Хулитель ","Сура  104",R.drawable.quran));
        list.add(new ListPojo("Слон ","Сура  105",R.drawable.quran));
        list.add(new ListPojo("Курайш","Сура  106",R.drawable.quran));
        list.add(new ListPojo("Подаяние ","Сура  107",R.drawable.quran));
        list.add(new ListPojo("Обильный ","Сура  108",R.drawable.quran));
        list.add(new ListPojo("Неверные ","Сура  109",R.drawable.quran));
        list.add(new ListPojo("Помошь ","Сура  110",R.drawable.quran));

        list.add(new ListPojo("Пальмовые волокна","Сура 111",R.drawable.quran));
        list.add(new ListPojo("Очищение","Сура 112",R.drawable.quran));
        list.add(new ListPojo("Рассвет ","Сура  113",R.drawable.quran));
        list.add(new ListPojo("Люди ","Сура  114",R.drawable.quran));





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.basemenu,menu);
        return true;
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.stop:
                if(mediaPlayer!=null)  mediaPlayer.pause();
                return true;

            case R.id.play:
                if(mediaPlayer!=null  ) {


                    Boolean isPaused = !mediaPlayer.isPlaying() && mediaPlayer.getCurrentPosition() > 1;

                    if(isPaused)  mediaPlayer.start();


                }

                return true;

            case R.id.licence:
                Toast.makeText(this,"Licence: zafar.zainulloev@gmail.com",Toast.LENGTH_LONG).show();
                return true;


            case R.id.close:

                if(Build.VERSION.SDK_INT>=16 && Build.VERSION.SDK_INT<21){
                    finishAffinity();
                } else if(Build.VERSION.SDK_INT>=21){
                    finishAndRemoveTask();
                }



                System.exit(0);


                return true;






        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume() {
        adapterList.notifyDataSetChanged();


        super.onResume();
    }





}
