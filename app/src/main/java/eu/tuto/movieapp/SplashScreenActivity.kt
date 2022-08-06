package eu.tuto.movieapp

import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.Configuration
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowInsets
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import eu.tuto.movieapp.databinding.ActivitySplashScreenBinding
import eu.tuto.movieapp.presentation.HomeActivity

@Suppress("DEPRECATION")
@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }
        val splashScreenBottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_anim)
        val splashScreenTopAnim = AnimationUtils.loadAnimation(this, R.anim.top_anim)
        binding.ivPowerBy.animation = splashScreenBottomAnim
        binding.imageView4.animation = splashScreenBottomAnim
        binding.ivMovTop.animation = splashScreenTopAnim

        splashScreenBottomAnim.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(p0: Animation?) {}

            override fun onAnimationEnd(p0: Animation?) {
                Handler(Looper.getMainLooper()).postDelayed({
                    startActivity(Intent(this@SplashScreenActivity, HomeActivity::class.java))
                }, 1000)
            }

            override fun onAnimationRepeat(p0: Animation?) {}
        })

    }

    override fun onPause() {
        super.onPause()
        finish()
    }
    private fun checkTheme() {

    }
}