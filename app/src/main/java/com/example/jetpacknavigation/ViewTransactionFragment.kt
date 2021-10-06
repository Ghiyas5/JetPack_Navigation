package com.example.jetpacknavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_view_transaction.*


class ViewTransactionFragment : Fragment(R.layout.fragment_view_transaction){
    private val arg : ViewTransactionFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recVal = arg.myArg
        viewtext_et.text = recVal
    }
}


