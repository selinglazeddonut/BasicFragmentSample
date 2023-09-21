package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //changeFragment(FragmentOne()) eğer başlangıçta fragment çağırmak istersek istenilen fragmenti
        // burada çağırabiliriz

        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        button1.setOnClickListener {
            changeFragment(FragmentOne())
        }

        button2.setOnClickListener {
            changeFragment(FragmentTwo())


        }
        button3.setOnClickListener {
            changeFragment(FragmentThree())
        }

    }

    fun changeFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()

    }

}
