package com.example.superheroesbeaut.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Hero(
    @DrawableRes val imageResId: Int,
    @StringRes val heroName: Int,
    @StringRes val powersDescription: Int
)