package com.charusat.internalpractice

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context):SQLiteOpenHelper(context, DB_NAME,null, DB_VERSION) {
    companion object {
        private var DB_NAME = "CarDetails"
        private var TB_NAME = "Car"
        private var DB_VERSION = 1
        private var CR_ID = "id"
        private var CR_NAME = "Car_Name"
        private var CR_COMPANY = "Car_Company"
        private var CR_PRICE = "Car_Price"
}


    override fun onCreate(p0: SQLiteDatabase?) {
        var query = "Create Table $TB_NAME($CR_ID Integer Primary Key AUTOINCREMENT,$CR_NAME text,$CR_COMPANY text,$CR_PRICE Integer)"
        p0?.execSQL(query);
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }

    fun Insert(car: Car): Boolean {
        var db = writableDatabase
        var cv = ContentValues()
        cv.put(CR_NAME, car.Cr_Name)
        cv.put(CR_COMPANY, car.Cr_Company)
        cv.put(CR_PRICE, car.Cr_Price)
        var flag = db.insert(TB_NAME, null, cv)
        return flag>0
    }

}