package ir.borjian.lottieanimation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.airbnb.lottie.LottieComposition
import com.airbnb.lottie.LottieCompositionFactory
import java.util.*
import kotlin.collections.ArrayList

class ViewPagerAdapter(var fm: FragmentManager , var list: List<LottieComposition>) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(item: Int): Fragment {
        return ViewPagerFragment(list[item])
    }

    override fun getCount(): Int {
        return list.size
    }

}