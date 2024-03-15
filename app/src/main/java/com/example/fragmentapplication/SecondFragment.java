package com.example.fragmentapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class SecondFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_second , container , false);

       Button btn2 = view.findViewById(R.id.btn_second);
       TextView textView = view.findViewById(R.id.tv_frag2);

       btn2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(getActivity() ,"Second Fragment is Started" , Toast.LENGTH_LONG).show();
           }
       });

       return view;
    }
}