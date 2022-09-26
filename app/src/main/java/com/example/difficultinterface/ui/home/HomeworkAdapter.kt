package com.example.difficultinterface.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.difficultinterface.R
import com.example.difficultinterface.databinding.ItemHomeworkBinding
import com.example.difficultinterface.model.HomeworkData

class HomeworkAdapter :
    RecyclerView.Adapter<HomeworkAdapter.HomeworkViewHolder>() {

    private var data: List<HomeworkData> = arrayListOf()

    fun setData(data: List<HomeworkData>) {
        this.data = data
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HomeworkViewHolder {
        val binding =
            ItemHomeworkBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return HomeworkViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HomeworkViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class HomeworkViewHolder(private val binding: ItemHomeworkBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: HomeworkData) {
            with(binding) {
                nameHomework.text = data.name
                timeHomework.text = data.time
                descriptionText.text = data.description

                if (data.bigIcon.isNotEmpty()) {
                    fabBigIcon.setImageResource(R.drawable.ic_baseline_menu_book_24)
                }
                if (data.boys) {
                    fabBoys.visibility = View.VISIBLE
                }
                if (data.girls) {
                    fabGirls.visibility = View.VISIBLE
                }
            }
        }
    }
}