package com.example.theappexperts.fragment;

import com.example.theappexperts.fragment.fragments.FirstFragment;
import com.example.theappexperts.fragment.fragments.SecondFragment;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.shadows.support.v4.SupportFragmentTestUtil;
import org.robolectric.util.FragmentTestUtil;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.robolectric.Shadows.shadowOf;
import static org.robolectric.shadows.support.v4.SupportFragmentTestUtil.startFragment;

/**
 * Created by TheAppExperts on 07/12/2017.
 */

@RunWith(RobolectricTestRunner.class)
public class ButtonTest {

    @Test
    public void testSomething() throws Exception {
        assertNotNull(shadowOf(RuntimeEnvironment.application));
        assertTrue(Robolectric.setupActivity(BaseActivity.class) != null);
    }

    @Test
    public void clickingNewsShouldStartSecondFragment() {

        BaseActivity activity = Robolectric.setupActivity(BaseActivity.class);
        activity.findViewById(R.id.btnNews).performClick();

        SecondFragment fragment = new SecondFragment();
        SupportFragmentTestUtil.startVisibleFragment(fragment);
        assertNotNull(fragment.getView());
    }

}
