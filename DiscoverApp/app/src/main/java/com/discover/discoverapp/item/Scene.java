package com.discover.discoverapp.item;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Kevin on 19/09/2015.
 */
public class Scene {

    @SerializedName("payload")
    private List<Payload> payload;

    public Payload getPayload(int index) {
        if (index < payload.size()) {
            return payload.get(index);
        } else {
            return null;
        }
    }

    public class Payload {
        @SerializedName("id")
        private String id;

        public String getId() {
            return id;
        }

    }

}
