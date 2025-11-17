package com.example.gs2sem
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.gs2sem.screens.EquipeScreen
import com.example.gs2sem.screens.IMCScreen
import com.example.gs2sem.screens.LoginScreen
import com.example.gs2sem.screens.MenuScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val navController = rememberNavController()

            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                NavHost(
                    navController = navController,
                    startDestination = "login"
                ) {

                    composable("login") {
                        LoginScreen(
                            modifier = Modifier.padding(innerPadding),
                            navController
                        )
                    }

                    composable("menu") {
                        MenuScreen(
                            modifier = Modifier.padding(innerPadding),
                            navController
                        )
                    }

                    composable("imc") {
                        IMCScreen(
                            modifier = Modifier.padding(innerPadding),
                            navController
                        )
                    }

                    composable("equipe") {
                        EquipeScreen(
                            modifier = Modifier.padding(innerPadding),
                            navController
                        )
                    }
                }
            }
        }
    }
}
