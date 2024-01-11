package com.example.eni_shop.ui.detailarticle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.eni_shop.R
import com.example.eni_shop.databinding.FragmentDetailArticleBinding
import com.example.eni_shop.databinding.FragmentListeArticleBinding


class DetailArticleFragment : Fragment() {

    val args by navArgs<DetailArticleFragmentArgs>()
    lateinit var binding: FragmentDetailArticleBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailArticleBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val article = args.article
        binding.article = article
    }


}