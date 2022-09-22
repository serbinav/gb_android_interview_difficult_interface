package com.example.difficultinterface

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.difficultinterface.databinding.ActivityMainBinding

//Напишите приложение, которое состоит из двух экранов, с табами снизу.
// На первом табе приложение должно показывать список из трех секций,
// данные можно брать из какого-то мокового источника
//(можно для этого использовать гитхаб, например, или файлы, или создание
//объектов из кода), либо из открытых API
// (https://courses.edx.org/api-docs/).
//● В первой секции оповещение с таймером до начала экзаменов;
//● Во второй секции горизонтальный список с уроками на день,
//при этом скролл должен находится на ближайшем или текущем уроке;
//● В третьей секции горизонтальный список домашних заданий с кратким
//описанием ДЗ и временем до сдачи ДЗ.

//На втором табе приложение должно показывать расписание уроков в
//хронологическом порядке (черные карточки) и
//информации о дополнительных занятиях (зеленая карточка).
// При тапе на карточку, у которой есть шеврон Open In справа —
// нужно открывать Скайп. Остальные табы могут
//быть либо некликабельные, либо с полноэкранной заглушкой.
// Реализация поиска и фильтра — по желанию.
//Выбор архитектуры и библиотек остается за вами, но желательно
// использовать SOLID, Clean, MVVM или MVP, MVI. Будет плюсом DI
// (Koin, Dagger, Toothpick). Наличие тестов будет плюсом. Дизайн
//не обязательно должен быть как на макетах, но желательно.

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)

        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home,
                R.id.navigation_class,
                R.id.navigation_list,
                R.id.navigation_star
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}