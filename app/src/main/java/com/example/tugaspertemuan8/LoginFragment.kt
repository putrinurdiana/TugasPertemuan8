package com.example.tugaspertemuan8

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        val btnLogin = view.findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            var loading = false
            if((view.findViewById<EditText>(R.id.teksEmail)).text.toString() == "") {
                (view.findViewById<EditText>(R.id.teksEmail)).error = "Email tidak boleh kosong"
                loading = true
            }
            if((view.findViewById<EditText>(R.id.teksPassword)).text.toString() == "") {
                (view.findViewById<EditText>(R.id.teksPassword)).error = "Password tidak boleh kosong"
                loading = true
            }
            if (!loading && ((view.findViewById<EditText>(R.id.teksPassword)).text.toString() == MainActivity.Password)
                && ((view.findViewById<EditText>(R.id.teksEmail)).text.toString() == MainActivity.Email))
            {
                val loginIntent = Intent(this.requireActivity(), Dashboard::class.java)
                startActivity(loginIntent)
            }
        }
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment LoginFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            LoginFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}