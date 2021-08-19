package com.udacity.asteroidradar.main

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.udacity.asteroidradar.AsteroidAdapter
import com.udacity.asteroidradar.R
import com.udacity.asteroidradar.api.AsteroidFilter
import com.udacity.asteroidradar.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(this).get(MainViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentMainBinding.inflate(inflater)

        // Set the lifecycleOwner so DataBinding can observe LiveData
        binding.lifecycleOwner = this

        binding.viewModel = viewModel

        val asteroidAdapter = AsteroidAdapter(AsteroidAdapter.OnClickListener {
            viewModel.displayAsteroidDetails(it)
        })

        // Instantiates AsteroidAdapter
        binding.asteroidRecycler.adapter = asteroidAdapter

        // Navigation
        viewModel.navigateToSelectedAsteroid.observe(viewLifecycleOwner, Observer {
            if (null != it) {
                this.findNavController().navigate(MainFragmentDirections.actionShowDetail(it))
                viewModel.displayAsteroidCompleted()
            }
        })

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.main_overflow_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    /**
     * Displays filtered result according to menu choice
     */
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        observeAsteroids()
        viewModel.updateFilter(
            when (item.itemId) {
                R.id.show_today_menu -> AsteroidFilter.SHOW_TODAY
                R.id.show_week_menu -> AsteroidFilter.SHOW_WEEK
                else -> AsteroidFilter.SHOW_SAVE
            }

        )
        Log.i("MainFragment", "onOptionsItemSelected returned true")
        return true

    }

    private fun observeAsteroids() {
        viewModel.asteroidsForFragment.observe(viewLifecycleOwner, Observer {
            // Not entirely sure what to implement here
        })
    }
}

