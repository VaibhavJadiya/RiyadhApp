package com.printoverit.riyadhapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.printoverit.riyadhapp.R
import com.printoverit.riyadhapp.adapter.ShowAdapter
import com.printoverit.riyadhapp.utils.MyApplication
import com.printoverit.riyadhapp.viewmodels.ShowViewModel
import com.printoverit.riyadhapp.viewmodels.ShowViewModelFactory
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_main.view.*
import java.util.*

class MainFragment : Fragment() {

    lateinit var showViewModel: ShowViewModel
    lateinit var  mAdapater:ShowAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val repo=(activity?.application as MyApplication).repository
        showViewModel=ViewModelProvider(requireActivity(),ShowViewModelFactory(repo)).get(ShowViewModel::class.java)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_main, container, false)
        val lang=Locale.getDefault().getLanguage()

       // Toast.makeText(requireContext(),lang,Toast.LENGTH_SHORT).show()
        if (lang=="en"){
            showViewModel.loadMutableData()
        }
        else if(lang=="hi"){
            showViewModel.loadHindiMutableData()
        }
        else if(lang=="ja"){
            showViewModel.loadJapaneseMutableData()
        }
        else if(lang=="ko"){
            showViewModel.loadKoreanMutableData()
        }
        view.show_recyclerView.layoutManager=GridLayoutManager(requireContext(),2)
        showViewModel.getLiveData().observe(requireActivity(),{user->
            mAdapater = ShowAdapter(user.data.shows)
            show_recyclerView.adapter=mAdapater
            mAdapater.notifyDataSetChanged()
        })
        //show_recyclerView.layoutManager=GridLayoutManager(activity?.applicationContext,2)
        return view
    }
}