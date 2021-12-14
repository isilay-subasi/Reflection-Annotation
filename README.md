# Reflection-Annotation

## Reflection Nedir ? 
Reflection(Yansıma), çalışma zamanında programınızın yapısını incelemenize olanak tanıyan bir dizi dil ve kitaplık özelliğidir.Nesnelerin sınıf, method, değişken ve diğer özelliklerine ulaşmamıza yardımcı olur.<br>
<hr>
 <img src="https://github.com/isilay-subasi/Reflection-Annotation/blob/main/images/evaluate1.PNG" width="500" />
  <img src="https://github.com/isilay-subasi/Reflection-Annotation/blob/main/images/evaluate2.PNG" width="500" />
<hr>

## Annotation Nedir ? 
Annotation, Java'da method,sınıf ve değişkenlere özellik katmak için kullanılan yapılardır. Üst bilgi olarak düşünebiliriz. Örneğin; @Override , @Deprecated. 

Nerelerde kullanılır ? 

+ CLASS - Sınıf başlarında
+ PROPERTY, FIELD - Özelliklerin başında
+ LOCAL_VARIABLE - Yerel değişkenlerin başında
+ CONSTRUCTOR - Constructorların başında
+ FUNCTION - Methodların başında
+ VALUE_PARAMETER - Constructor ve methodların başlarında

## Örnek Uygulama
Ekranda bir Button ve TextView olacak. Bu componentlerdeki yazılar telefonun diline göre değişmesi için reflection ve annotationlar kullanılarak yapılacaktır.

İhtiyacımız olan sınıflar ; <br>

+ Bize belirlediğimiz anahtar sözcüklere İngilizce ve Türkçe anlamlarını verecek olan bir json sınıfı
+ Özel bir annotation sınıfı
+ Reflection kullanarak annotation bilgilerine ulaşıp, arka planda findViewById uygulayacak bir sınıf
+ MainActivity <br>

## TrasnlateJson Class

Bu sınıf bizlere, anahtar sözcük ve telefonun diline göre İngilizce veya Türkçe olarak ekran gösterilecek mesajları içeren <b>JSONObject</b>    sağlayacaktır. Örneğin biz uygulamada “try” anahtar sözcüğünün mesajını İngilizce olarak butonda göstermek isteyeceğiz.


 ## KBindTranslateView Annotation Class

 Bu sınıf bizim oluşturduğumuz özel bir annotation sınıfıdır. Bu annotation sınıfını propertylerde (FIELD) üst bilgi olarak kullanacağız. Value -viewların idleri-, Key -bu viewda göstereceğimiz mesaj- bilgilerini gireceğiz. Annotation sınıfının bilgilerine ise çalışma zamanında (RUNTIME) ulaşabileceğiz.

 + Yani ben MainActivity de bir view tanımlayacağım örneğin Button. Bu viewa annotation olarak KBindTranslateView ekleyeceğim. Eklerken de bind etmek için value olarak “R.id.btn_try”, İngilizce veya Türkçe mesajı seçmek için key olarak “try” bilgilerini ayarlayacağım.

 ## KViewBindTranslator Class
 Bu sınıf bindAndTranslate methoduna sahiptir. Bu method, parametre olarak KBindTranslateView annotationlarını kullandığımız activity objesini alır.
 



