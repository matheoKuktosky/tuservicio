package com.ort.tuservicio.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ort.tuservicio.R
import com.ort.tuservicio.RegisterPrestadorViewModel

class RegisterPrestadorFragment : Fragment() {

    companion object {
        fun newInstance() = RegisterPrestadorFragment()
    }

    private lateinit var viewModel: RegisterPrestadorViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.register_prestador_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RegisterPrestadorViewModel::class.java)
        // TODO: Use the ViewModel
    }

}