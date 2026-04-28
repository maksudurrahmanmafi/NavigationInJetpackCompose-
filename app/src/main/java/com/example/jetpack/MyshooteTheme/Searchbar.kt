package com.example.jetpack.MyshooteTheme

import android.provider.ContactsContract.CommonDataKinds.Im
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TooltipDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpack.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Searchbar(modifier: Modifier = Modifier.padding(8.dp)) {


    TextField(
        value = "",
        onValueChange = {},
        leadingIcon = {
            Icon(Icons.Default.Search, contentDescription = null)
        },
        placeholder = {
            Text("Search")
        },
        colors = TextFieldDefaults.textFieldColors(
            unfocusedLabelColor = MaterialTheme.colorScheme.surface,
            focusedLabelColor = MaterialTheme.colorScheme.primary,



        ),
        modifier = modifier
            .heightIn(min = 56.dp)
            .fillMaxWidth()
    )
}
@Preview(showBackground = true)
@Composable
fun AlignYourBody(modifier: Modifier = Modifier) {
    Column (modifier=modifier.padding(top = 25.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        ){

        Image(
            painter = painterResource(id = R.drawable.dog), contentDescription = "Dog",
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(88.dp).clip(CircleShape)
        )
        Text(text = "Dog",
            style = MaterialTheme.typography.displaySmall,
           modifier =  modifier.paddingFromBaseline(top = 24.dp, bottom = 8.dp)
        )
    }
    
}