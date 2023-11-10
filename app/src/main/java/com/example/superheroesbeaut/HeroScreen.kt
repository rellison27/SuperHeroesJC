package com.example.superheroesbeaut

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superheroesbeaut.model.Hero
import com.example.superheroesbeaut.model.HeroRepositiory
import com.example.superheroesbeaut.ui.theme.SuperHeroesBeautTheme

private val heroRepository = HeroRepositiory

@Composable
fun HeroList(modifier: Modifier = Modifier, heroList: List<Hero>, contentPaddingValues: PaddingValues)
{
    LazyColumn(contentPadding = contentPaddingValues ) {
        items(items = heroList) {
            HeroCard(
                hero = it,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, bottom = 8.dp)
            )
        }
    }
}

@Composable
fun HeroCard(
    modifier: Modifier = Modifier,
    hero: Hero
) {
    Card(
        elevation = CardDefaults.cardElevation(2.dp),
        modifier = modifier.clip(MaterialTheme.shapes.medium)
    ) {
        Box(modifier = Modifier
            .padding(16.dp)
        )
        {
            Row (
                modifier = Modifier.height(72.dp)
            ){
                Column(
                    modifier = Modifier
                        .padding(end = 16.dp)
                        .weight(1F)
                ) {
                    Text(
                        text = stringResource(id = hero.heroName),
                        style = MaterialTheme.typography.displaySmall
                    )
                    Text(
                        text = stringResource(id = hero.powersDescription),
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
                Box(modifier = Modifier) {
                    Image(
                        modifier = Modifier
                            .clip(MaterialTheme.shapes.small)
                            .size(72.dp),
                        painter = painterResource(id = hero.imageResId),
                        contentDescription = stringResource(id = hero.powersDescription)
                    )
                }
            }
        }
    }
}
