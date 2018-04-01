package com.example.ikhsanlaisa.ikhsan_1202150084_modul6.fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class MyPostsFragment extends PostListFragment {

    public MyPostsFragment() {}



    @Override

    public Query getQuery(DatabaseReference databaseReference) {

        // All my posts

        return databaseReference.child("user-posts")

                .child(getUid());

    }
}
