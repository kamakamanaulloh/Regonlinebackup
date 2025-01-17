package com.itrsiam.rsiamuslimat.kartu

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.itrsiam.rsiamuslimat.R


class EkartuAdapter(context: Context, var listItemsTxt: List<EkartuResultItem>): BaseAdapter() {

    val mInflater: LayoutInflater = LayoutInflater.from(context)
    @SuppressLint("SetTextI18n")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val vh: ItemRowHolder
        if (convertView == null) {
            view = mInflater.inflate(R.layout.itempoli, parent, false)
            vh = ItemRowHolder(view)
            view?.tag = vh
        } else {
            view = convertView
            vh = view.tag as ItemRowHolder
        }
        val params = view.layoutParams
        params.height = 60
        view.layoutParams = params

        vh.label.text = listItemsTxt.get(position).custUsrKode+" - "+listItemsTxt.get(position).custUsrNama
        return view
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return listItemsTxt.size
    }

    private class ItemRowHolder(row: View?) {


        val label: TextView = row?.findViewById(R.id.textView) as TextView

    }


}