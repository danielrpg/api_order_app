package com.api.util;

public class URLConstants {

    private URLConstants() {}

    public static final String SWAGGER_API_URL = "/v2/api-docs";
    public static final String SWAGGER_API_DOC = "/swagger-ui.html";
    public static final String SWAGGER_API_DOC_UI = "/configuration/ui";
    public static final String SWAGGER_API_RESOURCES = "/swagger-resources/**";
    public static final String SWAGGER_API_SECURITY = "/configuration/security";
    public static final String SWAGGER_API_WEBJARS = "/webjars/**";
    private static final String VERSION_API_URL = "/api/v1";

    // user
    public static final String USER_URL = VERSION_API_URL + "/user";
    public static final String AUTHENTICATION_URL = VERSION_API_URL + "/authentication";

    // client
    public static final String CLIENT_URL = VERSION_API_URL + "/clients";

    // product
    public static final String PRODUCT_URL = VERSION_API_URL + "/products";

    // order
    public static final String ORDER_URL = VERSION_API_URL + "/orders";
}
