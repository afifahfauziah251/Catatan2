package com.fila.catatan
//Untuk Memasukan Data Lewat Codingan
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_catatan_list.*
class CatatanFragment : Fragment() {
    lateinit var listCatatan:ArrayList<ListCatatan>

    private fun simulasiCatatan() {
        listCatatan = ArrayList()
        listCatatan.add(ListCatatan(
            "Kampus","MAtkul hari senin"))
        listCatatan.add(ListCatatan(
            "",""))
        listCatatan.add(ListCatatan(
            "", ""))
        listCatatan.add(ListCatatan(
            "", ""))
        listCatatan.add(ListCatatan(
            "", ""))
        listCatatan.add(ListCatatan(
            "", ""))
        listCatatan.add(ListCatatan(
            "", ""))
        listCatatan.add(ListCatatan(
            "", ""))
    }
    private fun tampilTeman(){
        rv_listCatatan.layoutManager=LinearLayoutManager(activity)
        rv_listCatatan.adapter=CatatanAdapter(requireActivity(), listCatatan)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
        ): View? {
        return inflater.inflate(
            R.layout.fragment_catatan_list, container, false)

    }


    override fun onViewCreated(
        view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

        private fun initView(){
            simulasiCatatan()
            tampilTeman()
        }
        override fun onDestroy() {
            super.onDestroy()
            this.clearFindViewByIdCache()
        }
    }
