package com.example.jetpacknavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_view_balance.*


class ViewBalanceFragment : Fragment(R.layout.fragment_view_balance){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        btn_sendText.setOnClickListener{
            // safeargs method
            val text = text_et.text.toString()
            val action = ViewBalanceFragmentDirections.actionViewBalanceFragmentToViewTransactionFragment(text)
            findNavController().navigate(action)

        }
    }
}