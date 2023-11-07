package com.boukouch.tp3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // Move this line to the beginning

        setContentView(R.layout.activity_main) // Set the content view first

        var input = findViewById<TextView>(R.id.input)
        var output = findViewById<TextView>(R.id.output)
        var button_clear = findViewById<Button>(R.id.button_clear)
        var button_division = findViewById<Button>(R.id.button_division)
        var button_produit = findViewById<Button>(R.id.button_produit)
        var button_somme = findViewById<Button>(R.id.button_somme)
        var button_ssoustraction = findViewById<Button>(R.id.button_ssoustraction)
        var button_0 = findViewById<Button>(R.id.button_0)
        var button_1 = findViewById<Button>(R.id.button_1)
        var button_2 = findViewById<Button>(R.id.button_2)
        var button_3 = findViewById<Button>(R.id.button_3)
        var button_4 = findViewById<Button>(R.id.button_4)
        var button_5 = findViewById<Button>(R.id.button_5)
        var button_6 = findViewById<Button>(R.id.button_6)
        var button_7 = findViewById<Button>(R.id.button_7)
        var button_8 = findViewById<Button>(R.id.button_8)
        var button_9 = findViewById<Button>(R.id.button_9)
        var button_point = findViewById<Button>(R.id.button_point)
        var button_egale = findViewById<Button>(R.id.button_egale)
        var button_braket_left = findViewById<Button>(R.id.button_braket_left)
        var button_braket_right = findViewById<Button>(R.id.button_braket_right)

        fun add_to_input(button_txt:String) {
            input.text = "${input.text}$button_txt";
        }

        fun resulta(){

        }

        button_clear.setOnClickListener {
            input.text = " "
            output.text = " "
        }
        button_braket_left.setOnClickListener {
            add_to_input("(")
        }
        button_braket_right.setOnClickListener {
            add_to_input(")")
        }

        button_0.setOnClickListener {
            add_to_input("0")
        }
        button_1.setOnClickListener {
            add_to_input("1")
        }
        button_2.setOnClickListener {
            add_to_input("2")
        }
        button_3.setOnClickListener {
            add_to_input("3")
        }
        button_4.setOnClickListener {
            add_to_input("4")
        }
        button_5.setOnClickListener {
            add_to_input("5")
        }
        button_6.setOnClickListener {
            add_to_input("6")
        }
        button_7.setOnClickListener {
            add_to_input("7")
        }
        button_8.setOnClickListener {
           add_to_input("8")
        }
        button_9.setOnClickListener {
            add_to_input("9")
        }
        button_point.setOnClickListener {
            add_to_input(".")
        }
        button_somme.setOnClickListener {
            add_to_input("+")
        }
        button_ssoustraction.setOnClickListener {
            add_to_input("-")
        }
        button_produit.setOnClickListener {
            add_to_input("*")
        }
        button_division.setOnClickListener {
            add_to_input("/")
        }
    }
}
