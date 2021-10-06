package com.example.jetpacknavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var navController : NavController
    // use to remove back arrow from top level fragment and also fow show navigation drawer icon on toolbar
    lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

            // for toolbar
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        appBarConfiguration = AppBarConfiguration(
            setOf(R.id.homeFragment,R.id.settingFragment,R.id.notificationFragment),
            drawer_layout)
        setupActionBarWithNavController(navController,appBarConfiguration)
        // 1 line      toolbar.setupWithNavController(navController)

        //  bottom navigation set
        botom_Nav.setupWithNavController(navController)
        //    navigation drawr set
        nav_drawer.setupWithNavController(navController)
    }

    // alternate of 1 line
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    // through menu move next secreen
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.about_frag ->{
                 val action = MainNavGraphDirections.actionGlobalAboutFragment()
                navController.navigate(action)
                return true
            }
            else -> return item.onNavDestinationSelected(navController) || super.onOptionsItemSelected(item)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }
}