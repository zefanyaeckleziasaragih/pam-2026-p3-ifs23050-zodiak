package org.delcom.pam_p3_ifs23050.data

import org.delcom.pam_p3_ifs23050.R

object DummyData {
    fun getZodiacData(): List<ZodiacData> {
        return listOf(
            ZodiacData(
                nama = "Aries",
                gambar = R.drawable.img_aries,
                periode = "21 Maret – 19 April",
                elemen = "Api 🔥",
                deskripsi = "Aries adalah zodiak pertama dalam astrologi, dilambangkan dengan domba jantan. Mereka dikenal sebagai pionir yang penuh semangat dan keberanian.",
                sifat = "Berani, energik, antusias, percaya diri, dan terkadang impulsif.",
                kecocokan = "Leo, Sagitarius, Gemini"
            ),
            ZodiacData(
                nama = "Taurus",
                gambar = R.drawable.img_taurus,
                periode = "20 April – 20 Mei",
                elemen = "Tanah 🌍",
                deskripsi = "Taurus dilambangkan dengan banteng dan dikenal sebagai zodiak yang stabil, tekun, dan sangat menghargai kenyamanan serta keindahan.",
                sifat = "Sabar, dapat diandalkan, setia, keras kepala, dan menyukai kemewahan.",
                kecocokan = "Virgo, Capricorn, Cancer"
            ),
            ZodiacData(
                nama = "Gemini",
                gambar = R.drawable.img_gemini,
                periode = "21 Mei – 20 Juni",
                elemen = "Udara 💨",
                deskripsi = "Gemini dilambangkan dengan kembar dan terkenal memiliki dua sisi kepribadian. Mereka adalah komunikator ulung yang penuh rasa ingin tahu.",
                sifat = "Cerdas, adaptif, komunikatif, mudah bosan, dan suka bersosialisasi.",
                kecocokan = "Libra, Aquarius, Aries"
            ),
            ZodiacData(
                nama = "Cancer",
                gambar = R.drawable.img_cancer,
                periode = "21 Juni – 22 Juli",
                elemen = "Air 💧",
                deskripsi = "Cancer dilambangkan dengan kepiting dan dikenal sangat intuitif dan emosional. Mereka sangat menjaga hubungan keluarga dan orang-orang terdekat.",
                sifat = "Penyayang, intuitif, protektif, sensitif, dan mudah tersinggung.",
                kecocokan = "Scorpio, Pisces, Taurus"
            ),
            ZodiacData(
                nama = "Leo",
                gambar = R.drawable.img_leo,
                periode = "23 Juli – 22 Agustus",
                elemen = "Api 🔥",
                deskripsi = "Leo dilambangkan dengan singa dan merupakan sosok yang karismatik, suka menjadi pusat perhatian, dan memiliki jiwa pemimpin yang kuat.",
                sifat = "Percaya diri, dermawan, kreatif, dominan, dan dramatis.",
                kecocokan = "Aries, Sagitarius, Gemini"
            ),
            ZodiacData(
                nama = "Virgo",
                gambar = R.drawable.img_virgo,
                periode = "23 Agustus – 22 September",
                elemen = "Tanah 🌍",
                deskripsi = "Virgo dilambangkan dengan gadis perawan dan dikenal sangat analitis, perfeksionis, serta memiliki perhatian tinggi terhadap detail.",
                sifat = "Analitis, pekerja keras, praktis, kritis, dan sangat terorganisir.",
                kecocokan = "Taurus, Capricorn, Cancer"
            ),
            ZodiacData(
                nama = "Libra",
                gambar = R.drawable.img_libra,
                periode = "23 September – 22 Oktober",
                elemen = "Udara 💨",
                deskripsi = "Libra dilambangkan dengan timbangan dan mencerminkan keseimbangan, keadilan, serta harmoni. Mereka sangat menghargai hubungan yang serasi.",
                sifat = "Diplomatis, adil, sosial, menghindari konflik, dan indecisive.",
                kecocokan = "Gemini, Aquarius, Leo"
            ),
            ZodiacData(
                nama = "Scorpio",
                gambar = R.drawable.img_scorpio,
                periode = "23 Oktober – 21 November",
                elemen = "Air 💧",
                deskripsi = "Scorpio dilambangkan dengan kalajengking dan dikenal misterius, intens, dan memiliki tekad yang sangat kuat dalam setiap aspek kehidupan.",
                sifat = "Intens, setia, berani, cemburu, dan penuh misteri.",
                kecocokan = "Cancer, Pisces, Virgo"
            ),
            ZodiacData(
                nama = "Sagitarius",
                gambar = R.drawable.img_sagitarius,
                periode = "22 November – 21 Desember",
                elemen = "Api 🔥",
                deskripsi = "Sagitarius dilambangkan dengan pemanah dan dikenal sebagai jiwa petualang yang bebas, optimistis, serta haus akan pengetahuan dan pengalaman baru.",
                sifat = "Optimis, petualang, jujur, tidak sabar, dan suka kebebasan.",
                kecocokan = "Aries, Leo, Aquarius"
            ),
            ZodiacData(
                nama = "Capricorn",
                gambar = R.drawable.img_capricorn,
                periode = "22 Desember – 19 Januari",
                elemen = "Tanah 🌍",
                deskripsi = "Capricorn dilambangkan dengan kambing laut dan dikenal sebagai zodiak yang ambisius, disiplin, dan sangat bertanggung jawab terhadap tujuan hidupnya.",
                sifat = "Ambisius, disiplin, realistis, keras kepala, dan berorientasi pada tujuan.",
                kecocokan = "Taurus, Virgo, Scorpio"
            ),
            ZodiacData(
                nama = "Aquarius",
                gambar = R.drawable.img_aquarius,
                periode = "20 Januari – 18 Februari",
                elemen = "Udara 💨",
                deskripsi = "Aquarius dilambangkan dengan pembawa air dan dikenal sebagai pemikir inovatif yang humanis, unik, dan sering berada di luar kebiasaan umum.",
                sifat = "Inovatif, independen, humanis, eksentrik, dan visioner.",
                kecocokan = "Gemini, Libra, Sagitarius"
            ),
            ZodiacData(
                nama = "Pisces",
                gambar = R.drawable.img_pisces,
                periode = "19 Februari – 20 Maret",
                elemen = "Air 💧",
                deskripsi = "Pisces dilambangkan dengan dua ikan dan dikenal sebagai zodiak yang paling empatik, imajinatif, dan peka terhadap perasaan orang lain.",
                sifat = "Empatik, imajinatif, sensitif, mudah terpengaruh, dan artistik.",
                kecocokan = "Cancer, Scorpio, Taurus"
            ),
        )
    }
}