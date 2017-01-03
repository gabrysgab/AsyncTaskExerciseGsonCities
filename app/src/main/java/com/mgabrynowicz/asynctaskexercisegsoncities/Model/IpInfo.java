package com.mgabrynowicz.asynctaskexercisegsoncities.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by RENT on 2017-01-03.
 */

public class IpInfo {

    @SerializedName("RestResponse")
    RestResponse restResponse;





    public RestResponse getRestResponse() {
        return restResponse;
    }

    public void setRestResponse(RestResponse restResponse) {
        this.restResponse = restResponse;
    }
}
