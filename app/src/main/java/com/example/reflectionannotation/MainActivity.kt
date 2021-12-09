package com.example.reflectionannotation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    @KBindTranslateView(value = R.id.button,key = "try")
    lateinit var tryButton : AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tryButton = findViewById(R.id.button)

        KViewBindTranslator.bindAndTranslate(this)

        val student = Student("isil",25,false)
        unknownInput(student)


    }

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