package com.musmeong.koincrypto

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var rvCoins: RecyclerView
    private var list: ArrayList<Coin> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "CAT - Crypto Asset Tracker"

        rvCoins = findViewById(R.id.rv_coins)
        rvCoins.setHasFixedSize(true)

        list.addAll(CoinsData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvCoins.layoutManager = LinearLayoutManager(this)
        val listCoinAdapter = ListCoinAdapter(list)
        rvCoins.adapter = listCoinAdapter

        listCoinAdapter.setOnItemClickCallback(object : ListCoinAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Coin) {
                showSelectedChoice(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        val menuItem = menu!!.findItem(R.id.search_btn)

        if (menuItem != null) {
            val searchView = menuItem.actionView as SearchView

            searchView.setQueryHint("Search Coin...")

            searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
                override fun onQueryTextSubmit(query: String?): Boolean {
                    return true
                }

                override fun onQueryTextChange(newText: String?): Boolean {
                    if (newText!!.isNotEmpty()) {
                        list.clear()
                        val search = newText.toLowerCase(Locale.getDefault())
                        CoinsData.listData.forEach {
                            if (it.detail.toLowerCase(Locale.getDefault()).contains(search)){
                                list.add(it)
                            }
                        }

                        rvCoins.adapter!!.notifyDataSetChanged()
                    }

                    else {
                        list.clear()
                        list.addAll(CoinsData.listData)
                        rvCoins.adapter!!.notifyDataSetChanged()
                    }

                    return true
                }

            })
        }

        return super.onCreateOptionsMenu(menu)
    }

    private fun showAboutPage() {
        val intent = Intent(this,AboutActivity::class.java)
        this.startActivity(intent)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.favorite -> {
            }
            R.id.about -> {
                showAboutPage()
            }
        }
    }

    private fun showSelectedChoice(coin: Coin) {
        val intent = Intent(this,DetailActivity::class.java)
        intent.putExtra("iTitle", coin.name)
        intent.putExtra("iDesc", coin.detail)
        intent.putExtra("iImage", coin.photo)
        intent.putExtra("iLink", coin.link)
        this.startActivity(intent)
    }
}