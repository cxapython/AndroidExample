package com.cyrus.example.ui.tabs

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.cyrus.example.R
import com.cyrus.example.aes.AESActivity
import com.cyrus.example.base64.Base64Activity
import com.cyrus.example.crc32.CRC32Activity
import com.cyrus.example.hmac.HMACActivity
import com.cyrus.example.md5.MD5Activity
import com.cyrus.example.sha1.SHA1Activity

class CryptoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_crypto, container, false)

        view.findViewById<Button>(R.id.button_aes).setOnClickListener {
            startActivity(Intent(requireContext(), AESActivity::class.java))
        }
        view.findViewById<Button>(R.id.button_base64).setOnClickListener {
            startActivity(Intent(requireContext(), Base64Activity::class.java))
        }
        view.findViewById<Button>(R.id.button_crc32).setOnClickListener {
            startActivity(Intent(requireContext(), CRC32Activity::class.java))
        }
        view.findViewById<Button>(R.id.button_md5).setOnClickListener {
            startActivity(Intent(requireContext(), MD5Activity::class.java))
        }
        view.findViewById<Button>(R.id.button_sha1).setOnClickListener {
            startActivity(Intent(requireContext(), SHA1Activity::class.java))
        }
        view.findViewById<Button>(R.id.button_hmac).setOnClickListener {
            startActivity(Intent(requireContext(), HMACActivity::class.java))
        }
        return view
    }
}
