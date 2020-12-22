package com.doubleslash.picky.timetable;

import android.content.Context;

import androidx.lifecycle.ViewModel;

import com.alamkanak.weekview.WeekView;

public class TimetableViewModel extends ViewModel {

    private Context mContext;
    private WeekView mWeekView;

    public TimetableViewModel(Context mContext, WeekView mWeekView) {
        this.mContext = mContext;
        this.mWeekView = mWeekView;
    }

}