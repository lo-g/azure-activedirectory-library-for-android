/**
 * Copyright (c) Microsoft Corporation. All rights reserved. 
 */

package com.microsoft.adal;

import java.io.Serializable;

public class UserInfo implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 8790127561636702672L;

    private String mUserId;

    private String mGivenName;

    private String mFamilyName;

    private String mIdentityProvider;

    private boolean mIsUserIdDisplayable;

    public UserInfo() {

    }

    public UserInfo(String userid, String givenName, String familyName, String identityProvider,
            boolean isDisplayable) {
        mUserId = userid;
        mGivenName = givenName;
        mFamilyName = familyName;
        mIdentityProvider = identityProvider;
        mIsUserIdDisplayable = isDisplayable;
    }

    public String getUserId() {
        return mUserId;
    }

    public boolean getIsUserIdDisplayable() {
        return mIsUserIdDisplayable;
    }

    public String getGivenName() {
        return mGivenName;
    }

    public String getFamilyName() {
        return mFamilyName;
    }

    public String getIdentityProvider() {
        return mIdentityProvider;
    }
}
