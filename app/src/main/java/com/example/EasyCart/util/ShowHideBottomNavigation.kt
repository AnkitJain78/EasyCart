package com.example.EasyCart.util

import androidx.fragment.app.Fragment
import com.example.EasyCart.R
import com.example.EasyCart.activities.ShoppingActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

fun Fragment.hideBottomNavigationView(){
    val bottomNavigationView =
        (activity as ShoppingActivity).findViewById<BottomNavigationView>(
            com.example.EasyCart.R.id.bottomNavigation
        )
    bottomNavigationView.visibility = android.view.View.GONE
}

fun Fragment.showBottomNavigationView(){
    val bottomNavigationView =
        (activity as ShoppingActivity).findViewById<BottomNavigationView>(
            com.example.EasyCart.R.id.bottomNavigation
        )
    bottomNavigationView.visibility = android.view.View.VISIBLE
}