package com.example.intentvariant4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch

public lateinit var btn : Button
public lateinit var swt : Switch
public lateinit var Name : EditText
public lateinit var Surname : EditText
public lateinit var Patronymic : EditText
public lateinit var Number : EditText
public lateinit var Email : EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.Log_Button)
        swt = findViewById(R.id.switch2)
        Name = findViewById(R.id.editTextTextPersonName4)
        Surname = findViewById(R.id.editTextTextPersonName)
        Patronymic = findViewById(R.id.editTextTextPersonName2)
        Number = findViewById(R.id.editTextTextPersonName5)
        Email = findViewById(R.id.editTextTextPersonName6)
        btn.isEnabled = false
        Name.setOnClickListener {
            if(Name.text.toString()!=""&& Surname.text.toString()!=""&& Patronymic.text.toString()!=""&&Number.text.toString()!=""&&Email.text.toString()!="")
            {
                btn.isEnabled=true
            }
            else
            {
                btn.isEnabled=false
            }
        }
        Surname.setOnClickListener{
            if(Name.text.toString()!=""&& Surname.text.toString()!=""&& Patronymic.text.toString()!=""&&Number.text.toString()!=""&&Email.text.toString()!="")
            {
                btn.isEnabled=true
            }
            else
            {
                btn.isEnabled=false
            }
        }
        Patronymic.setOnClickListener{
            if(Name.text.toString()!=""&& Surname.text.toString()!=""&& Patronymic.text.toString()!=""&&Number.text.toString()!=""&&Email.text.toString()!="")
            {
                btn.isEnabled=true
            }
            else
            {
                btn.isEnabled=false
            }
        }
        Number.setOnClickListener {
            if(Name.text.toString()!=""&& Surname.text.toString()!=""&& Patronymic.text.toString()!=""&&Number.text.toString()!=""&&Email.text.toString()!="")
            {
                btn.isEnabled=true
            }
            else
            {
                btn.isEnabled=false
            }
        }
        Email.setOnClickListener {
            if(Name.text.toString()!=""&& Surname.text.toString()!=""&& Patronymic.text.toString()!=""&&Number.text.toString()!=""&&Email.text.toString()!="")
            {
                btn.isEnabled=true
            }
            else
            {
                btn.isEnabled=false
            }
        }


        btn.setOnClickListener {
            val gender: String
            if(swt.isChecked==false)
            {
                gender = "М"
            }
            else{
                gender = "Ж"
            }
            if(gender=="М")
            {
                val intent = Intent(this, AnotherActivity::class.java)
                intent.putExtra("data", "М")
                startActivity(intent)
            }
            else if(gender=="Ж")
            {
                val intent = Intent(this, AnotherActivity::class.java)
                intent.putExtra("data", "Ж")
                startActivity(intent)
            }
        }
    }
}