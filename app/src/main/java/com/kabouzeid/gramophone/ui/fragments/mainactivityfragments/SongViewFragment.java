package com.kabouzeid.gramophone.ui.fragments.mainactivityfragments;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.kabouzeid.gramophone.R;
import com.kabouzeid.gramophone.adapter.songadapter.SongAdapter;

/**
 * Created by karim on 29.12.14.
 */
public class SongViewFragment extends AbsMainActivityRecyclerViewFragment {
    public static final String TAG = SongViewFragment.class.getSimpleName();

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_songview;
    }

    @Override
    protected RecyclerView.LayoutManager getLayoutManager() {
        return new GridLayoutManager(getActivity(), 1);
    }

    @Override
    protected RecyclerView.Adapter getAdapter() {
        return new SongAdapter(getActivity());
    }
}
