package com.ort.tuservicio

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class SuccessFragment : Fragment() {

    companion object {
        fun newInstance() = SuccessFragment()
    }

    private lateinit var viewModel: SuccessViewModel
    lateinit var btnFragment: Button
    lateinit var v: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.success_fragment , container, false)
        btnFragment = v.findViewById(R.id.btnConfirmar)

        return v
    }

    override fun onStart(){
        super.onStart()
        val action = SuccessFragmentDirections.actionSuccessFragmentToHomeFragment()
        btnFragment.setOnClickListener{
            v.findNavController().navigate(action)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SuccessViewModel::class.java)
        // TODO: Use the ViewModel
    }

}