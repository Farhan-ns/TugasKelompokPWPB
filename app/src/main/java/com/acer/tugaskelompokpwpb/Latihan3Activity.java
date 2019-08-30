package com.acer.tugaskelompokpwpb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Latihan3Activity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Email> emails = new ArrayList<>();

    String[] froms = {"Sam", "Facebook", "Google+", "Twitter", "Pinterest Weekly", "Josh"};
    String[] subjects = {"Weekend Adventure", "James, you have 1 notification", "Top Suggested pages for you",
            "Follow T-Mobile, Samsung Mobile U", "Pins you'll love!", "Going Lunch"};
    String[] contents = {
            "Let's Go fishing with john and others. We will do..",
            "A lot has happened to Facebook since",
            "Top Suggested pages for you",
            "James, some people you might know",
            "Have you seen these pins yet, Pinterest",
            "Don't forget our lunch at 3 PM in Pizza Hut"
    };
    String[] times = {"10:42am", "16:04pm", "18:44pm", "20:04pm", "09:04am", "01:04am"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan3);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(
                Latihan3Activity.this,
                RecyclerView.VERTICAL,
                false)
        );

        for (int i = 0; i < froms.length;i++) {
            emails.add(new Email(
                    froms[i],
                    subjects[i],
                    contents[i],
                    times[i]
            ));
        }

        recyclerView.setAdapter(new EmailAdapter(emails));
    }

    private void setInitial() {

    }

}
