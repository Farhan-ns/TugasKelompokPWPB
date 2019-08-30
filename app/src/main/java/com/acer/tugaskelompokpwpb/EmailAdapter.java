package com.acer.tugaskelompokpwpb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.Random;

public class EmailAdapter extends RecyclerView.Adapter<EmailAdapter.ViewHolder> {

    private List<Email> emails;
    private int[] colors = {R.color.mailColor1, R.color.mailColor2, R.color.mailColor3, R.color.mailColor4,
            R.color.mailColor5, R.color.mailColor6
    };
    Random random = new Random();
    Context context;

    public EmailAdapter(List<Email> emails) {
        this.emails = emails;
    }

    @Override
    public EmailAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.view_lv_email,
                parent,
                false
        );
        this.context = parent.getContext();
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(EmailAdapter.ViewHolder holder, int position) {
        Email email = emails.get(position);
        holder.textFrom.setText(email.getFrom());
        holder.textSubject.setText(email.getSubject());
        holder.textContent.setText(email.getContent());
        holder.textReceivedTime.setText(email.getReceivedTime());

        String initial = email.getFrom().substring(0 , 1);
        holder.textInitial.setText(initial);

        int color = colors[random.nextInt(6)];
        holder.imageView.setColorFilter(ContextCompat.getColor(context, color));
    }

    @Override
    public int getItemCount() {
        return emails.size();
    }

    public static class ViewHolder  extends RecyclerView.ViewHolder {
        TextView textFrom, textSubject, textContent, textReceivedTime, textInitial;
        ImageView imageView;
        public ViewHolder(View v) {
            super(v);
            textFrom = v.findViewById(R.id.text_email_from);
            textSubject = v.findViewById(R.id.text_email_subject);
            textContent = v.findViewById(R.id.text_email_content);
            textReceivedTime = v.findViewById(R.id.text_email_received_time);
            textInitial = v.findViewById(R.id.text_initial);
            imageView = v.findViewById(R.id.image_circle);
        }
    }
}
