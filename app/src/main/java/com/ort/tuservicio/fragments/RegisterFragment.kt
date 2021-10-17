package com.ort.tuservicio.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.ort.tuservicio.R
import com.ort.tuservicio.viewmodels.RegisterViewModel

class RegisterFragment : Fragment() {

    companion object {
        fun newInstance() = RegisterFragment()
    }
    private lateinit var viewModel: RegisterViewModel
    lateinit var btnFragment: Button
    lateinit var v: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.register_fragment , container, false)
        btnFragment = v.findViewById(R.id.btnConfirmar)

        return v
    }

    override fun onStart(){
        super.onStart()
        val action = RegisterFragmentDirections.actionRegisterFragmentToSuccessFragment()
        btnFragment.setOnClickListener{
            v.findNavController().navigate(action)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RegisterViewModel::class.java)
        // TODO: Use the ViewModel
    }

}