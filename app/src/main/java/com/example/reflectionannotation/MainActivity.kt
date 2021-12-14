package com.example.reflectionannotation

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {

    @KBindTranslateView(value = R.id.textView, key = "fail_message")
   lateinit var tryText : TextView

    @KBindTranslateView(value = R.id.button,key = "try")
    lateinit var tryButton : AppCompatButton

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tryButton = findViewById(R.id.button)

        KViewBindTranslator.bindAndTranslate(this)

        val student = Student("isil",25,false)
        unknownInput(student)


    }

    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("LongLogTag")
    fun unknownInput(input : Any){

        //gelen inputu java classa çevirdim.
        val sampleClass =input.javaClass


        Log.d("Ref_Name",sampleClass.name)//class name
        Log.d("Ref_SimpleName",sampleClass.simpleName)//simple name

        Log.d("Ref_IsArray","${sampleClass.isArray}")//bu class array mi ?
        Log.d("Ref_IsInterface","${sampleClass.isInterface}")//bu class interface mi?

        Log.d("Ref_Constructors_Count","${sampleClass.constructors.size}")//constructor size ?
        Log.d("Ref_Constructors_Param_Count","${sampleClass.constructors[0].parameterCount}")//ilk constructorın parametre sayısı ?

        for(declaredField in sampleClass.declaredFields)
            Log.d("Ref_DeclaredField_Name",declaredField.name)

        for(declaredMethod in sampleClass.declaredMethods)
            Log.d("Ref_DeclaredField_Method_Name",declaredMethod.name)
    }


}