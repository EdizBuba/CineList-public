package com.but.cinelist.model

class Episode(
    val title: String,
    val rank: Int?,
    val air_time: String?,
    val network: String,
    val poster: String,
    val season: Int,
    val episode: Int,
    val watched: Int,
    val ids: Ids
)