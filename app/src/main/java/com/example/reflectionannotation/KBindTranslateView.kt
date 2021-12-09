package com.example.reflectionannotation

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD) // Nerde kullanmak istiyorum, işaretlemek
annotation class KBindTranslateView(val value : Int,val key : String ) {




}