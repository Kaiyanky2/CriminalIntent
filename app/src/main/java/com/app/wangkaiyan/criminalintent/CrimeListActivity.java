package com.app.wangkaiyan.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by wangkaiyan on 2016/8/11.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
