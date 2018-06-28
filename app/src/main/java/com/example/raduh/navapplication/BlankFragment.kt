package com.example.raduh.navapplication

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class BlankFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_blank, container, false)

        val btn: Button = view.findViewById(R.id.button)
        btn.setOnClickListener {
            it.findNavController().navigate(R.id.action_blankFragment_to_detailsFragment)
        }

        return view;
    }
}
