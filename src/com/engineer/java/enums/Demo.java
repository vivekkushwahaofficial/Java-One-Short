package com.engineer.java.enums;

public class Demo{
    public static void main(String[] args) {
        int status = PaymentStatus.SUCCESS;
        System.out.println(status);

        int status2 = 100;
    }
}


// payment status  --> success, failed, pending
/*
problem with this appraoach
1. Type safety
2. Poor Readability
3. No grouping of related entity

*/

class PaymentStatus{
    public static final int SUCCESS = 1;
    public static final int FAILED = 2;
    public static final int PENDING = 3;
}