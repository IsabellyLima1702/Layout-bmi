package br.senai.sp.jandira.bmi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.bmi.screens.HomeScreen
import br.senai.sp.jandira.bmi.screens.ResultScreen
import br.senai.sp.jandira.bmi.screens.UserDataScreen
import br.senai.sp.jandira.bmi.ui.theme.BMITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BMITheme {
                  //  HomeScreen()
                 //   UserDataScreen()
                //    ResultScreen()


                var navegacao = rememberNavController()

                NavHost(
                    navController = navegacao,
                    startDestination = "home"
                ){
                    composable("home"){ HomeScreen(navegacao) }
                    composable("dados"){ UserDataScreen(navegacao) }
                    composable("resultados"){ ResultScreen(navegacao) }
                }
            }
        }
    }
}

