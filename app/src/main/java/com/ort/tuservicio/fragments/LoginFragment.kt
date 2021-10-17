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
import com.ort.tuservicio.viewmodels.LoginViewModel

class LoginFragment : Fragment() {

    companion object {
        fun newInstance() = LoginFragment()
    }

    private lateinit var viewModel: LoginViewModel
    lateinit var btnFragment: Button
    lateinit var btnRegister: Button
    lateinit var v: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.initial_fragment , container, false)
        btnFragment = v.findViewById(R.id.btnFragment)
        btnRegister = v.findViewById(R.id.btnRegistrarse)

        return v
    }

    override fun onStart(){
        super.onStart()
        btnRegister.setOnClickListener{
            val action2 = LoginFragmentDirections.actionLoginFragmentToRegisterFragment()
            v.findNavController().navigate(action2)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        // TODO: Use the ViewModel
    }

}