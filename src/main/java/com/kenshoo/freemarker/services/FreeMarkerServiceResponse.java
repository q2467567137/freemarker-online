package com.kenshoo.freemarker.services;

/**
 * Created with IntelliJ IDEA.
 * User: nir
 * Date: 4/12/14
 * Time: 11:28 AM
 */
public class FreeMarkerServiceResponse {
    private String result;
    private boolean succeed;
    private String errorReason;


    private FreeMarkerServiceResponse(String result, boolean succeed, String errorReason) {
        this.result = result;
        this.succeed = succeed;
        this.errorReason = errorReason;
    }

    public String getResult() {
        return result;
    }

    public boolean isSucceed() {
        return succeed;
    }

    public String getErrorReason() {
        return errorReason;
    }

    public static class Builder {
        public FreeMarkerServiceResponse successfulResponse(String result){
            return new FreeMarkerServiceResponse(result,true,"");
        }

        public FreeMarkerServiceResponse errorResponse(String errorReason){
            return new FreeMarkerServiceResponse("",false,errorReason);
        }
    }
}