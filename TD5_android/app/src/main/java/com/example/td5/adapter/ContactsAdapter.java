package com.example.td5.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.td5.R;
import com.example.td5.model.Contact;

import org.w3c.dom.Text;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder> {

    private final List<Contact> contacts;

    public ContactsAdapter(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View contactView = layoutInflater.inflate(R.layout.item_contact,parent,false);
        return new ViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Contact contact = contacts.get(position);
        TextView firstnameTextView = holder.firstnameView;
        firstnameTextView.setText(contact.getPrenom());
        TextView lastnameTextView = holder.lastnameView;
        lastnameTextView.setText(contact.getNom());
        ImageView imageView = holder.imageView;
        Glide.with(holder.itemView).load(contact.getImageURL()).into(imageView);
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView firstnameView;
        public TextView lastnameView;
        public ImageView imageView;

        public ViewHolder(View itemView){
            super(itemView);

            firstnameView = (TextView) itemView.findViewById(R.id.firstname);
            lastnameView = (TextView) itemView.findViewById(R.id.lastname);
            imageView = (ImageView) itemView.findViewById(R.id.image);
        }
    }
}
