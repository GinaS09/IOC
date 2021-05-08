package com.example.cbir.adapters;
import com.example.cbir.R;
import com.example.cbir.models.CommentModel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;
import java.util.Map;

public class CommentAdapter extends ArrayAdapter<CommentModel> {
    public CommentAdapter(@NonNull Context context, int resource, @NonNull List<CommentModel> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.comment_item, null);
        }

        CommentModel comm = getItem(position);

        TextView nameComm = convertView.findViewById(R.id.nameComm);
        TextView commM = convertView.findViewById(R.id.comm);

        nameComm.setText(comm.getUsername());
        commM.setText(comm.getComment());


        return  convertView;
    }

}
