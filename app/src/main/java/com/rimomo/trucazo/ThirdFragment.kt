package com.rimomo.trucazo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.NavController
import androidx.navigation.Navigation


class ThirdFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_third, container, false)

        val button = view.findViewById<Button>(R.id.to_second)
        val data = view.findViewById<EditText>(R.id.data)




        button.setOnClickListener {

            if(data.text.isNotEmpty()){
                val navController : NavController =
                    Navigation.findNavController(view)

                controller.navigation
                navController.navigate(R.id.action_fragment_to_secondFragment)
            }



        }

        return view

    }
}
