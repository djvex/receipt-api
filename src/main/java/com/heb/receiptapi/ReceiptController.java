package com.heb.receiptapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReceiptController {
    private final ReceiptService  receiptService;

    public ReceiptController(ReceiptService receiptService) {
        this.receiptService = receiptService;
    }

    @GetMapping("/receipt")
    public String getReceipt() {
        return "hello";
    }

    @PostMapping("/receipt")
    public ResponseEntity<Receipt> createReceipt(@RequestBody Cart cart) {
        Receipt receipt = receiptService.calculateReceipt(cart.getItems(), cart.getCoupons());
        return new ResponseEntity<>(receipt, HttpStatus.OK);
    }
}