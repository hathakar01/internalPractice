package com.charusat.internalpractice

data class Car(var Cr_Name:String,var Cr_Company:String,var Cr_Price:Int )
{
    var id:Int=0
    constructor(id:Int,Cr_Name: String,Cr_Company: String,Cr_Price: Int)
            :this(Cr_Name,Cr_Company,Cr_Price)
    {
        this.id=id
    }
}