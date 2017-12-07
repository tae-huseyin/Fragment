package com.example.theappexperts.fragment;

import com.example.theappexperts.fragment.fragments.SecondFragment;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by TheAppExperts on 07/12/2017.
 */

public class TestingFragmentTwo {

    @Rule
    public FragmentTestRule<SecondFragment> secondFragmentFragmentTestRule = new FragmentTestRule<>(SecondFragment.class);

    @Before
    public void setUp() throws Exception {
        secondFragmentFragmentTestRule.launchActivity(null);
    }

    @Test
    public void fragment_can_instantiated() {
        onView(withId(R.id.fragmentContainer)).check(matches(isDisplayed()));
    }

    @Test
    public void fragment_two_has_text()
    {
        onView(withId(R.id.tvFrag2)).check(matches(withText(R.string.hello_fragment_two)));
    }
}
