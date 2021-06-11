package com.musmeong.koincrypto

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val actionBar : ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)

        var intent = intent
        val aTitle = intent.getStringExtra("iTitle")
        val aDesc = intent.getStringExtra("iDesc")
        val aImage = intent.getIntExtra("iImage", 0)
        val aLink = intent.getStringExtra("iLink")

        val a_title: TextView = findViewById(R.id.a_title)
        val a_desc: TextView = findViewById(R.id.a_desc)
        val imageLogo: ImageView = findViewById(R.id.imageLogo)
        val visitLinkBtn: Button = findViewById(R.id.button_visitlink)
        val shareBtn: Button = findViewById(R.id.button_share)

        actionBar.setTitle(aTitle)
        a_title.setText(aTitle)
        a_desc.setText(aDesc)
        imageLogo.setImageResource(aImage)
        visitLinkBtn.setOnClickListener {
            visitLink(aLink!!)
        }
        shareBtn.setOnClickListener {
            sharePost(aTitle, aDesc, aLink)
        }
    }

    private fun visitLink(link: String) {
        val uri = Uri.parse(link)
        val intent = Intent(Intent.ACTION_VIEW, uri)

        try {
            startActivity(intent)
        }
        catch (e: Exception) {
            Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()
        }
    }

    private fun sharePost(title: String?, desc: String?, link: String?) {
        val fullDesc = "$title\n\n$desc\n\nFind More at: $link"

        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TITLE, fullDesc)
        intent.putExtra(Intent.EXTRA_TEXT, fullDesc)
        intent.putExtra(Intent.EXTRA_SUBJECT, title)

        try {
            startActivity(Intent.createChooser(intent, "Share Coin Via..."))
        }
        catch (e: Exception) {
            Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()
        }
    }
}