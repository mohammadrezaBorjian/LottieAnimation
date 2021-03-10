package ir.borjian.lottieanimation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activty_main.*

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activty_main)

        btnLocalAnimation.setOnClickListener{
            startActivity(Intent(this@MainActivity,LocalAnimationActivity::class.java))
        }
        btnOnlineAnimation.setOnClickListener{
            startActivity(Intent(this@MainActivity,OnlineAnimationActivity::class.java))
        }
        btnViewPager.setOnClickListener{
            startActivity(Intent(this@MainActivity,ViewPagerActivity::class.java))
        }

    }
}