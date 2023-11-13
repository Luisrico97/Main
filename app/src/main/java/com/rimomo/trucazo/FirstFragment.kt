package com.rimomo.trucazo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation


class Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =  inflater.inflate(R.layout.fragment_first, container, false)
        
        val button = view.findViewById<Button>(R.id.to_second)

        button.setOnClickListener {
            val navController : NavController =
                Navigation.findNavController(view)

            navController.navigate(R.id.action_fragment_to_secondFragment)

        }

        return view

    }
}