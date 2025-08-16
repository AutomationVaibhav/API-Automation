package com.api.filters;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingFilter implements Filter {

    private static Logger LOGGER = LogManager.getLogger(LoggingFilter.class);

    @Override
    public Response filter(FilterableRequestSpecification filterableRequestSpecification, FilterableResponseSpecification filterableResponseSpecification, FilterContext filterContext) {
       logRequest(filterableRequestSpecification);
       Response response = filterContext.next(filterableRequestSpecification,filterableResponseSpecification);  // ---> Request moves forward to get executed
        logResponse(response);
       return response;
    }


    public void logRequest(FilterableRequestSpecification requestSpecification){
        LOGGER.info("BASE URI : "+ requestSpecification.getBaseUri());
        LOGGER.info("Request Headers : "+ requestSpecification.getHeaders());
        LOGGER.info("Request Payload : "+ requestSpecification.getBody());


    }

    public void logResponse(Response response){
        LOGGER.info("Status Code : "+ response.getStatusCode());
        LOGGER.info("Response Header : "+ response.getHeaders());
        LOGGER.info("Response Body : "+ response.getBody().prettyPrint());
    }
}
