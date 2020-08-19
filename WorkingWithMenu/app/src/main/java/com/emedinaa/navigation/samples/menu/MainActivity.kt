package com.emedinaa.navigation.samples.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.emedinaa.navigation.samples.menu.R

/**
 * @author : Eduardo Medina
 */
class MainActivity : AppCompatActivity() {

    private fun initUi() {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        NavigationUI.setupActionBarWithNavController(
            this,
            findNavController(R.id.nav_host_fragment)
        )
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.popBackStack()
                || super.onSupportNavigateUp()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUi()
    }

}