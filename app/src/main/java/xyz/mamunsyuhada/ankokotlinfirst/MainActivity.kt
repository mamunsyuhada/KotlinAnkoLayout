package xyz.mamunsyuhada.ankokotlinfirst

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCommons.onClick {
//////        gak make aanko
//            startActivity(Intent(this@MainActivity, CommonActivity::class.java))

            startActivity(intentFor<CommonActivity>(
                    //pengganti putExtra kalo di Java
                    "a" to 1,
                        "b" to 2))


        }
        btnLayout.onClick {

            startActivity(intentFor<LayoutActivity>())
//            startActivity(Intent(this@MainActivity, LayoutActivity::class.java))
        }
    }
}
