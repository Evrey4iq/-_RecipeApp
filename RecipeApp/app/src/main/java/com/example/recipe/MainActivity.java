package com.example.recipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Рол з куркою","200 г нарізаної кубиками курки, " +
                "лаваш (2 шт.), " +
                "молода капуста, " +
                "2 столові ложки рослинного масла, " +
                "1/2 нарізаного соломкою огірка, " +
                "1/2 столової ложки подрібненого листя коріандру, " +
                "1 велика тонко нарізана цибулина, " +
                "1/2 болгарського перецю, " +
                "50 гр. корейської моркви, " +
                "1 чайна ложка томатного кетчупу, " +
                "4-5 скибок твердого сиру.","Приготування",
                "Куряче філе необхідно заздалегідь відварити чи запекти в духовці. Для цього промиваємо його у проточній воді, обрізаємо, якщо є, зайвий жир та хрящі. Ставимо на плиту каструлю з водою, відправляємо до неї філе, солимо. Варимо до готовності – приблизно 20 хвилин. Чекаємо, доки воно охолоне, а потім нарізаємо середніми шматочками. Викладаємо на лаваш овочі, поливаємо соусом, потім шматочки курячого філе, додаємо ще соус, потім згортаємо лаваш. Розігріваємо сковороду без олії та підсмажуємо рол з куркою з двох боків, щоб вийшла апетитна золотиста скоринка. Подаємо смачний лаваш із начинкою та насолоджуємося смаком.\n", R.drawable.chicken_roll));
        recipes1.add(new Recipes("Пундик","400 г борошна, " +
                "150 мл молока, " +
                "1 шт. яйце,  " +
                "25 г свіжих дріжджів, " +
                "40 г вершкового масла, " +
                "цукрова пудра, " +
                "2 ст. л. цукру, " +
                "10 г ванільного цукру, " +
                "щіпка солі, " +
                "олія для смаження. ","Приготування","\n" +
                "У велику миску влити тепле молоко. Додати цукор, ванільний цукор та розчинені дріжджі. Перемішати вінчиком і залишити під рушником на 20 хвилин. Потім додати яйце, розтоплене вершкове масло, сіль та борошно. Замісити м'яке, еластичне тісто. Сформувати з тіста кулю і покласти у миску. Накрити харчовою плівкою і залишити на годину, поки воно не збільшиться вдвічі. Розкатати тісто в пласт товщиною 1,5 см і вирізати кола, а в них меншим круглим вирізати малі кола. Залишити для підняття на 15 хвилин. Розігріти і смажити пундики з обох боків до золотистого кольору. Покласти на паперову серветку, щоб зтік зайвий жир. Посипати цукровою пудрою. ",R.drawable.donut1));
        recipes1.add(new Recipes("Панкейк","250 мл молока," +
                "3 ст. ложки рослинного або 40 гр. розтопленого вершкового масла, воно повинно бути остигле або трохи тепле, але не гаряче, " +
                "1 яйце, " +
                "4 ст. л. цукру, " +
                "1 ч. л. розпушувача, " +
                "1/4 ч. л. сол, " +
                "170 гр борошна. ","Приготування",
                "Насамперед необхідно змішати в мисці молоко, яйця, масло і цукор. Можна легко збити все віночком або вилкою. Після цього змішати борошно, сіль і розпушувач, просіяти в молочно-яєчну суміш. Розмішати так, щоб вийшла однорідна маса без грудочок. Розігріти сковороду змащувати нічим не треба, вона повинна бути сухою. а 1 панкейк потрібно 2 ст. л. тіста, виливаємо на сковороду і чекаємо, коли почнуть з'являтися бульбашки. Як тільки це станеться, перевертаємо панкейк. Не потрібно чекати, коли вся поверхня млинчика покриється пухирцями, ось як тільки почали з'являтися, так і перевертаємо. На іншій стороні панкейк печеться ще швидше, тому важливо простежити, щоб він не підгорів. ",R.drawable.pancakes));
        recipes1.add(new Recipes("Паста","500 грамів макаронів (ріґатоні або пенне), ;" +
                "400 мілілітрів томатного соусу, " +
                "200 грамів солоної рикоти, " +
                "пучок базиліка, " +
                "2 зубчики часнику, " +
                "2 фіолетових баклажани, " +
                "оливкова олія. ","Приготування",
                "Для страви потрібно баклажани помити і нарізати скибочками товщиною близько 2 сантиметрів. Добре висушіть їх, посипте сіллю, щоб уникнути гіркоти овоча. бсмажте баклажани на сковороді з антипригарним покриттям з великою кількістю оливкової олії, потім злийте її і покладіть сушитися на шар паперового рушника. Залиште частину баклажанів кружечками, решту наріжте смужками або шматочками. Для томатного соусу, вичавіть у нього часник та доведіть до кипіння. Трішки проваріть і додайте нарізані баклажани. Окремо відваріть макарони у великій кількості підсоленої води і, як тільки вона звариться, процідіть і заправте томатним соусом. Можна відварити їх до консистенції аль денте. икладіть пасту на тарілки, покладіть на неї шматочки баклажанів і натріть солону рикоту. Перед подачею додайте кілька листочків свіжого базиліку.",R.drawable.pasta1));



        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recipes1);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myrecyclerView.setAdapter(myAdapter);



    }

}