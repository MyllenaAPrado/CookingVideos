package com.example.cookingvideos.initialscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.cookingvideos.R
import com.example.cookingvideos.databinding.FragmentInitialScreenBinding

class InitialScreen : Fragment(R.layout.fragment_initial_screen) {

    private val viewModel: InitialScreenViewModel by viewModels{
        InitialScreenViewModelFactory()
    }
    private lateinit var binding: FragmentInitialScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentInitialScreenBinding.inflate(inflater, container, false)
        binding.viewmodel = viewModel
        binding.lifecycleOwner = this

        return binding.root
    }

}