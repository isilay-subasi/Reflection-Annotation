package com.example.reflectionannotation

@Retention(AnnotationRetention.RUNTIME)//Çalışma zamanı erişeceğmi bildirmek için kullandık
@Target(AnnotationTarget.FIELD) // Nerde kullanmak istiyorum, işaretlemek, kullanılacak yerleri belirlemek için
annotation class KBindTranslateView(val value : Int,val key : String ) //Alacağı parametreleri belirttik.
{




}