package com.rk.lv_iv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

class CustomAdapter extends BaseExpandableListAdapter {
    private Context context;
    private HashMap<String, List<String>> childTitles;
    List<String> headerTitles;

    public CustomAdapter(Context context, List<String> headerTitles, HashMap<String, List<String>> childTitles) {
        this.context = context;
        this.childTitles = childTitles;
        this.headerTitles = headerTitles;
    }

    @Override
    public int getGroupCount() {
        return this.headerTitles.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this.childTitles.get(this.headerTitles.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this.headerTitles.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return this.childTitles.get(this.headerTitles.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String listTitle = (String) getGroup(groupPosition);

        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.group_header, null);
        }

        TextView listTitleTextView = convertView.findViewById(R.id.IDXML_Title);
        listTitleTextView.setText(listTitle);

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final String expandableListText = (String) getChild(groupPosition, childPosition);

        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.child_item, null);
        }

        TextView expandableTextView = convertView.findViewById(R.id.IDXML_childItem);
        expandableTextView.setText(expandableListText);

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
