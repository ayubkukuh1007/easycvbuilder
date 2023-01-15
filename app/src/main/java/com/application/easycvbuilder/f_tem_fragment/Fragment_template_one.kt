package com.application.easycvbuilder.f_tem_fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.application.easycvbuilder.R

class Fragment_template_one : Fragment() {

    companion object {
        fun newInstance() = Fragment_template_one()
    }

    private lateinit var viewModel: FragmentTemplateOneViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fragment_template_one, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FragmentTemplateOneViewModel::class.java)
        // TODO: Use the ViewModel
    }

}