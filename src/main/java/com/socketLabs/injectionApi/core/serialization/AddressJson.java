package com.socketLabs.injectionApi.core.serialization;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

class AddressJson {

    @JsonProperty("emailAddress")
    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("friendlyName")
    private String friendlyName;

    public AddressJson(String email, String friendlyName) {
        this.email = email;
        this.friendlyName = friendlyName;
    }

    public String getEmail() {
        return this.email;
    }
    public void setEmail(String value) {
        this.email = value;
    }

    public String getFriendlyName() {
        return this.friendlyName;
    }
    public void setFriendlyName(String value) {
        this.friendlyName = value;
    }

}