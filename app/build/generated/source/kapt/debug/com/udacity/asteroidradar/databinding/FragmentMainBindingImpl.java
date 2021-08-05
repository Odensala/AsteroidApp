package com.udacity.asteroidradar.databinding;
import com.udacity.asteroidradar.R;
import com.udacity.asteroidradar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMainBindingImpl extends FragmentMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.activity_main_image_of_the_day_layout, 3);
        sViewsWithIds.put(R.id.textView, 4);
        sViewsWithIds.put(R.id.status_loading_wheel, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[1]
            , (android.widget.FrameLayout) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (android.widget.ProgressBar) bindings[5]
            , (android.widget.TextView) bindings[4]
            );
        this.activityMainImageOfTheDay.setTag(null);
        this.asteroidRecycler.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.udacity.asteroidradar.main.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.udacity.asteroidradar.main.MainViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelAsteroidsForFragment((androidx.lifecycle.LiveData<java.util.List<com.udacity.asteroidradar.Asteroid>>) object, fieldId);
            case 1 :
                return onChangeViewModelDailyPicture((androidx.lifecycle.LiveData<com.udacity.asteroidradar.PictureOfDay>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelAsteroidsForFragment(androidx.lifecycle.LiveData<java.util.List<com.udacity.asteroidradar.Asteroid>> ViewModelAsteroidsForFragment, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDailyPicture(androidx.lifecycle.LiveData<com.udacity.asteroidradar.PictureOfDay> ViewModelDailyPicture, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.util.List<com.udacity.asteroidradar.Asteroid> viewModelAsteroidsForFragmentGetValue = null;
        com.udacity.asteroidradar.main.MainViewModel viewModel = mViewModel;
        androidx.lifecycle.LiveData<java.util.List<com.udacity.asteroidradar.Asteroid>> viewModelAsteroidsForFragment = null;
        androidx.lifecycle.LiveData<com.udacity.asteroidradar.PictureOfDay> viewModelDailyPicture = null;
        com.udacity.asteroidradar.PictureOfDay viewModelDailyPictureGetValue = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.asteroidsForFragment
                        viewModelAsteroidsForFragment = viewModel.getAsteroidsForFragment();
                    }
                    updateLiveDataRegistration(0, viewModelAsteroidsForFragment);


                    if (viewModelAsteroidsForFragment != null) {
                        // read viewModel.asteroidsForFragment.getValue()
                        viewModelAsteroidsForFragmentGetValue = viewModelAsteroidsForFragment.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.dailyPicture
                        viewModelDailyPicture = viewModel.getDailyPicture();
                    }
                    updateLiveDataRegistration(1, viewModelDailyPicture);


                    if (viewModelDailyPicture != null) {
                        // read viewModel.dailyPicture.getValue()
                        viewModelDailyPictureGetValue = viewModelDailyPicture.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.udacity.asteroidradar.BindingAdaptersKt.bindImage(this.activityMainImageOfTheDay, viewModelDailyPictureGetValue);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.udacity.asteroidradar.BindingAdaptersKt.bindRecyclerView(this.asteroidRecycler, viewModelAsteroidsForFragmentGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.asteroidsForFragment
        flag 1 (0x2L): viewModel.dailyPicture
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}