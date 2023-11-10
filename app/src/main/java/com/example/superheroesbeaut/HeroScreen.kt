package com.example.superheroesbeaut

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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

class HeroScreen
{
    private val heroRepository = HeroRepositiory

    @Composable
    fun HeroCard(
        modifier: Modifier = Modifier,
        hero: Hero
    ) {
        Card(
            elevation = CardDefaults.cardElevation(2.dp),
            modifier = Modifier.clip(MaterialTheme.shapes.medium)
        ) {
            Box(modifier = Modifier
                .padding(16.dp)
            )
            {
                Row (
                    modifier = Modifier.height(72.dp)
                ){
                    Column(modifier = Modifier.padding(end = 16.dp)) {
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

    @Preview(showBackground = true)
    @Composable
    fun SuperHeroCard()
    {
        SuperHeroesBeautTheme {
            HeroCard(modifier = Modifier, hero = heroRepository.heroes[0])
        }
    }
}