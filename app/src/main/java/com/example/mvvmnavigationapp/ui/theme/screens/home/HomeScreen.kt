package com.example.mvvmnavigationapp.ui.theme.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mvvmnavigationapp.navigation.ROUTE_ABOUT
import com.example.mvvmnavigationapp.navigation.ROUTE_LOGIN
import com.example.mvvmnavigationapp.navigation.ROUTE_PRODUCTS
import com.example.mvvmnavigationapp.navigation.ROUTE_SIGNUP
import com.example.mvvmnavigationapp.ui.theme.MVVMNavigationAppTheme


@Composable
fun HomeScreen(naveController: NavController){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = {
            naveController.navigate(ROUTE_PRODUCTS)
        }) {
           Text(text = "Products")
        }
        Button(onClick = {
            naveController.navigate(ROUTE_ABOUT)
        }) {
           Text(text = "About")
        }
        Button(onClick = {
            naveController.navigate(ROUTE_SIGNUP)
        }) {
            Text(text = "signup")
        }
        Button(onClick = {
            naveController.navigate(ROUTE_LOGIN)
        }) {
            Text(text = "login")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    MVVMNavigationAppTheme {
    HomeScreen( rememberNavController())
    }
}