package com.ms.consumer.order;

public class OrderRequest {
    private Long memberId;
    private String item;

    //...

    public OrderRequest() {
    }

    public OrderRequest(Long memberId, String item) {
        this.memberId = memberId;
        this.item = item;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
