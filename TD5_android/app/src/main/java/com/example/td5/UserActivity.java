package com.example.td5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.td5.adapter.ContactsAdapter;
import com.example.td5.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class UserActivity extends AppCompatActivity {

    public List<Contact> contactList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvContacts);

        //init contacts
        contactList.add(new Contact("Jean","Pierre","https://histoire-image.org/sites/default/jeanne-arc-sacre-charlesvii.jpg"));
        contactList.add(new Contact("Newton","Issak","https://histoire-image.org/sites/default/jeanne-arc-sacre-charlesvii.jpg"));
        contactList.add(new Contact("Einshten","Albert","https://histoire-image.org/sites/default/jeanne-arc-sacre-charlesvii.jpg"));
        contactList.add(new Contact("louis","Nico","https://histoire-image.org/sites/default/jeanne-arc-sacre-charlesvii.jpg"));
        contactList.add(new Contact("ali","el bikri","https://histoire-image.org/sites/default/jeanne-arc-sacre-charlesvii.jpg"));
        contactList.add(new Contact("Richard","Menez","https://histoire-image.org/sites/default/jeanne-arc-sacre-charlesvii.jpg"));
        contactList.add(new Contact("el bikri","rahhal","https://histoire-image.org/sites/default/jeanne-arc-sacre-charlesvii.jpg"));

        ContactsAdapter contactsAdapter = new ContactsAdapter(contactList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}