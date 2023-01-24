package com.example.adapters

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.adapters.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val countryItemList:MutableList<Country> = mutableListOf()
    private lateinit var adapter:CountryItemAdapter
    private lateinit var bind:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind=ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.rv)
        countryList()
        setUpAdapter()
    }
    private fun countryList() {
        countryItemList.add(Country("Колумбия","Богото",R.drawable.columbia,"Колу́мбия (исп. Colombia [koˈlombja], прослушать (инф.)[5]), официальное название — Респу́блика Колу́мбия (исп. República de Colombia [reˈpuβlika ðe koˈlombja]), — государство на северо-западе Южной Америки, с территориями в Центральной Америке. Столица — Богота. Граничит с Бразилией и Венесуэлой на востоке, на юге — с Эквадором и Перу, на западе — с Панамой"))
        countryItemList.add(Country("Великобритания","Лондон",R.drawable.gbr,"Великобрита́ния (русское название происходит от англ. Great Britain [ˌɡreɪt ˈbrɪtn]), или Соединённое Короле́вство (United Kingdom [jʊnaɪtɪd kɪŋdəm], сокр. UK)[19], полная официальная форма — Соединённое Короле́вство Великобрита́нии и Се́верной Ирла́ндии[19][6] (англ. The United Kingdom of Great Britain and Northern Ireland[комм 1][20]) — суверенное государство у северо-западного побережья континентальной Европы[21][22], состоящее из Англии, Уэльса, Шотландии и Северной Ирландии"))
        countryItemList.add(Country("Марокко","Рабат",R.drawable.marokko,"Маро́кко (араб. المغرب\u200E аль-Магриб, бербер. ⵍⵎⵖⵔⵉⴱ), официальное название — Короле́вство Маро́кко (араб. المملكة المغربية аль-Мамля́кату ль-Магриби́я, бербер. ⵜⴰⴳⵍⴷⵉⵜ ⵏ ⵍⵎⵖⵔⵉⴱ Такулдет н лмгриб[8]) — государство на крайнем западе Северной Африки. Столица — Рабат[9]. Омывается Средиземным морем на севере и Атлантическим океаном на западе, граничит с Алжиром на востоке и Мавританией на юге[10]. В узкой морской полосе, разделяющей Марокко и Испанию, между двумя странами находятся спорные анклавы, а именно Сеута, Мелилья и ряд островов"))
        countryItemList.add(Country("Россия","Москва",R.drawable.russia,"Росси́я, или Росси́йская Федера́ция[e] (сокр. РФ[f]), — государство в Восточной Европе и Северной Азии. Россия — крупнейшее государство в мире, её территория в конституционных границах с территорией Крыма, аннексия которого не получила международного признания, составляет 17 125 191[6] км²Перейти к разделу «#Географическое положение». Население страны в тех же границах составляет 146 980 061[10] чел. (2022; 9-е место в мире)"))
        countryItemList.add(Country("Испания","Мадрид",R.drawable.spain,"Испа́ния (исп. España, МФА: [esˈpaɲa]), официально Короле́вство Испа́ния (исп. Reino de España, МФА: [ˈreino ðe esˈpaɲa]) — трансконтинентальное суверенное государство в Южной Европе, имеющее часть территорий в Африке."))
    }
    private fun setUpAdapter()
    {
        adapter=CountryItemAdapter(this,countryItemList)
        bind.rv.adapter=adapter
        bind.rv.layoutManager=LinearLayoutManager(this)
    }
}