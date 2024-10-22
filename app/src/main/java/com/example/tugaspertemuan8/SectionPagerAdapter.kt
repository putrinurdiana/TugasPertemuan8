package com.example.tugaspertemuan8

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tugaspertemuan8.LoginFragment
import com.example.tugaspertemuan8.RegisterFragment

class SectionsPagerAdapter(activity: AppCompatActivity) :
    FragmentStateAdapter(activity) {

    val page = listOf(
        LoginFragment(),
        RegisterFragment()
    )

    override fun getItemCount(): Int {
        return page.size
    }

    override fun createFragment(position: Int): Fragment {
        return page[position]
    }
}

