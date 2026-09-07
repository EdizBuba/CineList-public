package com.but.cinelist.model

class Lists(
    val top_aired_fanarts: List<TopAiredFanart>,
    val new_episodes: NewEpisodes,
    val most_watched_this_month: List<TvItem>,
    val top_last_aired: List<TvItemWithDate>,
    val premieres: List<TvItem>
) {
}