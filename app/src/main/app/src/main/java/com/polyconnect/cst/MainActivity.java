package com.polyconnect.cst;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    int blue = Color.rgb(28, 75, 150);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout page = new LinearLayout(this);
        page.setOrientation(LinearLayout.VERTICAL);
        page.setPadding(24, 36, 24, 24);
        page.setBackgroundColor(Color.rgb(245, 247, 252));

        TextView title = new TextView(this);
        title.setText("PolyConnect");
        title.setTextSize(30);
        title.setTextColor(blue);
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, 20, 0, 8);
        page.addView(title);

        TextView subtitle = new TextView(this);
        subtitle.setText("Pabna Government Polytechnic Institute");
        subtitle.setTextSize(14);
        subtitle.setTextColor(Color.DKGRAY);
        subtitle.setGravity(Gravity.CENTER);
        subtitle.setPadding(0, 0, 0, 28);
        page.addView(subtitle);

        addCard(page, "📢 Notices", "Class updates and announcements");
        addCard(page, "📚 Class Tracker", "Current class and next period");
        addCard(page, "🗓 Class Routine", "Your weekly class schedule");
        addCard(page, "✅ Attendance", "Mark your attendance");
        addCard(page, "🏫 Room Updates", "Check classroom changes");
        addCard(page, "👤 Student Login", "Student access and registration");

        setContentView(page);
    }

    void addCard(LinearLayout page, String heading, String detail) {
        LinearLayout card = new LinearLayout(this);
        card.setOrientation(LinearLayout.VERTICAL);
        card.setPadding(18, 16, 18, 16);
        card.setBackgroundColor(Color.WHITE);

        LinearLayout.LayoutParams params =
            new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            );
        params.setMargins(0, 0, 0, 12);

        TextView h = new TextView(this);
        h.setText(heading);
        h.setTextSize(18);
        h.setTextColor(blue);
        card.addView(h);

        TextView d = new TextView(this);
        d.setText(detail);
        d.setTextSize(14);
        d.setTextColor(Color.DKGRAY);
        d.setPadding(0, 6, 0, 0);
        card.addView(d);

        page.addView(card, params);
    }
}
