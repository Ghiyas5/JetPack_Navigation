package com.example.jetpacknavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.fragment_notification.*


class NotificationFragment : Fragment(R.layout.fragment_notification ) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        lv_notification.adapter = ArrayAdapter(requireContext(),android.R.layout.simple_list_item_1,getNotification())
    }

    private fun getNotification(): MutableList<String> {
        val  notifications = mutableListOf<String>()

        for (i in 1..20){
            notifications.add("Notification # $i")
        }
        return notifications

    }


}