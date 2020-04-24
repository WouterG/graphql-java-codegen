package com.kobylynskyi.graphql.codegen.model.graphql.data;

import java.util.*;
import com.kobylynskyi.graphql.codegen.model.graphql.*;

public class EventsByCategoryAndStatusQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "eventsByCategoryAndStatus";

    private Map<String, Object> input = new LinkedHashMap<>();

    public EventsByCategoryAndStatusQueryRequest() {
    }

    public void setCategoryId(String categoryId) {
        this.input.put("categoryId", categoryId);
    }

    public void setStatus(Status status) {
        this.input.put("status", status);
    }

    @Override
    public GraphQLOperation getOperationType() {
        return OPERATION_TYPE;
    }

    @Override
    public String getOperationName() {
        return OPERATION_NAME;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static class Builder {

        private String categoryId;
        private Status status;

        public Builder() {
        }

        public Builder setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public Builder setStatus(Status status) {
            this.status = status;
            return this;
        }


        public EventsByCategoryAndStatusQueryRequest build() {
            EventsByCategoryAndStatusQueryRequest obj = new EventsByCategoryAndStatusQueryRequest();
            obj.setCategoryId(categoryId);
            obj.setStatus(status);
            return obj;
        }

    }
}