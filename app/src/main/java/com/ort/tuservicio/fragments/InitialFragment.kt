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
import com.ort.tuservicio.viewmodels.InitialViewModel

class InitialFragment : Fragment() {

    companion object {
        fun newInstance() = InitialFragment()
    }

    private lateinit var viewModel: InitialViewModel
    lateinit var btnFragment: Button
    lateinit var btnFragment2: Button
    lateinit var v: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.initial_fragment , container, false)
        btnFragment = v.findViewById(R.id.btnFragment)
        btnFragment2 = v.findViewById(R.id.btnFragment2)

        return v
    }

    override fun onStart(){
        super.onStart()
        btnFragment.setOnClickListener{
            val action2 = InitialFragmentDirections.actionInitialFragmentToLoginFragment2()
            v.findNavController().navigate(action2)
        }
        btnFragment2.setOnClickListener{
            val action2 = InitialFragmentDirections.actionInitialFragmentToLoginFragment2()
            v.findNavController().navigate(action2)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(InitialViewModel::class.java)
        // TODO: Use the ViewModel
    }

}