package com.serranoie.crypteck.detailscreen

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.serranoie.crypteck.R
import com.serranoie.crypteck.detailscreen.viewmodel.BookDetailsViewModel
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp

@AndroidEntryPoint
class BookDetailsFragment : Fragment() {

    private lateinit var viewModel: BookDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.book_details_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(BookDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

    companion object {
        const val TAG = "BookDetailsFragment"
        fun newInstance() = BookDetailsFragment()
    }
}