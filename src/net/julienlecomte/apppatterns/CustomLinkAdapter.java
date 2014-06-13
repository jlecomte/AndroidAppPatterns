package net.julienlecomte.apppatterns;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomLinkAdapter extends ArrayAdapter<Link> {

	public CustomLinkAdapter(Context context, ArrayList<Link> links) {
		super(context, 0, links);
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Link link = getItem(position);
		
		if (convertView == null) {
			convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_row, parent, false);
		}
		
		TextView titleTextView = (TextView) convertView.findViewById(R.id.titleTextView);
		TextView domainTextView = (TextView) convertView.findViewById(R.id.domainTextView);
		TextView tag1TextView = (TextView) convertView.findViewById(R.id.tag1TextView);
		TextView tag2TextView = (TextView) convertView.findViewById(R.id.tag2TextView);
		TextView tag3TextView = (TextView) convertView.findViewById(R.id.tag3TextView);
		
		titleTextView.setText(link.title);
		domainTextView.setText(link.domain);
		tag1TextView.setText(link.tag1);
		tag2TextView.setText(link.tag2);
		tag3TextView.setText(link.tag3);
		
		return convertView;
	}

}
