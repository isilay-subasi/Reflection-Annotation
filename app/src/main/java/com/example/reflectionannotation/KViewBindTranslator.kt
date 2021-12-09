package com.example.reflectionannotation

import android.app.Activity
import android.widget.TextView
import java.util.*

object KViewBindTranslator {

    fun bindAndTranslate(target : Activity){

        val language = Locale.getDefault().language
        val Json = TrasnlateJson().getTranslateJson()

        for (field in target.javaClass.declaredFields){
            val currentAnnotaton = field.getAnnotation(KBindTranslateView::class.java)
            //annotation boş değilse:
            currentAnnotaton.let {
                val translateMessage=Json.getJSONObject(it.key).getString(language)//key olarak tanımladığım try gelmiş olacak.

                field.set(target,target.findViewById(it.value))
                if(TextView::class.java.isAssignableFrom(field.type)){
                    (target.findViewById(currentAnnotaton.value) as TextView)
                        .text=translateMessage
                }
            }


        }

    }


}