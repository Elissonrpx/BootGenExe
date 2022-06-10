package com.example.ex_fragments_navcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ex_fragments_navcomponent.adapter.TarefaAdapter
import com.example.ex_fragments_navcomponent.databinding.FragmentListBinding
import com.example.ex_fragments_navcomponent.model.Tarefa

class ListFragment : Fragment() {
    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding=FragmentListBinding.inflate(layoutInflater, container, false)

        val listTarefas = listOf(
            Tarefa(
                "Lavar a Louça",
                "Lavar a louça do dia",
                "Elisson",
                "2022-08-06",
                false,
                "Dia a dia"
            ),
            Tarefa(
                "Lavar a Louça",
                "Lavar a louça do dia",
                "Elisson",
                "2022-08-06",
                false,
                "Dia a dia"
            ),
            Tarefa(
                "Lavar a Louça",
                "Lavar a louça do dia",
                "Elisson",
                "2022-08-06",
                false,
                "Dia a dia"
            )
        )
        //configuração do recyclerview
        val adapter = TarefaAdapter()
        binding.recyclerTarefa.layoutManager = LinearLayoutManager(context)
        binding.recyclerTarefa.adapter = adapter
        binding.recyclerTarefa.setHasFixedSize(true)

        adapter.setlist(listTarefas)

        binding.floatingAdd.setOnClickListener{

            findNavController().navigate(R.id.action_listFragment_to_formFragment)
        }

        return binding.root
    }

}