package com.andresjakl.partslist

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PartData ( var id: Long, var itemName: String)
