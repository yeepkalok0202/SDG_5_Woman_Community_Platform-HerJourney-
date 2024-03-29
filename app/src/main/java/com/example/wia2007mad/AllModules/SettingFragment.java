package com.example.wia2007mad.AllModules;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.wia2007mad.AllModules.utilities.Constants;
import com.example.wia2007mad.AllModules.utilities.PreferenceManager;
import com.example.wia2007mad.R;
import com.example.wia2007mad.databinding.FragmentSettingBinding;
import com.google.firebase.auth.FirebaseAuth;

import java.time.Duration;


public class SettingFragment extends Fragment {
    private FragmentSettingBinding binding;
    private boolean quit;
    private PreferenceManager preferenceManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding= FragmentSettingBinding.inflate(inflater,container,false);

        binding.changepasswordbuttoninsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),ResetPassword.class);
                startActivity(intent);
            }
        });

        binding.logoutbuttoninsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create the dialog using 'getContext()' for the activity context
                final Dialog dialog = new Dialog(getContext());
                dialog.setContentView(R.layout.overlay_confirm);

                // Initialize the views
                TextView cancel = dialog.findViewById(R.id.popupcancel);
                TextView ok = dialog.findViewById(R.id.popupok);
                TextView title = dialog.findViewById(R.id.popuptitle);
                TextView content = dialog.findViewById(R.id.popupcontent);

                // Set text
                title.setText("Sign out");
                content.setText("Continue this action?");

                // Set the close button action
                cancel.setOnClickListener(v1 -> {
                    dialog.dismiss();
                    quit = false;
                });
                ok.setOnClickListener(v1 -> {
                    dialog.dismiss();
                    quit = true;

                    // Perform sign-out logic here
                    Toast.makeText(getContext(), "Signing you out...", Toast.LENGTH_LONG).show();
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            // Navigate back to the LoginActivity (Main Activity)
                            FirebaseAuth.getInstance().signOut();
                            Intent intent = new Intent(getActivity(), RoleChoosing.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                            SharedPreferences sharedPreferences = getActivity().getSharedPreferences("AppPrefs", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.remove(Constants.KEY_EMAIL);
                            editor.remove(Constants.KEY_USER_ID);
                            editor.remove(Constants.KEY_ROLE);
                            editor.putBoolean("isLoggedOut", true);
                            editor.apply();
                            // Finish the current activity
                            getActivity().finish();
                        }
                    }, 100);
                });

                // Set the dialog background to transparent
                if (dialog.getWindow() != null) {
                    dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                }

                // Show the popup dialog
                dialog.show();
            }
        });

        return binding.getRoot();

    }


}