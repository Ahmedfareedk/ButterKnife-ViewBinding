package com.example.ahmed.butterknife;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.ExtractedTextRequest;
import android.widget.ListAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ahmed on 12/10/17.
 */

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.MyViewHolder> {

    private List<Contact> contacts;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.name)
        TextView name;

        @BindView(R.id.mobile)
        TextView mobile;


        public MyViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }

    public ContactsAdapter(List<Contact> contacts) {
        this.contacts = contacts;

    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.contacts_list_row, parent, false);
        return new MyViewHolder(view);
    }

        @Override
        public void onBindViewHolder (MyViewHolder holder, int position){

        Contact contact = contacts.get(position);
        holder.name.setText(contact.getName());
        holder.mobile.setText(contact.getMobile());

        }

        @Override
        public int getItemCount () {
            return contacts.size();
        }
    }

