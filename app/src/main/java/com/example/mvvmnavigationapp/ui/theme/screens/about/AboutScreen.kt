package com.example.mvvmnavigationapp.ui.theme.screens.about

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mvvmnavigationapp.ui.theme.MVVMNavigationAppTheme

@Composable
fun AboutScreen(navHostController: NavController){
    Text(text = "Welcome To About Page")

}
@Preview
@Composable
fun AboutSCreenPreview(){
    MVVMNavigationAppTheme {
        AboutScreen(rememberNavController())
    }
}