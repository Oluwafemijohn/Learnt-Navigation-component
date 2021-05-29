package com.example.navigationcomponentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.navigationcomponentexample.databinding.FragmentMainBinding


class MainFragment : Fragment(), View.OnClickListener {


    lateinit var navController: NavController
    private val binding get() = _binding!!

    private var _binding: FragmentMainBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        binding.viewTransactionsBtn.setOnClickListener(this)
        binding.sendMoneyBtn.setOnClickListener(this)
        binding.viewBalanceBtn.setOnClickListener(this)
    }


    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.view_transactions_btn -> navController.navigate(R.id.action_mainFragment_to_viewTransactionFragment4)
            R.id.send_money_btn -> navController.navigate(R.id.action_mainFragment_to_chooseRecipientFragment2)
            R.id.view_balance_btn -> navController.navigate(R.id.action_mainFragment_to_viewBalanceFragment2)
        }
    }


}