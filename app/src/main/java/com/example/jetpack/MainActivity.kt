package com.example.jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpack.MyshooteTheme.Searchbar
import com.example.jetpack.Nevigation.ScreenA
import com.example.jetpack.Nevigation.ScreenB
import com.example.jetpack.ui.theme.JetPackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackTheme { // Theme add kora bhalo
                AppNavigation()
            }
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "jui") {
        composable("jui") {
            ScreenA(

                onNavigateToScreenB = {

                    navController.navigate("screenB")
                }

            )
        }
        composable("screenB") {
            // ScreenB teo back jaoar logic add kore dilam
            ScreenB(onNavigateToScreenA = {
                navController.popBackStack()
            }
            )
        }
    }
}