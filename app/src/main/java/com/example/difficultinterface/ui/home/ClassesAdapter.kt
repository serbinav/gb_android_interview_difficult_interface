package com.example.difficultinterface.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.difficultinterface.R
import com.example.difficultinterface.databinding.ItemClassesBinding
import com.example.difficultinterface.model.ClassesData

class ClassesAdapter(
    private val onItemClick: () -> Unit
) : ListAdapter<ClassesData, ClassesAdapter.ClassesViewHolder>(ClassesItemCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClassesViewHolder {
        val binding =
            ItemClassesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ClassesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ClassesViewHolder, position: Int) {
        holder.bind(currentList[position])
    }

    inner class ClassesViewHolder(private val binding: ItemClassesBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: ClassesData) {
            with(binding) {
                nameClasses.text = data.name
                timeClasses.text = data.time

                if (data.icon.isNotEmpty()) {
                    fabIcon.setImageResource(R.drawable.ic_baseline_arrow_outward_24)
                }
                openInLayout.setOnClickListener { onItemClick.invoke() }
            }
        }
    }
}

class ClassesItemCallback : DiffUtil.ItemCallback<ClassesData>() {
    override fun areItemsTheSame(oldItem: ClassesData, newItem: ClassesData): Boolean {
        return oldItem.name == newItem.name && oldItem.time == newItem.time
    }

    override fun areContentsTheSame(oldItem: ClassesData, newItem: ClassesData): Boolean {
        return oldItem == newItem
    }
}