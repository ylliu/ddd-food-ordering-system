package com.food.ordering.system.service.domain.ports.input.message.listener.restaurantappoval;

import com.food.ordering.system.service.domain.dto.message.RestaurantApprovalResponse;

public interface RestaurantApprovalResponseMessageListener {

    void OrderApproved(RestaurantApprovalResponse restaurantApprovalResponse);

    void OrderRejected(RestaurantApprovalResponse restaurantApprovalResponse);
}
