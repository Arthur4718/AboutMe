package com.devarthur.aboutme

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.net.Uri
import android.widget.Toast


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initPageAnimations()
        setupButtons()


    }

    private fun setupButtons() {


        btnContactInfo.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:0123456789")
            startActivity(intent)
        }

        cardGitHub.setOnClickListener {
            val url = "https://github.com/Arthur4718?tab=repositories"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        cardLinkeDin.setOnClickListener {
            val url = "https://www.linkedin.com/in/devarthur4718/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        cardMyBlog.setOnClickListener {

            Toast.makeText(this, "The blog is not running right now...Please try again later.", Toast.LENGTH_SHORT).show();
        }

    }

    private fun initPageAnimations() {

        val top_to_bottom = AnimationUtils.loadAnimation(this, R.anim.top_to_button)
        val scale_to_big = AnimationUtils.loadAnimation(this, R.anim.scale_to_big)
        val bottom_to_top = AnimationUtils.loadAnimation(this, R.anim.bottom_to_top)
        val bottom_to_top2 = AnimationUtils.loadAnimation(this, R.anim.bottom_to_top2)
        val bottom_to_top3 = AnimationUtils.loadAnimation(this, R.anim.bottom_to_top3)
        val bottom_to_top4 = AnimationUtils.loadAnimation(this, R.anim.bottom_to_top4)

        tvPageTitle.startAnimation(top_to_bottom)
        tvSubtitle.startAnimation(top_to_bottom )
        profile_image.startAnimation(scale_to_big)
        cardGitHub.startAnimation(bottom_to_top)
        cardLinkeDin.startAnimation(bottom_to_top2)
        cardMyBlog.startAnimation(bottom_to_top3)
        btnContactInfo.startAnimation(bottom_to_top4)
    }
}
