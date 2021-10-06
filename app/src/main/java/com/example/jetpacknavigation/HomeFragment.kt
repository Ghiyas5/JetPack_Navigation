package com.example.jetpacknavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment(R.layout.fragment_home){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_send.setOnClickListener{

            // with receiving action object
            val action = HomeFragmentDirections.actionHomeFragmentToViewBalanceFragment()
            findNavController().navigate(action)

          //  without action object
//            findNavController().navigate(R.id.action_homeFragment_to_viewBalanceFragment)



            //  with animation
//            val navoption = NavOptions.Builder()
//                .setEnterAnim(R.anim.slide_in_right)
//                .setExitAnim(R.anim.slide_out_left)
//                .setPopEnterAnim(R.anim.slide_in_left)
//                .setPopEnterAnim(R.anim.slide_in_left)
//                .build()
            //findNavController().navigate(R.id.viewBalanceFragment,null,navOption)

        }

        btn_dialog.setOnClickListener{
            // findNavController().navigate(R.id.dialogFragment)
            val action = HomeFragmentDirections.actionHomeFragmentToDialogFragment()
            findNavController().navigate(action)


        }
    }
}