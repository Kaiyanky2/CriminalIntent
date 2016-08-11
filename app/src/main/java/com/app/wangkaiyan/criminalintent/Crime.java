package com.app.wangkaiyan.criminalintent;

import java.util.UUID;

/**
 * Created by wangkaiyan on 2016/8/10.
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime() {
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
