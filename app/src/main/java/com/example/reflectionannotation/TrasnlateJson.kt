package com.example.reflectionannotation

import org.json.JSONObject

class TrasnlateJson {

    private fun provideTranslateString() : String{
        return "{\n" +
                "  \"try\": {\n" +
                "    \"tr\": \"Dene\",\n" +
                "    \"en\": \"Try\"\n" +
                "  },\n" +
                "  \"play_again\": {\n" +
                "    \"tr\": \"Tekrar Oyna\",\n" +
                "    \"en\": \"Play Again\"\n" +
                "  },\n" +
                "  \"exit\": {\n" +
                "    \"tr\": \"Çıkış Yap\",\n" +
                "    \"en\": \"Exit\"\n" +
                "  },\n" +
                "  \"successful_message\": {\n" +
                "    \"tr\": \"Tebrikler bildiniz!\",\n" +
                "    \"en\": \"Congratulations!\"\n" +
                "  },\n" +
                "  \"fail_message\": {\n" +
                "    \"tr\": \"Bilemediniz, tekrar deneyin!\",\n" +
                "    \"en\": \"You can be better, play again!\"\n" +
                "  }\n" +
                "}"

    }


    fun getTranslateJson() : JSONObject{
        return JSONObject((this.provideTranslateString()))
    }
}