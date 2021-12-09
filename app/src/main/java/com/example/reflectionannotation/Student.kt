package com.example.reflectionannotation

import android.util.Log

//name,number,hardWorking -> properties
class Student( private val name : String,
               private val number : Int,
               private val hardWorking : Boolean) {

   public fun showName(){
       Log.i("student",name)
   }

  public fun showNumber(){
      Log.i("student","$number")
  }

  public fun isHardWorking(){
      Log.i("student","Hardworking ?: ${if(hardWorking) "Yes" else "No"}" )
  }



}