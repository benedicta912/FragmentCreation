package com.chinye.fragmentcreation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.chinye.fragmentcreation.R
import com.chinye.fragmentcreation.databinding.FragmentNewBinding

class NewFragment : Fragment() {

    private lateinit var binding: FragmentNewBinding
    }

    fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       var binding = FragmentNewBinding.inflate(inflater, container, false)
        return binding.root
    }
