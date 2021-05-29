package com.example.navigationcomponentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import com.example.navigationcomponentexample.databinding.FragmentChooseRecipientBinding
import com.example.navigationcomponentexample.databinding.FragmentConfirmationBinding

class ConfirmationFragment : Fragment() {

    lateinit var navController: NavController
    private val binding get() = _binding!!
    private var _binding: FragmentConfirmationBinding? = null
    lateinit var recipient: String
    lateinit var money: Money
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        recipient =  arguments?.getString("recipient" +
                "").toString()
        money = arguments?.getParcelable("amount")!!
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentConfirmationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val money = money.amount
        val confirmationMessage = "You are sending $money to $recipient"
        binding.confirmationMessage.text = confirmationMessage
    }
}