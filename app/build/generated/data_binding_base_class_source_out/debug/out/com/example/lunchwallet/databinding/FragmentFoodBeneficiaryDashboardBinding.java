// Generated by view binder compiler. Do not edit!
package com.example.lunchwallet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.lunchwallet.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class FragmentFoodBeneficiaryDashboardBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  private FragmentFoodBeneficiaryDashboardBinding(@NonNull FrameLayout rootView) {
    this.rootView = rootView;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFoodBeneficiaryDashboardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFoodBeneficiaryDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_food_beneficiary_dashboard, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFoodBeneficiaryDashboardBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    return new FragmentFoodBeneficiaryDashboardBinding((FrameLayout) rootView);
  }
}
