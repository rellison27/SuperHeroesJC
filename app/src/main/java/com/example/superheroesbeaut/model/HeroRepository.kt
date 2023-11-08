package com.example.superheroesbeaut.model

import com.example.superheroesbeaut.R

object HeroRepositiory
{
    val heroes = listOf(
        Hero(
            imageResId = R.drawable.android_superhero1,
            heroName = R.string.hero1,
            powersDescription = R.string.description1
        ),
        Hero(
            imageResId = R.drawable.android_superhero2,
            heroName = R.string.hero2,
            powersDescription = R.string.description2
        ),
        Hero(
            imageResId = R.drawable.android_superhero3,
            heroName = R.string.hero3,
            powersDescription = R.string.description3
        ),
        Hero(
            imageResId = R.drawable.android_superhero4,
            heroName = R.string.hero4,
            powersDescription = R.string.description4
        ),
        Hero(
            imageResId = R.drawable.android_superhero5,
            heroName = R.string.hero5,
            powersDescription = R.string.description5
        ),
        Hero(
            imageResId = R.drawable.android_superhero6,
            heroName = R.string.hero6,
            powersDescription = R.string.description6
        )
    )
}