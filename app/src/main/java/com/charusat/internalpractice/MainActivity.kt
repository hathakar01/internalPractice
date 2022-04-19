package com.charusat.internalpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnInsert.setOnClickListener {
            var name=edtCarName.text.toString()
            var company=edtCarCom.text.toString()
            var price=edtcarPrice.text.toString().toInt()
            var car=Car(name,company,price)
            var db=DBHelper(this)
            var flag = db.Insert(car)
            if (flag)
            {
                Toast.makeText(this,"Recored inserted Sussesfully!",Toast.LENGTH_SHORT).show()
            }

        }
    }
}