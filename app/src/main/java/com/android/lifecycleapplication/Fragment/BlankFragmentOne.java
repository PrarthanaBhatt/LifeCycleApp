package com.android.lifecycleapplication.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.lifecycleapplication.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragmentOne#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragmentOne extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BlankFragmentOne() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragmentOne.
     */
    // TODO: Rename and change types and number of parameters
    public static BlankFragmentOne newInstance(String param1, String param2) {
        BlankFragmentOne fragment = new BlankFragmentOne();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i("FragmentOne","-----** attach fragment **----");
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("FragmentOne","-----** create fragment **----");
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i("Fragment","----** create view **----");
        return inflater.inflate(R.layout.fragment_blank_one, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("FragmentOne","----** activity created **----");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("FragmentOne","----** start **----");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("FragmentOne","----** resume **----");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("FragmentOne","----** pause **----");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("FragmentOne","----** stop **----");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("FragmentOne","----** destroy view **----");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("FragmentOne","----** destroy **----");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("FragmentOne","---** detach **---");
    }
}