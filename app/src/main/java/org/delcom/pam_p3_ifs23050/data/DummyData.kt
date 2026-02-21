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
                deskripsi = "Aries adalah zodiak pertama dalam lingkaran astrologi, dilambangkan oleh domba jantan yang gagah berani. Sebagai tanda pertama, Aries membawa energi permulaan, keberanian, dan semangat yang membara ke dalam segala aspek kehidupan. Mereka adalah jiwa-jiwa yang tidak takut melangkah ke wilayah yang belum pernah dijelajahi, selalu menjadi yang terdepan dalam setiap petualangan baru.\n\nDikuasai oleh planet Mars — planet perang dan tindakan — Aries memiliki dorongan kompetitif yang sangat kuat. Mereka hidup di momen saat ini, bertindak berdasarkan naluri, dan jarang berpikir terlalu panjang sebelum melompat ke dalam situasi baru. Ini bisa menjadi kekuatan besar, tetapi juga kelemahan yang perlu dikelola dengan bijaksana.",
                sifat = "Berani dan tanpa rasa takut menghadapi tantangan apapun. Energik dan selalu penuh semangat yang membara. Antusias dalam memulai hal-hal baru meski sulit menyelesaikannya. Percaya diri tinggi dan terkadang terkesan sombong. Impulsif dan cepat mengambil keputusan berdasarkan naluri. Kompetitif dan selalu ingin menjadi yang terbaik di bidangnya. Jujur dan blak-blakan tanpa basa-basi.",
                kecocokan = "Leo dan Sagitarius (sesama elemen Api — energi yang saling mengobarkan semangat). Gemini (udara menyulut api — komunikasi lincah Gemini membuat Aries selalu tertarik). Aquarius (keunikan dan kebebasan Aquarius memikat jiwa petualang Aries)."
            ),
            ZodiacData(
                nama = "Taurus",
                gambar = R.drawable.img_taurus,
                periode = "20 April – 20 Mei",
                elemen = "Tanah 🌍",
                deskripsi = "Taurus adalah zodiak kedua, dilambangkan oleh banteng yang kuat dan tangguh. Dikuasai oleh planet Venus — planet cinta, keindahan, dan kemewahan — Taurus memiliki selera yang sangat tinggi terhadap hal-hal indah dalam kehidupan. Mereka adalah penikmat sejati: dari makanan terbaik, musik yang menyentuh hati, hingga lingkungan yang nyaman dan estetis.\n\nSebagai tanda Tanah, Taurus berpijak kuat di bumi. Mereka adalah orang-orang yang stabil, dapat diandalkan, dan memiliki kesabaran yang luar biasa. Namun jangan salah artikan ketenangan mereka sebagai kelemahan — seperti banteng, ketika Taurus telah memutuskan sesuatu, hampir tidak ada kekuatan di dunia ini yang mampu mengubah pendirian mereka.",
                sifat = "Sabar dan teguh dalam menghadapi situasi apapun. Dapat diandalkan dan selalu menepati janji yang diucapkan. Setia dalam hubungan dan persahabatan jangka panjang. Keras kepala dan sangat sulit diubah pendiriannya. Menyukai kemewahan, kenyamanan, dan segala hal yang indah. Praktis dan realistis dalam setiap pengambilan keputusan. Sensitif terhadap keindahan seni dan alam sekitar.",
                kecocokan = "Virgo dan Capricorn (sesama elemen Tanah — fondasi kokoh dan pemahaman yang mendalam). Cancer (air menyuburkan tanah — kelembutan Cancer membuat Taurus merasa aman). Pisces (keromantisan Pisces melengkapi sisi sensual dan penuh perasaan Taurus)."
            ),
            ZodiacData(
                nama = "Gemini",
                gambar = R.drawable.img_gemini,
                periode = "21 Mei – 20 Juni",
                elemen = "Udara 💨",
                deskripsi = "Gemini adalah zodiak ketiga yang dilambangkan oleh si Kembar — Castor dan Pollux dari mitologi Yunani. Simbol kembar ini mencerminkan sifat Gemini yang multifaset: mereka dapat menunjukkan wajah yang berbeda-beda tergantung situasi, membuat orang lain kadang merasa sulit untuk benar-benar mengenal mereka secara mendalam.\n\nDikuasai oleh Merkurius — planet komunikasi dan kecerdasan — Gemini adalah komunikator ulung yang dapat berbicara tentang hampir semua topik dengan cerdas dan mengasyikkan. Pikiran mereka bergerak sangat cepat, lompat dari satu ide ke ide lain seperti kupu-kupu yang hinggap dari bunga ke bunga. Mereka adalah pelajar seumur hidup yang tak pernah berhenti haus akan ilmu.",
                sifat = "Cerdas dan mampu berpikir cepat dalam berbagai situasi kompleks. Adaptif dan sangat mudah menyesuaikan diri dengan lingkungan baru. Komunikatif dan pandai bercerita dengan cara yang menarik. Mudah bosan jika rutinitas terlalu monoton dan tidak ada tantangan. Rasa ingin tahu yang sangat tinggi terhadap segala hal di sekitarnya. Fleksibel namun terkadang kurang konsisten. Humoris dan selalu menyenangkan untuk diajak bergaul.",
                kecocokan = "Libra dan Aquarius (sesama elemen Udara — percakapan tak pernah membosankan). Aries (semangat Aries memberi arah bagi energi Gemini yang melimpah ruah). Leo (keceriaan dan kreativitas yang saling menginspirasi satu sama lain setiap harinya)."
            ),
            ZodiacData(
                nama = "Cancer",
                gambar = R.drawable.img_cancer,
                periode = "21 Juni – 22 Juli",
                elemen = "Air 💧",
                deskripsi = "Cancer adalah zodiak keempat yang dilambangkan oleh kepiting — makhluk yang membawa rumahnya ke mana-mana dan terlindungi oleh cangkang keras. Ini adalah metafora sempurna untuk Cancer: di balik eksterior yang terkesan keras dan defensif, tersembunyi hati yang paling lembut dan paling penuh kasih sayang di seluruh zodiak.\n\nDikuasai oleh Bulan — benda langit yang mengatur pasang surut air laut dan siklus emosi — Cancer sangat sensitif terhadap perubahan suasana dan energi di sekitar mereka. Mereka adalah empath alami yang dapat merasakan perasaan orang lain bahkan sebelum kata-kata terucap. Rumah dan keluarga adalah segalanya bagi Cancer.",
                sifat = "Penyayang dan penuh perhatian terhadap semua orang terdekat. Intuitif dan sangat peka terhadap perasaan orang lain. Protektif dan rela berkorban apapun untuk keluarga. Sensitif dan mudah terlukai oleh kata-kata kasar meski disengaja atau tidak. Nostalgis dan sangat menghargai setiap kenangan indah. Moody dan suasana hatinya bisa berubah dengan cepat seperti pasang surut. Kreatif dengan imajinasi yang sangat kaya dan mendalam.",
                kecocokan = "Scorpio dan Pisces (sesama elemen Air — kedalaman emosi yang saling memahami). Taurus (kestabilan dan kesetiaan Taurus memberikan rasa aman yang sangat dibutuhkan Cancer). Virgo (kepedulian Virgo yang praktis dan tulus melengkapi kebutuhan emosional Cancer)."
            ),
            ZodiacData(
                nama = "Leo",
                gambar = R.drawable.img_leo,
                periode = "23 Juli – 22 Agustus",
                elemen = "Api 🔥",
                deskripsi = "Leo adalah zodiak kelima yang dilambangkan oleh Singa — raja hutan yang agung dan berwibawa. Tidak ada zodiak lain yang memancarkan kehadiran sekuat Leo. Ketika mereka memasuki sebuah ruangan, semua mata secara alami tertuju pada mereka — dan Leo pun menikmati setiap detik perhatian tersebut sepenuh hati.\n\nDikuasai oleh Matahari — pusat tata surya yang memberi cahaya dan kehidupan — Leo memancarkan kehangatan, vitalitas, dan energi positif yang dapat dirasakan oleh semua orang di sekitar mereka. Mereka adalah pemimpin alami yang karismatik, dengan hati yang mulia dan semangat membara untuk melindungi dan menginspirasi orang-orang yang mereka cintai. Kreativitas Leo tidak ada tandingannya di antara semua zodiak.",
                sifat = "Percaya diri dan memiliki kehadiran yang sangat kuat di mana pun berada. Dermawan dan senang berbagi kebahagiaan dengan orang lain. Kreatif dengan bakat seni yang sangat menonjol dan alami. Dominan dan selalu ingin memegang kendali sebagai pemimpin. Dramatis dan terkadang berlebihan dalam bereaksi terhadap sesuatu. Loyal dan sangat protektif terhadap orang-orang tersayang. Ambisius dengan standar kesuksesan yang selalu tinggi.",
                kecocokan = "Aries dan Sagitarius (sesama elemen Api — saling menyulut semangat dan petualangan baru). Gemini (kecerdasan Gemini membuat Leo selalu terpukau dan tidak pernah bosan). Libra (keseimbangan dan keanggunan Libra melengkapi keagungan Leo dengan sempurna indah)."
            ),
            ZodiacData(
                nama = "Virgo",
                gambar = R.drawable.img_virgo,
                periode = "23 Agustus – 22 September",
                elemen = "Tanah 🌍",
                deskripsi = "Virgo adalah zodiak keenam yang dilambangkan oleh Sang Perawan yang membawa gandum — simbol kemurnian, pelayanan, dan hasil kerja keras yang nyata. Virgo adalah perfeksionis sejati di antara semua zodiak. Mata mereka yang tajam mampu menangkap detail-detail terkecil yang luput dari perhatian siapapun.\n\nDikuasai oleh Merkurius — planet kecerdasan dan analisis — Virgo memiliki pikiran yang analitis dan sangat sistematis. Mereka adalah pemecah masalah yang luar biasa, mampu memilah-milah situasi paling kompleks menjadi langkah-langkah praktis. Meski sering dianggap terlalu kritis, sebenarnya Virgo melakukannya karena mereka benar-benar peduli dan ingin yang terbaik untuk semua orang di sekitarnya.",
                sifat = "Analitis dan mampu melihat masalah dari berbagai sudut pandang berbeda. Pekerja keras yang tidak mudah menyerah meski dalam kondisi sulit. Praktis dan selalu mencari solusi nyata yang dapat langsung diterapkan. Kritis terhadap diri sendiri maupun orang lain demi perbaikan. Sangat terorganisir dan menyukai keteraturan dalam setiap aspek. Pemalu namun sangat setia kepada sahabat sejati. Peduli kesehatan dan menjalani gaya hidup yang sehat.",
                kecocokan = "Taurus dan Capricorn (sesama elemen Tanah — saling menghargai kerja keras dan dedikasi). Cancer (kelembutan dan kepedulian Cancer melelehkan sisi kritis Virgo yang keras). Scorpio (kedalaman dan intensitas Scorpio membuat Virgo merasa tertantang secara intelektual)."
            ),
            ZodiacData(
                nama = "Libra",
                gambar = R.drawable.img_libra,
                periode = "23 September – 22 Oktober",
                elemen = "Udara 💨",
                deskripsi = "Libra adalah zodiak ketujuh yang dilambangkan oleh Timbangan — satu-satunya simbol zodiak yang berupa benda mati, bukan makhluk hidup. Ini mencerminkan esensi Libra yang paling dalam: pencarian tanpa henti akan keseimbangan, keadilan, dan harmoni dalam segala aspek kehidupan. Bagi Libra, dunia yang adil dan indah adalah prioritas utama.\n\nDikuasai oleh Venus — planet cinta dan keindahan — Libra memiliki selera estetika yang sangat tinggi dan kepekaan mendalam terhadap keindahan dalam seni, musik, dan hubungan antarmanusia. Mereka adalah diplomat ulung, selalu mencari titik tengah dalam setiap konflik, dan sangat mahir dalam membangun jembatan antara pihak-pihak yang berseberangan pandangan.",
                sifat = "Diplomatis dan mampu melihat kedua sisi dari setiap argumen secara objektif. Adil dan selalu memperjuangkan kebenaran dengan penuh keyakinan. Sosial dan sangat menikmati interaksi bermakna dengan orang lain. Menghindari konflik dan lebih suka mencari jalan damai. Indecisive dan terkadang sangat sulit membuat keputusan penting. Charming dan mudah disukai oleh hampir semua orang. Idealis dalam hal hubungan cinta dan persahabatan sejati.",
                kecocokan = "Gemini dan Aquarius (sesama elemen Udara — percakapan mendalam yang tak pernah berakhir). Leo (kemewahan dan drama Leo membuat Libra kagum dan terinspirasi setiap hari). Sagitarius (kebebasan dan petualangan Sagitarius memberikan angin segar bagi Libra)."
            ),
            ZodiacData(
                nama = "Scorpio",
                gambar = R.drawable.img_scorpio,
                periode = "23 Oktober – 21 November",
                elemen = "Air 💧",
                deskripsi = "Scorpio adalah zodiak kedelapan yang dilambangkan oleh Kalajengking — makhluk yang misterius, berbahaya jika diprovokasi, namun memiliki keindahan tersendiri yang sulit diabaikan. Dari semua zodiak, Scorpio adalah yang paling intens, paling dalam, dan paling kompleks dalam seluruh spektrum kepribadian.\n\nDikuasai oleh Pluto — planet transformasi, kekuasaan, dan hal-hal tersembunyi — Scorpio memiliki kemampuan unik untuk menembus permukaan dan melihat kebenaran di balik segala sesuatu. Mereka adalah detektif alami yang mampu membaca orang lain seperti membaca buku terbuka. Scorpio mengalami segalanya secara total: ketika mereka mencintai, mereka mencintai sepenuh jiwa; ketika mereka marah, kemarahan itu bisa sangat dalam dan tersimpan sangat lama.",
                sifat = "Intens dan menjalani setiap aspek kehidupan dengan penuh passion yang membara. Setia sampai mati kepada orang-orang yang benar-benar dicintai. Berani menghadapi kebenaran yang paling gelap dan menyakitkan sekalipun. Cemburu dan possesif dalam hubungan romantis yang serius. Penuh misteri dan sangat sulit untuk benar-benar dikenal orang lain. Intuisi setajam radar yang hampir tidak pernah salah. Berambisi tinggi dan tidak pernah mudah menyerah.",
                kecocokan = "Cancer dan Pisces (sesama elemen Air — kedalaman emosi yang saling memahami tanpa kata). Virgo (ketelitian Virgo mengimbangi intensitas Scorpio dengan cara yang sempurna). Capricorn (ambisi dan tekad kuat keduanya saling memperkuat dalam mencapai setiap tujuan)."
            ),
            ZodiacData(
                nama = "Sagitarius",
                gambar = R.drawable.img_sagitarius,
                periode = "22 November – 21 Desember",
                elemen = "Api 🔥",
                deskripsi = "Sagitarius adalah zodiak kesembilan yang dilambangkan oleh Pemanah Kentaur — setengah manusia setengah kuda yang melepaskan panah ke arah cakrawala tak terbatas. Ini adalah simbol sempurna dari jiwa Sagitarius: selalu menatap ke depan, selalu mengincar target baru yang lebih jauh, selalu haus akan kebebasan dan eksplorasi tanpa batas.\n\nDikuasai oleh Jupiter — planet ekspansi, keberuntungan, dan filsafat — Sagitarius adalah penjelajah filosofis yang tidak pernah puas hanya dengan pengetahuan permukaan. Mereka ingin memahami makna terdalam dari segala sesuatu: mengapa kita ada di sini, apa tujuan hidup, dan bagaimana berbagai kebudayaan dunia menjawab pertanyaan-pertanyaan besar tersebut. Optimisme mereka bisa sangat menular bagi siapa pun.",
                sifat = "Optimis dan selalu melihat sisi terang dalam setiap situasi yang dihadapi. Petualang sejati yang tak pernah lelah haus akan pengalaman baru. Jujur bahkan hingga terkadang terkesan terlalu blak-blakan. Tidak sabar dan sangat sulit duduk diam terlalu lama. Menyukai kebebasan mutlak dan sangat anti dikekang. Filosofis dan suka merenungkan pertanyaan-pertanyaan besar kehidupan. Murah hati dan senang berbagi pengetahuan kepada semua orang.",
                kecocokan = "Aries dan Leo (sesama elemen Api — petualangan dan semangat yang saling mengobarkan). Aquarius (inovasi Aquarius memberi dimensi baru yang menarik bagi eksplorasi Sagitarius). Libra (keseimbangan Libra memberikan anchor yang sangat dibutuhkan Sagitarius yang bebas)."
            ),
            ZodiacData(
                nama = "Capricorn",
                gambar = R.drawable.img_capricorn,
                periode = "22 Desember – 19 Januari",
                elemen = "Tanah 🌍",
                deskripsi = "Capricorn adalah zodiak kesepuluh yang dilambangkan oleh Kambing Laut — makhluk mitologis yang mampu mendaki puncak gunung tertinggi sekaligus menyelami kedalaman samudra. Ini mencerminkan kemampuan luar biasa Capricorn untuk mencapai puncak dalam dunia nyata sambil tetap memahami dimensi yang lebih dalam.\n\nDikuasai oleh Saturnus — planet disiplin, tanggung jawab, dan waktu — Capricorn adalah arsitek kehidupan yang paling terencana di antara semua zodiak. Mereka memahami bahwa kesuksesan sejati dibangun satu bata demi satu bata, dengan kesabaran dan kerja keras yang konsisten selama bertahun-tahun penuh dedikasi. Tidak ada jalan pintas dalam kamus Capricorn — hanya tekad dan komitmen tanpa goyah.",
                sifat = "Ambisius dengan rencana jangka panjang yang sangat matang dan terstruktur. Disiplin luar biasa dan mampu menahan godaan demi tujuan akhir. Realistis dan tidak mudah terbawa angan-angan yang tidak berdasar. Keras kepala ketika sudah yakin dengan suatu keputusan penting. Bertanggung jawab penuh dan dapat diandalkan dalam situasi apapun. Bijaksana yang sering melebihi usianya sendiri. Loyal tinggi kepada keluarga dan sahabat-sahabat sejati.",
                kecocokan = "Taurus dan Virgo (sesama elemen Tanah — saling menghargai kerja keras dan stabilitas hidup). Scorpio (ambisi dan intensitas keduanya menciptakan partnership yang sangat powerful). Cancer (kelembutan Cancer menghangatkan sisi dingin Capricorn yang terkadang terlalu serius)."
            ),
            ZodiacData(
                nama = "Aquarius",
                gambar = R.drawable.img_aquarius,
                periode = "20 Januari – 18 Februari",
                elemen = "Udara 💨",
                deskripsi = "Aquarius adalah zodiak kesebelas yang dilambangkan oleh Pembawa Air — sosok yang menuangkan air dari kendi ke bumi, simbol berbagi pengetahuan dan kebenaran kepada umat manusia. Meski dilambangkan dengan air, Aquarius sejatinya adalah tanda Udara — mereka adalah pemikir visioner yang jauh melampaui zamannya sendiri.\n\nDikuasai oleh Uranus — planet inovasi, revolusi, dan perubahan mendadak — Aquarius adalah pemberontak yang idealis. Mereka tidak pernah mengikuti aturan hanya karena 'begitulah adanya'; mereka selalu mempertanyakan status quo dan mencari cara yang lebih baik, lebih adil, dan lebih inovatif untuk menjalani kehidupan dan membangun masyarakat yang lebih baik bagi semua.",
                sifat = "Inovatif dan selalu berpikir jauh ke depan melampaui zamannya. Independen dan sangat menghargai kebebasan pribadi di atas segalanya. Humanis dengan kepedulian mendalam terhadap sesama dan masyarakat luas. Eksentrik dan tidak pernah takut tampil berbeda dari kebanyakan orang. Visioner yang mampu melihat potensi di mana orang lain hanya melihat masalah. Intelektual dengan minat yang sangat luas dan beragam. Terkadang terkesan terlalu dingin dan tidak emosional.",
                kecocokan = "Gemini dan Libra (sesama elemen Udara — pertukaran ide yang menstimulasi dan menginspirasi). Sagitarius (petualangan intelektual keduanya menciptakan hubungan yang sangat dinamis). Aries (spontanitas Aries mendorong Aquarius yang terlalu banyak berpikir untuk segera bertindak)."
            ),
            ZodiacData(
                nama = "Pisces",
                gambar = R.drawable.img_pisces,
                periode = "19 Februari – 20 Maret",
                elemen = "Air 💧",
                deskripsi = "Pisces adalah zodiak kedua belas — zodiak terakhir dalam lingkaran astrologi — dilambangkan oleh Dua Ikan yang berenang ke arah berlawanan. Ini mencerminkan dualitas Pisces yang mendalam: satu ikan berenang ke dunia nyata, satu lagi ke dunia mimpi. Pisces hidup di perbatasan antara realitas dan imajinasi, antara yang tampak dan yang tak tampak.\n\nDikuasai oleh Neptunus — planet ilusi, mimpi, dan spiritualitas tertinggi — Pisces memiliki koneksi mendalam dengan dunia tak kasat mata. Mereka adalah jiwa lama yang membawa kebijaksanaan dari banyak kehidupan. Sebagai zodiak terakhir, Pisces mengandung sedikit esensi dari setiap zodiak sebelumnya, menjadikan mereka pribadi yang paling kompleks, paling empatik, dan paling sulit untuk sepenuhnya dipahami.",
                sifat = "Empatik luar biasa dan mampu benar-benar merasakan penderitaan orang lain. Imajinatif dengan dunia batin yang sangat kaya dan penuh warna. Sensitif dan sangat mudah terpengaruh oleh energi dari lingkungan sekitar. Artistik dengan bakat seni yang mengalir sangat alami dan mendalam. Intuitif dan sering merasakan sesuatu bahkan sebelum itu benar-benar terjadi. Mudah larut dan kehilangan diri dalam hubungan yang sangat dalam. Spiritual dengan rasa terhubung kuat bersama alam semesta.",
                kecocokan = "Cancer dan Scorpio (sesama elemen Air — kedalaman emosi dan intuisi yang saling melengkapi). Taurus (kehadiran Taurus yang stabil memberikan pijakan bagi Pisces yang sering melayang). Capricorn (realisme Capricorn membantu Pisces mengubah mimpi indah menjadi kenyataan nyata)."
            ),
        )
    }
}