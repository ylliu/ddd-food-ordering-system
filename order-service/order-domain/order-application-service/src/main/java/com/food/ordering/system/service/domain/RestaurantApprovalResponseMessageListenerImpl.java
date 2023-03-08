package com.food.ordering.system.service.domain;

import com.food.ordering.system.service.domain.dto.message.RestaurantApprovalResponse;
import com.food.ordering.system.service.domain.ports.input.message.listener.restaurantappoval.RestaurantApprovalResponseMessageListener;

public class RestaurantApprovalResponseMessageListenerImpl implements RestaurantApprovalResponseMessageListener {
    @Override
    public void OrderApproved(RestaurantApprovalResponse restaurantApprovalResponse) {

    }

    @Override
    public void OrderRejected(RestaurantApprovalResponse restaurantApprovalResponse) {

    }
}
