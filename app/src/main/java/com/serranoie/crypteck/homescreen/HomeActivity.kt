package com.serranoie.crypteck.homescreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.serranoie.crypteck.HomeNavigation
import com.serranoie.crypteck.R
import com.serranoie.crypteck.databinding.ActivityMainBinding
import com.serranoie.crypteck.detailscreen.BookDetailsFragment
import com.serranoie.crypteck.homescreen.viewmodel.HomeViewModel
import com.serranoie.data.crypteck.dto.book.AvailableBooksResponse
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity: AppCompatActivity(), HomeNavigation {
    private lateinit var homeAdapter: HomeAdapter
    private val viewModel: HomeViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding
    private lateinit var homeNavigation: HomeNavigation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        homeAdapter = HomeAdapter(this::navigateOnClick)

        val recyclerView = binding.currenciesItem

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = homeAdapter

        setupViewModel()
        setupViews()
    }

    private fun setupViews() {
        TODO("Not yet implemented")
    }

    private fun setupViewModel() {
        TODO("Not yet implemented")
    }

    private fun navigateOnClick(currency: AvailableBooksResponse) {
        //map the dto to accept the dto with the image, do this in the viewmodel

        homeNavigation.launchBookDetailsFragment()
    }

    override fun launchBookDetailsFragment() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.home_fragment_container, BookDetailsFragment.newInstance(), BookDetailsFragment.TAG)
            .commit()
    }
}