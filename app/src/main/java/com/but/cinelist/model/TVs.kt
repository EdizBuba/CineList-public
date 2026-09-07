package com.but.cinelist.model

import com.google.gson.annotations.SerializedName

data class TVs(@SerializedName("tv") val tvList: List<Lists> ) {
}