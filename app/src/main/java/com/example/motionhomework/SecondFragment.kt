package com.example.motionhomework

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.example.motionhomework.databinding.SecondFragmentBinding

class SecondFragment : Fragment() {
    private lateinit var binding: SecondFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SecondFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.imageView.setOnClickListener {
            val extras = FragmentNavigatorExtras(
                binding.container to "container",
                binding.imageView to "imageView",
                binding.textView to "textView"
            )
            findNavController().navigate(
                SecondFragmentDirections.actionStartFragmentToViewAnimationFragment(), extras
            )
        }
    }
}
