package com.cyrus.example.ui.tabs

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.cyrus.example.R
import com.cyrus.example.antisniff.AntiSniffActivity
import com.cyrus.example.okhttp.OkHttpActivity
import com.cyrus.example.retrofit.RetrofitActivity
import com.cyrus.example.sohooker.SoHookerActivity
import com.cyrus.example.so_unpack.SoUnpackActivity
import com.cyrus.example.fart.FartActivity

class NetworkFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_network, container, false)

        view.findViewById<Button>(R.id.button_okhttp).setOnClickListener {
            startActivity(Intent(requireContext(), OkHttpActivity::class.java))
        }
        view.findViewById<Button>(R.id.button_retrofit).setOnClickListener {
            startActivity(Intent(requireContext(), RetrofitActivity::class.java))
        }
        view.findViewById<Button>(R.id.button_anti_sniff).setOnClickListener {
            startActivity(Intent(requireContext(), AntiSniffActivity::class.java))
        }
        view.findViewById<Button>(R.id.button_sohooker).setOnClickListener {
            startActivity(Intent(requireContext(), SoHookerActivity::class.java))
        }
        view.findViewById<Button>(R.id.button_so_unpack).setOnClickListener {
            startActivity(Intent(requireContext(), SoUnpackActivity::class.java))
        }
        view.findViewById<Button>(R.id.button_fart).setOnClickListener {
            startActivity(Intent(requireContext(), FartActivity::class.java))
        }
        return view
    }
}
