package com.udacity.asteroidradar;

import java.lang.System;

/**
 * @param asteroidList pass in list generated with items
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/udacity/asteroidradar/AsteroidAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/udacity/asteroidradar/Asteroid;", "Lcom/udacity/asteroidradar/AsteroidAdapter$AsteroidViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "AsteroidViewHolder", "DiffCallback", "app_debug"})
public final class AsteroidAdapter extends androidx.recyclerview.widget.ListAdapter<com.udacity.asteroidradar.Asteroid, com.udacity.asteroidradar.AsteroidAdapter.AsteroidViewHolder> {
    
    /**
     * Creates a new ViewHolder with AsteroidViewHolder as template, this function is only called initially
     * This is a required method RecyclerView.Adapter class
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.udacity.asteroidradar.AsteroidAdapter.AsteroidViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    /**
     * This binds existing views with new data, this function is called multiple times
     * This is a required method RecyclerView.Adapter class
     * this function will be called multiple times
     */
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.udacity.asteroidradar.AsteroidAdapter.AsteroidViewHolder holder, int position) {
    }
    
    public AsteroidAdapter() {
        super(null);
    }
    
    /**
     * ViewHolder class, constructor creates View object
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/udacity/asteroidradar/AsteroidAdapter$AsteroidViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/udacity/asteroidradar/databinding/AsteroidItemBinding;", "(Lcom/udacity/asteroidradar/databinding/AsteroidItemBinding;)V", "bind", "", "asteroid", "Lcom/udacity/asteroidradar/Asteroid;", "app_debug"})
    public static final class AsteroidViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.udacity.asteroidradar.databinding.AsteroidItemBinding binding = null;
        
        /**
         * Puts data into the views
         * @param Asteroid object
         */
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.udacity.asteroidradar.Asteroid asteroid) {
        }
        
        public AsteroidViewHolder(@org.jetbrains.annotations.NotNull()
        com.udacity.asteroidradar.databinding.AsteroidItemBinding binding) {
            super(null);
        }
    }
    
    /**
     * DiffUtil is a utility class that calculates
     * the difference between two lists
     * and outputs a list of update operations
     * that converts the first list into the second one
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/udacity/asteroidradar/AsteroidAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/udacity/asteroidradar/Asteroid;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.udacity.asteroidradar.Asteroid> {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.udacity.asteroidradar.Asteroid oldItem, @org.jetbrains.annotations.NotNull()
        com.udacity.asteroidradar.Asteroid newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.udacity.asteroidradar.Asteroid oldItem, @org.jetbrains.annotations.NotNull()
        com.udacity.asteroidradar.Asteroid newItem) {
            return false;
        }
        
        public DiffCallback() {
            super();
        }
    }
}