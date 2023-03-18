package com.example.sansu

object MovieList {
    val MOVIE_CATEGORY = arrayOf(
        "たしざん",
        "ひきざん",
        "かけざん",
        "わりざん",
    )

    val list: List<Movie> by lazy {
        setupMovies()
    }
    private var count: Long = 0

    private fun setupMovies(): List<Movie> {
        val title = arrayOf(
            "Zeitgeist 2010_ Year in Review",
            "Google Demo Slam_ 20ft Search",
            "Introducing Gmail Blue",
            "Introducing Google Fiber to the Pole",
            "Introducing Google Nose"
        )

        val description = "Fusce id nisi turpis. Praesent viverra bibendum semper. " +
                "Donec tristique, orci sed semper lacinia, quam erat rhoncus massa, non congue tellus est " +
                "quis tellus. Sed mollis orci venenatis quam scelerisque accumsan. Curabitur a massa sit " +
                "amet mi accumsan mollis sed et magna. Vivamus sed aliquam risus. Nulla eget dolor in elit " +
                "facilisis mattis. Ut aliquet luctus lacus. Phasellus nec commodo erat. Praesent tempus id " +
                "lectus ac scelerisque. Maecenas pretium cursus lectus id volutpat."
        val studio = arrayOf(
            "Studio Zero",
            "Studio One",
            "Studio Two",
            "Studio Three",
            "Studio Four"
        )
        val videoUrl = arrayOf(
            "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review.mp4",
            "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search.mp4",
            "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue.mp4",
            "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole.mp4",
            "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose.mp4"
        )
        val bgImageUrl = arrayOf(
            "https://i.ytimg.com/vi/z8sUGKptqo0/maxresdefault.jpg",
            "https://precure-web.com/hirogaru-sky/assets/img/info/p_info_01.webp",
            "https://news.mynavi.jp/article/20220514-2344860/images/001.jpg",
            "https://prcdn.freetls.fastly.net/release_image/16719/1417/16719-1417-c23b82c5e7f22dec6e2c2e27adf59cc3-1280x670.jpg?format=jpeg&auto=webp&quality=85%2C75&width=1950&height=1350&fit=bounds",
            "https://www.enjoytokyo.jp/film/wp-content/uploads/2022/08/re-precure-healing-o-e1606379488518.jpg.webp"
        )
        val cardImageUrl = arrayOf(
            "https://i.ytimg.com/vi/z8sUGKptqo0/maxresdefault.jpg",
            "https://precure-web.com/hirogaru-sky/assets/img/info/p_info_01.webp",
            "https://news.mynavi.jp/article/20220514-2344860/images/001.jpg",
            "https://prcdn.freetls.fastly.net/release_image/16719/1417/16719-1417-c23b82c5e7f22dec6e2c2e27adf59cc3-1280x670.jpg?format=jpeg&auto=webp&quality=85%2C75&width=1950&height=1350&fit=bounds",
            "https://www.enjoytokyo.jp/film/wp-content/uploads/2022/08/re-precure-healing-o-e1606379488518.jpg.webp"
        )

        val list = title.indices.map {
            buildMovieInfo(
                title[it],
                description,
                studio[it],
                videoUrl[it],
                cardImageUrl[it],
                bgImageUrl[it]
            )
        }

        return list
    }

    private fun buildMovieInfo(
        title: String,
        description: String,
        studio: String,
        videoUrl: String,
        cardImageUrl: String,
        backgroundImageUrl: String
    ): Movie {
        val movie = Movie()
        movie.id = count++
        movie.title = title
        movie.description = description
        movie.studio = studio
        movie.cardImageUrl = cardImageUrl
        movie.backgroundImageUrl = backgroundImageUrl
        movie.videoUrl = videoUrl
        return movie
    }
}