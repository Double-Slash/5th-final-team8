package com.doubleslash.picky.teamroom;

import androidx.lifecycle.ViewModelProvider;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.doubleslash.picky.R;

public class TeamroomFragment extends Fragment {

    private static final String Tag = "TeamroomFragment";
    private Context mContext;
    private RecyclerView RMRecyclerview;
    private RecyclerView IMRecyclerview;

    private TeamroomViewModel teamroomViewModel;

    public TeamroomFragment(Context mContext) {
        this.mContext = mContext;
    }

//    public static TeamroomFragment newInstance() {
//        return new TeamroomFragment();
//    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_teamroom, container, false);

        Button add_teamroom = rootview.findViewById(R.id.add_teamroom);
        RMRecyclerview = rootview.findViewById(R.id.tr_rm_recyclerview);
        IMRecyclerview = rootview.findViewById(R.id.tr_im_recyclerview);


        return rootview;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        teamroomViewModel = new ViewModelProvider(this).get(TeamroomViewModel.class);
//        mContext =
        // TODO: Use the ViewModel

    }

}