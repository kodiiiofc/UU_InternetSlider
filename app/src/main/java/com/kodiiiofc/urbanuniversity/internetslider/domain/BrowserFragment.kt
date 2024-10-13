package com.kodiiiofc.urbanuniversity.internetslider.domain

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.kodiiiofc.urbanuniversity.internetslider.R

class BrowserFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_browser, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val page = arguments?.getSerializable("page") as Page
        val browserWV = view.findViewById<WebView>(R.id.wv_browser)
        browserWV.webViewClient = WebViewClient()
        browserWV.loadUrl(page.url)
    }

}