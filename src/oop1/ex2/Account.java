package oop1.ex2;

public class Account {
    int balance; // 잔액

    void deposit(int amount){ // 입금메서드
        balance += amount;
    }

    void withdraw(int amount){
        if(balance>=amount){
            balance -= amount;
        }else{
            System.out.println("잔액 부족");
        }
    }
}
