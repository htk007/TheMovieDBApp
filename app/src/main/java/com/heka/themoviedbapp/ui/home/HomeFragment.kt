package com.heka.themoviedbapp.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.heka.themoviedbapp.R
import com.heka.themoviedbapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding :FragmentHomeBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        //for avoid memory leak
        _binding = null
    }
}