package com.example.student.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.student.R
import com.example.student.databinding.FragmentStudentListBinding


class StudentListFragment : Fragment() {
    private lateinit var binding:FragmentStudentListBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentStudentListBinding.inflate(inflater,container,false)
        return binding.root
    }
//    bugfix
    
}