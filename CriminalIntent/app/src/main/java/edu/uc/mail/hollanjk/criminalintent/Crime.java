package edu.uc.mail.hollanjk.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Jake on 2/22/2016.
 */
public class Crime {

    private String mTitle;
    private UUID mId;
    private Date mDate;
    private boolean mSolved;

    public UUID getId() {
        return mId;
    }


    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }


    public Crime() {
        // Generate unique identifier
        mId = UUID.randomUUID();
        mDate = new Date();
    }


    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
