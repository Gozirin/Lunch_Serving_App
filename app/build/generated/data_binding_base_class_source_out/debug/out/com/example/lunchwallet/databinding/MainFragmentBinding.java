// Generated by view binder compiler. Do not edit!
package com.example.lunchwallet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.lunchwallet.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MainFragmentBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button mainFragmentViewLandingPageButton;

  @NonNull
  public final LinearLayoutCompat pageHeader;

  @NonNull
  public final LinearLayoutCompat pageMain;

  private MainFragmentBinding(@NonNull FrameLayout rootView,
      @NonNull Button mainFragmentViewLandingPageButton, @NonNull LinearLayoutCompat pageHeader,
      @NonNull LinearLayoutCompat pageMain) {
    this.rootView = rootView;
    this.mainFragmentViewLandingPageButton = mainFragmentViewLandingPageButton;
    this.pageHeader = pageHeader;
    this.pageMain = pageMain;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MainFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MainFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.main_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MainFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.main_fragment_view_landing_page_button;
      Button mainFragmentViewLandingPageButton = ViewBindings.findChildViewById(rootView, id);
      if (mainFragmentViewLandingPageButton == null) {
        break missingId;
      }

      id = R.id.page_header;
      LinearLayoutCompat pageHeader = ViewBindings.findChildViewById(rootView, id);
      if (pageHeader == null) {
        break missingId;
      }

      id = R.id.page_main;
      LinearLayoutCompat pageMain = ViewBindings.findChildViewById(rootView, id);
      if (pageMain == null) {
        break missingId;
      }

      return new MainFragmentBinding((FrameLayout) rootView, mainFragmentViewLandingPageButton,
          pageHeader, pageMain);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}