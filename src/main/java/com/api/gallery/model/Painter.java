package com.api.gallery.model;

import java.util.UUID;

public class Painter {
    UUID painterId;
    String painterName;
    String painterDescription;
    String painterEmail;
    String painterPhoneNo;
    String painterWorkAddress;

    public Painter(UUID painterId, String painterName) {
        this.painterId = painterId;
        this.painterName = painterName;
    }

    public UUID getPainterId() {
        return painterId;
    }

    public String getPainterName() {
        return painterName;
    }

    public String getPainterDescription() {
        return painterDescription;
    }

    public void setPainterDescription(String painterDescription) {
        this.painterDescription = painterDescription;
    }

    public String getPainterEmail() {
        return painterEmail;
    }

    public void setPainterEmail(String painterEmail) {
        this.painterEmail = painterEmail;
    }

    public String getPainterPhoneNo() {
        return painterPhoneNo;
    }

    public void setPainterPhoneNo(String painterPhoneNo) {
        this.painterPhoneNo = painterPhoneNo;
    }

    public String getPainterWorkAddress() {
        return painterWorkAddress;
    }

    public void setPainterWorkAddress(String painterWorkAddress) {
        this.painterWorkAddress = painterWorkAddress;
    }
}
