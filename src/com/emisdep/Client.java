package com.emisdep;

public class Client {
    private String name;
    private int partySize;
    private float currentBill;
    private int prepaid;
    private String phoneNumber;
    private String number;
    private String type;

    public Client(String name, float currentBill, int prepaid) {
        this.name = name;
        this.currentBill = currentBill;
        this.prepaid = prepaid;
    }

    public float makePayment(float payment){
        prepaid += payment;
        return prepaid;
    }

    public float chargeRoom(float increase){
        currentBill += increase;
        return currentBill;
    }

    public float getOutstanding() {
        return currentBill - prepaid;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPartySize(){
        return partySize;
    }

    public int getPrepaid(){
        return prepaid;
    }

    public void setPrepaid(){
        this.prepaid = prepaid;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }
}
