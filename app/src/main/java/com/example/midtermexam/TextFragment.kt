package com.example.midtermexam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class TextFragment : Fragment() {
    private lateinit var text : TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_text,container, false)
        text = view.findViewById(R.id.txtText)
        val data = arguments
        text.text = "Hi " +data!!.get("string").toString()
        return view

    }
}
