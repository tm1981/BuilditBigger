package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import il.co.techmobile.jockactivity.JockActivity;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        Button button = root.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new EndpointsAsyncTask(new EndpointsAsyncTask.TaskCompleteListener() {
                    @Override
                    public void onTaskComplete(String result) {
                        Intent intent = new Intent(getActivity(), JockActivity.class);
                        intent.putExtra("jock",result);
                        getActivity().startActivity(intent);
                    }
                }).execute(new Pair<Context, String>(getActivity(), "jock"));
            }
        });

        return root;
    }
}
