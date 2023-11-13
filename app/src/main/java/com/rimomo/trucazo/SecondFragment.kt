package com.rimomo.trucazo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation


class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val button = view.findViewById<Button>(R.id.to_Third)

        button.setOnClickListener {
            val navController: NavController =
                Navigation.findNavController(view)

            navController.navigate(R.id.action_secondFragment_to_thirsFragment)

        }
            val button2 = view.findViewById<Button>(R.id.to_first)

            button2.setOnClickListener {
                val navController: NavController =
                    Navigation.findNavController(view)

                navController.navigate(R.id.action_secondFragment_to_fragment)

            }
            return view

        }
    }
