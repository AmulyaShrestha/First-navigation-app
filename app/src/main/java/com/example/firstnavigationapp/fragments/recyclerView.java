package com.example.firstnavigationapp.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.firstnavigationapp.MainActivity;
import com.example.firstnavigationapp.R;
import com.example.firstnavigationapp.adapters.ContactsAdapter;
import com.example.firstnavigationapp.classes.Contacts;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class recyclerView extends Fragment {
    private RecyclerView recyclerView;

    public recyclerView() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recycler_view, container, false);

        // binding
        recyclerView = view.findViewById(R.id.recyclerView);

        // data
        List<Contacts> contactList = new ArrayList<>();
        contactList.add(new Contacts("First", "98989898", R.drawable.a));
        contactList.add(new Contacts("Second", "98989898", R.drawable.b));
        contactList.add(new Contacts("Third", "98989898", R.drawable.a));
        contactList.add(new Contacts("First", "98989898", R.drawable.a));
        contactList.add(new Contacts("Second", "98989898", R.drawable.b));
        contactList.add(new Contacts("Third", "98989898", R.drawable.a));
        contactList.add(new Contacts("First", "98989898", R.drawable.a));
        contactList.add(new Contacts("Second", "98989898", R.drawable.b));
        contactList.add(new Contacts("Third", "98989898", R.drawable.a));
        contactList.add(new Contacts("First", "98989898", R.drawable.a));
        contactList.add(new Contacts("Second", "98989898", R.drawable.b));
        contactList.add(new Contacts("Third", "98989898", R.drawable.a));

        ContactsAdapter contactsAdapter = new ContactsAdapter(view.getContext(), contactList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        return view;
    }

}
