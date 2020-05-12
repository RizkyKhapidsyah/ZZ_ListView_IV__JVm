package com.rk.lv_iv;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class ExpandableListData {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> negaraNegaraAsia = new ArrayList<String>();
        negaraNegaraAsia.add("Arab Saudi");
        negaraNegaraAsia.add("India");
        negaraNegaraAsia.add("Indonesia");
        negaraNegaraAsia.add("Jepang");
        negaraNegaraAsia.add("Turki");
        negaraNegaraAsia.add("Nepal");
        negaraNegaraAsia.add("Bangladesh");
        negaraNegaraAsia.add("Vietnam");
        negaraNegaraAsia.add("dll");

        List<String> negaraNegaraEropa = new ArrayList<String>();
        negaraNegaraEropa.add("Austria");
        negaraNegaraEropa.add("Denmark");
        negaraNegaraEropa.add("Belanda");
        negaraNegaraEropa.add("Ceko");
        negaraNegaraEropa.add("Spanyol");
        negaraNegaraEropa.add("Portugal");
        negaraNegaraEropa.add("Yunani");
        negaraNegaraEropa.add("Inggris");

        expandableListDetail.put("Negara-Negara Asia", negaraNegaraAsia);
        expandableListDetail.put("Negara-Negara Eropa", negaraNegaraEropa);

        return expandableListDetail;
    }
}