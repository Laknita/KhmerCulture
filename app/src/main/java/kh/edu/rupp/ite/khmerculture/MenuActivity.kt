package kh.edu.rupp.ite.khmerculture

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.widget.Button
import android.widget.ImageView
import kh.edu.rupp.ite.khmerculture.R.*
import kh.edu.rupp.ite.khmerculture.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(FragmentHome())

        binding.bottom.setOnNavigationItemSelectedListener {

            when (it.itemId) {
                R.id.MenuHome -> replaceFragment(FragmentHome())
                R.id.MenuLogin -> replaceFragment(FragmentLogin())
                R.id.MenuCulture -> replaceFragment(FragmentCulture())
                R.id.MenuHistory -> replaceFragment(FragmentHistory())

                else -> {

                }
            }
            true
        }

    }

    private fun replaceFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.act_fragment, fragment)
        fragmentTransaction.commit()
    }

}