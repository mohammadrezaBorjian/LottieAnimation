package ir.borjian.lottieanimation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieComposition
import com.airbnb.lottie.LottieCompositionFactory
import kotlinx.android.synthetic.main.activity_viewpager.*
import kotlin.collections.ArrayList

class ViewPagerActivity : AppCompatActivity() {
    private val list = listOf("animations/animation.json", "animations/animation2.json", "animations/animation3.json")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewpager)
        viewPager.adapter = ViewPagerAdapter(supportFragmentManager , getComposition())
    }

    private fun getComposition():ArrayList<LottieComposition> {
        val composition :ArrayList<LottieComposition> = ArrayList()
        for (re in list) {
            val result = LottieCompositionFactory.fromAssetSync(this, re)
            composition.add(result.value!!)
        }
        return composition
    }
}