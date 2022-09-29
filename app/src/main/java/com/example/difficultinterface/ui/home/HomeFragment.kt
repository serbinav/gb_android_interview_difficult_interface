package com.example.difficultinterface.ui.home

import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.difficultinterface.databinding.FragmentHomeBinding
import java.text.SimpleDateFormat

private const val MILLISECOND_IN_MINUTE = 60 * 1000L
private const val MINUTE_IN_DAYS = 9 * 24 * 60L

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val sdfDays = SimpleDateFormat("dd")
    private val sdfHours = SimpleDateFormat("HH")
    private val sdfMinutes = SimpleDateFormat("mm")

    private val viewModel by lazy {
        ViewModelProvider(this).get(HomeViewModel::class.java)
    }
    private val adapterClasses: ClassesAdapter by lazy {
        ClassesAdapter {
            Toast.makeText(requireContext(), "OPEN SKYPE", Toast.LENGTH_LONG).show()
        }
    }
    private val adapterHomework: HomeworkAdapter by lazy {
        HomeworkAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.recyclerClasses.adapter = adapterClasses
        binding.recyclerClasses.layoutManager = LinearLayoutManager(
            requireContext(),
            LinearLayoutManager.HORIZONTAL,
            false
        )
        binding.recyclerHomework.adapter = adapterHomework
        binding.recyclerHomework.layoutManager = LinearLayoutManager(
            requireContext(),
            LinearLayoutManager.HORIZONTAL,
            false
        )

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.data.observe(viewLifecycleOwner) {
            adapterClasses.submitList(it.classes)
            adapterHomework.setData(it.homework)
        }

        with(binding) {
            object : CountDownTimer(
                MINUTE_IN_DAYS * MILLISECOND_IN_MINUTE,
                MILLISECOND_IN_MINUTE
            ) {
                override fun onTick(millisUntilFinished: Long) {
                    countdownTimerDays.text = sdfDays.format(millisUntilFinished)
                    countdownTimerHours.text = sdfHours.format(millisUntilFinished)
                    countdownTimerMinutes.text = sdfMinutes.format(millisUntilFinished)
                }

                override fun onFinish() {}
            }
                .start()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}