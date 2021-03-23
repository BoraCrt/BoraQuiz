package com.example.quizapp

object Constants{
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<Question>{
        val questionsList=ArrayList<Question>()
        //(hepsinin burada belirtilibelir.)listOf(Question())

        // 1
        val que1=Question(1,
            "Radyatörde suyun azalmasının sebebi aşağıdakilerden hangisidir?",
            R.drawable.carradiotor,
            "Termostat arızalıdır.",
            " Vantilatör kayışı sıkıdır.",
            "Hararet (ısı) göstergesi arızalıdır.",
            " Silindir kapak contasında kaçak vardır.",
            4
        )
        questionsList.add(que1)
        // 2
        val que2 = Question(
            2, "Araçta çalışmayan bir elektrik sistemi olduğu zaman ilk kontrol edilmesi gereken yer aşağıdakilerden hangisidir?",
            R.drawable.sigortakk,
            "Fan motoru", " Far anahtarı",
            " Sigorta kutusu", "Yakıt göstergesi", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Otomobillerin trafiğe çıkarılabilmesi için aşağıdakilerden hangisinin yaptırılması zorunludur?",
            R.drawable.arabasigorta,
            "Zorunlu mali sorumluluk sigortasının", "Koltuk ferdi kaza sigortasının",
            "Kasko sigortasının",   "Aracın bakımının", 1
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Araçlarda hava filtresi kirli ise aşağıdakilerden hangisi olur?",
            R.drawable.filtre4,
            "Motor az yağ yakar.", "Motorun gücü artar.",
            "Motor çok yağ yakar.", "Motorun gücü azalır.", 4
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "El freni teli kopmuş ise aşağıdakilerden hangisi olur?",
            R.drawable.elfo5,
            "Fren pedal boşluğu artar.", "Fren sistemi hava yapar.",
            "Kampana aşınır.", "El freni tutmaz.", 4
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Şekildeki trafik işareti aşağıdakilerden hangisini bildirir?",
            R.drawable.egim,
            "Kasisli yolu", "Eğimli Yolu",
            "Açılan Köprüye Yaklaştığını", "Mıcırlı Yolun Bulunduğunu", 2
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Şekildeki trafik işareti aşağıdakilerden hangisini bildirir?",
            R.drawable.soladon,
            "Dönel Kavşak Yaklaşımını", "İleri ve Sola Mecburi Yön",
            "Sağa ve Sola Mecburi Yön", "Ada Etrafında Dönüş", 2
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Şekildeki trafik işareti aşağıdakilerden hangisini bildirir?",
            R.drawable.takipmesafe,
            "70M Sonra Yolun Daralacağını", "70M Sonra Park Alanı",
            "Saatteki Hızın 70KM Olduğu", "Takip Mesafesinin En z 70M Olduğu", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Şekildeki trafik işareti aşağıdakilerden hangisini bildirir?",
            R.drawable.kontrolsuz9,
            "Dönel Kavşak", "Kontrolsüz Kavşak",
            "Demir Yolu Geçidi", "Tali Yol Kavşağı", 2
        )

        questionsList.add(que9)
        // 10
        val que10 = Question(
            10, "Şekildeki trafik işareti aşağıdakilerden hangisini bildirir?",
            R.drawable.traktor10,
            "Traktörün Geçebileceğini", "Traktörün Giremeyeceğini",
            "Traktör Parkı", "Sadece Traktörün Girebileceği", 2
        )

        questionsList.add(que10)
        return questionsList

    }
}