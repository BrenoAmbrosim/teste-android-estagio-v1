// Generated by view binder compiler. Do not edit!
package com.breno.testeandroidestagiov1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.breno.testeandroidestagiov1.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final LinearLayout bottomLayout;

  @NonNull
  public final Button btnFilter;

  @NonNull
  public final Button btnSearch;

  @NonNull
  public final EditText searchField;

  private ActivityMainBinding(@NonNull RelativeLayout rootView, @NonNull LinearLayout bottomLayout,
      @NonNull Button btnFilter, @NonNull Button btnSearch, @NonNull EditText searchField) {
    this.rootView = rootView;
    this.bottomLayout = bottomLayout;
    this.btnFilter = btnFilter;
    this.btnSearch = btnSearch;
    this.searchField = searchField;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottomLayout;
      LinearLayout bottomLayout = ViewBindings.findChildViewById(rootView, id);
      if (bottomLayout == null) {
        break missingId;
      }

      id = R.id.btnFilter;
      Button btnFilter = ViewBindings.findChildViewById(rootView, id);
      if (btnFilter == null) {
        break missingId;
      }

      id = R.id.btnSearch;
      Button btnSearch = ViewBindings.findChildViewById(rootView, id);
      if (btnSearch == null) {
        break missingId;
      }

      id = R.id.searchField;
      EditText searchField = ViewBindings.findChildViewById(rootView, id);
      if (searchField == null) {
        break missingId;
      }

      return new ActivityMainBinding((RelativeLayout) rootView, bottomLayout, btnFilter, btnSearch,
          searchField);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
