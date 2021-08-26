package com.udacity.asteroidradar;

import java.lang.System;

/**
 * @param asteroidList pass in list generated with items
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0010\u0011\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/udacity/asteroidradar/AsteroidAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/udacity/asteroidradar/domain/Asteroid;", "Lcom/udacity/asteroidradar/AsteroidAdapter$AsteroidViewHolder;", "onClickListener", "Lcom/udacity/asteroidradar/AsteroidAdapter$OnClickListener;", "(Lcom/udacity/asteroidradar/AsteroidAdapter$OnClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "AsteroidViewHolder", "DiffCallback", "OnClickListener", "app_debug"})
public final class AsteroidAdapter extends androidx.recyclerview.widget.ListAdapter<com.udacity.asteroidradar.domain.Asteroid, com.udacity.asteroidradar.AsteroidAdapter.AsteroidViewHolder> {
    private final com.udacity.asteroidradar.AsteroidAdapter.OnClickListener onClickListener = null;
    
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
     */
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.udacity.asteroidradar.AsteroidAdapter.AsteroidViewHolder holder, int position) {
    }
    
    public AsteroidAdapter(@org.jetbrains.annotations.NotNull()
    com.udacity.asteroidradar.AsteroidAdapter.OnClickListener onClickListener) {
        super(null);
    }
    
    /**
     * ViewHolder class, constructor creates View object
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/udacity/asteroidradar/AsteroidAdapter$AsteroidViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/udacity/asteroidradar/databinding/AsteroidItemBinding;", "(Lcom/udacity/asteroidradar/databinding/AsteroidItemBinding;)V", "bind", "", "asteroid", "Lcom/udacity/asteroidradar/domain/Asteroid;", "app_debug"})
    public static final class AsteroidViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.udacity.asteroidradar.databinding.AsteroidItemBinding binding = null;
        
        /**
         * Puts data into the views
         * @param Asteroid object
         */
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.udacity.asteroidradar.domain.Asteroid asteroid) {
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
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/udacity/asteroidradar/AsteroidAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/udacity/asteroidradar/domain/Asteroid;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.udacity.asteroidradar.domain.Asteroid> {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.udacity.asteroidradar.domain.Asteroid oldItem, @org.jetbrains.annotations.NotNull()
        com.udacity.asteroidradar.domain.Asteroid newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.udacity.asteroidradar.domain.Asteroid oldItem, @org.jetbrains.annotations.NotNull()
        com.udacity.asteroidradar.domain.Asteroid newItem) {
            return false;
        }
        
        public DiffCallback() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B(\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004R,\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/udacity/asteroidradar/AsteroidAdapter$OnClickListener;", "", "onClickListener", "Lkotlin/Function1;", "Lcom/udacity/asteroidradar/domain/Asteroid;", "Lkotlin/ParameterName;", "name", "asteroid", "", "(Lkotlin/jvm/functions/Function1;)V", "getOnClickListener", "()Lkotlin/jvm/functions/Function1;", "onClick", "app_debug"})
    public static final class OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<com.udacity.asteroidradar.domain.Asteroid, kotlin.Unit> onClickListener = null;
        
        public final void onClick(@org.jetbrains.annotations.NotNull()
        com.udacity.asteroidradar.domain.Asteroid asteroid) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<com.udacity.asteroidradar.domain.Asteroid, kotlin.Unit> getOnClickListener() {
            return null;
        }
        
        public OnClickListener(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.udacity.asteroidradar.domain.Asteroid, kotlin.Unit> onClickListener) {
            super();
        }
    }
}