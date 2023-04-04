package com.example.healthnutritionguideapp
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.FragmentTransaction
import com.example.healthnutritionguideapp.fragments.DiscoverFragment
import com.example.healthnutritionguideapp.fragments.NotificationsFragment
import com.example.healthnutritionguideapp.fragments.ProfileFragment
import com.example.healthnutritionguideapp.test.TestFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    //accessing the fragments
    lateinit var homeFragment: HomeFragment
    lateinit var testFragment: TestFragment
    lateinit var discoverFragment: DiscoverFragment
    lateinit var notificationsFragment: NotificationsFragment
    lateinit var profileFragment: ProfileFragment

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        val bottomNavigation: BottomNavigationView = findViewById(R.id.btn_nav)

       testFragment = TestFragment()
        supportFragmentManager
            .beginTransaction().replace(R.id.frame_layout, testFragment).setTransition(
                FragmentTransaction.TRANSIT_FRAGMENT_OPEN
            ).commit()

        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {

                R.id.navigation_home -> {
                    homeFragment = HomeFragment()
                    supportFragmentManager
                        .beginTransaction().replace(R.id.frame_layout, testFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()
                }

                R.id.navigation_not -> {
                    discoverFragment = DiscoverFragment()
                    supportFragmentManager
                        .beginTransaction().replace(R.id.frame_layout, discoverFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()
                }


                R.id.navigation_message -> {
                    notificationsFragment = NotificationsFragment()
                    supportFragmentManager
                        .beginTransaction().replace(R.id.frame_layout, notificationsFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()
                }

                R.id.navigation_profile -> {
                    profileFragment = ProfileFragment()
                    supportFragmentManager
                        .beginTransaction().replace(R.id.frame_layout, profileFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()
                }
            }
            true
        }

    }
}

