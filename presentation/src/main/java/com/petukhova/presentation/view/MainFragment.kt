package com.petukhova.presentation.view

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.petukhova.domain.dependencyprovider.dependencyProvider
import com.petukhova.presentation.adapter.AdapterCurrency
import com.petukhova.presentation.databinding.FragmentMainBinding
import com.petukhova.presentation.view.viewmodel.MainViewModel
import java.text.SimpleDateFormat
import javax.inject.Inject

class MainFragment : Fragment() {
    @Inject
    internal lateinit var viewModel: MainViewModel
    private val binding by lazy(LazyThreadSafetyMode.NONE) {
        FragmentMainBinding.inflate(LayoutInflater.from(requireContext()))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainFragmentDependencyProvider.inject(this)
        DaggerAppComponent
            .factory()
            .create(
                this,
                domainDiProvider = dependencyProvider,
                MainFragmentDependencyProvider()
            )
            .inject(this)

        Log.i("onCreate" , "MainFragment")
    }

    override fun onCreateView(inflater: LayoutInflater, group: ViewGroup?, state: Bundle?): View {
        Log.i("onCreate" , "onCreateView MainFragment")
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("onCreate" , "onViewCreated MainFragment")

        val adapter = AdapterCurrency()
        binding.recyclerView.adapter = adapter

//        viewModel.getCurrencyLiveData().observe(requireActivity(), {
//            adapter.submitList(it.data)
//        })
        viewModel.getCurrencyLiveData().observe(viewLifecycleOwner, {binding.inputDate.text =
           it.keys.toString()
            for(currency in it.values)
                adapter.submitList(currency)


        })


//        getActivity()?.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR)
        //загрузка данных по кнопке
        binding.btnUpdate.setOnClickListener {
            Log.i("onCreate" , "btnUpdat")
            viewModel.getCurreny()
        }

        binding.btnConvert.setOnClickListener {
//            showConverterFragment()
        }

    }
}