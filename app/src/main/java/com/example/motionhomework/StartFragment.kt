package com.example.motionhomework

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.motionhomework.databinding.StartFragmentBinding


class StartFragment : Fragment() {
    private lateinit var binding : StartFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = StartFragmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){
            title.animate()
                .translationY(700f)
                .setDuration(2000)
                .start()

            littleTitle.animate()
                .translationY(700f)
                .setDuration(2000)
                .start()

            desc.animate()
                .translationX(1450f)
                .setDuration(2000)
                .start()

            button.animate()
                .translationY(-800f)
                .setDuration(2000)
                .start()

            button.setOnClickListener{
                findNavController().navigate(
                    StartFragmentDirections.actionStartFragmentToViewAnimationFragment()
                )
            }
        }
    }
}